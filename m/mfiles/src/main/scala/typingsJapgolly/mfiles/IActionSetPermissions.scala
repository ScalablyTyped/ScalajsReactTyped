package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IActionSetPermissions extends StObject {
  
  def Clone(): IActionSetPermissions
  
  var DiscardsAutomaticPermissions: Boolean
  
  var Permissions: IAccessControlList
}
object IActionSetPermissions {
  
  inline def apply(
    Clone: CallbackTo[IActionSetPermissions],
    DiscardsAutomaticPermissions: Boolean,
    Permissions: IAccessControlList
  ): IActionSetPermissions = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, DiscardsAutomaticPermissions = DiscardsAutomaticPermissions.asInstanceOf[js.Any], Permissions = Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IActionSetPermissions]
  }
  
  extension [Self <: IActionSetPermissions](x: Self) {
    
    inline def setClone(value: CallbackTo[IActionSetPermissions]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setDiscardsAutomaticPermissions(value: Boolean): Self = StObject.set(x, "DiscardsAutomaticPermissions", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: IAccessControlList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
  }
}
