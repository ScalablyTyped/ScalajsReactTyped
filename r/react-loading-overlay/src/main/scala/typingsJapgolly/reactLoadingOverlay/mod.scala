package typingsJapgolly.reactLoadingOverlay

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactLoadingOverlay.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-loading-overlay", JSImport.Default)
  @js.native
  open class default ()
    extends Component[LoadingOverlayProps, js.Object, Any]
  
  type LoadingOverlay = japgolly.scalajs.react.facade.React.Component[LoadingOverlayProps & js.Object, js.Object]
  
  trait LoadingOverlayProps extends StObject {
    
    /** default: ``true`` - whether the loader is visible. */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * default: ``undefined`` - the className for the wrapping ``<div />`` that
      *  is present whether active or not.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * default: ``_loading_overlay_`` - the prefix for all classNames on the
      * generated elements. see Styling for more info.
      */
    var classNamePrefix: js.UndefOr[String] = js.undefined
    
    /** default: ``500`` - the transition speed for fading out the overlay. */
    var fadeSpeed: js.UndefOr[Double] = js.undefined
    
    /** default: ``undefined`` - click handler for the overlay when active. */
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    /**
      * default: ``false`` - renders the default spinner when true (and when the
      * loader is active). Otherwise you can provide any valid react node to use
      * your own spinner.
      */
    var spinner: js.UndefOr[Boolean | Node] = js.undefined
    
    /**
      * default: ``undefined`` - see Styling for more info.
      */
    var styles: js.UndefOr[Content] = js.undefined
    
    /**
      * default: ``undefined`` - the text or react node to render in the loader overlay when active.
      */
    var text: js.UndefOr[Node] = js.undefined
  }
  object LoadingOverlayProps {
    
    inline def apply(): LoadingOverlayProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadingOverlayProps]
    }
    
    extension [Self <: LoadingOverlayProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFadeSpeed(value: Double): Self = StObject.set(x, "fadeSpeed", value.asInstanceOf[js.Any])
      
      inline def setFadeSpeedUndefined: Self = StObject.set(x, "fadeSpeed", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[HTMLDivElement & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSpinner(value: Boolean | Node): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerNull: Self = StObject.set(x, "spinner", null)
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      inline def setSpinnerVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "spinner", js.Array(value*))
      
      inline def setSpinnerVdomElement(value: VdomElement): Self = StObject.set(x, "spinner", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyles(value: Content): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
