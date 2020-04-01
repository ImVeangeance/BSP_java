//
// Created by death on 3/31/20.
//
#include <string>


class devel
{
    std::string random_name[6] = {"Alexa", "Illia", "Ciri", "Bill", "Bjarne", "Pork"};
    std::string random_email[6] = {"123@gmail.com", "213@yandex.ru", "132@mail.ru", "312@icloud.com", "231@example.com", "321@prodota.com"};
    std::string random_pl[6] = {"C/C++", "C#", "Objective C", "Swift", "Java", "Ruby"}; // 6
    public:
        std::string name;
        std::string email;
        std::string prog_lang;
        public: devel(int r, int r1, int r2)
        {
            prog_lang = random_pl[r];
            name = random_name[r1];
            email = random_email[r2];
        }
};

class manager
{
    std::string random_name[6] = {"Alexa", "Illia", "Ciri", "Bill", "Bjarne", "Pork"};
    std::string random_email[6] = {"123@gmail.com", "213@yandex.ru", "132@mail.ru", "312@icloud.com", "231@example.com", "321@prodota.com"};
    std::string random_quality[6] = {"Newbie", "Middle", "Top", "Newbie", "Middle", "Top"}; // 6
    public:
        std::string name;
        std::string email;
        std::string quality;
        public: manager(int r, int r1, int r2)
        {
            quality = random_quality[r] + "-Manager";
            name = random_name[r1];
            email = random_email[r2];
        }
};

