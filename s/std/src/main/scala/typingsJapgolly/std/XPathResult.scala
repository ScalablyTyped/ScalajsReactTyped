package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The results generated by evaluating an XPath expression within the context of a given node. */
trait XPathResult extends js.Object {
  val ANY_TYPE: Double
  val ANY_UNORDERED_NODE_TYPE: Double
  val BOOLEAN_TYPE: Double
  val FIRST_ORDERED_NODE_TYPE: Double
  val NUMBER_TYPE: Double
  val ORDERED_NODE_ITERATOR_TYPE: Double
  val ORDERED_NODE_SNAPSHOT_TYPE: Double
  val STRING_TYPE: Double
  val UNORDERED_NODE_ITERATOR_TYPE: Double
  val UNORDERED_NODE_SNAPSHOT_TYPE: Double
  val booleanValue: scala.Boolean
  val invalidIteratorState: scala.Boolean
  val numberValue: Double
  val resultType: Double
  val singleNodeValue: org.scalajs.dom.raw.Node | Null
  val snapshotLength: Double
  val stringValue: java.lang.String
  def iterateNext(): org.scalajs.dom.raw.Node | Null
  def snapshotItem(index: Double): org.scalajs.dom.raw.Node | Null
}

@JSGlobal("XPathResult")
@js.native
object XPathResult extends Instantiable0[XPathResult] {
  val ANY_TYPE: Double = js.native
  val ANY_UNORDERED_NODE_TYPE: Double = js.native
  val BOOLEAN_TYPE: Double = js.native
  val FIRST_ORDERED_NODE_TYPE: Double = js.native
  val NUMBER_TYPE: Double = js.native
  val ORDERED_NODE_ITERATOR_TYPE: Double = js.native
  val ORDERED_NODE_SNAPSHOT_TYPE: Double = js.native
  val STRING_TYPE: Double = js.native
  val UNORDERED_NODE_ITERATOR_TYPE: Double = js.native
  val UNORDERED_NODE_SNAPSHOT_TYPE: Double = js.native
}

