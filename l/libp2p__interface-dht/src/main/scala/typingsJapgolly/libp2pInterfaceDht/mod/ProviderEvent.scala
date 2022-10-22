package typingsJapgolly.libp2pInterfaceDht.mod

import typingsJapgolly.libp2pInterfaceDht.libp2pInterfaceDhtStrings.PROVIDER
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfacePeerInfo.mod.PeerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderEvent
  extends StObject
     with QueryEvent {
  
  var from: PeerId
  
  var name: PROVIDER
  
  var providers: js.Array[PeerInfo]
  
  var `type`: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.PROVIDER
}
object ProviderEvent {
  
  inline def apply(
    from: PeerId,
    providers: js.Array[PeerInfo],
    `type`: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.PROVIDER
  ): ProviderEvent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = "PROVIDER", providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderEvent]
  }
  
  extension [Self <: ProviderEvent](x: Self) {
    
    inline def setFrom(value: PeerId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setName(value: PROVIDER): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[PeerInfo]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: PeerInfo*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setType(value: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.PROVIDER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
