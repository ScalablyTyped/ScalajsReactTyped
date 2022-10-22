package typingsJapgolly.activexAccess.Access

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagProperty extends StObject {
  
  /* private */ @JSName("Access.SmartTagProperty_typekey")
  var AccessDotSmartTagProperty_typekey: SmartTagProperty
  
  def Delete(): Unit
  
  def IsMemberSafe(dispid: Double): Boolean
  
  var Name: String
  
  var Value: String
}
object SmartTagProperty {
  
  inline def apply(
    AccessDotSmartTagProperty_typekey: SmartTagProperty,
    Delete: Callback,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: String
  ): SmartTagProperty = {
    val __obj = js.Dynamic.literal(Delete = Delete.toJsFn, IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SmartTagProperty_typekey")(AccessDotSmartTagProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagProperty]
  }
  
  extension [Self <: SmartTagProperty](x: Self) {
    
    inline def setAccessDotSmartTagProperty_typekey(value: SmartTagProperty): Self = StObject.set(x, "Access.SmartTagProperty_typekey", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
