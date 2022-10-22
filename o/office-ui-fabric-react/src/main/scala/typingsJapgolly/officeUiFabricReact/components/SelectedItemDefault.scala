package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.officeUiFabricReact.anon.IPersonaPropsValidationSt
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerItemsPeoplePickerItemDottypesMod.IPeoplePickerItemSelectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectedItemDefault {
  
  inline def apply(index: Double, item: IPersonaPropsValidationSt): SharedBuilder_IPeoplePickerItemSelectedProps660179614 = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    new SharedBuilder_IPeoplePickerItemSelectedProps660179614(js.Array(this.component, __props.asInstanceOf[IPeoplePickerItemSelectedProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/PeoplePicker/PeoplePickerItems/SelectedItemDefault", "SelectedItemDefault")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IPeoplePickerItemSelectedProps): SharedBuilder_IPeoplePickerItemSelectedProps660179614 = new SharedBuilder_IPeoplePickerItemSelectedProps660179614(js.Array(this.component, p.asInstanceOf[js.Any]))
}
