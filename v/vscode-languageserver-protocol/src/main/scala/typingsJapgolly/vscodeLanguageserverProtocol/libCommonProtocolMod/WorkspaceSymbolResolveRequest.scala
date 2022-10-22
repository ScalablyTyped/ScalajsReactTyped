package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSymbolSlashresolve
import typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolResolveRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceSymbolResolveRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceSymbolResolveRequest.method")
  @js.native
  val method: workspaceSymbolSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "WorkspaceSymbolResolveRequest.type")
  @js.native
  val `type`: ProtocolRequestType[WorkspaceSymbol, WorkspaceSymbol, scala.Nothing, Unit, Unit] = js.native
}
