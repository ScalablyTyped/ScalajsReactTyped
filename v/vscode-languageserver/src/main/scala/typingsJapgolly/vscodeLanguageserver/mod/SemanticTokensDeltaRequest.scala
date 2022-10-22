package typingsJapgolly.vscodeLanguageserver.mod

import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashsemanticTokens
import typingsJapgolly.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashsemanticTokensSlashfullSlashdelta
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensDeltaParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensDeltaPartialResult
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensPartialResult
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRegistrationOptions
import typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokensDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticTokensDeltaRequest {
  
  @JSImport("vscode-languageserver", "SemanticTokensDeltaRequest.messageDirection")
  @js.native
  val messageDirection: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "SemanticTokensDeltaRequest.method")
  @js.native
  val method: textDocumentSlashsemanticTokensSlashfullSlashdelta = js.native
  
  /* was `typeof SemanticTokensRegistrationType.method` */
  @JSImport("vscode-languageserver", "SemanticTokensDeltaRequest.registrationMethod")
  @js.native
  val registrationMethod: textDocumentSlashsemanticTokens = js.native
  
  @JSImport("vscode-languageserver", "SemanticTokensDeltaRequest.type")
  @js.native
  val `type`: typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    SemanticTokensDeltaParams, 
    typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokens | SemanticTokensDelta | Null, 
    SemanticTokensPartialResult | SemanticTokensDeltaPartialResult, 
    Unit, 
    SemanticTokensRegistrationOptions
  ] = js.native
}
