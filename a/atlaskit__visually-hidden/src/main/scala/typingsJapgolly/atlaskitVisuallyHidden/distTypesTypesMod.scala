package typingsJapgolly.atlaskitVisuallyHidden

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesMod {
  
  trait VisuallyHiddenProps extends StObject {
    
    /**
      * The element or elements that should be hidden.
      */
    var children: Node
    
    /**
      * An id may be appropriate for this component if used in conjunction with `aria-describedby`
      * on a paired element.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Role attribute is passed on to the span to aid screen readers.
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * A `testId` prop is provided for specified elements, which is a unique
      * string that appears as a data attribute `data-testid` in the rendered code,
      * serving as a hook for automated tests
      */
    var testId: js.UndefOr[String] = js.undefined
  }
  object VisuallyHiddenProps {
    
    inline def apply(): VisuallyHiddenProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[VisuallyHiddenProps]
    }
    
    extension [Self <: VisuallyHiddenProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
      
      inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
    }
  }
}
