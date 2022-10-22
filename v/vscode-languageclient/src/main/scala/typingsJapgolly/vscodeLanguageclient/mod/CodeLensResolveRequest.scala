package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.codeLensSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeLensResolveRequest {
  
  @JSImport("vscode-languageclient", "CodeLensResolveRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "CodeLensResolveRequest.method")
  @js.native
  val method: codeLensSlashresolve = js.native
  
  @JSImport("vscode-languageclient", "CodeLensResolveRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens, 
    typingsJapgolly.vscodeLanguageserverTypes.mod.CodeLens, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
