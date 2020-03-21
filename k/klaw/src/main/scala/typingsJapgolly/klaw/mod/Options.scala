package typingsJapgolly.klaw.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.ReadableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends ReadableOptions {
  var depthLimit: js.UndefOr[Double] = js.undefined
  // fs or mock-fs
  var filter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.undefined
  var fs: js.UndefOr[js.Any] = js.undefined
  var pathSorter: js.UndefOr[js.Function2[/* pathA */ String, /* pathB */ String, Double]] = js.undefined
  var preserveSymlinks: js.UndefOr[Boolean] = js.undefined
  var queueMethod: js.UndefOr[QueueMethod] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoDestroy: js.UndefOr[Boolean] = js.undefined,
    depthLimit: Int | Double = null,
    destroy: js.ThisFunction2[
      /* this */ Readable, 
      /* error */ js.Error | Null, 
      /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
      Unit
    ] = null,
    encoding: String = null,
    filter: /* path */ String => CallbackTo[Boolean] = null,
    fs: js.Any = null,
    highWaterMark: Int | Double = null,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    pathSorter: (/* pathA */ String, /* pathB */ String) => CallbackTo[Double] = null,
    preserveSymlinks: js.UndefOr[Boolean] = js.undefined,
    queueMethod: QueueMethod = null,
    read: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy.asInstanceOf[js.Any])
    if (depthLimit != null) __obj.updateDynamic("depthLimit")(depthLimit.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* path */ java.lang.String) => filter(t0).runNow()))
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (pathSorter != null) __obj.updateDynamic("pathSorter")(js.Any.fromFunction2((t0: /* pathA */ java.lang.String, t1: /* pathB */ java.lang.String) => pathSorter(t0, t1).runNow()))
    if (!js.isUndefined(preserveSymlinks)) __obj.updateDynamic("preserveSymlinks")(preserveSymlinks.asInstanceOf[js.Any])
    if (queueMethod != null) __obj.updateDynamic("queueMethod")(queueMethod.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

