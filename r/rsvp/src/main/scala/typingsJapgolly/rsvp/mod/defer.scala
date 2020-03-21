package typingsJapgolly.rsvp.mod

import typingsJapgolly.rsvp.mod.RSVP.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "defer")
@js.native
object defer extends js.Object {
  def apply[T](): Deferred[T] = js.native
  def apply[T](label: String): Deferred[T] = js.native
}

