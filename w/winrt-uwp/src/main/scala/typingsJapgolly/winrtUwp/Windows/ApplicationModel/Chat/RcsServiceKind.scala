package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RcsServiceKind extends StObject
/** Specifies the type of the Rich Communication Services (RCS) service. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsServiceKind")
@js.native
object RcsServiceKind extends StObject {
  
  /** Capability service */
  @js.native
  sealed trait capability
    extends StObject
       with RcsServiceKind
  
  /** Chat service */
  @js.native
  sealed trait chat
    extends StObject
       with RcsServiceKind
  
  /** File transfer service */
  @js.native
  sealed trait fileTransfer
    extends StObject
       with RcsServiceKind
  
  /** Group chat service */
  @js.native
  sealed trait groupChat
    extends StObject
       with RcsServiceKind
}
