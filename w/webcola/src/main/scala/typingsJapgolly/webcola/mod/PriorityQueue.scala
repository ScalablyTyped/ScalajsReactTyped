package typingsJapgolly.webcola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "PriorityQueue")
@js.native
class PriorityQueue[T] protected ()
  extends typingsJapgolly.webcola.pqueueMod.PriorityQueue[T] {
  def this(lessThan: js.Function2[/* a */ T, /* b */ T, Boolean]) = this()
}

