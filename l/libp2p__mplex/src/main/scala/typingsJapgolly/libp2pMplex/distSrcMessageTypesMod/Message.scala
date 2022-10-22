package typingsJapgolly.libp2pMplex.distSrcMessageTypesMod

import typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageTypes.CLOSE_INITIATOR
import typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageTypes.CLOSE_RECEIVER
import typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageTypes.MESSAGE_INITIATOR
import typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageTypes.MESSAGE_RECEIVER
import typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageTypes.NEW_STREAM
import typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageTypes.RESET_INITIATOR
import typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageTypes.RESET_RECEIVER
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.NewStreamMessage
  - typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageReceiverMessage
  - typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageInitiatorMessage
  - typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.CloseReceiverMessage
  - typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.CloseInitiatorMessage
  - typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.ResetReceiverMessage
  - typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.ResetInitiatorMessage
*/
trait Message extends StObject
object Message {
  
  inline def CloseInitiatorMessage(id: Double, `type`: CLOSE_INITIATOR): typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.CloseInitiatorMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.CloseInitiatorMessage]
  }
  
  inline def CloseReceiverMessage(id: Double, `type`: CLOSE_RECEIVER): typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.CloseReceiverMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.CloseReceiverMessage]
  }
  
  inline def MessageInitiatorMessage(data: Uint8ArrayList, id: Double, `type`: MESSAGE_INITIATOR): typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageInitiatorMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageInitiatorMessage]
  }
  
  inline def MessageReceiverMessage(data: Uint8ArrayList, id: Double, `type`: MESSAGE_RECEIVER): typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageReceiverMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.MessageReceiverMessage]
  }
  
  inline def NewStreamMessage(data: Uint8ArrayList, id: Double, `type`: NEW_STREAM): typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.NewStreamMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.NewStreamMessage]
  }
  
  inline def ResetInitiatorMessage(id: Double, `type`: RESET_INITIATOR): typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.ResetInitiatorMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.ResetInitiatorMessage]
  }
  
  inline def ResetReceiverMessage(id: Double, `type`: RESET_RECEIVER): typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.ResetReceiverMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.libp2pMplex.distSrcMessageTypesMod.ResetReceiverMessage]
  }
}
