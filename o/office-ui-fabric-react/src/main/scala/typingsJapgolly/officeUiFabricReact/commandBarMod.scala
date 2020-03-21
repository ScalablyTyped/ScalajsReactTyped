package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/CommandBar", JSImport.Namespace)
@js.native
object commandBarMod extends js.Object {
  @js.native
  class CommandBarBase ()
    extends typingsJapgolly.officeUiFabricReact.commandBarBaseMod.CommandBarBase
  
  val CommandBar: FunctionComponent[ICommandBarProps] = js.native
  /* static members */
  @js.native
  object CommandBarBase extends js.Object {
    var defaultProps: ICommandBarProps = js.native
  }
  
}

