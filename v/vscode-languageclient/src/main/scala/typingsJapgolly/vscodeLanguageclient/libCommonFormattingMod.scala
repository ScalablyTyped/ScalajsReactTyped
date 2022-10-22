package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.DocumentFormattingEditProvider
import typingsJapgolly.vscode.mod.DocumentRangeFormattingEditProvider
import typingsJapgolly.vscode.mod.FormattingOptions
import typingsJapgolly.vscode.mod.OnTypeFormattingEditProvider
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.TextEdit
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentFormattingOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentHighlightRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentOnTypeFormattingOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentOnTypeFormattingRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentRangeFormattingOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentRangeFormattingRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonFormattingMod {
  
  @JSImport("vscode-languageclient/lib/common/formatting", "DocumentFormattingFeature")
  @js.native
  open class DocumentFormattingFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | DocumentFormattingOptions, 
          DocumentHighlightRegistrationOptions, 
          DocumentFormattingEditProvider, 
          FormattingMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[FormattingMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: TextDocumentRegistrationOptions): js.Tuple2[Disposable, DocumentFormattingEditProvider] = js.native
  }
  
  @JSImport("vscode-languageclient/lib/common/formatting", "DocumentOnTypeFormattingFeature")
  @js.native
  open class DocumentOnTypeFormattingFeature protected ()
    extends TextDocumentLanguageFeature[
          DocumentOnTypeFormattingOptions, 
          DocumentOnTypeFormattingRegistrationOptions, 
          OnTypeFormattingEditProvider, 
          FormattingMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[FormattingMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: DocumentOnTypeFormattingRegistrationOptions): js.Tuple2[Disposable, OnTypeFormattingEditProvider] = js.native
  }
  
  @JSImport("vscode-languageclient/lib/common/formatting", "DocumentRangeFormattingFeature")
  @js.native
  open class DocumentRangeFormattingFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | DocumentRangeFormattingOptions, 
          DocumentRangeFormattingRegistrationOptions, 
          DocumentRangeFormattingEditProvider, 
          FormattingMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[FormattingMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: TextDocumentRegistrationOptions): js.Tuple2[Disposable, DocumentRangeFormattingEditProvider] = js.native
  }
  
  trait FormattingMiddleware extends StObject {
    
    var provideDocumentFormattingEdits: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* options */ FormattingOptions, 
          /* token */ CancellationToken, 
          /* next */ ProvideDocumentFormattingEditsSignature, 
          ProviderResult[js.Array[TextEdit]]
        ]
      ] = js.undefined
    
    var provideDocumentRangeFormattingEdits: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* range */ Range, 
          /* options */ FormattingOptions, 
          /* token */ CancellationToken, 
          /* next */ ProvideDocumentRangeFormattingEditsSignature, 
          ProviderResult[js.Array[TextEdit]]
        ]
      ] = js.undefined
    
    var provideOnTypeFormattingEdits: js.UndefOr[
        js.ThisFunction6[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* ch */ String, 
          /* options */ FormattingOptions, 
          /* token */ CancellationToken, 
          /* next */ ProvideOnTypeFormattingEditsSignature, 
          ProviderResult[js.Array[TextEdit]]
        ]
      ] = js.undefined
  }
  object FormattingMiddleware {
    
    inline def apply(): FormattingMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormattingMiddleware]
    }
    
    extension [Self <: FormattingMiddleware](x: Self) {
      
      inline def setProvideDocumentFormattingEdits(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* options */ FormattingOptions, 
              /* token */ CancellationToken, 
              /* next */ ProvideDocumentFormattingEditsSignature, 
              ProviderResult[js.Array[TextEdit]]
            ]
      ): Self = StObject.set(x, "provideDocumentFormattingEdits", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentFormattingEditsUndefined: Self = StObject.set(x, "provideDocumentFormattingEdits", js.undefined)
      
      inline def setProvideDocumentRangeFormattingEdits(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* range */ Range, 
              /* options */ FormattingOptions, 
              /* token */ CancellationToken, 
              /* next */ ProvideDocumentRangeFormattingEditsSignature, 
              ProviderResult[js.Array[TextEdit]]
            ]
      ): Self = StObject.set(x, "provideDocumentRangeFormattingEdits", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentRangeFormattingEditsUndefined: Self = StObject.set(x, "provideDocumentRangeFormattingEdits", js.undefined)
      
      inline def setProvideOnTypeFormattingEdits(
        value: js.ThisFunction6[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* ch */ String, 
              /* options */ FormattingOptions, 
              /* token */ CancellationToken, 
              /* next */ ProvideOnTypeFormattingEditsSignature, 
              ProviderResult[js.Array[TextEdit]]
            ]
      ): Self = StObject.set(x, "provideOnTypeFormattingEdits", value.asInstanceOf[js.Any])
      
      inline def setProvideOnTypeFormattingEditsUndefined: Self = StObject.set(x, "provideOnTypeFormattingEdits", js.undefined)
    }
  }
  
  type ProvideDocumentFormattingEditsSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* options */ FormattingOptions, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[TextEdit]]
  ]
  
  type ProvideDocumentRangeFormattingEditsSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* range */ Range, 
    /* options */ FormattingOptions, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[TextEdit]]
  ]
  
  type ProvideOnTypeFormattingEditsSignature = js.ThisFunction5[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* ch */ String, 
    /* options */ FormattingOptions, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[TextEdit]]
  ]
}
