package typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod

import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typingsJapgolly.vscodeJsonrpc.mod.ProgressType
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typingsJapgolly.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdiagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentDiagnosticRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DocumentDiagnosticRequest.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DocumentDiagnosticRequest.method")
  @js.native
  val method: textDocumentSlashdiagnostic = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DocumentDiagnosticRequest.partialResult")
  @js.native
  val partialResult: ProgressType[DocumentDiagnosticReportPartialResult] = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol.diagnostic", "DocumentDiagnosticRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    DocumentDiagnosticParams, 
    DocumentDiagnosticReport, 
    DocumentDiagnosticReportPartialResult, 
    DiagnosticServerCancellationData, 
    DiagnosticRegistrationOptions
  ] = js.native
  
  type HandlerSignature = RequestHandler[DocumentDiagnosticParams, DocumentDiagnosticReport, Unit]
}
