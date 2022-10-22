package typingsJapgolly.reactFloater.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactFloater.anon.Offset
import typingsJapgolly.reactFloater.libTypesMod.Action
import typingsJapgolly.reactFloater.libTypesMod.PlacementOptions
import typingsJapgolly.reactFloater.libTypesMod.Props
import typingsJapgolly.reactFloater.libTypesMod.RenderProps
import typingsJapgolly.reactFloater.libTypesMod.SelectorOrElement
import typingsJapgolly.reactFloater.libTypesMod.Styles
import typingsJapgolly.reactFloater.libTypesPopperMod.PopperInstance
import typingsJapgolly.reactFloater.libTypesPopperMod.PopperModifiers
import typingsJapgolly.reactFloater.reactFloaterStrings.click
import typingsJapgolly.reactFloater.reactFloaterStrings.floater
import typingsJapgolly.reactFloater.reactFloaterStrings.hover
import typingsJapgolly.reactFloater.reactFloaterStrings.wrapper
import typingsJapgolly.typeFest.sourcePartialDeepMod.PartialDeep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFloater {
  
  inline def apply(component: FunctionComponent[RenderProps] | Element): Builder = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-floater", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoOpen(value: Boolean): this.type = set("autoOpen", value.asInstanceOf[js.Any])
    
    inline def callback(value: (/* action */ Action, /* props */ Props) => Callback): this.type = set("callback", js.Any.fromFunction2((t0: /* action */ Action, t1: /* props */ Props) => (value(t0, t1)).runNow()))
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
    
    inline def disableFlip(value: Boolean): this.type = set("disableFlip", value.asInstanceOf[js.Any])
    
    inline def disableHoverToClick(value: Boolean): this.type = set("disableHoverToClick", value.asInstanceOf[js.Any])
    
    inline def event(value: click | hover): this.type = set("event", value.asInstanceOf[js.Any])
    
    inline def eventDelay(value: Double): this.type = set("eventDelay", value.asInstanceOf[js.Any])
    
    inline def footer(value: VdomNode): this.type = set("footer", value.rawNode.asInstanceOf[js.Any])
    
    inline def footerNull: this.type = set("footer", null)
    
    inline def footerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("footer", js.Array(value*))
    
    inline def footerVdomElement(value: VdomElement): this.type = set("footer", value.rawElement.asInstanceOf[js.Any])
    
    inline def getPopper(value: (/* popper */ PopperInstance, /* origin */ floater | wrapper) => Callback): this.type = set("getPopper", js.Any.fromFunction2((t0: /* popper */ PopperInstance, t1: /* origin */ floater | wrapper) => (value(t0, t1)).runNow()))
    
    inline def hideArrow(value: Boolean): this.type = set("hideArrow", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def modifiers(value: PopperModifiers): this.type = set("modifiers", value.asInstanceOf[js.Any])
    
    inline def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def placement(value: PlacementOptions): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def portalElement(value: SelectorOrElement): this.type = set("portalElement", value.asInstanceOf[js.Any])
    
    inline def portalElementNull: this.type = set("portalElement", null)
    
    inline def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def styles(value: PartialDeep[Styles, js.Object]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def target(value: SelectorOrElement): this.type = set("target", value.asInstanceOf[js.Any])
    
    inline def targetNull: this.type = set("target", null)
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def wrapperOptions(value: Offset): this.type = set("wrapperOptions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
