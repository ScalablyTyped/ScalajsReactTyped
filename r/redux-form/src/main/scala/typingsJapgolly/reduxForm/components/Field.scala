package typingsJapgolly.reduxForm.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reduxForm.libFieldMod.BaseFieldProps
import typingsJapgolly.reduxForm.libFieldMod.GenericFieldHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object Field {
  
  def apply[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */](p: P): Builder[P] = new Builder[P](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("redux-form", "Field")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reduxForm.mod.Field[P]]
  
  implicit def make[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */](companion: Field.type): Builder[P] = new Builder[P](js.Array(this.component, js.Dictionary.empty))()
}
