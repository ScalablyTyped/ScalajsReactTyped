package typingsJapgolly.coreJs.core

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.std.WeakSetConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("core.WeakSet")
@js.native
class WeakSet[T /* <: js.Object */] ()
  extends typingsJapgolly.std.WeakSet[T] {
  def this(iterable: js.Iterable[T]) = this()
  def this(values: js.Array[T]) = this()
}

@JSGlobal("core.WeakSet")
@js.native
object WeakSet extends TopLevel[WeakSetConstructor]

