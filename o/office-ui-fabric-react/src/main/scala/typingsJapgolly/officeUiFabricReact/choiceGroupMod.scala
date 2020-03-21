package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionProps
import typingsJapgolly.officeUiFabricReact.choiceGroupTypesMod.IChoiceGroupProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ChoiceGroup", JSImport.Namespace)
@js.native
object choiceGroupMod extends js.Object {
  @js.native
  class ChoiceGroupBase protected ()
    extends typingsJapgolly.officeUiFabricReact.choiceGroupBaseMod.ChoiceGroupBase {
    def this(props: IChoiceGroupProps) = this()
  }
  
  val ChoiceGroup: FunctionComponent[IChoiceGroupProps] = js.native
  val ChoiceGroupOption: FunctionComponent[IChoiceGroupOptionProps] = js.native
}

