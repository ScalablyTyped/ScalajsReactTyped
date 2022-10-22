package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldGeolocationValue
  extends StObject
     with ClientValueObject {
  
  def get_altitude(): Double
  
  def get_latitude(): Double
  
  def get_longitude(): Double
  
  def get_measure(): Double
  
  def set_altitude(value: Double): Unit
  
  def set_latitude(value: Double): Unit
  
  def set_longitude(value: Double): Unit
  
  def set_measure(value: Double): Unit
}
object FieldGeolocationValue {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_altitude: CallbackTo[Double],
    get_latitude: CallbackTo[Double],
    get_longitude: CallbackTo[Double],
    get_measure: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    set_altitude: Double => Callback,
    set_latitude: Double => Callback,
    set_longitude: Double => Callback,
    set_measure: Double => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): FieldGeolocationValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_altitude = get_altitude.toJsFn, get_latitude = get_latitude.toJsFn, get_longitude = get_longitude.toJsFn, get_measure = get_measure.toJsFn, get_typeId = get_typeId.toJsFn, set_altitude = js.Any.fromFunction1((t0: Double) => set_altitude(t0).runNow()), set_latitude = js.Any.fromFunction1((t0: Double) => set_latitude(t0).runNow()), set_longitude = js.Any.fromFunction1((t0: Double) => set_longitude(t0).runNow()), set_measure = js.Any.fromFunction1((t0: Double) => set_measure(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[FieldGeolocationValue]
  }
  
  extension [Self <: FieldGeolocationValue](x: Self) {
    
    inline def setGet_altitude(value: CallbackTo[Double]): Self = StObject.set(x, "get_altitude", value.toJsFn)
    
    inline def setGet_latitude(value: CallbackTo[Double]): Self = StObject.set(x, "get_latitude", value.toJsFn)
    
    inline def setGet_longitude(value: CallbackTo[Double]): Self = StObject.set(x, "get_longitude", value.toJsFn)
    
    inline def setGet_measure(value: CallbackTo[Double]): Self = StObject.set(x, "get_measure", value.toJsFn)
    
    inline def setSet_altitude(value: Double => Callback): Self = StObject.set(x, "set_altitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_latitude(value: Double => Callback): Self = StObject.set(x, "set_latitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_longitude(value: Double => Callback): Self = StObject.set(x, "set_longitude", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_measure(value: Double => Callback): Self = StObject.set(x, "set_measure", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
