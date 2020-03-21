package typingsJapgolly.behavior3.b3

import typingsJapgolly.behavior3.AnonChildMaxLoop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RepeatUntilFailure is a decorator that repeats the tick signal until the
  * node child returns `FAILURE`, `RUNNING` or `ERROR`. Optionally, a maximum
  * number of repetitions can be defined.
  *
  */
@JSGlobal("b3.RepeatUntilFailure")
@js.native
/**
  * Creates an instance of RepeatUntilFailure.
  *
  * - **maxLoop** (*Integer*) Maximum number of repetitions. Default to -1 (infinite).
  * - **child** (*BaseNode*) The child node.
  *
  */
class RepeatUntilFailure () extends Decorator {
  def this(hasMaxLoopChild: AnonChildMaxLoop) = this()
}

