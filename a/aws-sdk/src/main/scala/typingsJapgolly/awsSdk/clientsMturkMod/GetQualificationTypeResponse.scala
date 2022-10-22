package typingsJapgolly.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQualificationTypeResponse extends StObject {
  
  /**
    *  The returned Qualification Type
    */
  var QualificationType: js.UndefOr[typingsJapgolly.awsSdk.clientsMturkMod.QualificationType] = js.undefined
}
object GetQualificationTypeResponse {
  
  inline def apply(): GetQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetQualificationTypeResponse]
  }
  
  extension [Self <: GetQualificationTypeResponse](x: Self) {
    
    inline def setQualificationType(value: QualificationType): Self = StObject.set(x, "QualificationType", value.asInstanceOf[js.Any])
    
    inline def setQualificationTypeUndefined: Self = StObject.set(x, "QualificationType", js.undefined)
  }
}
