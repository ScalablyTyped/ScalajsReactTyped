package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.Declaration
import typingsJapgolly.vscode.mod.DeclarationProvider
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotdeclarationMod.DeclarationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDeclarationMod {
  
  @JSImport("vscode-languageclient/lib/common/declaration", "DeclarationFeature")
  @js.native
  open class DeclarationFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | DeclarationOptions, 
          DeclarationRegistrationOptions, 
          DeclarationProvider, 
          DeclarationMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[DeclarationMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: DeclarationRegistrationOptions): js.Tuple2[Disposable, DeclarationProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  trait DeclarationMiddleware extends StObject {
    
    var provideDeclaration: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideDeclarationSignature, 
          ProviderResult[Declaration]
        ]
      ] = js.undefined
  }
  object DeclarationMiddleware {
    
    inline def apply(): DeclarationMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeclarationMiddleware]
    }
    
    extension [Self <: DeclarationMiddleware](x: Self) {
      
      inline def setProvideDeclaration(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideDeclarationSignature, 
              ProviderResult[Declaration]
            ]
      ): Self = StObject.set(x, "provideDeclaration", value.asInstanceOf[js.Any])
      
      inline def setProvideDeclarationUndefined: Self = StObject.set(x, "provideDeclaration", js.undefined)
    }
  }
  
  type ProvideDeclarationSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Declaration]
  ]
}
