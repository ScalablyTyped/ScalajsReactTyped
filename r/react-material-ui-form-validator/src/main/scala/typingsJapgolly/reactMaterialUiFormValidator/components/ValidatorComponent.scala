package typingsJapgolly.reactMaterialUiFormValidator.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ValidatorComponent {
  
  inline def apply(name: String, value: Any): Builder = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ValidatorComponentProps]))
  }
  
  @JSImport("react-material-ui-form-validator", "ValidatorComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactMaterialUiFormValidator.mod.ValidatorComponent] {
    
    inline def errorMessages(value: js.Array[Any] | String): this.type = set("errorMessages", value.asInstanceOf[js.Any])
    
    inline def errorMessagesVarargs(value: Any*): this.type = set("errorMessages", js.Array(value*))
    
    inline def validatorListener(value: /* isValid */ Boolean => Callback): this.type = set("validatorListener", js.Any.fromFunction1((t0: /* isValid */ Boolean) => value(t0).runNow()))
    
    inline def validators(value: js.Array[Any]): this.type = set("validators", value.asInstanceOf[js.Any])
    
    inline def validatorsVarargs(value: Any*): this.type = set("validators", js.Array(value*))
    
    inline def withRequiredValidator(value: Boolean): this.type = set("withRequiredValidator", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ValidatorComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
