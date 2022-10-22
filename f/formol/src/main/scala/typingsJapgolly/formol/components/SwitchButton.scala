package typingsJapgolly.formol.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.formol.anon.Dictk
import typingsJapgolly.formol.mod.SwitchButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwitchButton {
  
  @JSImport("formol", "SwitchButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def i18n(value: Dictk): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    inline def leftLabel(value: VdomNode): this.type = set("leftLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def leftLabelNull: this.type = set("leftLabel", null)
    
    inline def leftLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("leftLabel", js.Array(value*))
    
    inline def leftLabelVdomElement(value: VdomElement): this.type = set("leftLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def rightLabel(value: VdomNode): this.type = set("rightLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def rightLabelNull: this.type = set("rightLabel", null)
    
    inline def rightLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rightLabel", js.Array(value*))
    
    inline def rightLabelVdomElement(value: VdomElement): this.type = set("rightLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SwitchButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwitchButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
