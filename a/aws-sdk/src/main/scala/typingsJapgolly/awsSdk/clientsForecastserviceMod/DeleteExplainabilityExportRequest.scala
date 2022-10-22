package typingsJapgolly.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteExplainabilityExportRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Explainability export to delete. 
    */
  var ExplainabilityExportArn: Arn
}
object DeleteExplainabilityExportRequest {
  
  inline def apply(ExplainabilityExportArn: Arn): DeleteExplainabilityExportRequest = {
    val __obj = js.Dynamic.literal(ExplainabilityExportArn = ExplainabilityExportArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExplainabilityExportRequest]
  }
  
  extension [Self <: DeleteExplainabilityExportRequest](x: Self) {
    
    inline def setExplainabilityExportArn(value: Arn): Self = StObject.set(x, "ExplainabilityExportArn", value.asInstanceOf[js.Any])
  }
}
