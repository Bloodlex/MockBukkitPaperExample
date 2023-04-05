package pl.ktmc.untitled;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPluginTest {

    private ServerMock server;
    private TestPlugin plugin;

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
        plugin = MockBukkit.load(TestPlugin.class);
    }
}