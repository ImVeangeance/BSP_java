#include <iostream>
#include <vector>
#include <fstream>
#include <random>
#include "classes_shit.cpp"

void create_csv_basic_file_dev(const std::vector <devel>& a)
{
    std::ofstream file_doer_base_shit;
    file_doer_base_shit.open("../../developers_table.csv");
    if(file_doer_base_shit.is_open())
    {
        file_doer_base_shit << "\n";
        for(auto & i : a)
        {
            file_doer_base_shit << i.name << "," << i.email << "," << i.prog_lang << ";\n";
        }
    }
    file_doer_base_shit.close();
}

void create_csv_basic_file_man(std::vector <manager> b)
{
    std::ofstream file_doer_base_shit;
    file_doer_base_shit.open("../../managers_table.csv");
    if(file_doer_base_shit.is_open())
    {
        file_doer_base_shit << "\n";
        for(auto & i : b)
        {
            file_doer_base_shit << i.name << "," << i.email << "," << i.quality << ";\n";
        }
    }
    file_doer_base_shit.close();
}

int main()
{
    int n;
    n = 1000000;
    std::random_device rd;
    std::mt19937_64 gen(rd());
    std::uniform_int_distribution<> dis(0, 5);
    std::cout << "Get started, old friend." << std::endl;
    //
    std::vector <devel> a;
    std::vector <manager> b;
    for(int i = 0; i < n; i++)
    {
        a.emplace_back(dis(gen), dis(gen), dis(gen));
        b.emplace_back(dis(gen), dis(gen), dis(gen));
    }
    std::cout << std::endl;
    create_csv_basic_file_dev(a);
    create_csv_basic_file_man(b);
    return 0;
}
