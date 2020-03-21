package typingsJapgolly.baconjs.mod

import typingsJapgolly.baconjs.retryMod.RetryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "retry")
@js.native
object retry extends js.Object {
  def apply[V](options: RetryOptions[V]): typingsJapgolly.baconjs.observableMod.EventStream[V] = js.native
}

