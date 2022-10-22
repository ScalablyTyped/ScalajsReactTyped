package typingsJapgolly.canvaskitWasm.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PictureRecorder
  extends StObject
     with EmbindObject[PictureRecorder] {
  
  /**
    * Returns a canvas on which to draw. When done drawing, call finishRecordingAsPicture()
    *
    * @param bounds - a rect to cull the results.
    */
  def beginRecording(bounds: InputRect): Canvas
  
  /**
    * Returns the captured draw commands as a picture and invalidates the canvas returned earlier.
    */
  def finishRecordingAsPicture(): SkPicture
}
object PictureRecorder {
  
  inline def apply(
    beginRecording: InputRect => Canvas,
    delete: Callback,
    deleteLater: Callback,
    finishRecordingAsPicture: CallbackTo[SkPicture],
    isAliasOf: Any => Boolean,
    isDeleted: CallbackTo[Boolean]
  ): PictureRecorder = {
    val __obj = js.Dynamic.literal(beginRecording = js.Any.fromFunction1(beginRecording), delete = delete.toJsFn, deleteLater = deleteLater.toJsFn, finishRecordingAsPicture = finishRecordingAsPicture.toJsFn, isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = isDeleted.toJsFn)
    __obj.asInstanceOf[PictureRecorder]
  }
  
  extension [Self <: PictureRecorder](x: Self) {
    
    inline def setBeginRecording(value: InputRect => Canvas): Self = StObject.set(x, "beginRecording", js.Any.fromFunction1(value))
    
    inline def setFinishRecordingAsPicture(value: CallbackTo[SkPicture]): Self = StObject.set(x, "finishRecordingAsPicture", value.toJsFn)
  }
}
