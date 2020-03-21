package typingsJapgolly.ffmpegJs.ffmpegMp4Mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var MEMFS: js.UndefOr[js.Array[Video]] = js.undefined
  var TOTAL_MEMORY: js.UndefOr[Double] = js.undefined
  var arguments: js.Array[String]
  var mounts: js.UndefOr[js.Array[Mount]] = js.undefined
  var onExit: js.UndefOr[js.Function1[/* code */ js.Any, Unit]] = js.undefined
  var print: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  var printErr: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  var stdin: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arguments: js.Array[String],
    MEMFS: js.Array[Video] = null,
    TOTAL_MEMORY: Int | Double = null,
    mounts: js.Array[Mount] = null,
    onExit: /* code */ js.Any => Callback = null,
    print: /* data */ js.Any => Callback = null,
    printErr: /* data */ js.Any => Callback = null,
    stdin: /* data */ js.Any => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
    if (MEMFS != null) __obj.updateDynamic("MEMFS")(MEMFS.asInstanceOf[js.Any])
    if (TOTAL_MEMORY != null) __obj.updateDynamic("TOTAL_MEMORY")(TOTAL_MEMORY.asInstanceOf[js.Any])
    if (mounts != null) __obj.updateDynamic("mounts")(mounts.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1((t0: /* code */ js.Any) => onExit(t0).runNow()))
    if (print != null) __obj.updateDynamic("print")(js.Any.fromFunction1((t0: /* data */ js.Any) => print(t0).runNow()))
    if (printErr != null) __obj.updateDynamic("printErr")(js.Any.fromFunction1((t0: /* data */ js.Any) => printErr(t0).runNow()))
    if (stdin != null) __obj.updateDynamic("stdin")(js.Any.fromFunction1((t0: /* data */ js.Any) => stdin(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

