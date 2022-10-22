package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeDimensionIntervalResolution
  extends StObject
     with Object {
  
  /**
    * Number of days.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
    */
  var days: Double
  
  /**
    * Number of hours.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
    */
  var hours: Double
  
  /**
    * Number of minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
    */
  var minutes: Double
  
  /**
    * Number of months.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
    */
  var months: Double
  
  /**
    * Number of seconds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
    */
  var seconds: Double
  
  /**
    * Number of years.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#TimeDimensionInterval)
    */
  var years: Double
}
object TimeDimensionIntervalResolution {
  
  inline def apply(
    constructor: js.Function,
    days: Double,
    hasOwnProperty: PropertyKey => Boolean,
    hours: Double,
    minutes: Double,
    months: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    seconds: Double,
    years: Double
  ): TimeDimensionIntervalResolution = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeDimensionIntervalResolution]
  }
  
  extension [Self <: TimeDimensionIntervalResolution](x: Self) {
    
    inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setYears(value: Double): Self = StObject.set(x, "years", value.asInstanceOf[js.Any])
  }
}
