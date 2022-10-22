package typingsJapgolly.jupyterlabUiComponents.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.jupyterlabUiComponents.libBlueprintMod.CommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICheckboxProps * / scala.Any) & typingsJapgolly.jupyterlabUiComponents.libBlueprintMod.CommonProps[scala.Any] because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ICheckboxProps * / scala.Any because couldn't resolve ClassTree.) */
object Select {
  
  def apply(
    p: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ISelectProps<any> */ Any) & CommonProps[Any]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@jupyterlab/ui-components", "Select")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Select.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
