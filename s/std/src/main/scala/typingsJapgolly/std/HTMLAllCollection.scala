package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAllCollection extends /* index */ NumberDictionary[Element] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.Element]] = js.native
  /**
    * Returns the number of elements in the collection.
    */
  val length: Double = js.native
  /**
    * Returns the item with index index from the collection (determined by tree order).
    */
  def item(): org.scalajs.dom.raw.HTMLCollection | org.scalajs.dom.raw.Element | Null = js.native
  def item(nameOrIndex: java.lang.String): org.scalajs.dom.raw.HTMLCollection | org.scalajs.dom.raw.Element | Null = js.native
  /**
    * Returns the item with ID or name name from the collection.
    * 
    * If there are multiple matching items, then an HTMLCollection object containing all those elements is returned.
    * 
    * Only button, form, iframe, input, map, meta, object, select, and textarea elements can have a name for the purpose of this method; their name is given by the value of their name attribute.
    */
  def namedItem(name: java.lang.String): org.scalajs.dom.raw.HTMLCollection | org.scalajs.dom.raw.Element | Null = js.native
}

@JSGlobal("HTMLAllCollection")
@js.native
object HTMLAllCollection extends Instantiable0[HTMLAllCollection]

