package main.protocol.memory.habboclient;

import main.protocol.HConnection;

import java.util.List;

/**
 * Created by Jonas on 13/06/18.
 */
public abstract class HabboClient {

    protected HConnection hConnection;

    public HabboClient(HConnection connection) {
        this.hConnection = connection;
    }

    public abstract List<byte[]> getRC4possibilities();
}
