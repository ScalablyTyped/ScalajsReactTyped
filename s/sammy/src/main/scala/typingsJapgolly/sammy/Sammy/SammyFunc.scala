package typingsJapgolly.sammy.Sammy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SammyFunc extends js.Object {
  def apply(): Application = js.native
  def apply(handler: js.Function): Application = js.native
  def apply(selector: String): Application = js.native
  def apply(selector: String, handler: js.Function): Application = js.native
}

