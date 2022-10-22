package typingsJapgolly.formik.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.formik.distTypesMod.FormikContextType
import typingsJapgolly.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormikProvider {
  
  inline def apply(value: FormikContextType[Any]): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[FormikContextType[Any]]]))
  }
  
  @JSImport("formik", "FormikProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[FormikContextType[Any]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
