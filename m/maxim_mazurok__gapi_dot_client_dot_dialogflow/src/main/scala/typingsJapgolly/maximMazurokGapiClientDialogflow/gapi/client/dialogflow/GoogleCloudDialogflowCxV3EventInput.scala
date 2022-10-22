package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3EventInput extends StObject {
  
  /** Name of the event. */
  var event: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3EventInput {
  
  inline def apply(): GoogleCloudDialogflowCxV3EventInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3EventInput]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3EventInput](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
  }
}
