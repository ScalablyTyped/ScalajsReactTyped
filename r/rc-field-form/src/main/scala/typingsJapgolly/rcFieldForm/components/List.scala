package typingsJapgolly.rcFieldForm.components

import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import typingsJapgolly.rcFieldForm.esListMod.ListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  inline def apply(name: NamePath): SharedBuilder_ListProps_1668479475 = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_ListProps_1668479475(js.Array(this.component, __props.asInstanceOf[ListProps]))
  }
  
  @JSImport("rc-field-form", "List")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ListProps): SharedBuilder_ListProps_1668479475 = new SharedBuilder_ListProps_1668479475(js.Array(this.component, p.asInstanceOf[js.Any]))
}
