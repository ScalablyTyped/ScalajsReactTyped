package typingsJapgolly.libp2p

import typingsJapgolly.libp2pInterfaceDht.mod.DualDHT
import typingsJapgolly.libp2pInterfaceDht.mod.QueryEvent
import typingsJapgolly.libp2pInterfaceDht.mod.SingleDHT
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcDhtDummyDhtMod {
  
  @JSImport("libp2p/dist/src/dht/dummy-dht", "DummyDHT")
  @js.native
  open class DummyDHT () extends DualDHT {
    
    def findPeer(): AsyncIterable[QueryEvent] = js.native
    
    def findProviders(): AsyncIterable[QueryEvent] = js.native
    
    def get(): AsyncIterable[QueryEvent] = js.native
    
    def getClosestPeers(): AsyncIterable[QueryEvent] = js.native
    
    @JSName("get")
    var get_FDummyDHT: Any = js.native
    
    @JSName("lan")
    def lan_MDummyDHT: SingleDHT = js.native
    
    def provide(): AsyncIterable[QueryEvent] = js.native
    
    def put(): AsyncIterable[QueryEvent] = js.native
    
    def setMode(): js.Promise[Unit] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_DummyDHT: js.Function0[String] = js.native
    
    @JSName("wan")
    def wan_MDummyDHT: SingleDHT = js.native
  }
}
