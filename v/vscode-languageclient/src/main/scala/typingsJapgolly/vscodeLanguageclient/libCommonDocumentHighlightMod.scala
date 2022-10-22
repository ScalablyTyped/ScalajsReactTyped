package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.DocumentHighlight
import typingsJapgolly.vscode.mod.DocumentHighlightProvider
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentHighlightOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentHighlightRegistrationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDocumentHighlightMod {
  
  @JSImport("vscode-languageclient/lib/common/documentHighlight", "DocumentHighlightFeature")
  @js.native
  open class DocumentHighlightFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | DocumentHighlightOptions, 
          DocumentHighlightRegistrationOptions, 
          DocumentHighlightProvider, 
          DocumentHighlightMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[DocumentHighlightMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: TextDocumentRegistrationOptions): js.Tuple2[Disposable, DocumentHighlightProvider] = js.native
  }
  
  trait DocumentHighlightMiddleware extends StObject {
    
    var provideDocumentHighlights: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideDocumentHighlightsSignature, 
          ProviderResult[js.Array[DocumentHighlight]]
        ]
      ] = js.undefined
  }
  object DocumentHighlightMiddleware {
    
    inline def apply(): DocumentHighlightMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentHighlightMiddleware]
    }
    
    extension [Self <: DocumentHighlightMiddleware](x: Self) {
      
      inline def setProvideDocumentHighlights(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideDocumentHighlightsSignature, 
              ProviderResult[js.Array[DocumentHighlight]]
            ]
      ): Self = StObject.set(x, "provideDocumentHighlights", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentHighlightsUndefined: Self = StObject.set(x, "provideDocumentHighlights", js.undefined)
    }
  }
  
  type ProvideDocumentHighlightsSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[DocumentHighlight]]
  ]
}
