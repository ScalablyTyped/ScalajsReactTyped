package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContourMeasureIter
  extends StObject
     with EmbindObject[ContourMeasureIter] {
  
  /**
    *  Iterates through contours in path, returning a contour-measure object for each contour
    *  in the path. Returns null when it is done.
    *
    *  See SkContourMeasure.h for more details.
    */
  def next(): ContourMeasure | Null
}
object ContourMeasureIter {
  
  inline def apply(
    delete: Callback,
    deleteLater: Callback,
    isAliasOf: Any => Boolean,
    isDeleted: CallbackTo[Boolean],
    next: CallbackTo[ContourMeasure | Null]
  ): ContourMeasureIter = {
    val __obj = js.Dynamic.literal(delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn, next = next.toJsFn)
    __obj.asInstanceOf[ContourMeasureIter]
  }
  
  extension [Self <: ContourMeasureIter](x: Self) {
    
    inline def setNext(value: CallbackTo[ContourMeasure | Null]): Self = StObject.set(x, "next", value.toJsFn)
  }
}
