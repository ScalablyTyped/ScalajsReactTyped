package typingsJapgolly.libp2pInterfaceDht.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends StObject
@JSImport("@libp2p/interface-dht", "MessageType")
@js.native
object MessageType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType & Double] = js.native
  
  @js.native
  sealed trait ADD_PROVIDER
    extends StObject
       with MessageType
  /* 2 */ val ADD_PROVIDER: typingsJapgolly.libp2pInterfaceDht.mod.MessageType.ADD_PROVIDER & Double = js.native
  
  @js.native
  sealed trait FIND_NODE
    extends StObject
       with MessageType
  /* 4 */ val FIND_NODE: typingsJapgolly.libp2pInterfaceDht.mod.MessageType.FIND_NODE & Double = js.native
  
  @js.native
  sealed trait GET_PROVIDERS
    extends StObject
       with MessageType
  /* 3 */ val GET_PROVIDERS: typingsJapgolly.libp2pInterfaceDht.mod.MessageType.GET_PROVIDERS & Double = js.native
  
  @js.native
  sealed trait GET_VALUE
    extends StObject
       with MessageType
  /* 1 */ val GET_VALUE: typingsJapgolly.libp2pInterfaceDht.mod.MessageType.GET_VALUE & Double = js.native
  
  @js.native
  sealed trait PING
    extends StObject
       with MessageType
  /* 5 */ val PING: typingsJapgolly.libp2pInterfaceDht.mod.MessageType.PING & Double = js.native
  
  @js.native
  sealed trait PUT_VALUE
    extends StObject
       with MessageType
  /* 0 */ val PUT_VALUE: typingsJapgolly.libp2pInterfaceDht.mod.MessageType.PUT_VALUE & Double = js.native
}
