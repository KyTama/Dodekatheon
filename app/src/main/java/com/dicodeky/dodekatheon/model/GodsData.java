package com.dicodeky.dodekatheon.model;

import com.dicodeky.dodekatheon.R;

import java.util.ArrayList;

public class GodsData {
    private static String[] godNames = {
        "Zeus",
        "Hera",
        "Poseidon",
        "Demeter",
        "Athena",
        "Apollo",
        "Artemis",
        "Ares",
        "Aphrodite",
        "Hephaestus",
        "Hermes",
        "Hestia"
    };

    private static String[] godDetails = {
        "Raja dari para dewa dan penguasa Gunung Olympus. Dewa langit, petir, guntur, hukum, ketertiban, dan keadilan. Putra termuda dari Titan Cronus dan Rhea. Memiliki simbol petir, elang, pohon ek, dan banteng. Saudara laki-laki sekaligus suami Hera, meskipun ia memiliki banyak kekasih. Saudara laki-laki dari Poseidon, Hades, Demeter, dan Hestia.",
        "Ratu dari para dewa dan dewi pernikahan, perempuan, kelahiran, dan keluarga. Memiliki simbol burung merak, burung kukuk, dan sapi. Putri termuda dari Cronus dan Rhea. Istri sekaligus saudara perempuan dari Zeus. Sebagai dewi pernikahan, dia sering berusaha untuk membalas dendam kepada kekasih Zeus dan anak-anaknya.",
        "Dewa dari lautan, air, badai, angin ribut, gempa bumi, dan kuda. Memiliki simbol kuda, banteng, lumba-lumba, dan trisula. Putra kedua dari Cronus dan Rhea. Saudara laki-laki dari Zeus dan Hades. Menikah dengan Nereid Amphitrite, meskipun, seperti kebanyakan dewa laki-laki Yunani, dia memiliki banyak kekasih.",
        "Goddess of the harvest, fertility, agriculture, nature and the seasons. She presided over grains and the fertility of the earth. Symbols include the poppy, wheat, torch, cornucopia, and pig. Middle daughter of Cronus and Rhea. Also the lover of Zeus and Poseidon, and the mother of Persephone.",
        "Goddess of wisdom, handicraft, and warfare.[25] Symbols include the owl and the olive tree. Daughter of Zeus and the Oceanid Metis, she rose from her father's head fully grown and in full battle armor.",
        "God of light, the sun, prophecy, philosophy, truth, inspiration, poetry, music, arts, medicine, healing, and plague. Symbols include the sun, bow and arrow, lyre, swan, and mouse. Son of Zeus and Leto, and twin brother of Artemis.",
        "Goddess of the hunt, the wilderness, virginity, the moon, archery, childbirth, protection and plague. Symbols include the moon, horse, deer, hound, she-bear, snake, cypress tree, and bow and arrow. Daughter of Zeus and Leto and twin sister of Apollo.",
        "God of war, violence, bloodshed and manly virtues. Symbols include the boar, serpent, dog, vulture, spear, and shield. Son of Zeus and Hera, all the other gods despised him except Aphrodite. His Latin name, Mars, gave us the word 'martial'",
        "Goddess of love, pleasure, passion, procreation, fertility, beauty and desire. Symbols include the dove, bird, apple, bee, swan, myrtle, and rose. Daughter of Zeus and the Oceanid Dione, or perhaps born from the sea foam after Uranus' blood dripped into the sea after being castrated by his youngest son, Cronus, who then threw his father's genitals into the sea. Married to Hephaestus, although she had many adulterous affairs, most notably with Ares. Her name gave us the word 'aphrodisiac'.",
        "Master blacksmith and craftsman of the gods; god of the forge, craftsmanship, invention, fire and volcanoes. Symbols include fire, anvil, axe, donkey, hammer, tongs, and quail. Son of Hera, either by Zeus or alone. Married to Aphrodite, though unlike most divine husbands, he was rarely ever licentious.",
        "Messenger of the gods; god of travel, commerce, communication, borders, eloquence, diplomacy, thieves and games. Symbols include the caduceus (staff entwined with two snakes), winged sandals and cap, stork, and tortoise (whose shell he used to invent the lyre). Son of Zeus and the nymph Maia. The second-youngest Olympian, just older than Dionysus.",
        "Goddess of the hearth, fire and of the right ordering of domesticity and the family; she was born into the first Olympian generation and was one of the original twelve Olympians. Some lists of the Twelve Olympians omit her in favor of Dionysus, but the speculation that she gave her throne to him in order to keep the peace seems to be modern invention. She is the first child of Cronus and Rhea, eldest sister of Hades, Demeter, Poseidon, Hera, and Zeus."
    };

    private static int[] godImages = {
            R.drawable.zeus,
            R.drawable.hera,
            R.drawable.poseidon,
            R.drawable.demeter,
            R.drawable.athena,
            R.drawable.apollo,
            R.drawable.artemis,
            R.drawable.ares,
            R.drawable.aphrodite,
            R.drawable.hephaestus,
            R.drawable.hermes,
            R.drawable.hestia
    };

    public static ArrayList<God> getListData() {
        ArrayList<God> list = new ArrayList<>();
        for (int position = 0; position < godNames.length; position++) {
            God god = new God();
            god.setName(godNames[position]);
            god.setDetail(godDetails[position]);
            god.setPhoto(godImages[position]);
            list.add(god);
        }
        return list;
    }
}
