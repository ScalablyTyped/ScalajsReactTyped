package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZoneInformation
  extends StObject
     with ClientValueObject {
  
  def get_bias(): Double
  
  def get_daylightBias(): Double
  
  def get_standardBias(): Double
}
object TimeZoneInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_bias: CallbackTo[Double],
    get_daylightBias: CallbackTo[Double],
    get_standardBias: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): TimeZoneInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_bias = get_bias.toJsFn, get_daylightBias = get_daylightBias.toJsFn, get_standardBias = get_standardBias.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[TimeZoneInformation]
  }
  
  extension [Self <: TimeZoneInformation](x: Self) {
    
    inline def setGet_bias(value: CallbackTo[Double]): Self = StObject.set(x, "get_bias", value.toJsFn)
    
    inline def setGet_daylightBias(value: CallbackTo[Double]): Self = StObject.set(x, "get_daylightBias", value.toJsFn)
    
    inline def setGet_standardBias(value: CallbackTo[Double]): Self = StObject.set(x, "get_standardBias", value.toJsFn)
  }
}
