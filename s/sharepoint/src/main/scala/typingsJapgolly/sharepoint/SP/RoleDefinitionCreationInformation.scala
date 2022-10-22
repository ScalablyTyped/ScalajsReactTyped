package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleDefinitionCreationInformation
  extends StObject
     with ClientValueObject {
  
  def get_basePermissions(): BasePermissions
  
  def get_description(): String
  
  def get_name(): String
  
  def get_order(): Double
  
  def set_basePermissions(value: BasePermissions): Unit
  
  def set_description(value: String): Unit
  
  def set_name(value: String): Unit
  
  def set_order(value: Double): Unit
}
object RoleDefinitionCreationInformation {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_basePermissions: CallbackTo[BasePermissions],
    get_description: CallbackTo[String],
    get_name: CallbackTo[String],
    get_order: CallbackTo[Double],
    get_typeId: CallbackTo[String],
    set_basePermissions: BasePermissions => Callback,
    set_description: String => Callback,
    set_name: String => Callback,
    set_order: Double => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): RoleDefinitionCreationInformation = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_basePermissions = get_basePermissions.toJsFn, get_description = get_description.toJsFn, get_name = get_name.toJsFn, get_order = get_order.toJsFn, get_typeId = get_typeId.toJsFn, set_basePermissions = js.Any.fromFunction1((t0: BasePermissions) => set_basePermissions(t0).runNow()), set_description = js.Any.fromFunction1((t0: String) => set_description(t0).runNow()), set_name = js.Any.fromFunction1((t0: String) => set_name(t0).runNow()), set_order = js.Any.fromFunction1((t0: Double) => set_order(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[RoleDefinitionCreationInformation]
  }
  
  extension [Self <: RoleDefinitionCreationInformation](x: Self) {
    
    inline def setGet_basePermissions(value: CallbackTo[BasePermissions]): Self = StObject.set(x, "get_basePermissions", value.toJsFn)
    
    inline def setGet_description(value: CallbackTo[String]): Self = StObject.set(x, "get_description", value.toJsFn)
    
    inline def setGet_name(value: CallbackTo[String]): Self = StObject.set(x, "get_name", value.toJsFn)
    
    inline def setGet_order(value: CallbackTo[Double]): Self = StObject.set(x, "get_order", value.toJsFn)
    
    inline def setSet_basePermissions(value: BasePermissions => Callback): Self = StObject.set(x, "set_basePermissions", js.Any.fromFunction1((t0: BasePermissions) => value(t0).runNow()))
    
    inline def setSet_description(value: String => Callback): Self = StObject.set(x, "set_description", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_name(value: String => Callback): Self = StObject.set(x, "set_name", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSet_order(value: Double => Callback): Self = StObject.set(x, "set_order", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
