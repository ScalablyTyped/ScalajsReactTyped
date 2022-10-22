package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.EventEmitter
import typingsJapgolly.vscode.mod.InlineValue
import typingsJapgolly.vscode.mod.InlineValueContext
import typingsJapgolly.vscode.mod.InlineValuesProvider
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotinlineValueMod.InlineValueOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotinlineValueMod.InlineValueRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonInlineValueMod {
  
  @JSImport("vscode-languageclient/lib/common/inlineValue", "InlineValueFeature")
  @js.native
  open class InlineValueFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | InlineValueOptions, 
          InlineValueRegistrationOptions, 
          InlineValueProviderShape, 
          InlineValueMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[InlineValueMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: InlineValueRegistrationOptions): js.Tuple2[Disposable, InlineValueProviderShape] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  trait InlineValueMiddleware extends StObject {
    
    var provideInlineValues: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* viewPort */ Range, 
          /* context */ InlineValueContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideInlineValuesSignature, 
          ProviderResult[js.Array[InlineValue]]
        ]
      ] = js.undefined
  }
  object InlineValueMiddleware {
    
    inline def apply(): InlineValueMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineValueMiddleware]
    }
    
    extension [Self <: InlineValueMiddleware](x: Self) {
      
      inline def setProvideInlineValues(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* viewPort */ Range, 
              /* context */ InlineValueContext, 
              /* token */ CancellationToken, 
              /* next */ ProvideInlineValuesSignature, 
              ProviderResult[js.Array[InlineValue]]
            ]
      ): Self = StObject.set(x, "provideInlineValues", value.asInstanceOf[js.Any])
      
      inline def setProvideInlineValuesUndefined: Self = StObject.set(x, "provideInlineValues", js.undefined)
    }
  }
  
  trait InlineValueProviderShape extends StObject {
    
    var onDidChangeInlineValues: EventEmitter[Unit]
    
    var provider: InlineValuesProvider
  }
  object InlineValueProviderShape {
    
    inline def apply(onDidChangeInlineValues: EventEmitter[Unit], provider: InlineValuesProvider): InlineValueProviderShape = {
      val __obj = js.Dynamic.literal(onDidChangeInlineValues = onDidChangeInlineValues.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineValueProviderShape]
    }
    
    extension [Self <: InlineValueProviderShape](x: Self) {
      
      inline def setOnDidChangeInlineValues(value: EventEmitter[Unit]): Self = StObject.set(x, "onDidChangeInlineValues", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: InlineValuesProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    }
  }
  
  type ProvideInlineValuesSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* viewPort */ Range, 
    /* context */ InlineValueContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[InlineValue]]
  ]
}
