package typingsJapgolly.vscodeLanguageclient.mod

import typingsJapgolly.std.IterableIterator
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.CreateParamsSignature
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.NextSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-languageclient", "TextDocumentEventFeature")
@js.native
open class TextDocumentEventFeature[P, E, M] protected ()
  extends typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentEventFeature[P, E, M] {
  def this(
    client: FeatureClient[M, js.Object],
    event: typingsJapgolly.vscode.mod.Event[E],
    `type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolNotificationType[
        P, 
        typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
      ],
    middleware: js.Function0[js.UndefOr[NextSignature[E, js.Promise[Unit]]]],
    createParams: CreateParamsSignature[E, P],
    textDocument: js.Function1[/* data */ E, typingsJapgolly.vscode.mod.TextDocument]
  ) = this()
  def this(
    client: FeatureClient[M, js.Object],
    event: typingsJapgolly.vscode.mod.Event[E],
    `type`: typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolNotificationType[
        P, 
        typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
      ],
    middleware: js.Function0[js.UndefOr[NextSignature[E, js.Promise[Unit]]]],
    createParams: CreateParamsSignature[E, P],
    textDocument: js.Function1[/* data */ E, typingsJapgolly.vscode.mod.TextDocument],
    selectorFilter: js.Function2[
        /* selectors */ IterableIterator[typingsJapgolly.vscode.mod.DocumentSelector], 
        /* data */ E, 
        Boolean
      ]
  ) = this()
}
/* static members */
object TextDocumentEventFeature {
  
  @JSImport("vscode-languageclient", "TextDocumentEventFeature")
  @js.native
  val ^ : js.Any = js.native
  
  inline def textDocumentFilter(
    selectors: IterableIterator[typingsJapgolly.vscode.mod.DocumentSelector],
    textDocument: typingsJapgolly.vscode.mod.TextDocument
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("textDocumentFilter")(selectors.asInstanceOf[js.Any], textDocument.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
