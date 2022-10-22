package typingsJapgolly.formik.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.formik.distFieldMod.FieldAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.formik.distFieldMod.FieldAttributes[scala.Any] because: IArray(Could't extract props from scala.Any because couldn't resolve ClassTree.) */
object Field {
  
  def apply(p: FieldAttributes[Any]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("formik", "Field")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Field.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
