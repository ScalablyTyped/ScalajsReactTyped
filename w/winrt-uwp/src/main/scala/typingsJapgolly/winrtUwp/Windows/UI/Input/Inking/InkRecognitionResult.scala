package typingsJapgolly.winrtUwp.Windows.UI.Input.Inking

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties and methods to manage InkStroke handwriting recognition data. */
trait InkRecognitionResult extends StObject {
  
  /** Gets the bounding rectangle of the InkStroke data used for handwriting recognition. */
  var boundingRect: Rect
  
  /**
    * Retrieves all ink strokes used for handwriting recognition.
    * @return The ink strokes used for handwriting recognition as a collection of InkStroke objects.
    */
  def getStrokes(): IVectorView[InkStroke]
  
  /**
    * Retrieves the collection of strings identified as potential matches for each word returned by handwriting recognition.
    * @return The recognition matches as a collection of String objects. The most likely candidate is topmost in the collection.
    */
  def getTextCandidates(): IVectorView[String]
}
object InkRecognitionResult {
  
  inline def apply(
    boundingRect: Rect,
    getStrokes: CallbackTo[IVectorView[InkStroke]],
    getTextCandidates: CallbackTo[IVectorView[String]]
  ): InkRecognitionResult = {
    val __obj = js.Dynamic.literal(boundingRect = boundingRect.asInstanceOf[js.Any], getStrokes = getStrokes.toJsFn, getTextCandidates = getTextCandidates.toJsFn)
    __obj.asInstanceOf[InkRecognitionResult]
  }
  
  extension [Self <: InkRecognitionResult](x: Self) {
    
    inline def setBoundingRect(value: Rect): Self = StObject.set(x, "boundingRect", value.asInstanceOf[js.Any])
    
    inline def setGetStrokes(value: CallbackTo[IVectorView[InkStroke]]): Self = StObject.set(x, "getStrokes", value.toJsFn)
    
    inline def setGetTextCandidates(value: CallbackTo[IVectorView[String]]): Self = StObject.set(x, "getTextCandidates", value.toJsFn)
  }
}
