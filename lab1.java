import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lab1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lab1 extends World
{
    Counter timeCount = new Counter();
    
    public static int score= 0;
    /**
     * Constructor for objects of class lab1.
     * 
     */
    public lab1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(544, 475, 1); 
        prepare();
        addObject(timeCount,285,15);
        
    }
    public void act()
    {
        showText("Punteo: " + score, 485,25);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        wall2 wall2 = new wall2();
        addObject(wall2,91,8);
        wall2 wall21 = new wall2();
        addObject(wall21,136,8);
        wall2 wall22 = new wall2();
        addObject(wall22,181,8);
        wall2 wall23 = new wall2();
        addObject(wall23,226,8);
        wall2 wall24 = new wall2();
        addObject(wall24,271,8);
        wall2 wall25 = new wall2();
        addObject(wall25,316,8);
        wall2 wall26 = new wall2();
        addObject(wall26,406,8);
        wall2 wall27 = new wall2();
        addObject(wall27,451,8);
        wall2 wall28 = new wall2();
        addObject(wall28,496,8);
        wall2 wall29 = new wall2();
        addObject(wall29,541,8);
        wall2 wall30 = new wall2();
        addObject(wall30,361,8);
        wall2 wall31 = new wall2();
        addObject(wall31,23,468);
        wall31.setLocation(24,468);
        wall2 wall32 = new wall2();
        addObject(wall32,69,468);
        wall2 wall33 = new wall2();
        addObject(wall33,114,468);
        wall2 wall34 = new wall2();
        addObject(wall34,159,468);
        wall2 wall35 = new wall2();
        addObject(wall35,204,468);
        wall2 wall36 = new wall2();
        addObject(wall36,249,468);
        wall2 wall37 = new wall2();
        addObject(wall37,294,468);
        wall2 wall38 = new wall2();
        addObject(wall38,339,468);
        wall2 wall39 = new wall2();
        addObject(wall39,384,468);
        wall2 wall40 = new wall2();
        addObject(wall40,429,468);
        wall2 wall41 = new wall2();
        addObject(wall41,466,468);

        // Vertical //
        wall1 walla = new wall1();
        addObject(walla,6,24);
        wall1 wallb = new wall1();
        addObject(wallb,6, 68);
        wall1 wallc = new wall1();
        addObject(wallc,6,112);
        wall1 walld = new wall1();
        addObject(walld,6,156);
        wall1 walle = new wall1();
        addObject(walle,6,200);
        wall1 wallf = new wall1();
        addObject(wallf,6, 244);
        wall1 wallg = new wall1();
        addObject(wallg,6,288);
        wall1 wallh = new wall1();
        addObject(wallh,6,332);
        wall1 walli = new wall1();
        addObject(walli,6,376);
        wall1 wallj = new wall1();
        addObject(wallj,6, 420);
        wall1 wallk = new wall1();
        addObject(wallk,6,464);
        wall1 walll = new wall1();
        addObject(walll,6,508);
        wall1 wallm = new wall1();
        addObject(wallm,537,25);
        wall1 walln = new wall1();
        addObject(walln,537,69);
        wall1 wallo = new wall1();
        addObject(wallo,537,113);
        wall1 wallp = new wall1();
        addObject(wallp,537,157);
        wall1 wallq = new wall1();
        addObject(wallq,537,201);
        wall1 wallr = new wall1();
        addObject(wallr,537,245);
        wall1 wallu = new wall1();
        addObject(wallu,537,289);
        wall1 wallt = new wall1();
        addObject(wallt,537,333);
        wall1 wallv = new wall1();
        addObject(wallv,537,377);
        wall1 wallw = new wall1();
        addObject(wallw,537,421);
        wall1 wallx = new wall1();
        addObject(wallx,537,465);

        //interior//
        wall1 wall124 = new wall1();
        addObject(wall124,204,37);
        wall1 wall125 = new wall1();
        addObject(wall125,204,80);
        wall1 wall126 = new wall1();
        addObject(wall126,204,120);
        wall1 wall127 = new wall1();
        addObject(wall127,204,156);
        wall1 wall128 = new wall1();
        addObject(wall128,204,189);
        wall2 wall223 = new wall2();
        addObject(wall223,92,70);
        wall2 wall224 = new wall2();
        addObject(wall224,134,70);
        wall2 wall225 = new wall2();
        addObject(wall225,179,70);

        wall2 wall226 = new wall2();
        addObject(wall226,89,138);
        wall2 wall227 = new wall2();
        addObject(wall227,117,138);
        wall2 wall228 = new wall2();
        addObject(wall228,222,139);
        wall2 wall229 = new wall2();
        addObject(wall229,252,139);
        wall2 wall230 = new wall2();
        addObject(wall230,292,71);
        wall2 wall231 = new wall2();
        addObject(wall231,322,71);

        wall2 wall232 = new wall2();
        addObject(wall232,293,202);
        wall2 wall234 = new wall2();
        addObject(wall234,338,202);
        wall2 wall235 = new wall2();
        addObject(wall235,383,202);
        wall2 wall236 = new wall2();
        addObject(wall236,428,202);
        wall2 wall237 = new wall2();
        addObject(wall237,454,202);

        wall2 wall238 = new wall2();
        addObject(wall238,158,272);
        wall2 wall239 = new wall2();
        addObject(wall239,203,272);
        wall2 wall240 = new wall2();
        addObject(wall240,248,272);
        wall2 wall241 = new wall2();
        addObject(wall241,293,272);
        wall2 wall242 = new wall2();
        addObject(wall242,338,272);

        wall2 wall243 = new wall2();
        addObject(wall243,24,269);
        wall2 wall244 = new wall2();
        addObject(wall244,54,269);
        wall2 wall245 = new wall2();
        addObject(wall245,88,339);
        wall2 wall246 = new wall2();
        addObject(wall246,122,339);
        wall246.setLocation(117,339);
        wall2 wall247 = new wall2();
        addObject(wall247,291,336);
        wall2 wall248 = new wall2();
        addObject(wall248,327,336);
        wall2 wall249 = new wall2();
        addObject(wall249,363,336);
        wall2 wall250 = new wall2();
        addObject(wall250,390,336);

        wall2 wall251 = new wall2();
        addObject(wall251,361,139);
        wall2 wall252 = new wall2();
        addObject(wall252,387,140);
        wall252.setLocation(387,139);

        wall2 wall253 = new wall2();
        addObject(wall253,226,405);
        wall2 wall254 = new wall2();
        addObject(wall254,262,405);
        wall2 wall255 = new wall2();
        addObject(wall255,298,405);
        wall2 wall256 = new wall2();
        addObject(wall256,324,405);

        wall2 wall257 = new wall2();
        addObject(wall257,427,406);
        wall2 wall258 = new wall2();
        addObject(wall258,453,406);

        wall1 wall129 = new wall1();
        addObject(wall129,70,158);
        wall1 wall130 = new wall1();
        addObject(wall130,70,188);
        wall1 wall131 = new wall1();
        addObject(wall131,70,218);
        wall1 wall132 = new wall1();
        addObject(wall132,70,248);

        wall1 wall133 = new wall1();
        addObject(wall133,137,227);
        wall1 wall134 = new wall1();
        addObject(wall134,137,258);
        wall1 wall135 = new wall1();
        addObject(wall135,137,288);
        wall1 wall136 = new wall1();
        addObject(wall136,137,318);
        wall1 wall137 = new wall1();
        addObject(wall137,137,348);
        wall1 wall138 = new wall1();
        addObject(wall135,137,378);
        wall1 wall139 = new wall1();
        addObject(wall139,137,390);

        wall1 wall140 = new wall1();
        addObject(wall140,72,427);
        wall1 wall141 = new wall1();
        addObject(wall141,72,451);

        wall1 wall142 = new wall1();
        addObject(wall142,204,359);
        wall1 wall143 = new wall1();
        addObject(wall143,204,389);

        wall1 wall144 = new wall1();
        addObject(wall144,273,290);
        wall1 wall145 = new wall1();
        addObject(wall145,273,320);

        wall1 wall146 = new wall1();
        addObject(wall146,340,421);
        wall1 wall147 = new wall1();
        addObject(wall147,340,451);

        wall1 wall149 = new wall1();
        addObject(wall149,474,93);
        wall1 wall150 = new wall1();
        addObject(wall150,474,131);
        wall1 wall151 = new wall1();
        addObject(wall151,474,171);
        wall1 wall152 = new wall1();
        addObject(wall152,474,211);
        wall1 wall153 = new wall1();
        addObject(wall153,474,251);
        wall1 wall154 = new wall1();
        addObject(wall154,474,291);
        wall1 wall155 = new wall1();
        addObject(wall155,474,331);
        wall1 wall156 = new wall1();
        addObject(wall156,474,371);
        wall1 wall157 = new wall1();
        addObject(wall157,474,390);

        wall1 wall158 = new wall1();
        addObject(wall158,407,25);
        wall1 wall159 = new wall1();
        addObject(wall159,407,61);
        wall1 wall160 = new wall1();
        addObject(wall160,407,91);
        wall1 wall161 = new wall1();
        addObject(wall161,407,121);

        wall1 wall162 = new wall1();
        addObject(wall162,274,90);
        wall1 wall163 = new wall1();
        addObject(wall163,274,120);
        wall1 wall164 = new wall1();
        addObject(wall164,274,150);
        wall1 wall165 = new wall1();
        addObject(wall165,274,180);

        wall1 wall166 = new wall1();
        addObject(wall166,406,220);
        wall1 wall167 = new wall1();
        addObject(wall167,406,250);

        wall1 wall168 = new wall1();
        addObject(wall168,406,355);
        wall1 wall169 = new wall1();
        addObject(wall169,406,385);

        Character character = new Character();
        addObject(character,36,26);

        Prize prize = new Prize();
        addObject(prize,238,112);
        Prize prize2 = new Prize();
        addObject(prize2,440,376);
        Prize prize3 = new Prize();
        addObject(prize3,306,434);
        Trap trap = new Trap();
        addObject(trap,38,154);
        Trap trap2 = new Trap();
        addObject(trap2,40,418);
        Trap trap3 = new Trap();
        addObject(trap3,436,243);

        Goal goal = new Goal();
        addObject(goal,511,454);
        goal.setLocation(508,458);
    }
}
