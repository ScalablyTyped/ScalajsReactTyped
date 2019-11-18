package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of contact points on a touch surface. For example, if the user has three fingers on the touch surface (such as a screen or trackpad), the corresponding TouchList object would have one Touch object for each finger, for a total of three entries. */
@js.native
trait TouchList extends /* index */ NumberDictionary[Touch] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.Touch]] = js.native
  val length: Double = js.native
  def item(index: Double): org.scalajs.dom.raw.Touch | Null = js.native
}

@JSGlobal("TouchList")
@js.native
object TouchList extends Instantiable0[TouchList]

