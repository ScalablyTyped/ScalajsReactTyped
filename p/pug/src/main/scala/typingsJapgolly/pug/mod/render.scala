package typingsJapgolly.pug.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pug", "render")
@js.native
object render extends js.Object {
  def apply(template: String): String = js.native
  def apply(template: String, callback: js.Function2[/* err */ Error | Null, /* html */ String, Unit]): Unit = js.native
  def apply(template: String, options: Options with LocalsObject): String = js.native
  def apply(
    template: String,
    options: Options with LocalsObject,
    callback: js.Function2[/* err */ js.Error | Null, /* html */ String, Unit]
  ): Unit = js.native
}

