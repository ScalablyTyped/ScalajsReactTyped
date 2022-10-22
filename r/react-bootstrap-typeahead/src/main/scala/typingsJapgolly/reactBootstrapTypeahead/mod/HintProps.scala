package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HintProps extends StObject {
  
  /* Hint expects a single child: your input component. */
  var children: Node
  
  var className: js.UndefOr[String] = js.undefined
  
  /* Callback function that determines whether the hint should be selected. */
  var shouldSelect: js.UndefOr[ShouldSelect] = js.undefined
}
object HintProps {
  
  inline def apply(): HintProps = {
    val __obj = js.Dynamic.literal(children = null)
    __obj.asInstanceOf[HintProps]
  }
  
  extension [Self <: HintProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setShouldSelect(value: (/* shouldSelect */ Boolean, /* e */ ReactKeyboardEventFrom[HTMLInputElement]) => Boolean): Self = StObject.set(x, "shouldSelect", js.Any.fromFunction2(value))
    
    inline def setShouldSelectUndefined: Self = StObject.set(x, "shouldSelect", js.undefined)
  }
}
