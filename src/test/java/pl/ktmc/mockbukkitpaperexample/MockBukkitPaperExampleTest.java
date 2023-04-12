package pl.ktmc.mockbukkitpaperexample;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MockBukkitPaperExampleTest {

    private ServerMock server;
    private MockBukkitPaperExample plugin;

    @Test
    void test() {

    }

    @AfterEach
    public void tearDown() {
        MockBukkit.unmock();
    }

    @BeforeEach
    public void setUp() {
        server = MockBukkit.mock();
        plugin = MockBukkit.load(MockBukkitPaperExample.class);
    }
}
