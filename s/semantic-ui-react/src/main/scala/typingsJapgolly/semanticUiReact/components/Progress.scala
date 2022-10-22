package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ReactNodeArray
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.HtmlLabelProps
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandContent
import typingsJapgolly.semanticUiReact.distCommonjsGenericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.distCommonjsModulesProgressProgressMod.ProgressProps
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.big
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.medium
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.percent
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.ratio
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.tiny
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Progress {
  
  @JSImport("semantic-ui-react", "Progress")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.semanticUiReact.mod.Progress] {
    
    inline def active(value: Boolean): this.type = set("active", value.asInstanceOf[js.Any])
    
    inline def as(value: Any): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def attached(value: top | bottom): this.type = set("attached", value.asInstanceOf[js.Any])
    
    inline def autoSuccess(value: Boolean): this.type = set("autoSuccess", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def color(value: SemanticCOLORS): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def content(value: SemanticShorthandContent): this.type = set("content", value.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Boolean): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def indicating(value: Boolean): this.type = set("indicating", value.asInstanceOf[js.Any])
    
    inline def inverted(value: Boolean): this.type = set("inverted", value.asInstanceOf[js.Any])
    
    inline def label(value: SemanticShorthandItem[HtmlLabelProps]): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFunction3(
      value: (/* component */ ElementType, HtmlLabelProps, /* children */ js.UndefOr[Node | ReactNodeArray]) => Element | Null
    ): this.type = set("label", js.Any.fromFunction3(value))
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def percent(value: Double | String): this.type = set("percent", value.asInstanceOf[js.Any])
    
    inline def precision(value: Double): this.type = set("precision", value.asInstanceOf[js.Any])
    
    inline def progress(value: Boolean | percent | ratio | value): this.type = set("progress", value.asInstanceOf[js.Any])
    
    inline def size(value: tiny | small | medium | large | big): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def success(value: Boolean): this.type = set("success", value.asInstanceOf[js.Any])
    
    inline def total(value: Double | String): this.type = set("total", value.asInstanceOf[js.Any])
    
    inline def value(value: Double | String): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def warning(value: Boolean): this.type = set("warning", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Progress.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProgressProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
