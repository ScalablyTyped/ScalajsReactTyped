package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInkRecognitionResult extends StObject {
  
  var boundingRect: Rect
  
  def getStrokes(): IVectorView[InkStroke]
  
  def getTextCandidates(): IVectorView[String]
}
object IInkRecognitionResult {
  
  inline def apply(
    boundingRect: Rect,
    getStrokes: CallbackTo[IVectorView[InkStroke]],
    getTextCandidates: CallbackTo[IVectorView[String]]
  ): IInkRecognitionResult = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], getStrokes = getStrokes.toJsFn, getTextCandidates = getTextCandidates.toJsFn)
    __obj.asInstanceOf[IInkRecognitionResult]
  }
  
  extension [Self <: IInkRecognitionResult](x: Self) {
    
    inline def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    inline def setGetStrokes(value: CallbackTo[IVectorView[InkStroke]]): Self = StObject.set(x, "getStrokes", value.toJsFn)
    
    inline def setGetTextCandidates(value: CallbackTo[IVectorView[String]]): Self = StObject.set(x, "getTextCandidates", value.toJsFn)
  }
}
