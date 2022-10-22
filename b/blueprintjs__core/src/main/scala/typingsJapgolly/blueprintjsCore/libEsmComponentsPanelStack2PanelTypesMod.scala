package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsPanelStack2PanelTypesMod {
  
  trait Panel[P] extends StObject {
    
    /**
      * HTML title to be passed to the <Text> component
      */
    var htmlTitle: js.UndefOr[String] = js.undefined
    
    /**
      * The props passed to the component type when it is rendered. The methods
      * in `PanelActions` will be injected by `PanelStack2`.
      */
    var props: js.UndefOr[P] = js.undefined
    
    /**
      * The renderer for this panel.
      */
    def renderPanel(props: PanelProps[P]): Element | Null
    
    /**
      * The title to be displayed above this panel. It is also used as the text
      * of the back button for any panel opened by this panel.
      */
    var title: js.UndefOr[Node] = js.undefined
  }
  object Panel {
    
    inline def apply[P](renderPanel: PanelProps[P] => Element | Null): Panel[P] = {
      val __obj = js.Dynamic.literal(renderPanel = js.Any.fromFunction1(renderPanel))
      __obj.asInstanceOf[Panel[P]]
    }
    
    extension [Self <: Panel[?], P](x: Self & Panel[P]) {
      
      inline def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
      
      inline def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setRenderPanel(value: PanelProps[P] => Element | Null): Self = StObject.set(x, "renderPanel", js.Any.fromFunction1(value))
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait PanelActions extends StObject {
    
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
    def openPanel[P](panel: Panel[P]): Unit
  }
  object PanelActions {
    
    inline def apply(closePanel: Callback, openPanel: Panel[Any] => Callback): PanelActions = {
      val __obj = js.Dynamic.literal(closePanel = closePanel.toJsFn, openPanel = js.Any.fromFunction1((t0: Panel[Any]) => openPanel(t0).runNow()))
      __obj.asInstanceOf[PanelActions]
    }
    
    extension [Self <: PanelActions](x: Self) {
      
      inline def setClosePanel(value: Callback): Self = StObject.set(x, "closePanel", value.toJsFn)
      
      inline def setOpenPanel(value: Panel[Any] => Callback): Self = StObject.set(x, "openPanel", js.Any.fromFunction1((t0: Panel[Any]) => value(t0).runNow()))
    }
  }
  
  type PanelProps[P] = P & PanelActions
}
