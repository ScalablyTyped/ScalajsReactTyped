package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.DocumentSymbol
import typingsJapgolly.vscode.mod.DocumentSymbolProvider
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.SymbolInformation
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSymbolOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DocumentSymbolRegistrationOptions
import typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolKind
import typingsJapgolly.vscodeLanguageserverTypes.mod.SymbolTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDocumentSymbolMod {
  
  @JSImport("vscode-languageclient/lib/common/documentSymbol", "DocumentSymbolFeature")
  @js.native
  open class DocumentSymbolFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | DocumentSymbolOptions, 
          DocumentSymbolRegistrationOptions, 
          DocumentSymbolProvider, 
          DocumentSymbolMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[DocumentSymbolMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: DocumentSymbolRegistrationOptions): js.Tuple2[Disposable, DocumentSymbolProvider] = js.native
  }
  
  @JSImport("vscode-languageclient/lib/common/documentSymbol", "SupportedSymbolKinds")
  @js.native
  val SupportedSymbolKinds: js.Array[SymbolKind] = js.native
  
  @JSImport("vscode-languageclient/lib/common/documentSymbol", "SupportedSymbolTags")
  @js.native
  val SupportedSymbolTags: js.Array[SymbolTag] = js.native
  
  trait DocumentSymbolMiddleware extends StObject {
    
    var provideDocumentSymbols: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ ProvideDocumentSymbolsSignature, 
          ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
        ]
      ] = js.undefined
  }
  object DocumentSymbolMiddleware {
    
    inline def apply(): DocumentSymbolMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentSymbolMiddleware]
    }
    
    extension [Self <: DocumentSymbolMiddleware](x: Self) {
      
      inline def setProvideDocumentSymbols(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* token */ CancellationToken, 
              /* next */ ProvideDocumentSymbolsSignature, 
              ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
            ]
      ): Self = StObject.set(x, "provideDocumentSymbols", value.asInstanceOf[js.Any])
      
      inline def setProvideDocumentSymbolsUndefined: Self = StObject.set(x, "provideDocumentSymbols", js.undefined)
    }
  }
  
  type ProvideDocumentSymbolsSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[DocumentSymbol | SymbolInformation]]
  ]
}
