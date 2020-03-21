package typingsJapgolly.rmfr.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.glob.mod.IOptions
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.Stats
import typingsJapgolly.rimraf.Fn0
import typingsJapgolly.rimraf.FnCall
import typingsJapgolly.rimraf.FnCallPathOptions
import typingsJapgolly.rimraf.Typeofchmod
import typingsJapgolly.rimraf.Typeoflstat
import typingsJapgolly.rimraf.Typeofreaddir
import typingsJapgolly.rimraf.Typeofrmdir
import typingsJapgolly.rimraf.Typeofstat
import typingsJapgolly.rimraf.Typeofunlink
import typingsJapgolly.rmfr.rmfrBooleans.`false`
import typingsJapgolly.rmfr.rmfrBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rimraf.rimraf.Options & {  glob ? :rimraf.rimraf.Options['glob'] | true,   disableGlob ? :never} */
trait Options extends js.Object {
  var chmod: js.UndefOr[Typeofchmod] = js.undefined
  var chmodSync: js.UndefOr[FnCall] = js.undefined
  var disableGlob: js.UndefOr[Boolean] = js.undefined
  var emfileWait: js.UndefOr[Double] = js.undefined
  var glob: js.UndefOr[(IOptions | `false`) with (js.UndefOr[IOptions | `false` | `true`])] = js.undefined
  var lstat: js.UndefOr[Typeoflstat] = js.undefined
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var maxBusyTries: js.UndefOr[Double] = js.undefined
  var readdir: js.UndefOr[Typeofreaddir] = js.undefined
  var readdirSync: js.UndefOr[Fn0] = js.undefined
  var rmdir: js.UndefOr[Typeofrmdir] = js.undefined
  var rmdirSync: js.UndefOr[FnCallPathOptions] = js.undefined
  var stat: js.UndefOr[Typeofstat] = js.undefined
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var unlink: js.UndefOr[Typeofunlink] = js.undefined
  var unlinkSync: js.UndefOr[js.Function1[/* path */ PathLike, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chmod: Typeofchmod = null,
    chmodSync: FnCall = null,
    disableGlob: js.UndefOr[Boolean] = js.undefined,
    emfileWait: Int | Double = null,
    glob: (IOptions | `false`) with (js.UndefOr[IOptions | `false` | `true`]) = null,
    lstat: Typeoflstat = null,
    lstatSync: /* path */ PathLike => CallbackTo[Stats] = null,
    maxBusyTries: Int | Double = null,
    readdir: Typeofreaddir = null,
    readdirSync: Fn0 = null,
    rmdir: Typeofrmdir = null,
    rmdirSync: FnCallPathOptions = null,
    stat: Typeofstat = null,
    statSync: /* path */ PathLike => CallbackTo[Stats] = null,
    unlink: Typeofunlink = null,
    unlinkSync: /* path */ PathLike => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chmod != null) __obj.updateDynamic("chmod")(chmod.asInstanceOf[js.Any])
    if (chmodSync != null) __obj.updateDynamic("chmodSync")(chmodSync.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGlob)) __obj.updateDynamic("disableGlob")(disableGlob.asInstanceOf[js.Any])
    if (emfileWait != null) __obj.updateDynamic("emfileWait")(emfileWait.asInstanceOf[js.Any])
    if (glob != null) __obj.updateDynamic("glob")(glob.asInstanceOf[js.Any])
    if (lstat != null) __obj.updateDynamic("lstat")(lstat.asInstanceOf[js.Any])
    if (lstatSync != null) __obj.updateDynamic("lstatSync")(js.Any.fromFunction1((t0: /* path */ typingsJapgolly.node.fsMod.PathLike) => lstatSync(t0).runNow()))
    if (maxBusyTries != null) __obj.updateDynamic("maxBusyTries")(maxBusyTries.asInstanceOf[js.Any])
    if (readdir != null) __obj.updateDynamic("readdir")(readdir.asInstanceOf[js.Any])
    if (readdirSync != null) __obj.updateDynamic("readdirSync")(readdirSync.asInstanceOf[js.Any])
    if (rmdir != null) __obj.updateDynamic("rmdir")(rmdir.asInstanceOf[js.Any])
    if (rmdirSync != null) __obj.updateDynamic("rmdirSync")(rmdirSync.asInstanceOf[js.Any])
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    if (statSync != null) __obj.updateDynamic("statSync")(js.Any.fromFunction1((t0: /* path */ typingsJapgolly.node.fsMod.PathLike) => statSync(t0).runNow()))
    if (unlink != null) __obj.updateDynamic("unlink")(unlink.asInstanceOf[js.Any])
    if (unlinkSync != null) __obj.updateDynamic("unlinkSync")(js.Any.fromFunction1((t0: /* path */ typingsJapgolly.node.fsMod.PathLike) => unlinkSync(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

