package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.Definition
import typingsJapgolly.vscode.mod.DefinitionLink
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.ImplementationProvider
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotimplementationMod.ImplementationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonImplementationMod {
  
  @JSImport("vscode-languageclient/lib/common/implementation", "ImplementationFeature")
  @js.native
  open class ImplementationFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | ImplementationOptions, 
          ImplementationRegistrationOptions, 
          ImplementationProvider, 
          ImplementationMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[ImplementationMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: ImplementationRegistrationOptions): js.Tuple2[Disposable, ImplementationProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  trait ImplementationMiddleware extends StObject {
    
    var provideImplementation: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideImplementationSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
      ] = js.undefined
  }
  object ImplementationMiddleware {
    
    inline def apply(): ImplementationMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImplementationMiddleware]
    }
    
    extension [Self <: ImplementationMiddleware](x: Self) {
      
      inline def setProvideImplementation(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideImplementationSignature, 
              ProviderResult[Definition | js.Array[DefinitionLink]]
            ]
      ): Self = StObject.set(x, "provideImplementation", value.asInstanceOf[js.Any])
      
      inline def setProvideImplementationUndefined: Self = StObject.set(x, "provideImplementation", js.undefined)
    }
  }
  
  type ProvideImplementationSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
}
