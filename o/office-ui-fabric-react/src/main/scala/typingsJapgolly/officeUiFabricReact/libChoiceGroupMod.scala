package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsChoiceGroupChoiceGroupDottypesMod.IChoiceGroupProps
import typingsJapgolly.officeUiFabricReact.libComponentsChoiceGroupChoiceGroupOptionChoiceGroupOptionDottypesMod.IChoiceGroupOptionProps
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChoiceGroupMod {
  
  @JSImport("office-ui-fabric-react/lib/ChoiceGroup", "ChoiceGroup")
  @js.native
  val ChoiceGroup: FunctionComponent[IChoiceGroupProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ChoiceGroup", "ChoiceGroupBase")
  @js.native
  open class ChoiceGroupBase protected ()
    extends typingsJapgolly.officeUiFabricReact.libComponentsChoiceGroupMod.ChoiceGroupBase {
    def this(props: IChoiceGroupProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/ChoiceGroup", "ChoiceGroupOption")
  @js.native
  val ChoiceGroupOption: FunctionComponent[IChoiceGroupOptionProps] = js.native
}
