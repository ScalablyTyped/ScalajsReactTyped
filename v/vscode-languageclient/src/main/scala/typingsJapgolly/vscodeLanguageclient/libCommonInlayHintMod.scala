package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.EventEmitter
import typingsJapgolly.vscode.mod.InlayHint
import typingsJapgolly.vscode.mod.InlayHintsProvider
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotinlayHintMod.InlayHintOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotinlayHintMod.InlayHintRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonInlayHintMod {
  
  @JSImport("vscode-languageclient/lib/common/inlayHint", "InlayHintsFeature")
  @js.native
  open class InlayHintsFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | InlayHintOptions, 
          InlayHintRegistrationOptions, 
          InlayHintsProviderShape, 
          InlayHintsMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[InlayHintsMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: InlayHintRegistrationOptions): js.Tuple2[Disposable, InlayHintsProviderShape] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  trait InlayHintsMiddleware extends StObject {
    
    var provideInlayHints: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* viewPort */ Range, 
          /* token */ CancellationToken, 
          /* next */ ProvideInlayHintsSignature, 
          ProviderResult[js.Array[InlayHint]]
        ]
      ] = js.undefined
    
    var resolveInlayHint: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ InlayHint, 
          /* token */ CancellationToken, 
          /* next */ ResolveInlayHintSignature, 
          ProviderResult[InlayHint]
        ]
      ] = js.undefined
  }
  object InlayHintsMiddleware {
    
    inline def apply(): InlayHintsMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlayHintsMiddleware]
    }
    
    extension [Self <: InlayHintsMiddleware](x: Self) {
      
      inline def setProvideInlayHints(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* viewPort */ Range, 
              /* token */ CancellationToken, 
              /* next */ ProvideInlayHintsSignature, 
              ProviderResult[js.Array[InlayHint]]
            ]
      ): Self = StObject.set(x, "provideInlayHints", value.asInstanceOf[js.Any])
      
      inline def setProvideInlayHintsUndefined: Self = StObject.set(x, "provideInlayHints", js.undefined)
      
      inline def setResolveInlayHint(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ InlayHint, 
              /* token */ CancellationToken, 
              /* next */ ResolveInlayHintSignature, 
              ProviderResult[InlayHint]
            ]
      ): Self = StObject.set(x, "resolveInlayHint", value.asInstanceOf[js.Any])
      
      inline def setResolveInlayHintUndefined: Self = StObject.set(x, "resolveInlayHint", js.undefined)
    }
  }
  
  trait InlayHintsProviderShape extends StObject {
    
    var onDidChangeInlayHints: EventEmitter[Unit]
    
    var provider: InlayHintsProvider[InlayHint]
  }
  object InlayHintsProviderShape {
    
    inline def apply(onDidChangeInlayHints: EventEmitter[Unit], provider: InlayHintsProvider[InlayHint]): InlayHintsProviderShape = {
      val __obj = js.Dynamic.literal(onDidChangeInlayHints = onDidChangeInlayHints.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlayHintsProviderShape]
    }
    
    extension [Self <: InlayHintsProviderShape](x: Self) {
      
      inline def setOnDidChangeInlayHints(value: EventEmitter[Unit]): Self = StObject.set(x, "onDidChangeInlayHints", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: InlayHintsProvider[InlayHint]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  type ProvideInlayHintsSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* viewPort */ Range, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[InlayHint]]
  ]
  
  type ResolveInlayHintSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ InlayHint, 
    /* token */ CancellationToken, 
    ProviderResult[InlayHint]
  ]
}
