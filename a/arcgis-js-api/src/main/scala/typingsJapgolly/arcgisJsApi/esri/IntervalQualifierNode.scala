package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`interval-qualifier`
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

trait IntervalQualifierNode
  extends StObject
     with Object
     with SQLNode {
  
  /**
    * Interval node periods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalQualifierNode)
    */
  var period: day | month | hour | second | year | minute
  
  /**
    * Precision for an interval data type includes interval leading precision, interval precision, and seconds precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalQualifierNode)
    */
  var precision: Double
  
  /**
    * Seconds precision.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-sql-WhereClause.html#IntervalQualifierNode)
    */
  var secondary: number
  
  var `type`: `interval-qualifier`
}
object IntervalQualifierNode {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    period: day | month | hour | second | year | minute,
    precision: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): IntervalQualifierNode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), period = period.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), secondary = "number")
    __obj.updateDynamic("type")("interval-qualifier")
    __obj.asInstanceOf[IntervalQualifierNode]
  }
  
  extension [Self <: IntervalQualifierNode](x: Self) {
    
    inline def setPeriod(value: day | month | hour | second | year | minute): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: number): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setType(value: `interval-qualifier`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
