package typingsJapgolly.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A generic collection (array-like object similar to arguments) of elements (in document order) and offers methods and properties for selecting from the list. */
@js.native
trait HTMLCollectionBase extends /* index */ NumberDictionary[Element] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.Element]] = js.native
  /**
    * Sets or retrieves the number of objects in a collection.
    */
  val length: Double = js.native
  /**
    * Retrieves an object from various collections.
    */
  def item(index: Double): org.scalajs.dom.raw.Element | Null = js.native
}

