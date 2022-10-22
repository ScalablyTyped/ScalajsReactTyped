package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashcompletion
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionItem
import typingsJapgolly.vscodeLanguageserverTypes.mod.CompletionList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompletionRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CompletionRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CompletionRequest.method")
  @js.native
  val method: textDocumentSlashcompletion = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "CompletionRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    CompletionParams, 
    CompletionList | js.Array[CompletionItem] | Null, 
    js.Array[CompletionItem], 
    Unit, 
    CompletionRegistrationOptions
  ] = js.native
}
