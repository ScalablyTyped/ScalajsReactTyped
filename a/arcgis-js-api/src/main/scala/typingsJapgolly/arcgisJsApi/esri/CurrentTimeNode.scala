package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`current-time`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.date
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.timestamp
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentTimeNode
  extends StObject
     with Object
     with SQLNode {
  
  /**
    * The current time node mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#CurrentTimeNode)
    */
  var mode: timestamp | date
  
  var `type`: `current-time`
}
object CurrentTimeNode {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mode: timestamp | date,
    propertyIsEnumerable: PropertyKey => Boolean
  ): CurrentTimeNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("current-time")
    __obj.asInstanceOf[CurrentTimeNode]
  }
  
  extension [Self <: CurrentTimeNode](x: Self) {
    
    inline def setMode(value: timestamp | date): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setType(value: `current-time`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
