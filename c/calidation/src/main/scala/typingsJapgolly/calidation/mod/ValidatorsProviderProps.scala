package typingsJapgolly.calidation.mod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatorsProviderProps[T /* <: js.Object */] extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  var validators: Record[String, CustomValidatorFunction[T]]
}
object ValidatorsProviderProps {
  
  inline def apply[T /* <: js.Object */](validators: Record[String, CustomValidatorFunction[T]]): ValidatorsProviderProps[T] = {
    val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorsProviderProps[T]]
  }
  
  extension [Self <: ValidatorsProviderProps[?], T /* <: js.Object */](x: Self & ValidatorsProviderProps[T]) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setValidators(value: Record[String, CustomValidatorFunction[T]]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
  }
}
