package typingsJapgolly.signalfx.mod

import typingsJapgolly.signalfx.anon.IncidentId
import typingsJapgolly.signalfx.anon.JobId
import typingsJapgolly.signalfx.anon.TsId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.signalfx.mod.MetadataMessage
  - typingsJapgolly.signalfx.mod.EventMessage
  - typingsJapgolly.signalfx.mod.ControlMessage
  - typingsJapgolly.signalfx.mod.DataMessage
*/
trait StreamMessage extends StObject
object StreamMessage {
  
  inline def ControlMessage(event: String, logicalTimestampMs: Double): typingsJapgolly.signalfx.mod.ControlMessage = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], logicalTimestampMs = logicalTimestampMs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("control-message")
    __obj.asInstanceOf[typingsJapgolly.signalfx.mod.ControlMessage]
  }
  
  inline def DataMessage(channel: String, data: js.Array[TsId], logicalTimestampMs: Double): typingsJapgolly.signalfx.mod.DataMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], logicalTimestampMs = logicalTimestampMs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("data")
    __obj.asInstanceOf[typingsJapgolly.signalfx.mod.DataMessage]
  }
  
  inline def EventMessage(channel: String, logicalTimestampMs: Double, properties: IncidentId, tsId: String): typingsJapgolly.signalfx.mod.EventMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], logicalTimestampMs = logicalTimestampMs.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tsId = tsId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[typingsJapgolly.signalfx.mod.EventMessage]
  }
  
  inline def MetadataMessage(channel: String, properties: JobId, tsId: String): typingsJapgolly.signalfx.mod.MetadataMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tsId = tsId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("metadata")
    __obj.asInstanceOf[typingsJapgolly.signalfx.mod.MetadataMessage]
  }
}
