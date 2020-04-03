//
// Created by death on 3/31/20.
//
#include <string>
#include <ctime>
#include <random>



class devel
{
    std::string random_name[6] = {"Alexa", "Illia", "Ciri", "Bill", "Bjarne", "Pork"};
    std::string random_email[6] = {"@gmail.com", "@yandex.ru", "@mail.ru", "@icloud.com", "@example.com", "@prodota.com"};
    std::string random_pl[6] = {"C/C++", "C#", "Objective C", "Swift", "Java", "Ruby"}; // 6
    public:
        std::string name;
        std::string email;
        std::string prog_lang;
        public: devel(int r, int r1, int r2)
        {
            prog_lang = random_pl[r];
            name = random_name[r1];
            email = random_email_smth(email) + random_email[r2];
        }
    public: std::string random_email_smth(std::string basic)
    {
        std::string ransom = "qwertyuiopasdfghjklzxcvbnm0123456789"; // 26 + 10 = 36
        std::random_device rd;
        std::mt19937_64 gen(rd());
        std::uniform_int_distribution<> dis(5, 10);
        std::uniform_int_distribution<> dis_letters(0, 25);
        std::uniform_int_distribution<> dis_numbers(26, 35);
        std::uniform_int_distribution<> dis_var(0, 1); // 0 - b  1- c
        for(int i = 0; i < dis(gen); i++)
        {
            if(dis_var(gen) == 0)
            {
                basic.push_back(ransom[dis_letters(gen)]);
            }
            else
            {
                basic.push_back(ransom[dis_numbers(gen)]);
            }
        }
        return basic;
    }
};

class manager
{
    std::string random_name[6] = {"Alexa", "Illia", "Ciri", "Bill", "Bjarne", "Pork"};
    std::string random_email[6] = {"@gmail.com", "@yandex.ru", "@mail.ru", "@icloud.com", "@example.com", "@prodota.com"};
    std::string random_quality[6] = {"Newbie", "Middle", "Top", "Newbie", "Middle", "Top"}; // 6
    public:
        std::string name;
        std::string email;
        std::string quality;
        public: manager(int r, int r1, int r2)
        {
            quality = random_quality[r] + "-Manager";
            name = random_name[r1];
            email = random_email_smth(email) + random_email[r2];
        }
    public: std::string random_email_smth(std::string basic)
    {
        std::string ransom = "qwertyuiopasdfghjklzxcvbnm0123456789"; // 26 + 10 = 36
        std::random_device rd;
        std::mt19937_64 gen(rd());
        std::uniform_int_distribution<> dis(5, 10);
        std::uniform_int_distribution<> dis_letters(0, 25);
        std::uniform_int_distribution<> dis_numbers(26, 35);
        std::uniform_int_distribution<> dis_var(0, 1); // 0 - b  1- c
        for(int i = 0; i < dis(gen); i++)
        {
            if(dis_var(gen) == 0)
            {
                basic.push_back(ransom[dis_letters(gen)]);
            }
            else
            {
                basic.push_back(ransom[dis_numbers(gen)]);
            }
        }
        return basic;
    }
};

