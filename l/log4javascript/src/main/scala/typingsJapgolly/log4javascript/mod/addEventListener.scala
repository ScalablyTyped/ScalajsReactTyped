package typingsJapgolly.log4javascript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("log4javascript", "addEventListener")
@js.native
object addEventListener extends js.Object {
  def apply(
    eventType: String,
    listener: js.Function3[/* sender */ js.Any, /* eventType */ String, /* eventArgs */ js.Any, Unit]
  ): Unit = js.native
}

