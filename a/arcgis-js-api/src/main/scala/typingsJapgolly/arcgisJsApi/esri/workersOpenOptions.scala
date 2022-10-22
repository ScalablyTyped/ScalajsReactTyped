package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.AbortSignal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.dedicated
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.distributed
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.local
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait workersOpenOptions
  extends StObject
     with Object {
  
  /**
    * The objects defining the API accessible from the module.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    */
  var client: js.UndefOr[Any] = js.undefined
  
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable asynchronous job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * Indicates how to load the module.
    *
    * @default distributed
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    */
  var strategy: js.UndefOr[distributed | dedicated | local] = js.undefined
}
object workersOpenOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): workersOpenOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[workersOpenOptions]
  }
  
  extension [Self <: workersOpenOptions](x: Self) {
    
    inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStrategy(value: distributed | dedicated | local): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
