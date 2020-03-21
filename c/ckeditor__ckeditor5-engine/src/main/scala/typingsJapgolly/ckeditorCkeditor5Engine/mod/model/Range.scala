package typingsJapgolly.ckeditorCkeditor5Engine.mod.model

import typingsJapgolly.ckeditorCkeditor5Engine.AnonIgnoreElementEnd
import typingsJapgolly.ckeditorCkeditor5Engine.mod.model.operation.Operation
import typingsJapgolly.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// engine/model/range
@JSImport("@ckeditor/ckeditor5-engine", "model.Range")
@js.native
class Range protected () extends Iterable[Node] {
  def this(start: Position) = this()
  def this(start: Position, end: Position) = this()
  val end: Position = js.native
  var isCollapsed: Boolean = js.native
  var isFlat: Boolean = js.native
  var root: Element | DocumentFragment = js.native
  val start: Position = js.native
  def containsItem(item: Item): Unit = js.native
  def containsPosition(position: Position): Boolean = js.native
  def containsRange(otherRange: Range): Boolean = js.native
  def containsRange(otherRange: Range, loose: Boolean): Boolean = js.native
  def getCommonAncestor(): Element | DocumentFragment | Null = js.native
  def getDifference(otherRange: Range): js.Array[Range] = js.native
  def getIntersection(otherRange: Range): Range | Null = js.native
  def getMinimalFlatRanges(): js.Array[Range] = js.native
  def getPositions(options: js.Object): js.Iterable[Position] = js.native
  def getTransformedByOperation(operation: Operation): js.Array[Range] = js.native
  def getTransformedByOperations(operations: js.Iterable[Operation]): js.Array[Range] = js.native
  def getWalker(options: AnonIgnoreElementEnd): Unit = js.native
  def isEqual(otherRange: Range): Boolean = js.native
  def isIntersecting(otherRange: Range): Boolean = js.native
  def toJSON(): js.Object = js.native
}

