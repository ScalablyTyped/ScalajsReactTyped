package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CodeLens
import typingsJapgolly.vscode.mod.CodeLensProvider
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.EventEmitter
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeLensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonCodeLensMod {
  
  @JSImport("vscode-languageclient/lib/common/codeLens", "CodeLensFeature")
  @js.native
  open class CodeLensFeature protected ()
    extends TextDocumentLanguageFeature[
          CodeLensOptions, 
          CodeLensRegistrationOptions, 
          CodeLensProviderShape, 
          CodeLensMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[CodeLensMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: CodeLensRegistrationOptions): js.Tuple2[Disposable, CodeLensProviderShape] = js.native
  }
  
  trait CodeLensMiddleware extends StObject {
    
    var provideCodeLenses: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* token */ CancellationToken, 
          /* next */ ProvideCodeLensesSignature, 
          ProviderResult[js.Array[CodeLens]]
        ]
      ] = js.undefined
    
    var resolveCodeLens: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* codeLens */ CodeLens, 
          /* token */ CancellationToken, 
          /* next */ ResolveCodeLensSignature, 
          ProviderResult[CodeLens]
        ]
      ] = js.undefined
  }
  object CodeLensMiddleware {
    
    inline def apply(): CodeLensMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeLensMiddleware]
    }
    
    extension [Self <: CodeLensMiddleware](x: Self) {
      
      inline def setProvideCodeLenses(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* token */ CancellationToken, 
              /* next */ ProvideCodeLensesSignature, 
              ProviderResult[js.Array[CodeLens]]
            ]
      ): Self = StObject.set(x, "provideCodeLenses", value.asInstanceOf[js.Any])
      
      inline def setProvideCodeLensesUndefined: Self = StObject.set(x, "provideCodeLenses", js.undefined)
      
      inline def setResolveCodeLens(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* codeLens */ CodeLens, 
              /* token */ CancellationToken, 
              /* next */ ResolveCodeLensSignature, 
              ProviderResult[CodeLens]
            ]
      ): Self = StObject.set(x, "resolveCodeLens", value.asInstanceOf[js.Any])
      
      inline def setResolveCodeLensUndefined: Self = StObject.set(x, "resolveCodeLens", js.undefined)
    }
  }
  
  trait CodeLensProviderShape extends StObject {
    
    var onDidChangeCodeLensEmitter: EventEmitter[Unit]
    
    var provider: js.UndefOr[CodeLensProvider[CodeLens]] = js.undefined
  }
  object CodeLensProviderShape {
    
    inline def apply(onDidChangeCodeLensEmitter: EventEmitter[Unit]): CodeLensProviderShape = {
      val __obj = js.Dynamic.literal(onDidChangeCodeLensEmitter = onDidChangeCodeLensEmitter.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeLensProviderShape]
    }
    
    extension [Self <: CodeLensProviderShape](x: Self) {
      
      inline def setOnDidChangeCodeLensEmitter(value: EventEmitter[Unit]): Self = StObject.set(x, "onDidChangeCodeLensEmitter", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: CodeLensProvider[CodeLens]): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    }
  }
  
  type ProvideCodeLensesSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[CodeLens]]
  ]
  
  type ResolveCodeLensSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* codeLens */ CodeLens, 
    /* token */ CancellationToken, 
    ProviderResult[CodeLens]
  ]
}
