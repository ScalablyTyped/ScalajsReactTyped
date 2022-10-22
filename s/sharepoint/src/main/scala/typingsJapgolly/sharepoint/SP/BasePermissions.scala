package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasePermissions
  extends StObject
     with ClientValueObject {
  
  def clear(perm: PermissionKind): Unit
  
  def clearAll(): Unit
  
  def equals(perm: BasePermissions): Boolean
  
  def has(perm: PermissionKind): Boolean
  
  def hasPermissions(high: Double, low: Double): Boolean
  
  def set(perm: PermissionKind): Unit
}
object BasePermissions {
  
  inline def apply(
    clear: PermissionKind => Callback,
    clearAll: Callback,
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    equals_ : BasePermissions => Boolean,
    fromJson: Any => Callback,
    get_typeId: CallbackTo[String],
    has: PermissionKind => Boolean,
    hasPermissions: (Double, Double) => Boolean,
    set: PermissionKind => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): BasePermissions = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1((t0: PermissionKind) => clear(t0).runNow()), clearAll = clearAll.toJsFn, customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_typeId = get_typeId.toJsFn, has = js.Any.fromFunction1(has), hasPermissions = js.Any.fromFunction2(hasPermissions), set = js.Any.fromFunction1((t0: PermissionKind) => set(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[BasePermissions]
  }
  
  extension [Self <: BasePermissions](x: Self) {
    
    inline def setClear(value: PermissionKind => Callback): Self = StObject.set(x, "clear", js.Any.fromFunction1((t0: PermissionKind) => value(t0).runNow()))
    
    inline def setClearAll(value: Callback): Self = StObject.set(x, "clearAll", value.toJsFn)
    
    inline def setEquals_(value: BasePermissions => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setHas(value: PermissionKind => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
    
    inline def setHasPermissions(value: (Double, Double) => Boolean): Self = StObject.set(x, "hasPermissions", js.Any.fromFunction2(value))
    
    inline def setSet(value: PermissionKind => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: PermissionKind) => value(t0).runNow()))
  }
}
