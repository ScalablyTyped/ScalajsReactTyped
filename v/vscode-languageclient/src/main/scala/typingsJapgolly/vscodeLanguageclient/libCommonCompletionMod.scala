package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.CompletionContext
import typingsJapgolly.vscode.mod.CompletionItem
import typingsJapgolly.vscode.mod.CompletionItemProvider
import typingsJapgolly.vscode.mod.CompletionList
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CompletionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonCompletionMod {
  
  @JSImport("vscode-languageclient/lib/common/completion", "CompletionItemFeature")
  @js.native
  open class CompletionItemFeature protected ()
    extends TextDocumentLanguageFeature[
          CompletionOptions, 
          CompletionRegistrationOptions, 
          CompletionItemProvider[CompletionItem], 
          CompletionMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[CompletionMiddleware, js.Object]) = this()
    
    /* private */ var labelDetailsSupport: Any = js.native
  }
  
  trait CompletionMiddleware extends StObject {
    
    var provideCompletionItem: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* context */ CompletionContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideCompletionItemsSignature, 
          ProviderResult[js.Array[CompletionItem] | CompletionList[CompletionItem]]
        ]
      ] = js.undefined
    
    var resolveCompletionItem: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ CompletionItem, 
          /* token */ CancellationToken, 
          /* next */ ResolveCompletionItemSignature, 
          ProviderResult[CompletionItem]
        ]
      ] = js.undefined
  }
  object CompletionMiddleware {
    
    inline def apply(): CompletionMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompletionMiddleware]
    }
    
    extension [Self <: CompletionMiddleware](x: Self) {
      
      inline def setProvideCompletionItem(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* context */ CompletionContext, 
              /* token */ CancellationToken, 
              /* next */ ProvideCompletionItemsSignature, 
              ProviderResult[js.Array[CompletionItem] | CompletionList[CompletionItem]]
            ]
      ): Self = StObject.set(x, "provideCompletionItem", value.asInstanceOf[js.Any])
      
      inline def setProvideCompletionItemUndefined: Self = StObject.set(x, "provideCompletionItem", js.undefined)
      
      inline def setResolveCompletionItem(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ CompletionItem, 
              /* token */ CancellationToken, 
              /* next */ ResolveCompletionItemSignature, 
              ProviderResult[CompletionItem]
            ]
      ): Self = StObject.set(x, "resolveCompletionItem", value.asInstanceOf[js.Any])
      
      inline def setResolveCompletionItemUndefined: Self = StObject.set(x, "resolveCompletionItem", js.undefined)
    }
  }
  
  type ProvideCompletionItemsSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* context */ CompletionContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[CompletionItem] | CompletionList[CompletionItem]]
  ]
  
  type ResolveCompletionItemSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ CompletionItem, 
    /* token */ CancellationToken, 
    ProviderResult[CompletionItem]
  ]
}
