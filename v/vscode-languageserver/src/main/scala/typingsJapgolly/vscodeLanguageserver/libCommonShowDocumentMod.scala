package typingsJapgolly.vscodeLanguageserver

import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.Feature
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod._RemoteWindow
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotshowDocumentMod.ShowDocumentResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonShowDocumentMod {
  
  @JSImport("vscode-languageserver/lib/common/showDocument", "ShowDocumentFeature")
  @js.native
  val ShowDocumentFeature: Feature[_RemoteWindow, ShowDocumentFeatureShape] = js.native
  
  trait ShowDocumentFeatureShape extends StObject {
    
    def showDocument(params: ShowDocumentParams): js.Promise[ShowDocumentResult]
  }
  object ShowDocumentFeatureShape {
    
    inline def apply(showDocument: ShowDocumentParams => js.Promise[ShowDocumentResult]): ShowDocumentFeatureShape = {
      val __obj = js.Dynamic.literal(showDocument = js.Any.fromFunction1(showDocument))
      __obj.asInstanceOf[ShowDocumentFeatureShape]
    }
    
    extension [Self <: ShowDocumentFeatureShape](x: Self) {
      
      inline def setShowDocument(value: ShowDocumentParams => js.Promise[ShowDocumentResult]): Self = StObject.set(x, "showDocument", js.Any.fromFunction1(value))
    }
  }
}
