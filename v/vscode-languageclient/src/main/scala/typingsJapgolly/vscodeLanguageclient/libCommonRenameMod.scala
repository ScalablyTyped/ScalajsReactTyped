package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.Range
import typingsJapgolly.vscode.mod.RenameProvider
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscode.mod.WorkspaceEdit
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.anon.Placeholder
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.DocumentSelectorOptions
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.RenameOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolMod.RenameRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonRenameMod {
  
  @JSImport("vscode-languageclient/lib/common/rename", "RenameFeature")
  @js.native
  open class RenameFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | RenameOptions, 
          RenameRegistrationOptions, 
          RenameProvider, 
          RenameMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[RenameMiddleware, js.Object]) = this()
    
    /* private */ var isDefaultBehavior: Any = js.native
    
    /* protected */ def registerLanguageProvider(options: RenameRegistrationOptions & DocumentSelectorOptions): js.Tuple2[Disposable, RenameProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  type PrepareRenameSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* token */ CancellationToken, 
    ProviderResult[Range | Placeholder]
  ]
  
  type ProvideRenameEditsSignature = js.ThisFunction4[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* position */ Position, 
    /* newName */ String, 
    /* token */ CancellationToken, 
    ProviderResult[WorkspaceEdit]
  ]
  
  trait RenameMiddleware extends StObject {
    
    var prepareRename: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* token */ CancellationToken, 
          /* next */ PrepareRenameSignature, 
          ProviderResult[Range | Placeholder]
        ]
      ] = js.undefined
    
    var provideRenameEdits: js.UndefOr[
        js.ThisFunction5[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* position */ Position, 
          /* newName */ String, 
          /* token */ CancellationToken, 
          /* next */ ProvideRenameEditsSignature, 
          ProviderResult[WorkspaceEdit]
        ]
      ] = js.undefined
  }
  object RenameMiddleware {
    
    inline def apply(): RenameMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenameMiddleware]
    }
    
    extension [Self <: RenameMiddleware](x: Self) {
      
      inline def setPrepareRename(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* token */ CancellationToken, 
              /* next */ PrepareRenameSignature, 
              ProviderResult[Range | Placeholder]
            ]
      ): Self = StObject.set(x, "prepareRename", value.asInstanceOf[js.Any])
      
      inline def setPrepareRenameUndefined: Self = StObject.set(x, "prepareRename", js.undefined)
      
      inline def setProvideRenameEdits(
        value: js.ThisFunction5[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* position */ Position, 
              /* newName */ String, 
              /* token */ CancellationToken, 
              /* next */ ProvideRenameEditsSignature, 
              ProviderResult[WorkspaceEdit]
            ]
      ): Self = StObject.set(x, "provideRenameEdits", value.asInstanceOf[js.Any])
      
      inline def setProvideRenameEditsUndefined: Self = StObject.set(x, "provideRenameEdits", js.undefined)
    }
  }
}
