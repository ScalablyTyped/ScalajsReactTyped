package typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod

import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Map
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.DocumentSelector
import typingsJapgolly.vscode.mod.Event
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeLanguageclient.anon.SendT
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.mod.ProtocolNotificationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("vscode-languageclient/lib/common/features", "TextDocumentEventFeature")
@js.native
open class TextDocumentEventFeature[P, E, M] protected ()
  extends DynamicDocumentFeature[TextDocumentRegistrationOptions, M, js.Object]
     with TextDocumentSendFeature[js.Function1[/* data */ E, js.Promise[Unit]]]
     with NotifyingFeature[E, P] {
  def this(
    client: FeatureClient[M, js.Object],
    event: Event[E],
    `type`: ProtocolNotificationType[P, TextDocumentRegistrationOptions],
    middleware: js.Function0[js.UndefOr[NextSignature[E, js.Promise[Unit]]]],
    createParams: CreateParamsSignature[E, P],
    textDocument: js.Function1[/* data */ E, TextDocument]
  ) = this()
  def this(
    client: FeatureClient[M, js.Object],
    event: Event[E],
    `type`: ProtocolNotificationType[P, TextDocumentRegistrationOptions],
    middleware: js.Function0[js.UndefOr[NextSignature[E, js.Promise[Unit]]]],
    createParams: CreateParamsSignature[E, P],
    textDocument: js.Function1[/* data */ E, TextDocument],
    selectorFilter: js.Function2[/* selectors */ IterableIterator[DocumentSelector], /* data */ E, Boolean]
  ) = this()
  
  /* protected */ def _createParams(data: E): P = js.native
  
  /* private */ val _event: Any = js.native
  
  /* private */ var _listener: Any = js.native
  
  /* protected */ def _middleware(): js.UndefOr[NextSignature[E, js.Promise[Unit]]] = js.native
  
  /* private */ val _onNotificationSent: Any = js.native
  
  /* protected */ val _selectorFilter: js.UndefOr[
    js.Function2[/* selectors */ IterableIterator[DocumentSelector], /* data */ E, Boolean]
  ] = js.native
  
  /* protected */ val _selectors: Map[String, DocumentSelector] = js.native
  
  /* protected */ def _textDocument(data: E): TextDocument = js.native
  
  /* protected */ val _type: ProtocolNotificationType[P, TextDocumentRegistrationOptions] = js.native
  
  /* private */ var callback: Any = js.native
  
  /**
    * Returns a provider for the given text document.
    */
  /* CompleteClass */
  override def getProvider(document: TextDocument): js.UndefOr[SendT[js.Function1[/* data */ E, js.Promise[Unit]]]] = js.native
  
  /* protected */ def getStateInfo(): js.Tuple2[IterableIterator[DocumentSelector], Boolean] = js.native
  
  /* private */ var matches: Any = js.native
  
  /* protected */ def notificationSent(data: E, `type`: ProtocolNotificationType[P, TextDocumentRegistrationOptions], params: P): Unit = js.native
  
  def onNotificationSent: Event[NotificationSendEvent[E, P]] = js.native
  /* CompleteClass */
  override def onNotificationSent(listener: js.Function1[/* e */ NotificationSendEvent[E, P], Any]): Disposable = js.native
  /* CompleteClass */
  override def onNotificationSent(listener: js.Function1[/* e */ NotificationSendEvent[E, P], Any], thisArgs: Any): Disposable = js.native
  /* CompleteClass */
  override def onNotificationSent(
    listener: js.Function1[/* e */ NotificationSendEvent[E, P], Any],
    thisArgs: Any,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /* CompleteClass */
  override def onNotificationSent(
    listener: js.Function1[/* e */ NotificationSendEvent[E, P], Any],
    thisArgs: Unit,
    disposables: js.Array[Disposable]
  ): Disposable = js.native
  /* CompleteClass */
  @JSName("onNotificationSent")
  var onNotificationSent_Original: Event[NotificationSendEvent[E, P]] = js.native
}
/* static members */
object TextDocumentEventFeature {
  
  @JSImport("vscode-languageclient/lib/common/features", "TextDocumentEventFeature")
  @js.native
  val ^ : js.Any = js.native
  
  inline def textDocumentFilter(selectors: IterableIterator[DocumentSelector], textDocument: TextDocument): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("textDocumentFilter")(selectors.asInstanceOf[js.Any], textDocument.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
