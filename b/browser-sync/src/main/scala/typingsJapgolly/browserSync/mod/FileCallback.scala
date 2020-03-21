package typingsJapgolly.browserSync.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.chokidar.mod.WatchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCallback extends js.Object {
  var `match`: js.UndefOr[String | js.Array[String]] = js.undefined
  var options: js.UndefOr[WatchOptions] = js.undefined
  def fn(event: String, file: String): js.Any
}

object FileCallback {
  @scala.inline
  def apply(
    fn: (String, String) => CallbackTo[js.Any],
    `match`: String | js.Array[String] = null,
    options: WatchOptions = null
  ): FileCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fn")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => fn(t0, t1).runNow()))
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCallback]
  }
}

