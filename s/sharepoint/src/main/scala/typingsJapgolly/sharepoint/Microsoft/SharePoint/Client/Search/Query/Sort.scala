package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.sharepoint.SP.ClientValueObject
import typingsJapgolly.sharepoint.SP.SerializationContext
import typingsJapgolly.sharepoint.SP.XmlWriter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sort
  extends StObject
     with ClientValueObject {
  
  def get_direction(): SortDirection
  
  def get_property(): String
  
  def set_direction(value: SortDirection): Unit
  
  def set_property(value: String): Unit
}
object Sort {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_direction: CallbackTo[SortDirection],
    get_property: CallbackTo[String],
    get_typeId: CallbackTo[String],
    set_direction: SortDirection => Callback,
    set_property: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): Sort = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_direction = get_direction.toJsFn, get_property = get_property.toJsFn, get_typeId = get_typeId.toJsFn, set_direction = js.Any.fromFunction1((t0: SortDirection) => set_direction(t0).runNow()), set_property = js.Any.fromFunction1((t0: String) => set_property(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[Sort]
  }
  
  extension [Self <: Sort](x: Self) {
    
    inline def setGet_direction(value: CallbackTo[SortDirection]): Self = StObject.set(x, "get_direction", value.toJsFn)
    
    inline def setGet_property(value: CallbackTo[String]): Self = StObject.set(x, "get_property", value.toJsFn)
    
    inline def setSet_direction(value: SortDirection => Callback): Self = StObject.set(x, "set_direction", js.Any.fromFunction1((t0: SortDirection) => value(t0).runNow()))
    
    inline def setSet_property(value: String => Callback): Self = StObject.set(x, "set_property", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
