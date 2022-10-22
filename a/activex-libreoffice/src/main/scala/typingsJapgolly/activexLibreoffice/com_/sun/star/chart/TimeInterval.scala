package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes an interval on a date-axis
  * @since OOo 3.4
  */
trait TimeInterval extends StObject {
  
  /** specifies the number of units */
  var Number: Double
  
  /**
    * specifies a unit for the interval
    *
    * is a value out of the constant group {@link com.sun.star.chart.TimeUnit} .
    */
  var TimeUnit: Double
}
object TimeInterval {
  
  inline def apply(Number: Double, TimeUnit: Double): TimeInterval = {
    val __obj = js.Dynamic.literal(Number = Number.asInstanceOf[js.Any], TimeUnit = TimeUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInterval]
  }
  
  extension [Self <: TimeInterval](x: Self) {
    
    inline def setNumber(value: Double): Self = StObject.set(x, "Number", value.asInstanceOf[js.Any])
    
    inline def setTimeUnit(value: Double): Self = StObject.set(x, "TimeUnit", value.asInstanceOf[js.Any])
  }
}
