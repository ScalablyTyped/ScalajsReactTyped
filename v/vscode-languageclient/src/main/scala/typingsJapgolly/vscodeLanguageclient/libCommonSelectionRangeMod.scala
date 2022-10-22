package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.Position
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.SelectionRange
import typingsJapgolly.vscode.mod.SelectionRangeProvider
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotselectionRangeMod.SelectionRangeOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotselectionRangeMod.SelectionRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonSelectionRangeMod {
  
  @JSImport("vscode-languageclient/lib/common/selectionRange", "SelectionRangeFeature")
  @js.native
  open class SelectionRangeFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | SelectionRangeOptions, 
          SelectionRangeRegistrationOptions, 
          SelectionRangeProvider, 
          SelectionRangeProviderMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[SelectionRangeProviderMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: SelectionRangeRegistrationOptions): js.Tuple2[Disposable, SelectionRangeProvider] = js.native
    
    /* private */ var registerProvider: Any = js.native
  }
  
  type ProvideSelectionRangeSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* positions */ js.Array[Position], 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[SelectionRange]]
  ]
  
  trait SelectionRangeProviderMiddleware extends StObject {
    
    var provideSelectionRanges: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* positions */ js.Array[Position], 
          /* token */ CancellationToken, 
          /* next */ ProvideSelectionRangeSignature, 
          ProviderResult[js.Array[SelectionRange]]
        ]
      ] = js.undefined
  }
  object SelectionRangeProviderMiddleware {
    
    inline def apply(): SelectionRangeProviderMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionRangeProviderMiddleware]
    }
    
    extension [Self <: SelectionRangeProviderMiddleware](x: Self) {
      
      inline def setProvideSelectionRanges(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* positions */ js.Array[Position], 
              /* token */ CancellationToken, 
              /* next */ ProvideSelectionRangeSignature, 
              ProviderResult[js.Array[SelectionRange]]
            ]
      ): Self = StObject.set(x, "provideSelectionRanges", value.asInstanceOf[js.Any])
      
      inline def setProvideSelectionRangesUndefined: Self = StObject.set(x, "provideSelectionRanges", js.undefined)
    }
  }
}
