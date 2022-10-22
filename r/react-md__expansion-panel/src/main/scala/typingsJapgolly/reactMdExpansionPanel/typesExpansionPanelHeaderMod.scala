package typingsJapgolly.reactMdExpansionPanel

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExpansionPanelHeaderMod {
  
  @JSImport("@react-md/expansion-panel/types/ExpansionPanelHeader", "ExpansionPanelHeader")
  @js.native
  val ExpansionPanelHeader: ForwardRefExoticComponent[ExpansionPanelHeaderProps & RefAttributes[HTMLButtonElement]] = js.native
  
  trait ExpansionPanelHeaderProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    /**
      * The children to display within the header.
      *
      * Reminder: Since this is a `<button>`, only `inline` elements should be
      * rendered within (so use `<span>` instead of `<div>` for children).
      */
    @JSName("children")
    var children_ExpansionPanelHeaderProps: Node
    
    /**
      * Boolean if the icon rotation transition should be disabled.
      */
    var disableTransition: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the panel is currently expanded. This is just used to rotate the
      * icon as needed.
      */
    var expanded: Boolean
    
    /**
      * The icon to use for the expander icon.
      */
    var icon: js.UndefOr[Node] = js.undefined
    
    /**
      * The id for the header. This is required for a11y.
      */
    @JSName("id")
    var id_ExpansionPanelHeaderProps: String
    
    /**
      * The click handler that should attempt to toggle the expansion state of the
      * panel.
      */
    @JSName("onClick")
    var onClick_ExpansionPanelHeaderProps: MouseEventHandler[HTMLButtonElement]
  }
  object ExpansionPanelHeaderProps {
    
    inline def apply(
      expanded: Boolean,
      id: String,
      onClick: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback
    ): ExpansionPanelHeaderProps = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => onClick(t0).runNow()), children = null)
      __obj.asInstanceOf[ExpansionPanelHeaderProps]
    }
    
    extension [Self <: ExpansionPanelHeaderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisableTransition(value: Boolean): Self = StObject.set(x, "disableTransition", value.asInstanceOf[js.Any])
      
      inline def setDisableTransitionUndefined: Self = StObject.set(x, "disableTransition", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
    }
  }
}
