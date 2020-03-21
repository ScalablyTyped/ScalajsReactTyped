package typingsJapgolly.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "CustomEvent")
@js.native
class CustomEvent protected ()
  extends typingsJapgolly.wonderJs.customEventMod.CustomEvent {
  def this(eventName: String) = this()
  def this(eventName: String, userData: js.Any) = this()
}

/* static members */
@JSImport("wonder.js/dist/es2015", "CustomEvent")
@js.native
object CustomEvent extends js.Object {
  def create(eventName: String): js.Any = js.native
  def create(eventName: String, userData: js.Any): js.Any = js.native
}

