package typingsJapgolly.emberEngine.initializerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Initializer[T] extends js.Object {
  var after: js.UndefOr[js.Array[String]] = js.undefined
  var before: js.UndefOr[js.Array[String]] = js.undefined
  var name: String
  def initialize(application: T): Unit
}

object Initializer {
  @scala.inline
  def apply[T](
    initialize: T => Callback,
    name: String,
    after: js.Array[String] = null,
    before: js.Array[String] = null
  ): Initializer[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("initialize")(js.Any.fromFunction1((t0: T) => initialize(t0).runNow()))
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initializer[T]]
  }
}

