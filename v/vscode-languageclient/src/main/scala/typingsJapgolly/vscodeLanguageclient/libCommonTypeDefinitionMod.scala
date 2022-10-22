package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.Definition
import typingsJapgolly.vscode.mod.DefinitionLink
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.TypeDefinitionProvider
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDottypeDefinitionMod.TypeDefinitionOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDottypeDefinitionMod.TypeDefinitionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonTypeDefinitionMod {
  
  @JSImport("vscode-languageclient/lib/common/typeDefinition", "TypeDefinitionFeature")
  @js.native
  open class TypeDefinitionFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | TypeDefinitionOptions, 
          TypeDefinitionRegistrationOptions, 
          TypeDefinitionProvider, 
          TypeDefinitionMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[TypeDefinitionMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: TypeDefinitionRegistrationOptions): js.Tuple2[Disposable, TypeDefinitionProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  type ProvideTypeDefinitionSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
  
  trait TypeDefinitionMiddleware extends StObject {
    
    var provideTypeDefinition: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideTypeDefinitionSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
      ] = js.undefined
  }
  object TypeDefinitionMiddleware {
    
    inline def apply(): TypeDefinitionMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeDefinitionMiddleware]
    }
    
    extension [Self <: TypeDefinitionMiddleware](x: Self) {
      
      inline def setProvideTypeDefinition(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideTypeDefinitionSignature, 
              ProviderResult[Definition | js.Array[DefinitionLink]]
            ]
      ): Self = StObject.set(x, "provideTypeDefinition", value.asInstanceOf[js.Any])
      
      inline def setProvideTypeDefinitionUndefined: Self = StObject.set(x, "provideTypeDefinition", js.undefined)
    }
  }
}
