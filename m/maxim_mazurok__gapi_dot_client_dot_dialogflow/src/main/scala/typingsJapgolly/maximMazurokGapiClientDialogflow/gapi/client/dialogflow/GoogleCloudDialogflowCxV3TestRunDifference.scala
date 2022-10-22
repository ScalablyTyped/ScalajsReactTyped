package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3TestRunDifference extends StObject {
  
  /** A description of the diff, showing the actual output vs expected output. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The type of diff. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3TestRunDifference {
  
  inline def apply(): GoogleCloudDialogflowCxV3TestRunDifference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3TestRunDifference]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3TestRunDifference](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
