package typingsJapgolly.officeUiFabricReact.messageBarTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageBarType extends js.Object

@JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.types", "MessageBarType")
@js.native
object MessageBarType extends js.Object {
  /** Blocked styled MessageBar */
  @js.native
  sealed trait blocked extends MessageBarType
  
  /** Error styled MessageBar */
  @js.native
  sealed trait error extends MessageBarType
  
  /** Info styled MessageBar */
  @js.native
  sealed trait info extends MessageBarType
  
  /**
    * Deprecated at v0.48.0, to be removed at \>= v1.0.0. Use `blocked` instead.
    * @deprecated Use `blocked` instead.
    */
  @js.native
  sealed trait remove extends MessageBarType
  
  /** SevereWarning styled MessageBar */
  @js.native
  sealed trait severeWarning extends MessageBarType
  
  /** Success styled MessageBar */
  @js.native
  sealed trait success extends MessageBarType
  
  /** Warning styled MessageBar */
  @js.native
  sealed trait warning extends MessageBarType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageBarType with Double] = js.native
  /* 2 */ @js.native
  object blocked extends TopLevel[blocked with Double]
  
  /* 1 */ @js.native
  object error extends TopLevel[error with Double]
  
  /* 0 */ @js.native
  object info extends TopLevel[info with Double]
  
  /* 90000 */ @js.native
  object remove extends TopLevel[remove with Double]
  
  /* 3 */ @js.native
  object severeWarning extends TopLevel[severeWarning with Double]
  
  /* 4 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 5 */ @js.native
  object warning extends TopLevel[warning with Double]
  
}

