package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to set and remove seekable marks to a stream. */
trait XMarkableStream
  extends StObject
     with XInterface {
  
  /** creates a mark of the current position and returns an identifier to it. */
  def createMark(): Double
  
  /**
    * deletes the mark that you previously created with {@link XMarkableStream.createMark()} .
    *
    * It is an error to delete a mark if other marks after this exist. In this case, for reasons of robustness, the implementation must delete this mark and
    * all others after this mark.
    */
  def deleteMark(Mark: Double): Unit
  
  /**
    * jumps to the furthest position of the stream.
    *
    * In the inputstream case, a subsequent read call returns data, that was never read or skipped over before. In the outputstream case, a subsequent write
    * call will add new data at the end of the stream without overwriting existing data.
    */
  def jumpToFurthest(): Unit
  
  /** jumps to a previously created mark. */
  def jumpToMark(nMark: Double): Unit
  
  /**
    * @param nMark identifies the mark which is used as a base to calculate the offset of the current position.
    * @returns the offset from the current stream position to the mark ("current position" - "mark position").
    * @throws IllegalArgumentException if the mark does not exist or is deleted.
    * @throws IOException if an I/O error has occurred.
    */
  def offsetToMark(nMark: Double): Double
}
object XMarkableStream {
  
  inline def apply(
    acquire: Callback,
    createMark: CallbackTo[Double],
    deleteMark: Double => Callback,
    jumpToFurthest: Callback,
    jumpToMark: Double => Callback,
    offsetToMark: Double => Double,
    queryInterface: `type` => Any,
    release: Callback
  ): XMarkableStream = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createMark = createMark.toJsFn, deleteMark = js.Any.fromFunction1((t0: Double) => deleteMark(t0).runNow()), jumpToFurthest = jumpToFurthest.toJsFn, jumpToMark = js.Any.fromFunction1((t0: Double) => jumpToMark(t0).runNow()), offsetToMark = js.Any.fromFunction1(offsetToMark), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMarkableStream]
  }
  
  extension [Self <: XMarkableStream](x: Self) {
    
    inline def setCreateMark(value: CallbackTo[Double]): Self = StObject.set(x, "createMark", value.toJsFn)
    
    inline def setDeleteMark(value: Double => Callback): Self = StObject.set(x, "deleteMark", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setJumpToFurthest(value: Callback): Self = StObject.set(x, "jumpToFurthest", value.toJsFn)
    
    inline def setJumpToMark(value: Double => Callback): Self = StObject.set(x, "jumpToMark", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setOffsetToMark(value: Double => Double): Self = StObject.set(x, "offsetToMark", js.Any.fromFunction1(value))
  }
}
