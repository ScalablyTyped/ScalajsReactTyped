package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-languageclient", "TextDocumentLanguageFeature")
@js.native
open class TextDocumentLanguageFeature[PO, RO /* <: typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions & PO */, PR, MW, CO] protected ()
  extends typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature[PO, RO, PR, MW, CO] {
  def this(
    client: FeatureClient[MW, CO],
    registrationType: typingsJapgolly.vscodeLanguageserverProtocol.mod.RegistrationType[RO]
  ) = this()
}
