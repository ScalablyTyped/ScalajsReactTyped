package typingsJapgolly.nodelibFsStat

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@nodelib/fs.stat.@nodelib/fs.stat/out/adapters/fs.FileSystemAdapter> */
trait PartialFileSystemAdapter extends js.Object {
  var lstat: js.UndefOr[Typeoflstat] = js.undefined
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var stat: js.UndefOr[Typeofstat] = js.undefined
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
}

object PartialFileSystemAdapter {
  @scala.inline
  def apply(
    lstat: Typeoflstat = null,
    lstatSync: /* path */ PathLike => CallbackTo[Stats] = null,
    stat: Typeofstat = null,
    statSync: /* path */ PathLike => CallbackTo[Stats] = null
  ): PartialFileSystemAdapter = {
    val __obj = js.Dynamic.literal()
    if (lstat != null) __obj.updateDynamic("lstat")(lstat.asInstanceOf[js.Any])
    if (lstatSync != null) __obj.updateDynamic("lstatSync")(js.Any.fromFunction1((t0: /* path */ typingsJapgolly.node.fsMod.PathLike) => lstatSync(t0).runNow()))
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    if (statSync != null) __obj.updateDynamic("statSync")(js.Any.fromFunction1((t0: /* path */ typingsJapgolly.node.fsMod.PathLike) => statSync(t0).runNow()))
    __obj.asInstanceOf[PartialFileSystemAdapter]
  }
}

