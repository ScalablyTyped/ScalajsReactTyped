package typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod

import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelComplete
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelCreate
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelError
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.ChannelMessage
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.End
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.OnReady
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Output
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Pong
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageKind.Start
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOnReady
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageStart
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOutput[OutputT]
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelCreate
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelMessage
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelError
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelComplete
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageEnd
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessagePong
*/
trait JobOutboundMessage[OutputT /* <: JsonValue */] extends StObject
object JobOutboundMessage {
  
  inline def JobOutboundMessageChannelComplete(description: JobDescription, kind: ChannelComplete, name: String): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelComplete = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelComplete]
  }
  
  inline def JobOutboundMessageChannelCreate(description: JobDescription, kind: ChannelCreate, name: String): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelCreate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelCreate]
  }
  
  inline def JobOutboundMessageChannelError(description: JobDescription, kind: ChannelError, name: String): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelError = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], error = null)
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelError]
  }
  
  inline def JobOutboundMessageChannelMessage(description: JobDescription, kind: ChannelMessage, name: String): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelMessage = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], message = null)
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageChannelMessage]
  }
  
  inline def JobOutboundMessageEnd(description: JobDescription, kind: End): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageEnd = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageEnd]
  }
  
  inline def JobOutboundMessageOnReady(description: JobDescription, kind: OnReady): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOnReady = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOnReady]
  }
  
  inline def JobOutboundMessageOutput[OutputT /* <: JsonValue */](description: JobDescription, kind: Output, value: OutputT): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOutput[OutputT] = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageOutput[OutputT]]
  }
  
  inline def JobOutboundMessagePong(description: JobDescription, id: Double, kind: Pong): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessagePong = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessagePong]
  }
  
  inline def JobOutboundMessageStart(description: JobDescription, kind: Start): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageStart = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobOutboundMessageStart]
  }
}
