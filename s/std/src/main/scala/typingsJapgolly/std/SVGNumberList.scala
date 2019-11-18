package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGNumberList defines a list of SVGNumber objects. */
@js.native
trait SVGNumberList extends /* index */ NumberDictionary[SVGNumber] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[org.scalajs.dom.raw.SVGNumber]] = js.native
  val length: Double = js.native
  val numberOfItems: Double = js.native
  def appendItem(newItem: org.scalajs.dom.raw.SVGNumber): org.scalajs.dom.raw.SVGNumber = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): org.scalajs.dom.raw.SVGNumber = js.native
  def initialize(newItem: org.scalajs.dom.raw.SVGNumber): org.scalajs.dom.raw.SVGNumber = js.native
  def insertItemBefore(newItem: org.scalajs.dom.raw.SVGNumber, index: Double): org.scalajs.dom.raw.SVGNumber = js.native
  def removeItem(index: Double): org.scalajs.dom.raw.SVGNumber = js.native
  def replaceItem(newItem: org.scalajs.dom.raw.SVGNumber, index: Double): org.scalajs.dom.raw.SVGNumber = js.native
}

@JSGlobal("SVGNumberList")
@js.native
object SVGNumberList extends Instantiable0[SVGNumberList]

