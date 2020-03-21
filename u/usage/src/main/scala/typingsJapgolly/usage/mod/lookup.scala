package typingsJapgolly.usage.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("usage", "lookup")
@js.native
object lookup extends js.Object {
  def apply(pid: Double, callback: js.Function2[/* err */ Error, /* result */ ResultObject, Unit]): Unit = js.native
  def apply(
    pid: Double,
    options: Options,
    callback: js.Function2[/* err */ js.Error, /* result */ ResultObject, Unit]
  ): Unit = js.native
}

