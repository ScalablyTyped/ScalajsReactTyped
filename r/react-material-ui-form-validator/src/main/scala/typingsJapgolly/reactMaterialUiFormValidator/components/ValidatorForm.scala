package typingsJapgolly.reactMaterialUiFormValidator.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorFormProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ValidatorForm {
  
  inline def apply(onSubmit: ReactEventFrom[Element] => Callback): Builder = {
    val __props = js.Dynamic.literal(onSubmit = js.Any.fromFunction1((t0: ReactEventFrom[Element]) => onSubmit(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ValidatorFormProps]))
  }
  
  @JSImport("react-material-ui-form-validator", "ValidatorForm")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorForm] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def debounceTime(value: Double): this.type = set("debounceTime", value.asInstanceOf[js.Any])
    
    inline def instantValidate(value: Boolean): this.type = set("instantValidate", value.asInstanceOf[js.Any])
    
    inline def onError(value: /* errors */ js.Array[Any] => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* errors */ js.Array[Any]) => value(t0).runNow()))
  }
  
  def withProps(p: ValidatorFormProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
