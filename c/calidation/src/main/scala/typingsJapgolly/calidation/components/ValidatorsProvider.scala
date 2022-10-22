package typingsJapgolly.calidation.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.calidation.mod.CustomValidatorFunction
import typingsJapgolly.calidation.mod.ValidatorsProviderProps
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ValidatorsProvider {
  
  inline def apply[T /* <: js.Object */](validators: Record[String, CustomValidatorFunction[T]]): Builder[T] = {
    val __props = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ValidatorsProviderProps[T]]))
  }
  
  @JSImport("calidation", "ValidatorsProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.calidation.mod.ValidatorsProvider[T]]
  
  def withProps[T /* <: js.Object */](p: ValidatorsProviderProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
