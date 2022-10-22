package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmComponentsFormsFormGroupMod.IFormGroupProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormGroup {
  
  @JSImport("@blueprintjs/core", "FormGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.FormGroup] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def helperText(value: VdomNode): this.type = set("helperText", value.rawNode.asInstanceOf[js.Any])
    
    inline def helperTextNull: this.type = set("helperText", null)
    
    inline def helperTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("helperText", js.Array(value*))
    
    inline def helperTextVdomElement(value: VdomElement): this.type = set("helperText", value.rawElement.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelFor(value: String): this.type = set("labelFor", value.asInstanceOf[js.Any])
    
    inline def labelInfo(value: VdomNode): this.type = set("labelInfo", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelInfoNull: this.type = set("labelInfo", null)
    
    inline def labelInfoVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("labelInfo", js.Array(value*))
    
    inline def labelInfoVdomElement(value: VdomElement): this.type = set("labelInfo", value.rawElement.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def subLabel(value: VdomNode): this.type = set("subLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def subLabelNull: this.type = set("subLabel", null)
    
    inline def subLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subLabel", js.Array(value*))
    
    inline def subLabelVdomElement(value: VdomElement): this.type = set("subLabel", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FormGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IFormGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
