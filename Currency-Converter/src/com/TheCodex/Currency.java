package com.TheCodex;

public enum Currency {

    USD("US Dollar", "$"),
    EUR("Euro", "€"),
    GBP("British Pound", "£"),
    INR("Indian Rupee", "₹"),
    JPY("Japanese Yen", "¥"),
    CNY("Chinese Yuan Renminbi", "¥"),
    AUD("Australian Dollar", "A$"),
    CAD("Canadian Dollar", "C$"),
    CHF("Swiss Franc", "CHF"),
    NZD("New Zealand Dollar", "NZ$"),
    RUB("Russian Ruble", "₽"),
    BRL("Brazilian Real", "R$"),
    ZAR("South African Rand", "R"),
    MXN("Mexican Peso", "$"),
    SGD("Singapore Dollar", "S$"),
    HKD("Hong Kong Dollar", "HK$"),
    KRW("South Korean Won", "₩"),
    BWP("Botswana Pula", "P"),
    LSL("Lesotho Loti", "L"),
    NAD("Namibian Dollar", "N$"),
    SSP("South Sudanese Pound", "£"),
    ZWL("Zimbabwe Dollar", "Z$"),
    AED("UAE Dirham", "د.إ"),
    SAR("Saudi Riyal", "﷼"),
    SEK("Swedish Krona", "kr"),
    NOK("Norwegian Krone", "kr"),
    DKK("Danish Krone", "kr"),
    TRY("Turkish Lira", "₺"),

    // Africa
    EGP("Egyptian Pound", "£"),
    NGN("Nigerian Naira", "₦"),
    KES("Kenyan Shilling", "KSh"),
    GHS("Ghanaian Cedi", "₵"),
    MAD("Moroccan Dirham", "DH"),
    BAM("Bosnia and Herzegovina Convertible Mark", "KM"),
    TND("Tunisian Dinar", "DT"),
    UGX("Ugandan Shilling", "USh"),
    TZS("Tanzanian Shilling", "TSh"),
    RWF("Rwandan Franc", "FRw"),
    FKP("Falkland Islands Pound", "£"),
    GIP("Gibraltar Pound", "£"),
    IMP("Isle of Man Pound", "£"),
    JEP("Jersey Pound", "£"),
    SHP("Saint Helena Pound", "£"),
    SDG("Sudanese Pound", "SDG"),
    // Africa (more)
    BIF("Burundian Franc", "FBu"),
    DJF("Djiboutian Franc", "Fdj"),
    ETB("Ethiopian Birr", "Br"),
    LRD("Liberian Dollar", "L$"),
    MWK("Malawian Kwacha", "MK"),
    SZL("Swazi Lilangeni", "E"),
    ZMW("Zambian Kwacha", "ZK"),
    SOS("Somali Shilling", "Sh"),
    GMD("Gambian Dalasi", "D"),
    SLL("Sierra Leonean Leone", "Le"),
    CVE("Cape Verdean Escudo", "$"),
    STN("São Tomé and Príncipe Dobra", "Db"),
    KMF("Comorian Franc", "CF"),
    BMD("Bermudian Dollar", "BD$"),

    // Asia
    PKR("Pakistani Rupee", "₨"),
    BDT("Bangladeshi Taka", "৳"),
    LKR("Sri Lankan Rupee", "Rs"),
    NPR("Nepalese Rupee", "₨"),
    MMK("Myanmar Kyat", "K"),
    THB("Thai Baht", "฿"),
    VND("Vietnamese Dong", "₫"),
    IDR("Indonesian Rupiah", "Rp"),
    MYR("Malaysian Ringgit", "RM"),
    PHP("Philippine Peso", "₱"),
    ILS("Israeli Shekel", "₪"),
    IRR("Iranian Rial", "﷼"),
    IQD("Iraqi Dinar", "ع.د"),
    KWD("Kuwaiti Dinar", "د.ك"),
    BHD("Bahraini Dinar", ".د.ب"),
    OMR("Omani Rial", "﷼"),
    TWD("New Taiwan Dollar", "NT$"),
    QAR("Qatari Riyal", "﷼"),
    // Asia (more)
    BTN("Bhutanese Ngultrum", "Nu."),
    MOP("Macanese Pataca", "MOP$"),
    LAK("Lao Kip", "₭"),
    KGS("Kyrgyzstani Som", "с"),
    TJS("Tajikistani Somoni", "SM"),
    MZN("Mozambican Metical", "MT"),

    // Europe (extra)
    PLN("Polish Zloty", "zł"),
    HUF("Hungarian Forint", "Ft"),
    CZK("Czech Koruna", "Kč"),
    RON("Romanian Leu", "lei"),
    BGN("Bulgarian Lev", "лв"),
    HRK("Croatian Kuna", "kn"),
    UAH("Ukrainian Hryvnia", "₴"),
    BYN("Belarusian Ruble", "Br"),
    ISK("Icelandic Krona", "kr"),
    GEL("Georgian Lari", "₾"),
    ALL("Albanian Lek", "L"),
    MKD("Macedonian Denar", "ден"),
    // Europe (more microstates)
    MDL("Moldovan Leu", "L"),
    ANG("Netherlands Antillean Guilder", "NAf"),
    AWG("Aruban Florin", "Afl"),

    // Americas
    ARS("Argentine Peso", "$"),
    CLP("Chilean Peso", "$"),
    COP("Colombian Peso", "$"),
    PEN("Peruvian Sol", "S/"),
    UYU("Uruguayan Peso", "$U"),
    PYG("Paraguayan Guarani", "₲"),
    BOB("Bolivian Boliviano", "Bs"),
    VES("Venezuelan Bolívar", "Bs"),
    DOP("Dominican Peso", "RD$"),
    CUP("Cuban Peso", "₱"),
    JMD("Jamaican Dollar", "J$"),
    TTD("Trinidad & Tobago Dollar", "TT$"),
    BSD("Bahamian Dollar", "B$"),
    BBD("Barbadian Dollar", "Bds$"),
    // Caribbean & Americas
    HTG("Haitian Gourde", "G"),
    XCD("East Caribbean Dollar", "EC$"),
    NIO("Nicaraguan Córdoba", "C$"),
    GTQ("Guatemalan Quetzal", "Q"),
    HNL("Honduran Lempira", "L"),
    CRC("Costa Rican Colón", "₡"),
    PAB("Panamanian Balboa", "B/."),
    BZD("Belize Dollar", "BZ$"),
    SRD("Surinamese Dollar", "$"),

    // Oceania + Pacific
    FJD("Fijian Dollar", "FJ$"),
    PGK("Papua New Guinean Kina", "K"),
    SBD("Solomon Islands Dollar", "SI$"),
    WST("Samoan Tala", "WS$"),
    TOP("Tongan Paʻanga", "T$"),
    VUV("Vanuatu Vatu", "VT"),
    // Pacific & Oceania
    KID("Kiribati Dollar", "KID$"),
    TVD("Tuvaluan Dollar", "TVD$"),
    CKD("Cook Islands Dollar", "$"),
    NauruDollar("Nauruan Dollar", "AUD$"),

    // Rare / Others
    MNT("Mongolian Tögrög", "₮"),
    AFN("Afghan Afghani", "؋"),
    KZT("Kazakhstani Tenge", "₸"),
    TMT("Turkmenistani Manat", "m"),
    AZN("Azerbaijani Manat", "₼"),
    AMD("Armenian Dram", "֏"),
    KYD("Cayman Islands Dollar", "CI$"),
    XOF("West African CFA franc", "CFA"),
    XAF("Central African CFA franc", "FCFA"),
    XPF("CFP Franc", "₣"),
    MUR("Mauritian Rupee", "₨"),
    SCR("Seychellois Rupee", "₨"),
    MVR("Maldivian Rufiyaa", "Rf"),

    // Crypto (optional, not ISO 4217 but widely used)
    BTC("Bitcoin", "₿"),
    ETH("Ethereum", "Ξ");

    private final String fullName;
    private final String symbol;

    Currency(String fullName, String symbol) {
        this.fullName = fullName;
        this.symbol = symbol;
    }

    public String getFullName() {
        return fullName;
    }

    public String getSymbol() {
        return symbol;
    }
}
