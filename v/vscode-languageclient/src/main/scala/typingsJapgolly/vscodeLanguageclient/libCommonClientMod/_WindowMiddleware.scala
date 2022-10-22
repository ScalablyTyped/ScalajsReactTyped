package typingsJapgolly.vscodeLanguageclient.libCommonClientMod

import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentRequest.HandlerSignature
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _WindowMiddleware extends StObject {
  
  var showDocument: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* params */ ShowDocumentParams, 
      /* next */ HandlerSignature, 
      js.Promise[ShowDocumentResult]
    ]
  ] = js.undefined
}
object _WindowMiddleware {
  
  inline def apply(): _WindowMiddleware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[_WindowMiddleware]
  }
  
  extension [Self <: _WindowMiddleware](x: Self) {
    
    inline def setShowDocument(
      value: js.ThisFunction2[
          /* this */ Unit, 
          /* params */ ShowDocumentParams, 
          /* next */ HandlerSignature, 
          js.Promise[ShowDocumentResult]
        ]
    ): Self = StObject.set(x, "showDocument", value.asInstanceOf[js.Any])
    
    inline def setShowDocumentUndefined: Self = StObject.set(x, "showDocument", js.undefined)
  }
}
