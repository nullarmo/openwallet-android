package com.openwallet.core.coins;

import com.openwallet.core.coins.families.BitFamily;

/**
 * @author nullarmo
 */
public class TaoMain extends BitFamily{
    private TaoMain() {
        id = "tao.main";

        addressHeader = 66;
        p2shHeader = 3;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 80; // COINBASE_MATURITY_NEW
        dumpedPrivateKeyHeader = 76;

        name = "Tao";
        symbol = "TAO";
        uriScheme = "tao";
        bip44Index = 324; // t + a + o
        unitExponent = 8;
        feeValue = value(1000000L); // 0.01 Tao
        minNonDust = value(1);
        softDustLimit = value(1000000L); // 0.01 Tao
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Tao Signed Message:\n");
    }

    private static TaoMain instance = new TaoMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
