package typingsJapgolly.winrt.Windows.UI.Input.Inking

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InkRecognitionResult
  extends StObject
     with IInkRecognitionResult
object InkRecognitionResult {
  
  inline def apply(
    boundingRect: Rect,
    getStrokes: CallbackTo[IVectorView[InkStroke]],
    getTextCandidates: CallbackTo[IVectorView[String]]
  ): InkRecognitionResult = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], getStrokes = getStrokes.toJsFn, getTextCandidates = getTextCandidates.toJsFn)
    __obj.asInstanceOf[InkRecognitionResult]
  }
}
