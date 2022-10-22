package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.CodeAction
import typingsJapgolly.vscode.mod.CodeActionContext
import typingsJapgolly.vscode.mod.CodeActionProvider
import typingsJapgolly.vscode.mod.Command
import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeActionOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.CodeActionRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonCodeActionMod {
  
  @JSImport("vscode-languageclient/lib/common/codeAction", "CodeActionFeature")
  @js.native
  open class CodeActionFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | CodeActionOptions, 
          CodeActionRegistrationOptions, 
          CodeActionProvider[CodeAction], 
          CodeActionMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[CodeActionMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: CodeActionRegistrationOptions): js.Tuple2[Disposable, CodeActionProvider[CodeAction]] = js.native
  }
  
  trait CodeActionMiddleware extends StObject {
    
    var provideCodeActions: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* range */ Range, 
          /* context */ CodeActionContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideCodeActionsSignature, 
          ProviderResult[js.Array[Command | CodeAction]]
        ]
      ] = js.undefined
    
    var resolveCodeAction: js.UndefOr[
        js.ThisFunction3[
          /* this */ Unit, 
          /* item */ CodeAction, 
          /* token */ CancellationToken, 
          /* next */ ResolveCodeActionSignature, 
          ProviderResult[CodeAction]
        ]
      ] = js.undefined
  }
  object CodeActionMiddleware {
    
    inline def apply(): CodeActionMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodeActionMiddleware]
    }
    
    extension [Self <: CodeActionMiddleware](x: Self) {
      
      inline def setProvideCodeActions(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* range */ Range, 
              /* context */ CodeActionContext, 
              /* token */ CancellationToken, 
              /* next */ ProvideCodeActionsSignature, 
              ProviderResult[js.Array[Command | CodeAction]]
            ]
      ): Self = StObject.set(x, "provideCodeActions", value.asInstanceOf[js.Any])
      
      inline def setProvideCodeActionsUndefined: Self = StObject.set(x, "provideCodeActions", js.undefined)
      
      inline def setResolveCodeAction(
        value: js.ThisFunction3[
              /* this */ Unit, 
              /* item */ CodeAction, 
              /* token */ CancellationToken, 
              /* next */ ResolveCodeActionSignature, 
              ProviderResult[CodeAction]
            ]
      ): Self = StObject.set(x, "resolveCodeAction", value.asInstanceOf[js.Any])
      
      inline def setResolveCodeActionUndefined: Self = StObject.set(x, "resolveCodeAction", js.undefined)
    }
  }
  
  type ProvideCodeActionsSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* range */ Range, 
    /* context */ CodeActionContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[Command | CodeAction]]
  ]
  
  type ResolveCodeActionSignature = js.ThisFunction2[
    /* this */ Unit, 
    /* item */ CodeAction, 
    /* token */ CancellationToken, 
    ProviderResult[CodeAction]
  ]
}
