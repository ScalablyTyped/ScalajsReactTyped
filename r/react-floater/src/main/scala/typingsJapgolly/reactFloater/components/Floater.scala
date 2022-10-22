package typingsJapgolly.reactFloater.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactFloater.libComponentsFloaterMod.Props
import typingsJapgolly.reactFloater.libTypesMod.RenderProps
import typingsJapgolly.reactFloater.libTypesMod.Statuses
import typingsJapgolly.reactFloater.libTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Floater {
  
  inline def apply(
    hideArrow: Boolean,
    id: String,
    onClick: /* event */ ReactEventFrom[HTMLElement & Element] => Callback,
    placement: String,
    positionWrapper: Boolean,
    status: Statuses,
    styles: Styles
  ): Builder = {
    val __props = js.Dynamic.literal(hideArrow = hideArrow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLElement & Element]) => onClick(t0).runNow()), placement = placement.asInstanceOf[js.Any], positionWrapper = positionWrapper.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[/* props */ Props]))
  }
  
  @JSImport("react-floater/lib/components/Floater", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def arrowRef(value: Ref[HTMLSpanElement]): this.type = set("arrowRef", value.asInstanceOf[js.Any])
    
    inline def arrowRefFunction1(value: HTMLSpanElement | Null => Callback): this.type = set("arrowRef", js.Any.fromFunction1((t0: HTMLSpanElement | Null) => value(t0).runNow()))
    
    inline def arrowRefNull: this.type = set("arrowRef", null)
    
    inline def component(value: FunctionComponent[RenderProps] | japgolly.scalajs.react.facade.React.Element): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def componentVdomElement(value: VdomElement): this.type = set("component", value.rawElement.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def floaterRef(value: Ref[HTMLDivElement]): this.type = set("floaterRef", value.asInstanceOf[js.Any])
    
    inline def floaterRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("floaterRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def floaterRefNull: this.type = set("floaterRef", null)
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: /* props */ Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
