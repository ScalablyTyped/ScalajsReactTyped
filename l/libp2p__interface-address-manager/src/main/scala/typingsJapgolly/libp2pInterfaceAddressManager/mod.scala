package typingsJapgolly.libp2pInterfaceAddressManager

import org.scalajs.dom.CustomEvent
import typingsJapgolly.libp2pInterfaces.eventsMod.EventEmitter
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait AddressManager extends EventEmitter[AddressManagerEvents] {
    
    /**
      * Add peer observed addresses
      */
    def addObservedAddr(addr: Multiaddr_): Unit = js.native
    
    /**
      * Get the current node's addresses
      */
    def getAddresses(): js.Array[Multiaddr_] = js.native
    
    /**
      * Get peer announcing multiaddrs
      */
    def getAnnounceAddrs(): js.Array[Multiaddr_] = js.native
    
    /**
      * Get peer listen multiaddrs
      */
    def getListenAddrs(): js.Array[Multiaddr_] = js.native
    
    /**
      * Get observed multiaddrs
      */
    def getObservedAddrs(): js.Array[Multiaddr_] = js.native
  }
  
  trait AddressManagerEvents extends StObject {
    
    /**
      * Emitted when the current node's addresses change
      */
    @JSName("change:addresses")
    var changeColonaddresses: CustomEvent
  }
  object AddressManagerEvents {
    
    inline def apply(changeColonaddresses: CustomEvent): AddressManagerEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("change:addresses")(changeColonaddresses.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressManagerEvents]
    }
    
    extension [Self <: AddressManagerEvents](x: Self) {
      
      inline def setChangeColonaddresses(value: CustomEvent): Self = StObject.set(x, "change:addresses", value.asInstanceOf[js.Any])
    }
  }
}
