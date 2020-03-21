package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/CommandBar", JSImport.Namespace)
@js.native
object libCommandBarMod extends js.Object {
  @js.native
  class CommandBarBase ()
    extends typingsJapgolly.officeUiFabricReact.commandBarMod.CommandBarBase
  
  val CommandBar: FunctionComponent[ICommandBarProps] = js.native
  /* static members */
  @js.native
  object CommandBarBase extends js.Object {
    var defaultProps: ICommandBarProps = js.native
  }
  
}

