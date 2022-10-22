package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.error
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.info
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.warn
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait configLog
  extends StObject
     with Object {
  
  /**
    * An array of custom interceptor functions that can be used to intercept log messages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#log)
    */
  var interceptors: js.Array[LogInterceptor]
  
  /**
    * The level of messages to log.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#log)
    */
  var level: none_ | error | warn | info
}
object configLog {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    interceptors: js.Array[LogInterceptor],
    level: none_ | error | warn | info,
    propertyIsEnumerable: PropertyKey => Boolean
  ): configLog = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), interceptors = interceptors.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[configLog]
  }
  
  extension [Self <: configLog](x: Self) {
    
    inline def setInterceptors(value: js.Array[LogInterceptor]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
    
    inline def setInterceptorsVarargs(value: LogInterceptor*): Self = StObject.set(x, "interceptors", js.Array(value*))
    
    inline def setLevel(value: none_ | error | warn | info): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
