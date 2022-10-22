package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.SignatureHelp
import typingsJapgolly.vscode.mod.SignatureHelpContext
import typingsJapgolly.vscode.mod.SignatureHelpProvider
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DocumentSelectorOptions
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.SignatureHelpOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.SignatureHelpRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonSignatureHelpMod {
  
  @JSImport("vscode-languageclient/lib/common/signatureHelp", "SignatureHelpFeature")
  @js.native
  open class SignatureHelpFeature protected ()
    extends TextDocumentLanguageFeature[
          SignatureHelpOptions, 
          SignatureHelpRegistrationOptions, 
          SignatureHelpProvider, 
          SignatureHelpMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[SignatureHelpMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: SignatureHelpRegistrationOptions & DocumentSelectorOptions): js.Tuple2[Disposable, SignatureHelpProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  type ProvideSignatureHelpSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* context */ SignatureHelpContext, 
    /* token */ CancellationToken, 
    ProviderResult[SignatureHelp]
  ]
  
  trait SignatureHelpMiddleware extends StObject {
    
    var provideSignatureHelp: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* context */ SignatureHelpContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideSignatureHelpSignature, 
          ProviderResult[SignatureHelp]
        ]
      ] = js.undefined
  }
  object SignatureHelpMiddleware {
    
    inline def apply(): SignatureHelpMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureHelpMiddleware]
    }
    
    extension [Self <: SignatureHelpMiddleware](x: Self) {
      
      inline def setProvideSignatureHelp(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* context */ SignatureHelpContext, 
              /* token */ CancellationToken, 
              /* next */ ProvideSignatureHelpSignature, 
              ProviderResult[SignatureHelp]
            ]
      ): Self = StObject.set(x, "provideSignatureHelp", value.asInstanceOf[js.Any])
      
      inline def setProvideSignatureHelpUndefined: Self = StObject.set(x, "provideSignatureHelp", js.undefined)
    }
  }
}
