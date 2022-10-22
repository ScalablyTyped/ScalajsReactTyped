package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CancellationToken
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.TypeHierarchyItem
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDottypeHierarchyMod.TypeHierarchyOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDottypeHierarchyMod.TypeHierarchyRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonTypeHierarchyMod {
  
  @JSImport("vscode-languageclient/lib/common/typeHierarchy", "TypeHierarchyFeature")
  @js.native
  open class TypeHierarchyFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | TypeHierarchyOptions, 
          TypeHierarchyRegistrationOptions, 
          TypeHierarchyProvider, 
          TypeHierarchyMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[TypeHierarchyMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: TypeHierarchyRegistrationOptions): js.Tuple2[Disposable, TypeHierarchyProvider] = js.native
  }
  
  type PrepareTypeHierarchySignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[TypeHierarchyItem]]
  ]
  
  trait TypeHierarchyMiddleware extends StObject {
    
    var prepareTypeHierarchy: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* positions */ Position, 
          /* token */ CancellationToken, 
          /* next */ PrepareTypeHierarchySignature, 
          ProviderResult[js.Array[TypeHierarchyItem]]
        ]
      ] = js.undefined
    
    var provideTypeHierarchySubtypes: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ TypeHierarchyItem, 
          /* token */ CancellationToken, 
          /* next */ TypeHierarchySubtypesSignature, 
          ProviderResult[js.Array[TypeHierarchyItem]]
        ]
      ] = js.undefined
    
    var provideTypeHierarchySupertypes: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ TypeHierarchyItem, 
          /* token */ CancellationToken, 
          /* next */ TypeHierarchySupertypesSignature, 
          ProviderResult[js.Array[TypeHierarchyItem]]
        ]
      ] = js.undefined
  }
  object TypeHierarchyMiddleware {
    
    inline def apply(): TypeHierarchyMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeHierarchyMiddleware]
    }
    
    extension [Self <: TypeHierarchyMiddleware](x: Self) {
      
      inline def setPrepareTypeHierarchy(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* positions */ Position, 
              /* token */ CancellationToken, 
              /* next */ PrepareTypeHierarchySignature, 
              ProviderResult[js.Array[TypeHierarchyItem]]
            ]
      ): Self = StObject.set(x, "prepareTypeHierarchy", value.asInstanceOf[js.Any])
      
      inline def setPrepareTypeHierarchyUndefined: Self = StObject.set(x, "prepareTypeHierarchy", js.undefined)
      
      inline def setProvideTypeHierarchySubtypes(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ TypeHierarchyItem, 
              /* token */ CancellationToken, 
              /* next */ TypeHierarchySubtypesSignature, 
              ProviderResult[js.Array[TypeHierarchyItem]]
            ]
      ): Self = StObject.set(x, "provideTypeHierarchySubtypes", value.asInstanceOf[js.Any])
      
      inline def setProvideTypeHierarchySubtypesUndefined: Self = StObject.set(x, "provideTypeHierarchySubtypes", js.undefined)
      
      inline def setProvideTypeHierarchySupertypes(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ TypeHierarchyItem, 
              /* token */ CancellationToken, 
              /* next */ TypeHierarchySupertypesSignature, 
              ProviderResult[js.Array[TypeHierarchyItem]]
            ]
      ): Self = StObject.set(x, "provideTypeHierarchySupertypes", value.asInstanceOf[js.Any])
      
      inline def setProvideTypeHierarchySupertypesUndefined: Self = StObject.set(x, "provideTypeHierarchySupertypes", js.undefined)
    }
  }
  
  trait TypeHierarchyProvider
    extends StObject
       with typingsJapgolly.vscode.mod.TypeHierarchyProvider {
    
    /* private */ var client: Any
    
    /* private */ var middleware: Any
  }
  object TypeHierarchyProvider {
    
    inline def apply(
      client: Any,
      middleware: Any,
      prepareTypeHierarchy: (TextDocument, Position, CancellationToken) => ProviderResult[TypeHierarchyItem | js.Array[TypeHierarchyItem]],
      provideTypeHierarchySubtypes: (TypeHierarchyItem, CancellationToken) => ProviderResult[js.Array[TypeHierarchyItem]],
      provideTypeHierarchySupertypes: (TypeHierarchyItem, CancellationToken) => ProviderResult[js.Array[TypeHierarchyItem]]
    ): TypeHierarchyProvider = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], prepareTypeHierarchy = js.Any.fromFunction3(prepareTypeHierarchy), provideTypeHierarchySubtypes = js.Any.fromFunction2(provideTypeHierarchySubtypes), provideTypeHierarchySupertypes = js.Any.fromFunction2(provideTypeHierarchySupertypes))
      __obj.asInstanceOf[TypeHierarchyProvider]
    }
    
    extension [Self <: TypeHierarchyProvider](x: Self) {
      
      inline def setClient(value: Any): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setMiddleware(value: Any): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    }
  }
  
  type TypeHierarchySubtypesSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ TypeHierarchyItem, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[TypeHierarchyItem]]
  ]
  
  type TypeHierarchySupertypesSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ TypeHierarchyItem, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[TypeHierarchyItem]]
  ]
}
