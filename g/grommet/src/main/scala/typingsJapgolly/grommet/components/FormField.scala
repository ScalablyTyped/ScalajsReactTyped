package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsFormFieldMod.FormFieldExtendedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.grommet.es6ComponentsFormFieldMod.FormFieldExtendedProps & T because: IArray(Could't extract props from T because couldn't resolve ClassTree.) */
object FormField {
  
  def apply[T](p: FormFieldExtendedProps & T): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("grommet/es6", "FormField")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  implicit def make[T](companion: FormField.type): Builder[T] = new Builder[T](js.Array(this.component, js.Dictionary.empty))()
}
