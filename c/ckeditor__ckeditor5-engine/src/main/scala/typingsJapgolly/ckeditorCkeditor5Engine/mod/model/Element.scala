package typingsJapgolly.ckeditorCkeditor5Engine.mod.model

import typingsJapgolly.std.Iterable
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/model/element
@JSImport("@ckeditor/ckeditor5-engine", "model.Element")
@js.native
class Element protected () extends Node {
  protected def this(name: String) = this()
  protected def this(name: String, attrs: js.Array[js.Tuple2[String, _]]) = this()
  protected def this(name: String, attrs: Map[String, _]) = this()
  protected def this(name: String, attrs: js.Array[js.Tuple2[String, _]], children: Node) = this()
  protected def this(name: String, attrs: js.Array[js.Tuple2[String, _]], children: js.Iterable[Node]) = this()
  protected def this(name: String, attrs: Map[String, _], children: Node) = this()
  protected def this(name: String, attrs: Map[String, _], children: js.Iterable[Node]) = this()
  val childCount: Double = js.native
  val isEmpty: Boolean = js.native
  val maxOffset: Double = js.native
  val name: String = js.native
  /* protected */ def _appendChild(nodes: Item): Unit = js.native
  /* protected */ def _appendChild(nodes: Iterable[Item]): Unit = js.native
  /* protected */ def _clone(): Element = js.native
  /* protected */ def _clone(deep: Boolean): Element = js.native
  /* protected */ def _insertChild(index: Double, items: Item): Unit = js.native
  /* protected */ def _insertChild(index: Double, items: Iterable[Item]): Unit = js.native
  /* protected */ def _removeChildren(index: Double): js.Array[Node] = js.native
  /* protected */ def _removeChildren(index: Double, howMany: Double): js.Array[Node] = js.native
  def getChild(index: Double): Node = js.native
  def getChildIndex(node: Node): Double = js.native
  def getChildStartOffset(node: Node): Double = js.native
  def getChildren(): js.Iterable[Node] = js.native
  def getNodeByPath(relativePath: js.Array[Double]): Node = js.native
  def is(`type`: String): Boolean = js.native
  def offsetToIndex(offset: Double): Double = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-engine", "model.Element")
@js.native
object Element extends js.Object {
  def fromJSON(json: js.Object): Element = js.native
}

