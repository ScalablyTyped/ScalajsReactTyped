package typingsJapgolly.winrtUwp.Windows.UI.Text.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.Deferral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the CompositionCompleted event. */
trait CoreTextCompositionCompletedEventArgs extends StObject {
  
  /** Gets a collection of CoreTextCompositionSegment objects representing the segments in the composition string. Applications can use this property, for example, to get the pre-conversion string for each composition segment. */
  var compositionSegments: IVectorView[CoreTextCompositionSegment]
  
  /**
    * Requests that the operation be delayed. Call this method if your text input control is hosted on a worker thread rather than on the UI thread.
    * @return A Deferral object.
    */
  def getDeferral(): Deferral
  
  /** Gets a value that indicates whether the operation is canceled. */
  var isCanceled: Boolean
}
object CoreTextCompositionCompletedEventArgs {
  
  inline def apply(
    compositionSegments: IVectorView[CoreTextCompositionSegment],
    getDeferral: CallbackTo[Deferral],
    isCanceled: Boolean
  ): CoreTextCompositionCompletedEventArgs = {
    val __obj = js.Dynamic.literal(compositionSegments = compositionSegments.asInstanceOf[js.Any], getDeferral = getDeferral.toJsFn, isCanceled = isCanceled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreTextCompositionCompletedEventArgs]
  }
  
  extension [Self <: CoreTextCompositionCompletedEventArgs](x: Self) {
    
    inline def setCompositionSegments(value: IVectorView[CoreTextCompositionSegment]): Self = StObject.set(x, "compositionSegments", value.asInstanceOf[js.Any])
    
    inline def setGetDeferral(value: CallbackTo[Deferral]): Self = StObject.set(x, "getDeferral", value.toJsFn)
    
    inline def setIsCanceled(value: Boolean): Self = StObject.set(x, "isCanceled", value.asInstanceOf[js.Any])
  }
}
