package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.vscodeLanguageclientStrings.documentLinkSlashresolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentLinkResolveRequest {
  
  @JSImport("vscode-languageclient", "DocumentLinkResolveRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DocumentLinkResolveRequest.method")
  @js.native
  val method: documentLinkSlashresolve = js.native
  
  @JSImport("vscode-languageclient", "DocumentLinkResolveRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink, 
    typingsJapgolly.vscodeLanguageserverTypes.mod.DocumentLink, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}
