package typingsJapgolly.libp2pInterfaceDht.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventTypes extends StObject
@JSImport("@libp2p/interface-dht", "EventTypes")
@js.native
object EventTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EventTypes & Double] = js.native
  
  @js.native
  sealed trait ADDING_PEER
    extends StObject
       with EventTypes
  /* 6 */ val ADDING_PEER: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.ADDING_PEER & Double = js.native
  
  @js.native
  sealed trait DIALING_PEER
    extends StObject
       with EventTypes
  /* 7 */ val DIALING_PEER: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.DIALING_PEER & Double = js.native
  
  @js.native
  sealed trait FINAL_PEER
    extends StObject
       with EventTypes
  /* 2 */ val FINAL_PEER: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.FINAL_PEER & Double = js.native
  
  @js.native
  sealed trait PEER_RESPONSE
    extends StObject
       with EventTypes
  /* 1 */ val PEER_RESPONSE: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.PEER_RESPONSE & Double = js.native
  
  @js.native
  sealed trait PROVIDER
    extends StObject
       with EventTypes
  /* 4 */ val PROVIDER: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.PROVIDER & Double = js.native
  
  @js.native
  sealed trait QUERY_ERROR
    extends StObject
       with EventTypes
  /* 3 */ val QUERY_ERROR: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.QUERY_ERROR & Double = js.native
  
  @js.native
  sealed trait SENDING_QUERY
    extends StObject
       with EventTypes
  /* 0 */ val SENDING_QUERY: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.SENDING_QUERY & Double = js.native
  
  @js.native
  sealed trait VALUE
    extends StObject
       with EventTypes
  /* 5 */ val VALUE: typingsJapgolly.libp2pInterfaceDht.mod.EventTypes.VALUE & Double = js.native
}
