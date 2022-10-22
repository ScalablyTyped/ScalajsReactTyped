package typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeLanguageclient.anon.DocumentSelector
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.StaticRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.mod.RegistrationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-languageclient/lib/common/features", "TextDocumentLanguageFeature")
@js.native
open class TextDocumentLanguageFeature[PO, RO /* <: TextDocumentRegistrationOptions & PO */, PR, MW, CO] protected () extends DynamicDocumentFeature[RO, MW, CO] {
  def this(client: FeatureClient[MW, CO], registrationType: RegistrationType[RO]) = this()
  
  /* private */ val _registrationType: Any = js.native
  
  /* private */ val _registrations: Any = js.native
  
  /* protected */ def getAllProviders(): js.Iterable[PR] = js.native
  
  def getProvider(textDocument: TextDocument): js.UndefOr[PR] = js.native
  
  /* protected */ def getRegistration(): js.Tuple2[js.UndefOr[String], js.UndefOr[RO & DocumentSelector]] = js.native
  /* protected */ def getRegistration(documentSelector: Unit, capability: (RO & StaticRegistrationOptions) | PO): js.Tuple2[js.UndefOr[String], js.UndefOr[RO & DocumentSelector]] = js.native
  /* protected */ def getRegistration(
    documentSelector: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector
  ): js.Tuple2[js.UndefOr[String], js.UndefOr[RO & DocumentSelector]] = js.native
  /* protected */ def getRegistration(
    documentSelector: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector,
    capability: (RO & StaticRegistrationOptions) | PO
  ): js.Tuple2[js.UndefOr[String], js.UndefOr[RO & DocumentSelector]] = js.native
  
  /* protected */ def getRegistrationOptions(): js.UndefOr[RO & DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(documentSelector: Unit, capability: PO): js.UndefOr[RO & DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(
    documentSelector: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector
  ): js.UndefOr[RO & DocumentSelector] = js.native
  /* protected */ def getRegistrationOptions(
    documentSelector: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSelector,
    capability: PO
  ): js.UndefOr[RO & DocumentSelector] = js.native
  
  /* protected */ def registerLanguageProvider(options: RO, id: String): js.Tuple2[Disposable, PR] = js.native
  
  @JSName("registrationType")
  def registrationType_MTextDocumentLanguageFeature: RegistrationType[RO] = js.native
}
