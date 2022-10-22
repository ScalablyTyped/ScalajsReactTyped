package typingsJapgolly.sharepoint.SP.Taxonomy

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.Guid
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaxonomyFieldValue
  extends StObject
     with ClientValueObject {
  
  def get_label(): String
  
  def get_termGuid(): Guid
  
  def get_wssId(): Double
  
  def set_label(value: String): Unit
  
  def set_termGuid(value: Guid): Unit
  
  def set_wssId(value: Double): Unit
}
object TaxonomyFieldValue {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_label: CallbackTo[String],
    get_termGuid: CallbackTo[Guid],
    get_typeId: CallbackTo[String],
    get_wssId: CallbackTo[Double],
    set_label: String => Callback,
    set_termGuid: Guid => Callback,
    set_wssId: Double => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): TaxonomyFieldValue = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_label = get_label.toJsFn, get_termGuid = get_termGuid.toJsFn, get_typeId = get_typeId.toJsFn, get_wssId = get_wssId.toJsFn, set_label = js.Any.fromFunction1((t0: String) => set_label(t0).runNow()), set_termGuid = js.Any.fromFunction1((t0: Guid) => set_termGuid(t0).runNow()), set_wssId = js.Any.fromFunction1((t0: Double) => set_wssId(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[TaxonomyFieldValue]
  }
  
  extension [Self <: TaxonomyFieldValue](x: Self) {
    
    inline def setGet_label(value: CallbackTo[String]): Self = StObject.set(x, "get_label", value.toJsFn)
    
    inline def setGet_termGuid(value: CallbackTo[Guid]): Self = StObject.set(x, "get_termGuid", value.toJsFn)
    
    inline def setGet_wssId(value: CallbackTo[Double]): Self = StObject.set(x, "get_wssId", value.toJsFn)
    
    inline def setSet_label(value: String => Callback): Self = StObject.set(x, "set_label", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_termGuid(value: Guid => Callback): Self = StObject.set(x, "set_termGuid", js.Any.fromFunction1((t0: Guid) => value(t0).runNow()))
    
    inline def setSet_wssId(value: Double => Callback): Self = StObject.set(x, "set_wssId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
