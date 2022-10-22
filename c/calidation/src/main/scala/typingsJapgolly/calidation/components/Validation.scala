package typingsJapgolly.calidation.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.calidation.mod.FieldsConfig
import typingsJapgolly.calidation.mod.Transforms
import typingsJapgolly.calidation.mod.ValidationContext
import typingsJapgolly.calidation.mod.ValidationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Validation {
  
  inline def apply[T /* <: js.Object */](children: ValidationContext[T] => Node, config: FieldsConfig[T]): Builder[T] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[ValidationProps[T]]))
  }
  
  @JSImport("calidation", "Validation")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.calidation.mod.Validation[T]] {
    
    inline def initialValues(value: T): this.type = set("initialValues", value.asInstanceOf[js.Any])
    
    inline def transforms(value: Transforms[T]): this.type = set("transforms", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: js.Object */](p: ValidationProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
