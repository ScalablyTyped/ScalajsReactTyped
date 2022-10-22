package typingsJapgolly.reactDaumPostcode.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactDaumPostcode.libDaumPostcodeMod.DaumPostcodeProps
import typingsJapgolly.reactDaumPostcode.libDaumPostcodeMod.default
import typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.Address
import typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.Search
import typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.Size
import typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.State
import typingsJapgolly.reactDaumPostcode.libLoadPostcodeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DaumPostcode {
  
  @JSImport("react-daum-postcode/lib/DaumPostcode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def alwaysShowEngAddr(value: Boolean): this.type = set("alwaysShowEngAddr", value.asInstanceOf[js.Any])
    
    inline def animation(value: Boolean): this.type = set("animation", value.asInstanceOf[js.Any])
    
    inline def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
    
    inline def autoMapping(value: Boolean): this.type = set("autoMapping", value.asInstanceOf[js.Any])
    
    inline def autoMappingJibun(value: Boolean): this.type = set("autoMappingJibun", value.asInstanceOf[js.Any])
    
    inline def autoMappingRoad(value: Boolean): this.type = set("autoMappingRoad", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultQuery(value: String): this.type = set("defaultQuery", value.asInstanceOf[js.Any])
    
    inline def errorMessage(value: String | Node): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    inline def errorMessageNull: this.type = set("errorMessage", null)
    
    inline def errorMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("errorMessage", js.Array(value*))
    
    inline def errorMessageVdomElement(value: VdomElement): this.type = set("errorMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def focusContent(value: Boolean): this.type = set("focusContent", value.asInstanceOf[js.Any])
    
    inline def focusInput(value: Boolean): this.type = set("focusInput", value.asInstanceOf[js.Any])
    
    inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hideEngBtn(value: Boolean): this.type = set("hideEngBtn", value.asInstanceOf[js.Any])
    
    inline def hideMapBtn(value: Boolean): this.type = set("hideMapBtn", value.asInstanceOf[js.Any])
    
    inline def maxSuggestItems(value: Double): this.type = set("maxSuggestItems", value.asInstanceOf[js.Any])
    
    inline def onClose(value: /* state */ State => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: /* state */ State) => value(t0).runNow()))
    
    inline def onComplete(value: /* address */ Address => Callback): this.type = set("onComplete", js.Any.fromFunction1((t0: /* address */ Address) => value(t0).runNow()))
    
    inline def onResize(value: /* size */ Size => Callback): this.type = set("onResize", js.Any.fromFunction1((t0: /* size */ Size) => value(t0).runNow()))
    
    inline def onSearch(value: /* search */ Search => Callback): this.type = set("onSearch", js.Any.fromFunction1((t0: /* search */ Search) => value(t0).runNow()))
    
    inline def pleaseReadGuide(value: Double): this.type = set("pleaseReadGuide", value.asInstanceOf[js.Any])
    
    inline def pleaseReadGuideTimer(value: Double): this.type = set("pleaseReadGuideTimer", value.asInstanceOf[js.Any])
    
    inline def scriptUrl(value: String): this.type = set("scriptUrl", value.asInstanceOf[js.Any])
    
    inline def shorthand(value: Boolean): this.type = set("shorthand", value.asInstanceOf[js.Any])
    
    inline def showMoreHName(value: Boolean): this.type = set("showMoreHName", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def submitMode(value: Boolean): this.type = set("submitMode", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def useBannerLink(value: Boolean): this.type = set("useBannerLink", value.asInstanceOf[js.Any])
    
    inline def useSuggest(value: Boolean): this.type = set("useSuggest", value.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DaumPostcode.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DaumPostcodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
