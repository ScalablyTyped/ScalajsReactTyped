package typingsJapgolly.reachAlert

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reachAlert.reachAlertStrings.assertive
import typingsJapgolly.reachAlert.reachAlertStrings.div
import typingsJapgolly.reachAlert.reachAlertStrings.polite
import typingsJapgolly.reachPolymorphic.mod.ForwardRefComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Welcome to @reach/alert!
    *
    * An alert is an element that displays a brief, important message in a way that
    * attracts the user's attention without interrupting the user's task.
    * Dynamically rendered alerts are automatically announced by most screen
    * readers, and in some operating systems, they may trigger an alert sound.
    *
    * The approach here is to allow developers to render a visual <Alert> and then
    * we mirror that to a couple of aria-live regions behind the scenes. This way,
    * most of the time, developers don't have to think about visual vs. aria
    * alerts.
    *
    * Limitations: Developers can't read from context inside of an Alert because
    * we aren't using ReactDOM.createPortal(), we're actually creating a couple of
    * brand new React roots. We could use createPortal but then apps would need to
    * render the entire app tree in an <AlertProvider>, or maybe there's a way
    * with default context to do it, but we haven't explored that yet. So, we'll
    * see how this goes. If it becomes a problem we can introduce a portal later.
    *
    * @see Docs     https://reach.tech/alert
    * @see Source   https://github.com/reach/reach-ui/tree/main/packages/alert
    * @see WAI-ARIA https://www.w3.org/TR/wai-aria-practices-1.2/#alert
    */
  /**
    * Alert
    *
    * Screen-reader-friendly alert messages. In many apps developers add "alert"
    * messages when network events or other things happen. Users with assistive
    * technologies may not know about the message unless you develop for it.
    *
    * @see Docs https://reach.tech/alert
    */
  @JSImport("@reach/alert", "Alert")
  @js.native
  val Alert: ForwardRefComponent[div, AlertProps] = js.native
  
  /**
    * @see Docs https://reach.tech/alert#alert-props
    */
  trait AlertProps extends StObject {
    
    var children: Node
    
    /**
      * Controls whether the assistive technology should read immediately
      * ("assertive") or wait until the user is idle ("polite").
      *
      * @see Docs https://reach.tech/alert#alert-type
      */
    var `type`: js.UndefOr[assertive | polite] = js.undefined
  }
  object AlertProps {
    
    inline def apply(): AlertProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[AlertProps]
    }
    
    extension [Self <: AlertProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setType(value: assertive | polite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
