package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeLogItemQuery
  extends StObject
     with ClientValueObject {
  
  def get_changeToken(): String
  
  def get_contains(): String
  
  def get_query(): String
  
  def get_queryOptions(): String
  
  def get_rowLimit(): String
  
  def get_viewFields(): String
  
  def get_viewName(): String
  
  def set_changeToken(value: String): Unit
  
  def set_contains(value: String): Unit
  
  def set_query(value: String): Unit
  
  def set_queryOptions(value: String): Unit
  
  def set_rowLimit(value: String): Unit
  
  def set_viewFields(value: String): Unit
  
  def set_viewName(value: String): Unit
}
object ChangeLogItemQuery {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_changeToken: CallbackTo[String],
    get_contains: CallbackTo[String],
    get_query: CallbackTo[String],
    get_queryOptions: CallbackTo[String],
    get_rowLimit: CallbackTo[String],
    get_typeId: CallbackTo[String],
    get_viewFields: CallbackTo[String],
    get_viewName: CallbackTo[String],
    set_changeToken: String => Callback,
    set_contains: String => Callback,
    set_query: String => Callback,
    set_queryOptions: String => Callback,
    set_rowLimit: String => Callback,
    set_viewFields: String => Callback,
    set_viewName: String => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ChangeLogItemQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_changeToken = get_changeToken.toJsFn, get_contains = get_contains.toJsFn, get_query = get_query.toJsFn, get_queryOptions = get_queryOptions.toJsFn, get_rowLimit = get_rowLimit.toJsFn, get_typeId = get_typeId.toJsFn, get_viewFields = get_viewFields.toJsFn, get_viewName = get_viewName.toJsFn, set_changeToken = js.Any.fromFunction1((t0: String) => set_changeToken(t0).runNow()), set_contains = js.Any.fromFunction1((t0: String) => set_contains(t0).runNow()), set_query = js.Any.fromFunction1((t0: String) => set_query(t0).runNow()), set_queryOptions = js.Any.fromFunction1((t0: String) => set_queryOptions(t0).runNow()), set_rowLimit = js.Any.fromFunction1((t0: String) => set_rowLimit(t0).runNow()), set_viewFields = js.Any.fromFunction1((t0: String) => set_viewFields(t0).runNow()), set_viewName = js.Any.fromFunction1((t0: String) => set_viewName(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ChangeLogItemQuery]
  }
  
  extension [Self <: ChangeLogItemQuery](x: Self) {
    
    inline def setGet_changeToken(value: CallbackTo[String]): Self = StObject.set(x, "get_changeToken", value.toJsFn)
    
    inline def setGet_contains(value: CallbackTo[String]): Self = StObject.set(x, "get_contains", value.toJsFn)
    
    inline def setGet_query(value: CallbackTo[String]): Self = StObject.set(x, "get_query", value.toJsFn)
    
    inline def setGet_queryOptions(value: CallbackTo[String]): Self = StObject.set(x, "get_queryOptions", value.toJsFn)
    
    inline def setGet_rowLimit(value: CallbackTo[String]): Self = StObject.set(x, "get_rowLimit", value.toJsFn)
    
    inline def setGet_viewFields(value: CallbackTo[String]): Self = StObject.set(x, "get_viewFields", value.toJsFn)
    
    inline def setGet_viewName(value: CallbackTo[String]): Self = StObject.set(x, "get_viewName", value.toJsFn)
    
    inline def setSet_changeToken(value: String => Callback): Self = StObject.set(x, "set_changeToken", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_contains(value: String => Callback): Self = StObject.set(x, "set_contains", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_query(value: String => Callback): Self = StObject.set(x, "set_query", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_queryOptions(value: String => Callback): Self = StObject.set(x, "set_queryOptions", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_rowLimit(value: String => Callback): Self = StObject.set(x, "set_rowLimit", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_viewFields(value: String => Callback): Self = StObject.set(x, "set_viewFields", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_viewName(value: String => Callback): Self = StObject.set(x, "set_viewName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
