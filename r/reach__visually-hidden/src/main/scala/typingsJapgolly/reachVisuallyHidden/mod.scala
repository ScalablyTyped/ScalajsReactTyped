package typingsJapgolly.reachVisuallyHidden

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reachPolymorphic.mod.ForwardRefComponent
import typingsJapgolly.reachVisuallyHidden.reachVisuallyHiddenStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Welcome to @reach/visually-hidden!
    *
    * Provides text for screen readers that is visually hidden.
    * It is the logical opposite of the `aria-hidden` attribute.
    *
    * @see https://snook.ca/archives/html_and_css/hiding-content-for-accessibility
    * @see https://a11yproject.com/posts/how-to-hide-content/
    * @see Docs     https://reach.tech/visually-hidden
    * @see Source   https://github.com/reach/reach-ui/tree/main/packages/visually-hidden
    */
  /**
    * VisuallyHidden
    *
    * Provides text for screen readers that is visually hidden.
    * It is the logical opposite of the `aria-hidden` attribute.
    */
  @JSImport("@reach/visually-hidden", "VisuallyHidden")
  @js.native
  val VisuallyHidden: ForwardRefComponent[span, VisuallyHiddenProps] = js.native
  
  /**
    * @see Docs https://reach.tech/visually-hidden#visuallyhidden-props
    */
  trait VisuallyHiddenProps extends StObject {
    
    /**
      * @see Docs https://reach.tech/visually-hidden#visuallyhidden-children
      */
    var children: Node
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
    }
  }
}
