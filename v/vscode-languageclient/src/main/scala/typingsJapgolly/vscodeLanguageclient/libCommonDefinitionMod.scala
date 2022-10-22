package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.Definition
import typingsJapgolly.vscode.mod.DefinitionLink
import typingsJapgolly.vscode.mod.DefinitionProvider
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DefinitionOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.DefinitionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDefinitionMod {
  
  @JSImport("vscode-languageclient/lib/common/definition", "DefinitionFeature")
  @js.native
  open class DefinitionFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | DefinitionOptions, 
          DefinitionRegistrationOptions, 
          DefinitionProvider, 
          DefinitionMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[DefinitionMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: DefinitionRegistrationOptions): js.Tuple2[Disposable, DefinitionProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  trait DefinitionMiddleware extends StObject {
    
    var provideDefinition: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ ProvideDefinitionSignature, 
          ProviderResult[Definition | js.Array[DefinitionLink]]
        ]
      ] = js.undefined
  }
  object DefinitionMiddleware {
    
    inline def apply(): DefinitionMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefinitionMiddleware]
    }
    
    extension [Self <: DefinitionMiddleware](x: Self) {
      
      inline def setProvideDefinition(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ ProvideDefinitionSignature, 
              ProviderResult[Definition | js.Array[DefinitionLink]]
            ]
      ): Self = StObject.set(x, "provideDefinition", value.asInstanceOf[js.Any])
      
      inline def setProvideDefinitionUndefined: Self = StObject.set(x, "provideDefinition", js.undefined)
    }
  }
  
  type ProvideDefinitionSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Definition | js.Array[DefinitionLink]]
  ]
}
