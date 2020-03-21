package typingsJapgolly.moonjs.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoonConfig extends js.Object {
  var delimiters: js.Array[String]
  var prefix: String
  var silent: Boolean
  var version: String
  def keycodes(codemap: Record[String, Double]): Unit
}

object MoonConfig {
  @scala.inline
  def apply(
    delimiters: js.Array[String],
    keycodes: Record[String, Double] => Callback,
    prefix: String,
    silent: Boolean,
    version: String
  ): MoonConfig = {
    val __obj = js.Dynamic.literal(delimiters = delimiters.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("keycodes")(js.Any.fromFunction1((t0: typingsJapgolly.std.Record[java.lang.String, scala.Double]) => keycodes(t0).runNow()))
    __obj.asInstanceOf[MoonConfig]
  }
}

