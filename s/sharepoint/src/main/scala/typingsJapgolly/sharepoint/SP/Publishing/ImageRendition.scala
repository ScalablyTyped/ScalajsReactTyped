package typingsJapgolly.sharepoint.SP.Publishing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRendition
  extends StObject
     with ClientValueObject {
  
  def get_height(): Double
  
  def get_id(): Double
  
  def get_name(): String
  
  def get_version(): Double
  
  def get_width(): Double
  
  def set_height(value: Double): Double
  
  def set_name(value: String): String
  
  def set_width(value: Double): Double
}
object ImageRendition {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_height: CallbackTo[Double],
    get_id: CallbackTo[Double],
    get_name: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_version: CallbackTo[Double],
    get_width: CallbackTo[Double],
    set_height: Double => Double,
    set_name: String => String,
    set_width: Double => Double,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ImageRendition = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_height = get_height.toJsFn, get_id = get_id.toJsFn, get_name = get_name.toJsFn, get_typeId = get_typeId.toJsFn, get_version = get_version.toJsFn, get_width = get_width.toJsFn, set_height = js.Any.fromFunction1(set_height), set_name = js.Any.fromFunction1(set_name), set_width = js.Any.fromFunction1(set_width), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ImageRendition]
  }
  
  extension [Self <: ImageRendition](x: Self) {
    
    inline def setGet_height(value: CallbackTo[Double]): Self = StObject.set(x, "get_height", value.toJsFn)
    
    inline def setGet_id(value: CallbackTo[Double]): Self = StObject.set(x, "get_id", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setGet_version(value: CallbackTo[Double]): Self = StObject.set(x, "get_version", value.toJsFn)
    
    inline def setGet_width(value: CallbackTo[Double]): Self = StObject.set(x, "get_width", value.toJsFn)
    
    inline def setSet_height(value: Double => Double): Self = StObject.set(x, "set_height", js.Any.fromFunction1(value))
    
    inline def setSet_name(value: String => String): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
    
    inline def setSet_width(value: Double => Double): Self = StObject.set(x, "set_width", js.Any.fromFunction1(value))
  }
}
