package typingsJapgolly.season.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("season", "readFile")
@js.native
object readFile extends js.Object {
  def apply(objectPath: String, callback: js.Function2[/* err */ Error | Null, /* object */ js.Any, Unit]): Unit = js.native
  def apply(
    objectPath: String,
    options: ParseOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* object */ js.Any, Unit]
  ): Unit = js.native
}

