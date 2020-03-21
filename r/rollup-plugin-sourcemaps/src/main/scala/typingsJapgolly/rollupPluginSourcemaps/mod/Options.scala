package typingsJapgolly.rollupPluginSourcemaps.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var exclude: js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null] = js.undefined
  var include: js.UndefOr[(js.Array[String | js.RegExp]) | String | js.RegExp | Null] = js.undefined
  var readFile: js.UndefOr[ReadFileFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exclude: (js.Array[String | js.RegExp]) | String | js.RegExp = null,
    include: (js.Array[String | js.RegExp]) | String | js.RegExp = null,
    readFile: (/* file */ String | Buffer | Double, /* encoding */ String, /* callback */ ReadFileCallback) => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (readFile != null) __obj.updateDynamic("readFile")(js.Any.fromFunction3((t0: /* file */ java.lang.String | typingsJapgolly.node.Buffer | scala.Double, t1: /* encoding */ java.lang.String, t2: /* callback */ typingsJapgolly.rollupPluginSourcemaps.mod.ReadFileCallback) => readFile(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Options]
  }
}

