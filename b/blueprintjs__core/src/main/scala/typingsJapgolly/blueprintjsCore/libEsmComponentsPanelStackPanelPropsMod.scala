package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsPanelStackPanelPropsMod {
  
  trait IPanel[P] extends StObject {
    
    /**
      * The component type to render for this panel. This must be a reference to
      * the component class or SFC, _not_ a JSX element, so it can be re-created
      * dynamically when needed.
      */
    var component: ComponentType[P & IPanelProps]
    
    /**
      * HTML title to be passed to the <Text> component
      */
    var htmlTitle: js.UndefOr[String] = js.undefined
    
    /**
      * The props passed to the component type when it is rendered. The methods
      * in `IPanelProps` will be injected by `PanelStack`.
      */
    var props: js.UndefOr[P] = js.undefined
    
    /**
      * The title to be displayed above this panel. It is also used as the text
      * of the back button for any panel opened by this panel.
      */
    var title: js.UndefOr[Node] = js.undefined
  }
  object IPanel {
    
    inline def apply[P](component: ComponentType[P & IPanelProps]): IPanel[P] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPanel[P]]
    }
    
    extension [Self <: IPanel[?], P](x: Self & IPanel[P]) {
      
      inline def setComponent(value: ComponentType[P & IPanelProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
      
      inline def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait IPanelProps extends StObject {
    
    /**
      * Call this method to programatically close this panel. If this is the only
      * panel on the stack then this method will do nothing.
      *
      * Remember that the panel header always contains a "back" button that
      * closes this panel on click (unless there is only one panel on the stack).
      */
    def closePanel(): Unit
    
    /**
      * Call this method to open a new panel on the top of the stack.
      */
    def openPanel[P](panel: IPanel[P]): Unit
  }
  object IPanelProps {
    
    inline def apply(closePanel: Callback, openPanel: IPanel[Any] => Callback): IPanelProps = {
      val __obj = js.Dynamic.literal(closePanel = closePanel.toJsFn, openPanel = js.Any.fromFunction1((t0: IPanel[Any]) => openPanel(t0).runNow()))
      __obj.asInstanceOf[IPanelProps]
    }
    
    extension [Self <: IPanelProps](x: Self) {
      
      inline def setClosePanel(value: Callback): Self = StObject.set(x, "closePanel", value.toJsFn)
      
      inline def setOpenPanel(value: IPanel[Any] => Callback): Self = StObject.set(x, "openPanel", js.Any.fromFunction1((t0: IPanel[Any]) => value(t0).runNow()))
    }
  }
}
