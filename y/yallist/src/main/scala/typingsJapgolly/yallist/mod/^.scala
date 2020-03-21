package typingsJapgolly.yallist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yallist", JSImport.Namespace)
@js.native
class ^[T] () extends Yallist[T] {
  def this(items: T*) = this()
  def this(list: ForEachIterable[T]) = this()
}

@JSImport("yallist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("Node")
  var Node_Original: NodeConstructor = js.native
  def Node[T](value: T): typingsJapgolly.yallist.mod.Node[T] = js.native
  def Node[T](value: T, prev: typingsJapgolly.yallist.mod.Node[T]): typingsJapgolly.yallist.mod.Node[T] = js.native
  def Node[T](value: T, prev: typingsJapgolly.yallist.mod.Node[T], next: typingsJapgolly.yallist.mod.Node[T]): typingsJapgolly.yallist.mod.Node[T] = js.native
  def Node[T](
    value: T,
    prev: typingsJapgolly.yallist.mod.Node[T],
    next: typingsJapgolly.yallist.mod.Node[T],
    list: Yallist[T]
  ): typingsJapgolly.yallist.mod.Node[T] = js.native
  def create[T](): Yallist[T] = js.native
  def create[T](items: T*): Yallist[T] = js.native
  def create[T](list: ForEachIterable[T]): Yallist[T] = js.native
}

