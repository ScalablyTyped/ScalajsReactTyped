package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Map
import typingsJapgolly.vscode.Thenable
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Event
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.TextDocumentChangeEvent
import typingsJapgolly.vscode.mod.TextDocumentWillSaveEvent
import typingsJapgolly.vscode.mod.TextEdit
import typingsJapgolly.vscodeLanguageclient.anon.SendT
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DynamicDocumentFeature
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.NextSignature
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.NotificationSendEvent
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.NotifyingFeature
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentEventFeature
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentSendFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidCloseTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidOpenTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DidSaveTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentChangeRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentSaveRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentSyncOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.WillSaveTextDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.mod.RegistrationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonTextSynchronizationMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature because Already inherited
  - typingsJapgolly.vscodeLanguageclient.libCommonTextSynchronizationMod.DidChangeTextDocumentFeatureShape because var conflicts: fillInitializeParams, preInitialize, registrationType. Inlined  */ @JSImport("vscode-languageclient/lib/common/textSynchronization", "DidChangeTextDocumentFeature")
  @js.native
  open class DidChangeTextDocumentFeature protected ()
    extends DynamicDocumentFeature[
          TextDocumentChangeRegistrationOptions, 
          TextDocumentSynchronizationMiddleware, 
          js.Object
        ]
       with TextDocumentSendFeature[js.Function1[/* event */ TextDocumentChangeEvent, js.Promise[Unit]]]
       with NotifyingFeature[TextDocumentChangeEvent, DidChangeTextDocumentParams] {
    def this(client: FeatureClient[TextDocumentSynchronizationMiddleware, js.Object]) = this()
    
    /* private */ val _changeData: Any = js.native
    
    /* private */ var _changeDelayer: Any = js.native
    
    /* private */ var _forcingDelivery: Any = js.native
    
    /* private */ var _listener: Any = js.native
    
    /* private */ val _onNotificationSent: Any = js.native
    
    /* private */ var callback: Any = js.native
    
    def forceDelivery(): js.Promise[Unit] = js.native
    
    /**
      * Returns a provider for the given text document.
      */
    /* CompleteClass */
    override def getProvider(document: TextDocument): js.UndefOr[SendT[js.Function1[/* event */ TextDocumentChangeEvent, js.Promise[Unit]]]] = js.native
    
    /* private */ var notificationSent: Any = js.native
    
    def onNotificationSent: Event[NotificationSendEvent[TextDocumentChangeEvent, DidChangeTextDocumentParams]] = js.native
    /* CompleteClass */
    override def onNotificationSent(
      listener: js.Function1[
          /* e */ NotificationSendEvent[TextDocumentChangeEvent, DidChangeTextDocumentParams], 
          Any
        ]
    ): Disposable = js.native
    /* CompleteClass */
    override def onNotificationSent(
      listener: js.Function1[
          /* e */ NotificationSendEvent[TextDocumentChangeEvent, DidChangeTextDocumentParams], 
          Any
        ],
      thisArgs: Any
    ): Disposable = js.native
    /* CompleteClass */
    override def onNotificationSent(
      listener: js.Function1[
          /* e */ NotificationSendEvent[TextDocumentChangeEvent, DidChangeTextDocumentParams], 
          Any
        ],
      thisArgs: Any,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    /* CompleteClass */
    override def onNotificationSent(
      listener: js.Function1[
          /* e */ NotificationSendEvent[TextDocumentChangeEvent, DidChangeTextDocumentParams], 
          Any
        ],
      thisArgs: Unit,
      disposables: js.Array[Disposable]
    ): Disposable = js.native
    /* CompleteClass */
    @JSName("onNotificationSent")
    var onNotificationSent_Original: Event[NotificationSendEvent[TextDocumentChangeEvent, DidChangeTextDocumentParams]] = js.native
    
    @JSName("registrationType")
    def registrationType_MDidChangeTextDocumentFeature: RegistrationType[TextDocumentChangeRegistrationOptions] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.NotifyingFeature because Already inherited
  - typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentSendFeature because Already inherited
  - typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature because Already inherited
  - typingsJapgolly.vscodeLanguageclient.libCommonTextSynchronizationMod.DidCloseTextDocumentFeatureShape because var conflicts: fillInitializeParams, onNotificationSent_Original, preInitialize, registrationType. Inlined  */ @JSImport("vscode-languageclient/lib/common/textSynchronization", "DidCloseTextDocumentFeature")
  @js.native
  open class DidCloseTextDocumentFeature protected () extends TextDocumentEventFeature[DidCloseTextDocumentParams, TextDocument, TextDocumentSynchronizationMiddleware] {
    def this(
      client: FeatureClient[TextDocumentSynchronizationMiddleware, js.Object],
      syncedDocuments: Map[String, TextDocument]
    ) = this()
    
    /* private */ val _syncedDocuments: Any = js.native
    
    @JSName("registrationType")
    def registrationType_MDidCloseTextDocumentFeature: RegistrationType[TextDocumentRegistrationOptions] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.NotifyingFeature because Already inherited
  - typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentSendFeature because Already inherited
  - typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature because Already inherited
  - typingsJapgolly.vscodeLanguageclient.libCommonTextSynchronizationMod.DidOpenTextDocumentFeatureShape because var conflicts: fillInitializeParams, onNotificationSent_Original, preInitialize, registrationType. Inlined openDocuments */ @JSImport("vscode-languageclient/lib/common/textSynchronization", "DidOpenTextDocumentFeature")
  @js.native
  open class DidOpenTextDocumentFeature protected () extends TextDocumentEventFeature[DidOpenTextDocumentParams, TextDocument, TextDocumentSynchronizationMiddleware] {
    def this(
      client: FeatureClient[TextDocumentSynchronizationMiddleware, js.Object],
      syncedDocuments: Map[String, TextDocument]
    ) = this()
    
    /* private */ val _syncedDocuments: Any = js.native
    
    def openDocuments: IterableIterator[TextDocument] = js.native
    @JSName("openDocuments")
    var openDocuments_FDidOpenTextDocumentFeature: js.Iterable[TextDocument] = js.native
    
    @JSName("registrationType")
    def registrationType_MDidOpenTextDocumentFeature: RegistrationType[TextDocumentRegistrationOptions] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.NotifyingFeature because Already inherited
  - typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentSendFeature because Already inherited
  - typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DynamicFeature because Already inherited
  - typingsJapgolly.vscodeLanguageclient.libCommonTextSynchronizationMod.DidSaveTextDocumentFeatureShape because var conflicts: fillInitializeParams, onNotificationSent_Original, preInitialize, registrationType. Inlined  */ @JSImport("vscode-languageclient/lib/common/textSynchronization", "DidSaveTextDocumentFeature")
  @js.native
  open class DidSaveTextDocumentFeature protected () extends TextDocumentEventFeature[DidSaveTextDocumentParams, TextDocument, TextDocumentSynchronizationMiddleware] {
    def this(client: FeatureClient[TextDocumentSynchronizationMiddleware, js.Object]) = this()
    
    /* private */ var _includeText: Any = js.native
    
    @JSName("registrationType")
    def registrationType_MDidSaveTextDocumentFeature: RegistrationType[TextDocumentSaveRegistrationOptions] = js.native
  }
  
  @JSImport("vscode-languageclient/lib/common/textSynchronization", "WillSaveFeature")
  @js.native
  open class WillSaveFeature protected () extends TextDocumentEventFeature[
          WillSaveTextDocumentParams, 
          TextDocumentWillSaveEvent, 
          TextDocumentSynchronizationMiddleware
        ] {
    def this(client: FeatureClient[TextDocumentSynchronizationMiddleware, js.Object]) = this()
    
    @JSName("registrationType")
    def registrationType_MWillSaveFeature: RegistrationType[TextDocumentRegistrationOptions] = js.native
  }
  
  @JSImport("vscode-languageclient/lib/common/textSynchronization", "WillSaveWaitUntilFeature")
  @js.native
  open class WillSaveWaitUntilFeature protected ()
    extends DynamicDocumentFeature[TextDocumentRegistrationOptions, TextDocumentSynchronizationMiddleware, js.Object] {
    def this(client: FeatureClient[TextDocumentSynchronizationMiddleware, js.Object]) = this()
    
    /* private */ var _listener: Any = js.native
    
    /* private */ val _selectors: Any = js.native
    
    /* private */ var callback: Any = js.native
    
    @JSName("registrationType")
    def registrationType_MWillSaveWaitUntilFeature: RegistrationType[TextDocumentRegistrationOptions] = js.native
  }
  
  @js.native
  trait DidChangeTextDocumentFeatureShape
    extends StObject
       with DynamicFeature[TextDocumentChangeRegistrationOptions]
       with TextDocumentSendFeature[js.Function1[/* event */ TextDocumentChangeEvent, js.Promise[Unit]]]
       with NotifyingFeature[TextDocumentChangeEvent, DidChangeTextDocumentParams]
  
  @js.native
  trait DidCloseTextDocumentFeatureShape
    extends StObject
       with DynamicFeature[TextDocumentRegistrationOptions]
       with TextDocumentSendFeature[js.Function1[/* textDocument */ TextDocument, js.Promise[Unit]]]
       with NotifyingFeature[TextDocument, DidCloseTextDocumentParams]
  
  @js.native
  trait DidOpenTextDocumentFeatureShape
    extends StObject
       with DynamicFeature[TextDocumentRegistrationOptions]
       with TextDocumentSendFeature[js.Function1[/* textDocument */ TextDocument, js.Promise[Unit]]]
       with NotifyingFeature[TextDocument, DidOpenTextDocumentParams] {
    
    var openDocuments: js.Iterable[TextDocument] = js.native
  }
  
  @js.native
  trait DidSaveTextDocumentFeatureShape
    extends StObject
       with DynamicFeature[TextDocumentRegistrationOptions]
       with TextDocumentSendFeature[js.Function1[/* textDocument */ TextDocument, js.Promise[Unit]]]
       with NotifyingFeature[TextDocument, DidSaveTextDocumentParams]
  
  trait ResolvedTextDocumentSyncCapabilities extends StObject {
    
    var resolvedTextDocumentSync: js.UndefOr[TextDocumentSyncOptions] = js.undefined
  }
  object ResolvedTextDocumentSyncCapabilities {
    
    inline def apply(): ResolvedTextDocumentSyncCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolvedTextDocumentSyncCapabilities]
    }
    
    extension [Self <: ResolvedTextDocumentSyncCapabilities](x: Self) {
      
      inline def setResolvedTextDocumentSync(value: TextDocumentSyncOptions): Self = StObject.set(x, "resolvedTextDocumentSync", value.asInstanceOf[js.Any])
      
      inline def setResolvedTextDocumentSyncUndefined: Self = StObject.set(x, "resolvedTextDocumentSync", js.undefined)
    }
  }
  
  trait TextDocumentSynchronizationMiddleware extends StObject {
    
    var didChange: js.UndefOr[NextSignature[TextDocumentChangeEvent, js.Promise[Unit]]] = js.undefined
    
    var didClose: js.UndefOr[NextSignature[TextDocument, js.Promise[Unit]]] = js.undefined
    
    var didOpen: js.UndefOr[NextSignature[TextDocument, js.Promise[Unit]]] = js.undefined
    
    var didSave: js.UndefOr[NextSignature[TextDocument, js.Promise[Unit]]] = js.undefined
    
    var willSave: js.UndefOr[NextSignature[TextDocumentWillSaveEvent, js.Promise[Unit]]] = js.undefined
    
    var willSaveWaitUntil: js.UndefOr[NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[TextEdit]]]] = js.undefined
  }
  object TextDocumentSynchronizationMiddleware {
    
    inline def apply(): TextDocumentSynchronizationMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDocumentSynchronizationMiddleware]
    }
    
    extension [Self <: TextDocumentSynchronizationMiddleware](x: Self) {
      
      inline def setDidChange(value: NextSignature[TextDocumentChangeEvent, js.Promise[Unit]]): Self = StObject.set(x, "didChange", value.asInstanceOf[js.Any])
      
      inline def setDidChangeUndefined: Self = StObject.set(x, "didChange", js.undefined)
      
      inline def setDidClose(value: NextSignature[TextDocument, js.Promise[Unit]]): Self = StObject.set(x, "didClose", value.asInstanceOf[js.Any])
      
      inline def setDidCloseUndefined: Self = StObject.set(x, "didClose", js.undefined)
      
      inline def setDidOpen(value: NextSignature[TextDocument, js.Promise[Unit]]): Self = StObject.set(x, "didOpen", value.asInstanceOf[js.Any])
      
      inline def setDidOpenUndefined: Self = StObject.set(x, "didOpen", js.undefined)
      
      inline def setDidSave(value: NextSignature[TextDocument, js.Promise[Unit]]): Self = StObject.set(x, "didSave", value.asInstanceOf[js.Any])
      
      inline def setDidSaveUndefined: Self = StObject.set(x, "didSave", js.undefined)
      
      inline def setWillSave(value: NextSignature[TextDocumentWillSaveEvent, js.Promise[Unit]]): Self = StObject.set(x, "willSave", value.asInstanceOf[js.Any])
      
      inline def setWillSaveUndefined: Self = StObject.set(x, "willSave", js.undefined)
      
      inline def setWillSaveWaitUntil(value: NextSignature[TextDocumentWillSaveEvent, Thenable[js.Array[TextEdit]]]): Self = StObject.set(x, "willSaveWaitUntil", value.asInstanceOf[js.Any])
      
      inline def setWillSaveWaitUntilUndefined: Self = StObject.set(x, "willSaveWaitUntil", js.undefined)
    }
  }
}
