package typingsJapgolly.semanticUiReact.components

import typingsJapgolly.semanticUiReact.distCommonjsCollectionsFormFormSelectMod.FormSelectProps
import typingsJapgolly.semanticUiReact.distCommonjsModulesDropdownDropdownItemMod.DropdownItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormSelect {
  
  inline def apply(options: js.Array[DropdownItemProps]): SharedBuilder_FormSelectProps509196359 = {
    val __props = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    new SharedBuilder_FormSelectProps509196359(js.Array(this.component, __props.asInstanceOf[FormSelectProps]))
  }
  
  @JSImport("semantic-ui-react", "FormSelect")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FormSelectProps): SharedBuilder_FormSelectProps509196359 = new SharedBuilder_FormSelectProps509196359(js.Array(this.component, p.asInstanceOf[js.Any]))
}
