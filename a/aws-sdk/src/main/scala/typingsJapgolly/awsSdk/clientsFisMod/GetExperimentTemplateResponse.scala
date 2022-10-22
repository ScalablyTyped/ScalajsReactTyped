package typingsJapgolly.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExperimentTemplateResponse extends StObject {
  
  /**
    * Information about the experiment template.
    */
  var experimentTemplate: js.UndefOr[ExperimentTemplate] = js.undefined
}
object GetExperimentTemplateResponse {
  
  inline def apply(): GetExperimentTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExperimentTemplateResponse]
  }
  
  extension [Self <: GetExperimentTemplateResponse](x: Self) {
    
    inline def setExperimentTemplate(value: ExperimentTemplate): Self = StObject.set(x, "experimentTemplate", value.asInstanceOf[js.Any])
    
    inline def setExperimentTemplateUndefined: Self = StObject.set(x, "experimentTemplate", js.undefined)
  }
}
