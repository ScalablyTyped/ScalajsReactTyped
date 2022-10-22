package typingsJapgolly.winrtUwp.Windows.Media.Playback

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An ordered collection of PlaybackMediaMarker objects. */
trait PlaybackMediaMarkerSequence extends StObject {
  
  /** Removes all elements from the sequence. */
  def clear(): Unit
  
  /**
    * Gets an IIterator pointing at the first PlaybackMediaMarker in the sequence.
    * @return Iterator pointing at the first media marker in the sequence.
    */
  def first(): IIterator[PlaybackMediaMarker]
  
  /**
    * Adds a PlaybackMediaMarker to the sequence in it's ordered position.
    * @param value The media marker to insert into the sequence.
    */
  def insert(value: PlaybackMediaMarker): Unit
  
  /** Returns the number of items in the sequence. */
  var size: Double
}
object PlaybackMediaMarkerSequence {
  
  inline def apply(
    clear: Callback,
    first: CallbackTo[IIterator[PlaybackMediaMarker]],
    insert: PlaybackMediaMarker => Callback,
    size: Double
  ): PlaybackMediaMarkerSequence = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, first = first.toJsFn, insert = js.Any.fromFunction1((t0: PlaybackMediaMarker) => insert(t0).runNow()), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackMediaMarkerSequence]
  }
  
  extension [Self <: PlaybackMediaMarkerSequence](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setFirst(value: CallbackTo[IIterator[PlaybackMediaMarker]]): Self = StObject.set(x, "first", value.toJsFn)
    
    inline def setInsert(value: PlaybackMediaMarker => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: PlaybackMediaMarker) => value(t0).runNow()))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
