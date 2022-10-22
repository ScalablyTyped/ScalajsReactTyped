package typingsJapgolly.vscodeLanguageclient.libCommonDiagnosticMod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdiagnosticMod.DiagnosticRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageclient/lib/common/diagnostic", "DiagnosticFeature")
@js.native
open class DiagnosticFeature protected () extends TextDocumentLanguageFeature[
      DiagnosticOptions, 
      DiagnosticRegistrationOptions, 
      DiagnosticProviderShape, 
      DiagnosticProviderMiddleware, 
      DiagnosticPullOptions
    ] {
  def this(client: FeatureClient[DiagnosticProviderMiddleware, DiagnosticPullOptions]) = this()
  
  /* protected */ def registerLanguageProvider(options: DiagnosticRegistrationOptions): js.Tuple2[Disposable, DiagnosticProviderShape] = js.native
  
  /* private */ var tabs: Any = js.native
}
