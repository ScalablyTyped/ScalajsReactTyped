package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.messageBarTypesMod.IMessageBarProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/MessageBar", JSImport.Namespace)
@js.native
object libMessageBarMod extends js.Object {
  @js.native
  class MessageBarBase protected ()
    extends typingsJapgolly.officeUiFabricReact.messageBarMod.MessageBarBase {
    def this(props: IMessageBarProps) = this()
  }
  
  val MessageBar: FunctionComponent[IMessageBarProps] = js.native
  /* static members */
  @js.native
  object MessageBarBase extends js.Object {
    var defaultProps: IMessageBarProps = js.native
  }
  
  @js.native
  object MessageBarType extends js.Object {
    /* 2 */ val blocked: typingsJapgolly.officeUiFabricReact.messageBarTypesMod.MessageBarType.blocked with Double = js.native
    /* 1 */ val error: typingsJapgolly.officeUiFabricReact.messageBarTypesMod.MessageBarType.error with Double = js.native
    /* 0 */ val info: typingsJapgolly.officeUiFabricReact.messageBarTypesMod.MessageBarType.info with Double = js.native
    /* 90000 */ val remove: typingsJapgolly.officeUiFabricReact.messageBarTypesMod.MessageBarType.remove with Double = js.native
    /* 3 */ val severeWarning: typingsJapgolly.officeUiFabricReact.messageBarTypesMod.MessageBarType.severeWarning with Double = js.native
    /* 4 */ val success: typingsJapgolly.officeUiFabricReact.messageBarTypesMod.MessageBarType.success with Double = js.native
    /* 5 */ val warning: typingsJapgolly.officeUiFabricReact.messageBarTypesMod.MessageBarType.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.officeUiFabricReact.messageBarTypesMod.MessageBarType with Double
      ] = js.native
  }
  
}

