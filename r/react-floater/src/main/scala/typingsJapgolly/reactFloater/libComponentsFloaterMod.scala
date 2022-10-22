package typingsJapgolly.reactFloater

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactFloater.libTypesMod.HandlerFunction
import typingsJapgolly.reactFloater.libTypesMod.RenderProps
import typingsJapgolly.reactFloater.libTypesMod.Statuses
import typingsJapgolly.reactFloater.libTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloaterMod extends Shortcut {
  
  @JSImport("react-floater/lib/components/Floater", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]] = js.native
  
  trait Props extends StObject {
    
    var arrowRef: Ref[HTMLSpanElement]
    
    var component: js.UndefOr[FunctionComponent[RenderProps] | japgolly.scalajs.react.facade.React.Element] = js.undefined
    
    var content: js.UndefOr[Node] = js.undefined
    
    var floaterRef: Ref[HTMLDivElement]
    
    var footer: js.UndefOr[Node] = js.undefined
    
    var hideArrow: Boolean
    
    var id: String
    
    var onClick: HandlerFunction[HTMLElement]
    
    var placement: String
    
    var positionWrapper: Boolean
    
    var showCloseButton: js.UndefOr[Boolean] = js.undefined
    
    var status: Statuses
    
    var styles: Styles
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object Props {
    
    inline def apply(
      hideArrow: Boolean,
      id: String,
      onClick: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback,
      placement: String,
      positionWrapper: Boolean,
      status: Statuses,
      styles: Styles
    ): Props = {
      val __obj = js.Dynamic.literal(hideArrow = hideArrow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => onClick(t0).runNow()), placement = placement.asInstanceOf[js.Any], positionWrapper = positionWrapper.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], arrowRef = null, floaterRef = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setArrowRef(value: Ref[HTMLSpanElement]): Self = StObject.set(x, "arrowRef", value.asInstanceOf[js.Any])
      
      inline def setArrowRefFunction1(value: HTMLSpanElement | Null => Callback): Self = StObject.set(x, "arrowRef", js.Any.fromFunction1((t0: HTMLSpanElement | Null) => value(t0).runNow()))
      
      inline def setArrowRefNull: Self = StObject.set(x, "arrowRef", null)
      
      inline def setComponent(value: FunctionComponent[RenderProps] | japgolly.scalajs.react.facade.React.Element): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setComponentVdomElement(value: VdomElement): Self = StObject.set(x, "component", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setFloaterRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "floaterRef", value.asInstanceOf[js.Any])
      
      inline def setFloaterRefFunction1(value: HTMLDivElement | Null => Callback): Self = StObject.set(x, "floaterRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
      
      inline def setFloaterRefNull: Self = StObject.set(x, "floaterRef", null)
      
      inline def setFooter(value: VdomNode): Self = StObject.set(x, "footer", value.rawNode.asInstanceOf[js.Any])
      
      inline def setFooterNull: Self = StObject.set(x, "footer", null)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setFooterVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "footer", js.Array(value*))
      
      inline def setFooterVdomElement(value: VdomElement): Self = StObject.set(x, "footer", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHideArrow(value: Boolean): Self = StObject.set(x, "hideArrow", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPositionWrapper(value: Boolean): Self = StObject.set(x, "positionWrapper", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setStatus(value: Statuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: Styles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsFloaterMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]] = default
}
