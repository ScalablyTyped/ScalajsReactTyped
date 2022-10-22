package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.anon.Label
import typingsJapgolly.wordpressComponents.anon.Selected
import typingsJapgolly.wordpressComponents.comboboxControlMod.ComboboxControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ComboboxControl {
  
  inline def apply(onChange: js.UndefOr[String] => Callback, options: js.Array[Label], value: String): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: js.UndefOr[String]) => onChange(t0).runNow()), options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/components", "ComboboxControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def allowReset(value: Boolean): this.type = set("allowReset", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def help(value: VdomNode): this.type = set("help", value.rawNode.asInstanceOf[js.Any])
    
    inline def helpNull: this.type = set("help", null)
    
    inline def helpVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("help", js.Array(value*))
    
    inline def helpVdomElement(value: VdomElement): this.type = set("help", value.rawElement.asInstanceOf[js.Any])
    
    inline def hideLabelFromVision(value: Boolean): this.type = set("hideLabelFromVision", value.asInstanceOf[js.Any])
    
    inline def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def messages(value: Selected): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def onFilterValueChange(value: /* value */ String => Callback): this.type = set("onFilterValueChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
