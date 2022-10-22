package typingsJapgolly.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCallAnalyticsCategoryResponse extends StObject {
  
  /**
    * Provides you with the properties of the Call Analytics category you specified in your UpdateCallAnalyticsCategory request.
    */
  var CategoryProperties: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.CategoryProperties] = js.undefined
}
object UpdateCallAnalyticsCategoryResponse {
  
  inline def apply(): UpdateCallAnalyticsCategoryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateCallAnalyticsCategoryResponse]
  }
  
  extension [Self <: UpdateCallAnalyticsCategoryResponse](x: Self) {
    
    inline def setCategoryProperties(value: CategoryProperties): Self = StObject.set(x, "CategoryProperties", value.asInstanceOf[js.Any])
    
    inline def setCategoryPropertiesUndefined: Self = StObject.set(x, "CategoryProperties", js.undefined)
  }
}
