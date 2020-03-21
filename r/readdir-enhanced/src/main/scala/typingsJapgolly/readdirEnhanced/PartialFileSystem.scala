package typingsJapgolly.readdirEnhanced

import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.readdirEnhanced.typesPublicMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<readdir-enhanced.readdir-enhanced/lib/types-public.FileSystem> */
trait PartialFileSystem extends js.Object {
  var lstat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.undefined
  var readdir: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[js.Array[String]], Unit]] = js.undefined
  var stat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.undefined
}

object PartialFileSystem {
  @scala.inline
  def apply(
    lstat: (/* path */ String, /* callback */ Callback[Stats]) => japgolly.scalajs.react.Callback = null,
    readdir: (/* path */ String, /* callback */ Callback[js.Array[String]]) => japgolly.scalajs.react.Callback = null,
    stat: (/* path */ String, /* callback */ Callback[Stats]) => japgolly.scalajs.react.Callback = null
  ): PartialFileSystem = {
    val __obj = js.Dynamic.literal()
    if (lstat != null) __obj.updateDynamic("lstat")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* callback */ typingsJapgolly.readdirEnhanced.typesPublicMod.Callback[typingsJapgolly.node.fsMod.Stats]) => lstat(t0, t1).runNow()))
    if (readdir != null) __obj.updateDynamic("readdir")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* callback */ typingsJapgolly.readdirEnhanced.typesPublicMod.Callback[js.Array[java.lang.String]]) => readdir(t0, t1).runNow()))
    if (stat != null) __obj.updateDynamic("stat")(js.Any.fromFunction2((t0: /* path */ java.lang.String, t1: /* callback */ typingsJapgolly.readdirEnhanced.typesPublicMod.Callback[typingsJapgolly.node.fsMod.Stats]) => stat(t0, t1).runNow()))
    __obj.asInstanceOf[PartialFileSystem]
  }
}

