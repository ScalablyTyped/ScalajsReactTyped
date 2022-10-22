package typingsJapgolly.formik.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.formik.distTypesMod.FormikConfig
import typingsJapgolly.formik.distTypesMod.FormikValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.formik.distTypesMod.FormikConfig[Values] & ExtraProps because: IArray(Could't extract props from ExtraProps because couldn't resolve ClassTree.) */
object Formik {
  
  def apply[Values /* <: FormikValues */, ExtraProps](p: FormikConfig[Values] & ExtraProps): Builder[Values, ExtraProps] = new Builder[Values, ExtraProps](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("formik", "Formik")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Values /* <: FormikValues */, ExtraProps] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  implicit def make[Values /* <: FormikValues */, ExtraProps](companion: Formik.type): Builder[Values, ExtraProps] = new Builder[Values, ExtraProps](js.Array(this.component, js.Dictionary.empty))()
}
