package typingsJapgolly.avvio.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Close[I, C] extends js.Object {
  def apply(fn: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(fn: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): Unit = js.native
  def apply(fn: js.Function3[/* err */ Error, /* context */ C, /* done */ js.Function, Unit]): Unit = js.native
}

