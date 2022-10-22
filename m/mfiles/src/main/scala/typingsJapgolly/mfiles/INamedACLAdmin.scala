package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INamedACLAdmin extends StObject {
  
  var AccessControlListForNamedACL: IAccessControlList
  
  def Clone(): INamedACLAdmin
  
  var NamedACL: INamedACL
  
  var SemanticAliases: ISemanticAliases
}
object INamedACLAdmin {
  
  inline def apply(
    AccessControlListForNamedACL: IAccessControlList,
    Clone: CallbackTo[INamedACLAdmin],
    NamedACL: INamedACL,
    SemanticAliases: ISemanticAliases
  ): INamedACLAdmin = {
    val __obj = js.Dynamic.literal(AccessControlListForNamedACL = AccessControlListForNamedACL.asInstanceOf[js.Any], Clone = Clone.toJsFn, NamedACL = NamedACL.asInstanceOf[js.Any], SemanticAliases = SemanticAliases.asInstanceOf[js.Any])
    __obj.asInstanceOf[INamedACLAdmin]
  }
  
  extension [Self <: INamedACLAdmin](x: Self) {
    
    inline def setAccessControlListForNamedACL(value: IAccessControlList): Self = StObject.set(x, "AccessControlListForNamedACL", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[INamedACLAdmin]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setNamedACL(value: INamedACL): Self = StObject.set(x, "NamedACL", value.asInstanceOf[js.Any])
    
    inline def setSemanticAliases(value: ISemanticAliases): Self = StObject.set(x, "SemanticAliases", value.asInstanceOf[js.Any])
  }
}
