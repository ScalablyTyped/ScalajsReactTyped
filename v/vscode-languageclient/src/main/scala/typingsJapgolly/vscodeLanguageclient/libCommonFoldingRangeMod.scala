package typingsJapgolly.vscodeLanguageclient

import typingsJapgolly.vscode.mod.Disposable
import typingsJapgolly.vscode.mod.FoldingContext
import typingsJapgolly.vscode.mod.FoldingRange
import typingsJapgolly.vscode.mod.FoldingRangeProvider
import typingsJapgolly.vscode.mod.ProviderResult
import typingsJapgolly.vscode.mod.TextDocument
import typingsJapgolly.vscodeJsonrpc.libCommonCancellationMod.CancellationToken
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.FeatureClient
import typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod.TextDocumentLanguageFeature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotfoldingRangeMod.FoldingRangeOptions
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotfoldingRangeMod.FoldingRangeRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonFoldingRangeMod {
  
  @JSImport("vscode-languageclient/lib/common/foldingRange", "FoldingRangeFeature")
  @js.native
  open class FoldingRangeFeature protected ()
    extends TextDocumentLanguageFeature[
          Boolean | FoldingRangeOptions, 
          FoldingRangeRegistrationOptions, 
          FoldingRangeProvider, 
          FoldingRangeProviderMiddleware, 
          js.Object
        ] {
    def this(client: FeatureClient[FoldingRangeProviderMiddleware, js.Object]) = this()
    
    /* protected */ def registerLanguageProvider(options: FoldingRangeRegistrationOptions): js.Tuple2[Disposable, FoldingRangeProvider] = js.native
  }
  
  trait FoldingRangeProviderMiddleware extends StObject {
    
    var provideFoldingRanges: js.UndefOr[
        js.ThisFunction4[
          /* this */ Unit, 
          /* document */ TextDocument, 
          /* context */ FoldingContext, 
          /* token */ CancellationToken, 
          /* next */ ProvideFoldingRangeSignature, 
          ProviderResult[js.Array[FoldingRange]]
        ]
      ] = js.undefined
  }
  object FoldingRangeProviderMiddleware {
    
    inline def apply(): FoldingRangeProviderMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoldingRangeProviderMiddleware]
    }
    
    extension [Self <: FoldingRangeProviderMiddleware](x: Self) {
      
      inline def setProvideFoldingRanges(
        value: js.ThisFunction4[
              /* this */ Unit, 
              /* document */ TextDocument, 
              /* context */ FoldingContext, 
              /* token */ CancellationToken, 
              /* next */ ProvideFoldingRangeSignature, 
              ProviderResult[js.Array[FoldingRange]]
            ]
      ): Self = StObject.set(x, "provideFoldingRanges", value.asInstanceOf[js.Any])
      
      inline def setProvideFoldingRangesUndefined: Self = StObject.set(x, "provideFoldingRanges", js.undefined)
    }
  }
  
  type ProvideFoldingRangeSignature = js.ThisFunction3[
    /* this */ Unit, 
    /* document */ TextDocument, 
    /* context */ FoldingContext, 
    /* token */ CancellationToken, 
    ProviderResult[js.Array[FoldingRange]]
  ]
}
