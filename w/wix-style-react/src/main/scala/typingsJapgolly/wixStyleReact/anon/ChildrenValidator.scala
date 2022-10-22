package typingsJapgolly.wixStyleReact.anon

import typingsJapgolly.propTypes.mod.ReactElementLike
import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenValidator extends StObject {
  
  var children: Validator[ReactElementLike]
  
  var dataHook: Requireable[String]
}
object ChildrenValidator {
  
  inline def apply(children: Validator[ReactElementLike], dataHook: Requireable[String]): ChildrenValidator = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenValidator]
  }
  
  extension [Self <: ChildrenValidator](x: Self) {
    
    inline def setChildren(value: Validator[ReactElementLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
  }
}
