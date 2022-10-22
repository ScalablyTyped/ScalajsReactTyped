package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.Error
import typingsJapgolly.baseui.formControlTypesMod.FormControlOverrides
import typingsJapgolly.baseui.formControlTypesMod.FormControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormControl {
  
  @JSImport("baseui/form-control", "FormControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.formControlMod.FormControl] {
    
    inline def caption(value: Node | (js.Function1[/* props */ js.Object, Node])): this.type = set("caption", value.asInstanceOf[js.Any])
    
    inline def captionFunction1(value: /* props */ js.Object => Node): this.type = set("caption", js.Any.fromFunction1(value))
    
    inline def captionNull: this.type = set("caption", null)
    
    inline def captionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("caption", js.Array(value*))
    
    inline def captionVdomElement(value: VdomElement): this.type = set("caption", value.rawElement.asInstanceOf[js.Any])
    
    inline def counter(value: Boolean | Error): this.type = set("counter", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def error(value: Node | (js.Function1[/* props */ js.Object, Node])): this.type = set("error", value.asInstanceOf[js.Any])
    
    inline def errorFunction1(value: /* props */ js.Object => Node): this.type = set("error", js.Any.fromFunction1(value))
    
    inline def errorNull: this.type = set("error", null)
    
    inline def errorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("error", js.Array(value*))
    
    inline def errorVdomElement(value: VdomElement): this.type = set("error", value.rawElement.asInstanceOf[js.Any])
    
    inline def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
    
    inline def label(value: Node | (js.Function1[/* props */ js.Object, Node])): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelEndEnhancer(value: Node | (js.Function1[/* props */ js.Object, Node])): this.type = set("labelEndEnhancer", value.asInstanceOf[js.Any])
    
    inline def labelEndEnhancerFunction1(value: /* props */ js.Object => Node): this.type = set("labelEndEnhancer", js.Any.fromFunction1(value))
    
    inline def labelEndEnhancerNull: this.type = set("labelEndEnhancer", null)
    
    inline def labelEndEnhancerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("labelEndEnhancer", js.Array(value*))
    
    inline def labelEndEnhancerVdomElement(value: VdomElement): this.type = set("labelEndEnhancer", value.rawElement.asInstanceOf[js.Any])
    
    inline def labelFunction1(value: /* props */ js.Object => Node): this.type = set("label", js.Any.fromFunction1(value))
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def overrides(value: FormControlOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def positive(value: Node | (js.Function1[/* props */ js.Object, Node])): this.type = set("positive", value.asInstanceOf[js.Any])
    
    inline def positiveFunction1(value: /* props */ js.Object => Node): this.type = set("positive", js.Any.fromFunction1(value))
    
    inline def positiveNull: this.type = set("positive", null)
    
    inline def positiveVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("positive", js.Array(value*))
    
    inline def positiveVdomElement(value: VdomElement): this.type = set("positive", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FormControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FormControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
