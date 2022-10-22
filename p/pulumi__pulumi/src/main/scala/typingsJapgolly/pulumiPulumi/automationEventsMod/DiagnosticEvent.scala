package typingsJapgolly.pulumiPulumi.automationEventsMod

import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.error
import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.info
import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.infoNumbersignerr
import typingsJapgolly.pulumiPulumi.pulumiPulumiStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagnosticEvent extends StObject {
  
  var color: String
  
  var ephemeral: js.UndefOr[Boolean] = js.undefined
  
  var message: String
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var severity: info | infoNumbersignerr | warning | error
  
  var streamID: js.UndefOr[Double] = js.undefined
  
  var urn: js.UndefOr[String] = js.undefined
}
object DiagnosticEvent {
  
  inline def apply(color: String, message: String, severity: info | infoNumbersignerr | warning | error): DiagnosticEvent = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagnosticEvent]
  }
  
  extension [Self <: DiagnosticEvent](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEphemeral(value: Boolean): Self = StObject.set(x, "ephemeral", value.asInstanceOf[js.Any])
    
    inline def setEphemeralUndefined: Self = StObject.set(x, "ephemeral", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setSeverity(value: info | infoNumbersignerr | warning | error): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setStreamID(value: Double): Self = StObject.set(x, "streamID", value.asInstanceOf[js.Any])
    
    inline def setStreamIDUndefined: Self = StObject.set(x, "streamID", js.undefined)
    
    inline def setUrn(value: String): Self = StObject.set(x, "urn", value.asInstanceOf[js.Any])
    
    inline def setUrnUndefined: Self = StObject.set(x, "urn", js.undefined)
  }
}
