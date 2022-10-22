package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod

import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashwillCreateFiles
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillCreateFilesRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "WillCreateFilesRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "WillCreateFilesRequest.method")
  @js.native
  val method: workspaceSlashwillCreateFiles = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.fileOperations", "WillCreateFilesRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CreateFilesParams, 
    WorkspaceEdit | Null, 
    scala.Nothing, 
    Unit, 
    FileOperationRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[CreateFilesParams, js.UndefOr[WorkspaceEdit | Null], Unit]
}
