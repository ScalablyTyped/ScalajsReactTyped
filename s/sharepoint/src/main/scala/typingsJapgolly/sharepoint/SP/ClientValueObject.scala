package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientValueObject extends StObject {
  
  def customFromJson(obj: Any): Boolean
  
  def customWriteToXml(writer: XmlWriter, serializationContext: SerializationContext): Boolean
  
  def fromJson(obj: Any): Unit
  
  def get_typeId(): String
  
  def writeToXml(writer: XmlWriter, serializationContext: SerializationContext): Unit
}
object ClientValueObject {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ClientValueObject = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ClientValueObject]
  }
  
  extension [Self <: ClientValueObject](x: Self) {
    
    inline def setCustomFromJson(value: Any => Boolean): Self = StObject.set(x, "customFromJson", js.Any.fromFunction1(value))
    
    inline def setCustomWriteToXml(value: (XmlWriter, SerializationContext) => Boolean): Self = StObject.set(x, "customWriteToXml", js.Any.fromFunction2(value))
    
    inline def setFromJson(value: Any => Callback): Self = StObject.set(x, "fromJson", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGet_typeId(value: CallbackTo[String]): Self = StObject.set(x, "get_typeId", value.toJsFn)
    
    inline def setWriteToXml(value: (XmlWriter, SerializationContext) => Callback): Self = StObject.set(x, "writeToXml", js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (value(t0, t1)).runNow()))
  }
}
