package typingsJapgolly.wordpressComponents.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.toggleControlMod.ToggleControl.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToggleControl {
  
  @JSImport("@wordpress/components", "ToggleControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def checked(value: Boolean): this.type = set("checked", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def help(value: VdomNode): this.type = set("help", value.rawNode.asInstanceOf[js.Any])
    
    inline def helpNull: this.type = set("help", null)
    
    inline def helpVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("help", js.Array(value*))
    
    inline def helpVdomElement(value: VdomElement): this.type = set("help", value.rawElement.asInstanceOf[js.Any])
    
    inline def hideLabelFromVision(value: Boolean): this.type = set("hideLabelFromVision", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def onChange(value: /* isChecked */ Boolean => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* isChecked */ Boolean) => value(t0).runNow()))
  }
  
  implicit def make(companion: ToggleControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
