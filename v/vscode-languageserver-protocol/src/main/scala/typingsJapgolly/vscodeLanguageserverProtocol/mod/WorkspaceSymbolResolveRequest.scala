package typingsJapgolly.vscodeLanguageserverProtocol.mod

import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSymbolSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkspaceSymbolResolveRequest {
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceSymbolResolveRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceSymbolResolveRequest.method")
  @js.native
  val method: workspaceSymbolSlashresolve = js.native
  
  @JSImport("vscode-languageserver-protocol", "WorkspaceSymbolResolveRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol, 
    typingsJapgolly.vscodeLanguageserverTypes.mod.WorkspaceSymbol, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
