package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashwillRenameFiles
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillRenameFilesRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "WillRenameFilesRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "WillRenameFilesRequest.method")
  @js.native
  val method: workspaceSlashwillRenameFiles = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "WillRenameFilesRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    RenameFilesParams, 
    WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    FileOperationRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[RenameFilesParams, js.UndefOr[WorkspaceEdit | Null], Unit]
}
