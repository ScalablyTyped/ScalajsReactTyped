package typingsJapgolly.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnalysisSchemeResponse extends StObject {
  
  /**
    * The status of the analysis scheme being deleted.
    */
  var AnalysisScheme: AnalysisSchemeStatus
}
object DeleteAnalysisSchemeResponse {
  
  inline def apply(AnalysisScheme: AnalysisSchemeStatus): DeleteAnalysisSchemeResponse = {
    val __obj = js.Dynamic.literal(AnalysisScheme = AnalysisScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalysisSchemeResponse]
  }
  
  extension [Self <: DeleteAnalysisSchemeResponse](x: Self) {
    
    inline def setAnalysisScheme(value: AnalysisSchemeStatus): Self = StObject.set(x, "AnalysisScheme", value.asInstanceOf[js.Any])
  }
}
