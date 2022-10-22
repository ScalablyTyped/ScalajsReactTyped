package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerChangeParams
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerContentTemplateOptions
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerContentTemplateType
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerItemSizeType
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerItemTemplateType
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerItemsType
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerLazyParams
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerLoaderIconTemplateOptions
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerLoaderIconTemplateType
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerLoadingTemplateOptions
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerLoadingTemplateType
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerOrientationType
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerProps
import typingsJapgolly.primereact.virtualscrollerVirtualscrollerMod.VirtualScrollerTemplateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VirtualScroller {
  
  @JSImport("primereact", "VirtualScroller")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.VirtualScroller] {
    
    inline def autoSize(value: Boolean): this.type = set("autoSize", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def columns(value: Any): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def contentTemplate(value: VirtualScrollerContentTemplateType): this.type = set("contentTemplate", value.asInstanceOf[js.Any])
    
    inline def contentTemplateFunction1(value: /* options */ VirtualScrollerContentTemplateOptions => Node): this.type = set("contentTemplate", js.Any.fromFunction1(value))
    
    inline def contentTemplateNull: this.type = set("contentTemplate", null)
    
    inline def contentTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("contentTemplate", js.Array(value*))
    
    inline def contentTemplateVdomElement(value: VdomElement): this.type = set("contentTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def itemSize(value: VirtualScrollerItemSizeType): this.type = set("itemSize", value.asInstanceOf[js.Any])
    
    inline def itemSizeVarargs(value: Double*): this.type = set("itemSize", js.Array(value*))
    
    inline def itemTemplate(value: VirtualScrollerItemTemplateType): this.type = set("itemTemplate", value.asInstanceOf[js.Any])
    
    inline def itemTemplateFunction2(value: (/* item */ Any, /* options */ VirtualScrollerTemplateOptions) => Node): this.type = set("itemTemplate", js.Any.fromFunction2(value))
    
    inline def itemTemplateNull: this.type = set("itemTemplate", null)
    
    inline def itemTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("itemTemplate", js.Array(value*))
    
    inline def itemTemplateVdomElement(value: VdomElement): this.type = set("itemTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def items(value: VirtualScrollerItemsType): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsNull: this.type = set("items", null)
    
    inline def itemsVarargs(value: (Any | js.Array[Any])*): this.type = set("items", js.Array(value*))
    
    inline def `lazy`(value: Boolean): this.type = set("lazy", value.asInstanceOf[js.Any])
    
    inline def loaderDisabled(value: Boolean): this.type = set("loaderDisabled", value.asInstanceOf[js.Any])
    
    inline def loaderIconTemplate(value: VirtualScrollerLoaderIconTemplateType): this.type = set("loaderIconTemplate", value.asInstanceOf[js.Any])
    
    inline def loaderIconTemplateFunction1(value: /* options */ VirtualScrollerLoaderIconTemplateOptions => Node): this.type = set("loaderIconTemplate", js.Any.fromFunction1(value))
    
    inline def loaderIconTemplateNull: this.type = set("loaderIconTemplate", null)
    
    inline def loaderIconTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("loaderIconTemplate", js.Array(value*))
    
    inline def loaderIconTemplateVdomElement(value: VdomElement): this.type = set("loaderIconTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def loadingTemplate(value: VirtualScrollerLoadingTemplateType): this.type = set("loadingTemplate", value.asInstanceOf[js.Any])
    
    inline def loadingTemplateFunction1(value: /* options */ VirtualScrollerLoadingTemplateOptions => Node): this.type = set("loadingTemplate", js.Any.fromFunction1(value))
    
    inline def loadingTemplateNull: this.type = set("loadingTemplate", null)
    
    inline def loadingTemplateVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("loadingTemplate", js.Array(value*))
    
    inline def loadingTemplateVdomElement(value: VdomElement): this.type = set("loadingTemplate", value.rawElement.asInstanceOf[js.Any])
    
    inline def numToleratedItems(value: Double): this.type = set("numToleratedItems", value.asInstanceOf[js.Any])
    
    inline def onLazyLoad(value: /* e */ VirtualScrollerLazyParams => Callback): this.type = set("onLazyLoad", js.Any.fromFunction1((t0: /* e */ VirtualScrollerLazyParams) => value(t0).runNow()))
    
    inline def onScroll(value: /* e */ ReactUIEventFrom[HTMLElement] => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* e */ ReactUIEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def onScrollIndexChange(value: /* e */ VirtualScrollerChangeParams => Callback): this.type = set("onScrollIndexChange", js.Any.fromFunction1((t0: /* e */ VirtualScrollerChangeParams) => value(t0).runNow()))
    
    inline def orientation(value: VirtualScrollerOrientationType): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def resizeDelay(value: Double): this.type = set("resizeDelay", value.asInstanceOf[js.Any])
    
    inline def scrollHeight(value: String): this.type = set("scrollHeight", value.asInstanceOf[js.Any])
    
    inline def scrollWidth(value: String): this.type = set("scrollWidth", value.asInstanceOf[js.Any])
    
    inline def showLoader(value: Boolean): this.type = set("showLoader", value.asInstanceOf[js.Any])
    
    inline def showSpacer(value: Boolean): this.type = set("showSpacer", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VirtualScroller.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VirtualScrollerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
