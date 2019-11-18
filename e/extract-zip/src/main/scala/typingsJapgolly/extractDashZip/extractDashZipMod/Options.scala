package typingsJapgolly.extractDashZip.extractDashZipMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultDirMode: js.UndefOr[Double] = js.undefined
  var defaultFileMode: js.UndefOr[Double] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var onEntry: js.UndefOr[js.Function2[/* entry */ js.Any, /* zipfile */ js.Any, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultDirMode: Int | Double = null,
    defaultFileMode: Int | Double = null,
    dir: String = null,
    onEntry: (/* entry */ js.Any, /* zipfile */ js.Any) => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultDirMode != null) __obj.updateDynamic("defaultDirMode")(defaultDirMode.asInstanceOf[js.Any])
    if (defaultFileMode != null) __obj.updateDynamic("defaultFileMode")(defaultFileMode.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (onEntry != null) __obj.updateDynamic("onEntry")(js.Any.fromFunction2((t0: /* entry */ js.Any, t1: /* zipfile */ js.Any) => onEntry(t0, t1).runNow()))
    __obj.asInstanceOf[Options]
  }
}

