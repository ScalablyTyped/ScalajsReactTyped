package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashcodeAction
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeActionParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeActionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CodeActionRequest {
  
  @JSImport("vscode-languageserver", "CodeActionRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "CodeActionRequest.method")
  @js.native
  val method: textDocumentSlashcodeAction = js.native
  
  @JSImport("vscode-languageserver", "CodeActionRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    CodeActionParams, 
    (js.Array[
      typingsJapgolly.vscodeLanguageserverTypes.mod.Command | typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction
    ]) | Null, 
    js.Array[
      typingsJapgolly.vscodeLanguageserverTypes.mod.Command | typingsJapgolly.vscodeLanguageserverTypes.mod.CodeAction
    ], 
    Unit, 
    CodeActionRegistrationOptions
  ] = js.native
}
