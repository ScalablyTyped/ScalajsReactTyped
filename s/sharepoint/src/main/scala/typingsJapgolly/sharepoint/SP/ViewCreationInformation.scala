package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_paged(): Boolean
  
  def get_personalView(): Boolean
  
  def get_query(): String
  
  def get_rowLimit(): Double
  
  def get_setAsDefaultView(): Boolean
  
  def get_title(): String
  
  def get_viewFields(): js.Array[String]
  
  def get_viewTypeKind(): ViewType
  
  def set_paged(value: Boolean): Unit
  
  def set_personalView(value: Boolean): Unit
  
  def set_query(value: String): Unit
  
  def set_rowLimit(value: Double): Unit
  
  def set_setAsDefaultView(value: Boolean): Unit
  
  def set_title(value: String): Unit
  
  def set_viewFields(value: js.Array[String]): Unit
  
  def set_viewTypeKind(value: ViewType): Unit
}
object ViewCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_paged: CallbackTo[Boolean],
    get_personalView: CallbackTo[Boolean],
    get_query: CallbackTo[String],
    get_rowLimit: CallbackTo[Double],
    get_setAsDefaultView: CallbackTo[Boolean],
    get_title: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_viewFields: CallbackTo[js.Array[String]],
    get_viewTypeKind: CallbackTo[ViewType],
    set_paged: Boolean => Callback,
    set_personalView: Boolean => Callback,
    set_query: String => Callback,
    set_rowLimit: Double => Callback,
    set_setAsDefaultView: Boolean => Callback,
    set_title: String => Callback,
    set_viewFields: js.Array[String] => Callback,
    set_viewTypeKind: ViewType => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ViewCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_paged = get_paged.toJsFn, get_personalView = get_personalView.toJsFn, get_query = get_query.toJsFn, get_rowLimit = get_rowLimit.toJsFn, get_setAsDefaultView = get_setAsDefaultView.toJsFn, get_title = get_title.toJsFn, get_typeId = get_typeId.toJsFn, get_viewFields = get_viewFields.toJsFn, get_viewTypeKind = get_viewTypeKind.toJsFn, set_paged = js.Any.fromFunction1((t0: Boolean) => set_paged(t0).runNow()), set_personalView = js.Any.fromFunction1((t0: Boolean) => set_personalView(t0).runNow()), set_query = js.Any.fromFunction1((t0: String) => set_query(t0).runNow()), set_rowLimit = js.Any.fromFunction1((t0: Double) => set_rowLimit(t0).runNow()), set_setAsDefaultView = js.Any.fromFunction1((t0: Boolean) => set_setAsDefaultView(t0).runNow()), set_title = js.Any.fromFunction1((t0: String) => set_title(t0).runNow()), set_viewFields = js.Any.fromFunction1((t0: js.Array[String]) => set_viewFields(t0).runNow()), set_viewTypeKind = js.Any.fromFunction1((t0: ViewType) => set_viewTypeKind(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ViewCreationInformation]
  }
  
  extension [Self <: ViewCreationInformation](x: Self) {
    
    inline def setGet_paged(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_paged", value.toJsFn)
    
    inline def setGet_personalView(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_personalView", value.toJsFn)
    
    inline def setGet_query(value: CallbackTo[String]): Self = StObject.set(x, "get_query", value.toJsFn)
    
    inline def setGet_rowLimit(value: CallbackTo[Double]): Self = StObject.set(x, "get_rowLimit", value.toJsFn)
    
    inline def setGet_setAsDefaultView(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_setAsDefaultView", value.toJsFn)
    
    inline def setGet_title(value: CallbackTo[String]): Self = StObject.set(x, "get_title", value.toJsFn)
    
    inline def setGet_viewFields(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "get_viewFields", value.toJsFn)
    
    inline def setGet_viewTypeKind(value: CallbackTo[ViewType]): Self = StObject.set(x, "get_viewTypeKind", value.toJsFn)
    
    inline def setSet_paged(value: Boolean => Callback): Self = StObject.set(x, "set_paged", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_personalView(value: Boolean => Callback): Self = StObject.set(x, "set_personalView", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_query(value: String => Callback): Self = StObject.set(x, "set_query", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_rowLimit(value: Double => Callback): Self = StObject.set(x, "set_rowLimit", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSet_setAsDefaultView(value: Boolean => Callback): Self = StObject.set(x, "set_setAsDefaultView", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_title(value: String => Callback): Self = StObject.set(x, "set_title", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_viewFields(value: js.Array[String] => Callback): Self = StObject.set(x, "set_viewFields", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setSet_viewTypeKind(value: ViewType => Callback): Self = StObject.set(x, "set_viewTypeKind", js.Any.fromFunction1((t0: ViewType) => value(t0).runNow()))
  }
}
