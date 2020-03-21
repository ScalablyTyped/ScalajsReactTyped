package typingsJapgolly.cloneableReadable.mod

import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneableFn extends js.Object {
  def apply[T /* <: Readable */](x: T): Cloneable[T] = js.native
  def isCloneable(x: Readable): /* is cloneable-readable.CloneableReadableAsyncIterator */ Boolean = js.native
}

