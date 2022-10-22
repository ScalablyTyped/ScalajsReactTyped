package typingsJapgolly.reactResponsive.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactResponsive.anon.PartialMediaQueryMatchers
import typingsJapgolly.reactResponsive.mod.MediaQueryMatchers
import typingsJapgolly.reactResponsive.mod.MediaQueryProps
import typingsJapgolly.reactResponsive.mod.MediaQueryType
import typingsJapgolly.reactResponsive.mod.default
import typingsJapgolly.reactResponsive.reactResponsiveStrings.interlace
import typingsJapgolly.reactResponsive.reactResponsiveStrings.landscape
import typingsJapgolly.reactResponsive.reactResponsiveStrings.portrait
import typingsJapgolly.reactResponsive.reactResponsiveStrings.progressive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactResponsive {
  
  @JSImport("react-responsive", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def all(value: Boolean): this.type = set("all", value.asInstanceOf[js.Any])
    
    inline def aspectRatio(value: String): this.type = set("aspectRatio", value.asInstanceOf[js.Any])
    
    inline def aural(value: Boolean): this.type = set("aural", value.asInstanceOf[js.Any])
    
    inline def braille(value: Boolean): this.type = set("braille", value.asInstanceOf[js.Any])
    
    inline def children(value: Node | (js.Function1[/* matches */ Boolean, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* matches */ Boolean => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: Boolean): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def colorIndex(value: Boolean): this.type = set("colorIndex", value.asInstanceOf[js.Any])
    
    inline def component(value: ElementType): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def device(value: MediaQueryMatchers): this.type = set("device", value.asInstanceOf[js.Any])
    
    inline def deviceAspectRatio(value: String): this.type = set("deviceAspectRatio", value.asInstanceOf[js.Any])
    
    inline def deviceHeight(value: Double | String): this.type = set("deviceHeight", value.asInstanceOf[js.Any])
    
    inline def deviceWidth(value: Double | String): this.type = set("deviceWidth", value.asInstanceOf[js.Any])
    
    inline def embossed(value: Boolean): this.type = set("embossed", value.asInstanceOf[js.Any])
    
    inline def grid(value: Boolean): this.type = set("grid", value.asInstanceOf[js.Any])
    
    inline def handheld(value: Boolean): this.type = set("handheld", value.asInstanceOf[js.Any])
    
    inline def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def maxAspectRatio(value: String): this.type = set("maxAspectRatio", value.asInstanceOf[js.Any])
    
    inline def maxColor(value: Double): this.type = set("maxColor", value.asInstanceOf[js.Any])
    
    inline def maxColorIndex(value: Double): this.type = set("maxColorIndex", value.asInstanceOf[js.Any])
    
    inline def maxDeviceAspectRatio(value: String): this.type = set("maxDeviceAspectRatio", value.asInstanceOf[js.Any])
    
    inline def maxDeviceHeight(value: Double | String): this.type = set("maxDeviceHeight", value.asInstanceOf[js.Any])
    
    inline def maxDeviceWidth(value: Double | String): this.type = set("maxDeviceWidth", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: Double | String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxMonochrome(value: Double): this.type = set("maxMonochrome", value.asInstanceOf[js.Any])
    
    inline def maxResolution(value: Double | String): this.type = set("maxResolution", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: Double | String): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minAspectRatio(value: String): this.type = set("minAspectRatio", value.asInstanceOf[js.Any])
    
    inline def minColor(value: Double): this.type = set("minColor", value.asInstanceOf[js.Any])
    
    inline def minColorIndex(value: Double): this.type = set("minColorIndex", value.asInstanceOf[js.Any])
    
    inline def minDeviceAspectRatio(value: String): this.type = set("minDeviceAspectRatio", value.asInstanceOf[js.Any])
    
    inline def minDeviceHeight(value: Double | String): this.type = set("minDeviceHeight", value.asInstanceOf[js.Any])
    
    inline def minDeviceWidth(value: Double | String): this.type = set("minDeviceWidth", value.asInstanceOf[js.Any])
    
    inline def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minMonochrome(value: Double): this.type = set("minMonochrome", value.asInstanceOf[js.Any])
    
    inline def minResolution(value: Double | String): this.type = set("minResolution", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double | String): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def monochrome(value: Boolean): this.type = set("monochrome", value.asInstanceOf[js.Any])
    
    inline def onBeforeChange(value: /* matches */ Boolean => Callback): this.type = set("onBeforeChange", js.Any.fromFunction1((t0: /* matches */ Boolean) => value(t0).runNow()))
    
    inline def onChange(value: /* matches */ Boolean => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* matches */ Boolean) => value(t0).runNow()))
    
    inline def orientation(value: portrait | landscape): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def print(value: Boolean): this.type = set("print", value.asInstanceOf[js.Any])
    
    inline def projection(value: Boolean): this.type = set("projection", value.asInstanceOf[js.Any])
    
    inline def query(value: String): this.type = set("query", value.asInstanceOf[js.Any])
    
    inline def resolution(value: Double | String): this.type = set("resolution", value.asInstanceOf[js.Any])
    
    inline def scan(value: progressive | interlace): this.type = set("scan", value.asInstanceOf[js.Any])
    
    inline def screen(value: Boolean): this.type = set("screen", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tty(value: Boolean): this.type = set("tty", value.asInstanceOf[js.Any])
    
    inline def tv(value: Boolean): this.type = set("tv", value.asInstanceOf[js.Any])
    
    inline def `type`(value: MediaQueryType): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def values(value: PartialMediaQueryMatchers): this.type = set("values", value.asInstanceOf[js.Any])
    
    inline def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactResponsive.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MediaQueryProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
