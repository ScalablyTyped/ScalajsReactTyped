package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPreviewDataFrameAnalyticsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var config: js.UndefOr[MlPreviewDataFrameAnalyticsDataframePreviewConfig] = js.undefined
  
  var id: js.UndefOr[Id] = js.undefined
}
object MlPreviewDataFrameAnalyticsRequest {
  
  inline def apply(): MlPreviewDataFrameAnalyticsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlPreviewDataFrameAnalyticsRequest]
  }
  
  extension [Self <: MlPreviewDataFrameAnalyticsRequest](x: Self) {
    
    inline def setConfig(value: MlPreviewDataFrameAnalyticsDataframePreviewConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
