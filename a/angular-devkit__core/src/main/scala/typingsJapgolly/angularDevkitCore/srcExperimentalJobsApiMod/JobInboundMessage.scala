package typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod

import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageKind.Input
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageKind.Ping
import typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageKind.Stop
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessagePing
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageStop
  - typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageInput[InputT]
*/
trait JobInboundMessage[InputT /* <: JsonValue */] extends StObject
object JobInboundMessage {
  
  inline def JobInboundMessageInput[InputT /* <: JsonValue */](kind: Input, value: InputT): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageInput[InputT] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageInput[InputT]]
  }
  
  inline def JobInboundMessagePing(id: Double, kind: Ping): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessagePing = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessagePing]
  }
  
  inline def JobInboundMessageStop(kind: Stop): typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageStop = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularDevkitCore.srcExperimentalJobsApiMod.JobInboundMessageStop]
  }
}
