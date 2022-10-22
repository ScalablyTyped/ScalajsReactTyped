package typingsJapgolly.activexAccess.Access

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedResource extends StObject {
  
  /* private */ @JSName("Access.SharedResource_typekey")
  var AccessDotSharedResource_typekey: SharedResource
  
  def Delete(): Unit
  
  def IsMemberSafe(dispid: Double): Boolean
  
  var Name: String
  
  val Parent: Any
  
  val Type: AcResourceType
}
object SharedResource {
  
  inline def apply(
    AccessDotSharedResource_typekey: SharedResource,
    Delete: Callback,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: Any,
    Type: AcResourceType
  ): SharedResource = {
    val __obj = js.Dynamic.literal(Delete = Delete.toJsFn, IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SharedResource_typekey")(AccessDotSharedResource_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedResource]
  }
  
  extension [Self <: SharedResource](x: Self) {
    
    inline def setAccessDotSharedResource_typekey(value: SharedResource): Self = StObject.set(x, "Access.SharedResource_typekey", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setType(value: AcResourceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
