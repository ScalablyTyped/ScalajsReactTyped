package typingsJapgolly.mapboxMapboxSdk.anon

import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.`private`
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.created
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.modified
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.public
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.raster
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortBy_ extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var ownerId: String
  
  var sortBy: js.UndefOr[created | modified] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[raster | vector] = js.undefined
  
  var visibility: js.UndefOr[public | `private`] = js.undefined
}
object SortBy_ {
  
  inline def apply(ownerId: String): SortBy_ = {
    val __obj = js.Dynamic.literal(ownerId = ownerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortBy_]
  }
  
  extension [Self <: SortBy_](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setSortBy(value: created | modified): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setType(value: raster | vector): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisibility(value: public | `private`): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
