package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.IEnumerable
import typingsJapgolly.sharepoint.IEnumerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientValueObjectCollection[T]
  extends StObject
     with ClientValueObject
     with IEnumerable[T] {
  
  def get_count(): Double
}
object ClientValueObjectCollection {
  
  inline def apply[T](
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    getEnumerator: CallbackTo[IEnumerator[T]],
    get_count: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ClientValueObjectCollection[T] = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), getEnumerator = getEnumerator.toJsFn, get_count = get_count.toJsFn, get_typeId = get_typeId.toJsFn, writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ClientValueObjectCollection[T]]
  }
  
  extension [Self <: ClientValueObjectCollection[?], T](x: Self & ClientValueObjectCollection[T]) {
    
    inline def setGet_count(value: CallbackTo[Double]): Self = StObject.set(x, "get_count", value.toJsFn)
  }
}
