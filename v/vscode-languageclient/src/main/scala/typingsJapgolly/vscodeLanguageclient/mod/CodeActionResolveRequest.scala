package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.codeActionSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionResolveRequest {
  
  @JSImport("vscode-languageclient", "CodeActionResolveRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "CodeActionResolveRequest.method")
  @js.native
  val method: codeActionSlashresolve = js.native
  
  @JSImport("vscode-languageclient", "CodeActionResolveRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction, 
    typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
