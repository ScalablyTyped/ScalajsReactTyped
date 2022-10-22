package typingsJapgolly.ionic.definitionsMod

import typingsJapgolly.ionic.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ionic.definitionsMod.TelemetryIPCMessage
  - typingsJapgolly.ionic.definitionsMod.UpdateCheckIPCMessage
*/
trait IPCMessage extends StObject
object IPCMessage {
  
  inline def TelemetryIPCMessage(data: Args): typingsJapgolly.ionic.definitionsMod.TelemetryIPCMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("telemetry")
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.TelemetryIPCMessage]
  }
  
  inline def UpdateCheckIPCMessage(): typingsJapgolly.ionic.definitionsMod.UpdateCheckIPCMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("update-check")
    __obj.asInstanceOf[typingsJapgolly.ionic.definitionsMod.UpdateCheckIPCMessage]
  }
}
