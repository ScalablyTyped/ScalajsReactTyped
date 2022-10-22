package typingsJapgolly.mapboxMapboxSdk.anon

import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.failed
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.processing
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.queued
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stage extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var stage: js.UndefOr[processing | queued | success | failed] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
  
  var tilesetId: String
}
object Stage {
  
  inline def apply(tilesetId: String): Stage = {
    val __obj = js.Dynamic.literal(tilesetId = tilesetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
  
  extension [Self <: Stage](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setStage(value: processing | queued | success | failed): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTilesetId(value: String): Self = StObject.set(x, "tilesetId", value.asInstanceOf[js.Any])
  }
}
