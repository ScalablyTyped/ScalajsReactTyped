package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonPropsMod.OptionProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsFormsRadioGroupMod.IRadioGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioGroup {
  
  inline def apply(onChange: ReactEventFrom[HTMLInputElement] => Callback): Builder = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => onChange(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[IRadioGroupProps]))
  }
  
  @JSImport("@blueprintjs/core", "RadioGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.RadioGroup] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def options(value: js.Array[OptionProps]): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def optionsVarargs(value: OptionProps*): this.type = set("options", js.Array(value*))
    
    inline def selectedValue(value: String | Double): this.type = set("selectedValue", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IRadioGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
