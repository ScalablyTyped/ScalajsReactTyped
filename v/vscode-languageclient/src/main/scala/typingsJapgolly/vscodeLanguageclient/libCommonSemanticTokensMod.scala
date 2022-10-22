package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.DocumentRangeSemanticTokensProvider
import typingsJapgolly.vscode.mod.DocumentSemanticTokensProvider
import typingsJapgolly.vscode.mod.EventEmitter
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.SemanticTokens
import typingsJapgolly.vscode.mod.SemanticTokensEdits
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonSemanticTokensMod {
  
  @JSImport("vscode-languageclient/lib/common/semanticTokens", "SemanticTokensFeature")
  @js.native
  open class SemanticTokensFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | SemanticTokensOptions, 
          SemanticTokensRegistrationOptions, 
          SemanticTokensProviderShape, 
          SemanticTokensMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[SemanticTokensMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: SemanticTokensRegistrationOptions): js.Tuple2[Disposable, SemanticTokensProviderShape] = js.native
  }
  
  type DocumentRangeSemanticTokensSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* range */ Range, 
    /* token */ CancellationToken, 
    ProviderResult[SemanticTokens]
  ]
  
  type DocumentSemanticsTokensEditsSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* previousResultId */ String, 
    /* token */ CancellationToken, 
    ProviderResult[SemanticTokensEdits | SemanticTokens]
  ]
  
  type DocumentSemanticsTokensSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[SemanticTokens]
  ]
  
  trait SemanticTokensMiddleware extends StObject {
    
    var provideDocumentRangeSemanticTokens: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* range */ Range, 
          /* token */ CancellationToken, 
          /* next */ DocumentRangeSemanticTokensSignature, 
          ProviderResult[SemanticTokens]
        ]
      ] = js.undefined
    
    var provideDocumentSemanticTokens: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ DocumentSemanticsTokensSignature, 
          ProviderResult[SemanticTokens]
        ]
      ] = js.undefined
    
    var provideDocumentSemanticTokensEdits: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* previousResultId */ String, 
          /* token */ CancellationToken, 
          /* next */ DocumentSemanticsTokensEditsSignature, 
          ProviderResult[SemanticTokensEdits | SemanticTokens]
        ]
      ] = js.undefined
  }
  object SemanticTokensMiddleware {
    
    inline def apply(): SemanticTokensMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemanticTokensMiddleware]
    }
    
    extension [Self <: SemanticTokensMiddleware](x: Self) {
      
      inline def setProvideDocumentRangeSemanticTokens(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* range */ Range, 
              /* token */ CancellationToken, 
              /* next */ DocumentRangeSemanticTokensSignature, 
              ProviderResult[SemanticTokens]
            ]
      ): Self = StObject.set(x, "provideDocumentRangeSemanticTokens", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentRangeSemanticTokensUndefined: Self = StObject.set(x, "provideDocumentRangeSemanticTokens", js.undefined)
      
      inline def setProvideDocumentSemanticTokens(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* token */ CancellationToken, 
              /* next */ DocumentSemanticsTokensSignature, 
              ProviderResult[SemanticTokens]
            ]
      ): Self = StObject.set(x, "provideDocumentSemanticTokens", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentSemanticTokensEdits(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* previousResultId */ String, 
              /* token */ CancellationToken, 
              /* next */ DocumentSemanticsTokensEditsSignature, 
              ProviderResult[SemanticTokensEdits | SemanticTokens]
            ]
      ): Self = StObject.set(x, "provideDocumentSemanticTokensEdits", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentSemanticTokensEditsUndefined: Self = StObject.set(x, "provideDocumentSemanticTokensEdits", js.undefined)
      
      inline def setProvideDocumentSemanticTokensUndefined: Self = StObject.set(x, "provideDocumentSemanticTokens", js.undefined)
    }
  }
  
  trait SemanticTokensProviderShape extends StObject {
    
    var full: js.UndefOr[DocumentSemanticTokensProvider] = js.undefined
    
    var onDidChangeSemanticTokensEmitter: EventEmitter[Unit]
    
    var range: js.UndefOr[DocumentRangeSemanticTokensProvider] = js.undefined
  }
  object SemanticTokensProviderShape {
    
    inline def apply(onDidChangeSemanticTokensEmitter: EventEmitter[Unit]): SemanticTokensProviderShape = {
      val __obj = js.Dynamic.literal(onDidChangeSemanticTokensEmitter = onDidChangeSemanticTokensEmitter.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensProviderShape]
    }
    
    extension [Self <: SemanticTokensProviderShape](x: Self) {
      
      inline def setFull(value: DocumentSemanticTokensProvider): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setOnDidChangeSemanticTokensEmitter(value: EventEmitter[Unit]): Self = StObject.set(x, "onDidChangeSemanticTokensEmitter", value.asInstanceOf[js.Any])
      
      inline def setRange(value: DocumentRangeSemanticTokensProvider): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
}
