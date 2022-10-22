package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITag
import typingsJapgolly.officeUiFabricReact.libComponentsPickersTagPickerTagPickerDottypesMod.ITagItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagItemBase {
  
  inline def apply(index: Double, item: ITag): SharedBuilder_ITagItemProps522051606 = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    new SharedBuilder_ITagItemProps522051606(js.Array(this.component, __props.asInstanceOf[ITagItemProps]))
  }
  
  @JSImport("office-ui-fabric-react", "TagItemBase")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ITagItemProps): SharedBuilder_ITagItemProps522051606 = new SharedBuilder_ITagItemProps522051606(js.Array(this.component, p.asInstanceOf[js.Any]))
}
