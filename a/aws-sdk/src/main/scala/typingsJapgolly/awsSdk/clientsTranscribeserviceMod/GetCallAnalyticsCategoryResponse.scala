package typingsJapgolly.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCallAnalyticsCategoryResponse extends StObject {
  
  /**
    * Provides you with the properties of the Call Analytics category you specified in your GetCallAnalyticsCategory request.
    */
  var CategoryProperties: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.CategoryProperties] = js.undefined
}
object GetCallAnalyticsCategoryResponse {
  
  inline def apply(): GetCallAnalyticsCategoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCallAnalyticsCategoryResponse]
  }
  
  extension [Self <: GetCallAnalyticsCategoryResponse](x: Self) {
    
    inline def setCategoryProperties(value: CategoryProperties): Self = StObject.set(x, "CategoryProperties", value.asInstanceOf[js.Any])
    
    inline def setCategoryPropertiesUndefined: Self = StObject.set(x, "CategoryProperties", js.undefined)
  }
}
