package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSlidesPositionRequest extends StObject {
  
  /**
    * The index where the slides should be inserted, based on the slide arrangement before the move takes place. Must be between zero and the number of slides in the presentation,
    * inclusive.
    */
  var insertionIndex: js.UndefOr[Double] = js.undefined
  
  /** The IDs of the slides in the presentation that should be moved. The slides in this list must be in existing presentation order, without duplicates. */
  var slideObjectIds: js.UndefOr[js.Array[String]] = js.undefined
}
object UpdateSlidesPositionRequest {
  
  inline def apply(): UpdateSlidesPositionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSlidesPositionRequest]
  }
  
  extension [Self <: UpdateSlidesPositionRequest](x: Self) {
    
    inline def setInsertionIndex(value: Double): Self = StObject.set(x, "insertionIndex", value.asInstanceOf[js.Any])
    
    inline def setInsertionIndexUndefined: Self = StObject.set(x, "insertionIndex", js.undefined)
    
    inline def setSlideObjectIds(value: js.Array[String]): Self = StObject.set(x, "slideObjectIds", value.asInstanceOf[js.Any])
    
    inline def setSlideObjectIdsUndefined: Self = StObject.set(x, "slideObjectIds", js.undefined)
    
    inline def setSlideObjectIdsVarargs(value: String*): Self = StObject.set(x, "slideObjectIds", js.Array(value*))
  }
}
