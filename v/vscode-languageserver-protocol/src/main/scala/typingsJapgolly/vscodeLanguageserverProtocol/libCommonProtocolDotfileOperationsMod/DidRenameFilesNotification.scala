package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.NotificationHandler
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdidRenameFiles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidRenameFilesNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "DidRenameFilesNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "DidRenameFilesNotification.method")
  @js.native
  val method: workspaceSlashdidRenameFiles = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "DidRenameFilesNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[RenameFilesParams, FileOperationRegistrationOptions] = js.native
  
  type HandlerSignature = NotificationHandler[RenameFilesParams]
}
