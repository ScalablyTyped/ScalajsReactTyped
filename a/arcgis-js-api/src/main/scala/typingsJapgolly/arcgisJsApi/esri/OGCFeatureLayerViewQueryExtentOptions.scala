package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.AbortSignal
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OGCFeatureLayerViewQueryExtentOptions
  extends StObject
     with Object {
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#queryExtent)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object OGCFeatureLayerViewQueryExtentOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): OGCFeatureLayerViewQueryExtentOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[OGCFeatureLayerViewQueryExtentOptions]
  }
  
  extension [Self <: OGCFeatureLayerViewQueryExtentOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
