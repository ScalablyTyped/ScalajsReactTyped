package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`interval-period`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.day
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.hour
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.minute
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.month
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.number
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.second
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.year
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntervalPeriodNode
  extends StObject
     with Object
     with SQLNode {
  
  /**
    * Interval node periods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalPeriodNode)
    */
  var period: day | month | hour | second | year | minute
  
  var precision: Double
  
  var secondary: number
  
  var `type`: `interval-period`
}
object IntervalPeriodNode {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    period: day | month | hour | second | year | minute,
    precision: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): IntervalPeriodNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), period = period.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondary = "number")
    __obj.updateDynamic("type")("interval-period")
    __obj.asInstanceOf[IntervalPeriodNode]
  }
  
  extension [Self <: IntervalPeriodNode](x: Self) {
    
    inline def setPeriod(value: day | month | hour | second | year | minute): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: number): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setType(value: `interval-period`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
