package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashwillDeleteFiles
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillDeleteFilesRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "WillDeleteFilesRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "WillDeleteFilesRequest.method")
  @js.native
  val method: workspaceSlashwillDeleteFiles = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "WillDeleteFilesRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DeleteFilesParams, 
    WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    FileOperationRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[DeleteFilesParams, js.UndefOr[WorkspaceEdit | Null], Unit]
}
