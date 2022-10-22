package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFormMessageCounterMod {
  
  @JSImport("@react-md/form/types/FormMessageCounter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormMessageCounter(hasChildrenClassNameProps: FormMessageCounterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FormMessageCounter")(hasChildrenClassNameProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait FormMessageCounterProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    /**
      * The children to display in the counter. This is normally a string like:
      *
      * @example
      * String Example
      * ```ts
      * `${min} / ${max}`
      * ```
      */
    @JSName("children")
    var children_FormMessageCounterProps: Node
  }
  object FormMessageCounterProps {
    
    inline def apply(): FormMessageCounterProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[FormMessageCounterProps]
    }
    
    extension [Self <: FormMessageCounterProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
