package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmlDateTime extends StObject {
  
  /**
    * Returns the date and time in XML Schema time format.
    */
  def get(): String
  
  /**
    * Set the date.  Accepts only XML Schema time (see XML Schema Part 2: Datatypes Second Edition).
    * The value can be expressed as yyyy-mm-ddThh:mm:sszzzzzz, where T is the separator between the date and the time,
    * and the time zone is either Z(for UTC) or zzzzzz, which represents +/-hh:mm in relation to UTC.
    * Additionally, the value can be expressed as a date only.
    */
  def set(date: String): Unit
}
object KmlDateTime {
  
  inline def apply(get: CallbackTo[String], set: String => Callback): KmlDateTime = {
    val __obj = js.Dynamic.literal(get = get.toJsFn, set = js.Any.fromFunction1((t0: String) => set(t0).runNow()))
    __obj.asInstanceOf[KmlDateTime]
  }
  
  extension [Self <: KmlDateTime](x: Self) {
    
    inline def setGet(value: CallbackTo[String]): Self = StObject.set(x, "get", value.toJsFn)
    
    inline def setSet(value: String => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
