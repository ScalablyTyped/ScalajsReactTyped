package typingsJapgolly.krakenJs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var basedir: js.UndefOr[String] = js.undefined
  var configdir: js.UndefOr[String] = js.undefined
  var inheritViews: js.UndefOr[Boolean] = js.undefined
  var mountpath: js.UndefOr[String] = js.undefined
  var onconfig: js.UndefOr[
    js.Function2[
      /* config */ Map[String, _], 
      /* next */ js.Function2[/* err */ js.Error | Null, /* config */ js.UndefOr[js.Object], _], 
      _
    ]
  ] = js.undefined
  var protocols: js.UndefOr[js.Object] = js.undefined
  var startupHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var uncaughtException: js.UndefOr[js.Function1[/* err */ js.Error, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basedir: String = null,
    configdir: String = null,
    inheritViews: js.UndefOr[Boolean] = js.undefined,
    mountpath: String = null,
    onconfig: (/* config */ Map[String, js.Any], /* next */ js.Function2[/* err */ js.Error | Null, /* config */ js.UndefOr[js.Object], js.Any]) => CallbackTo[js.Any] = null,
    protocols: js.Object = null,
    startupHeaders: StringDictionary[String] = null,
    uncaughtException: /* err */ js.Error => CallbackTo[js.Any] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (configdir != null) __obj.updateDynamic("configdir")(configdir.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritViews)) __obj.updateDynamic("inheritViews")(inheritViews.asInstanceOf[js.Any])
    if (mountpath != null) __obj.updateDynamic("mountpath")(mountpath.asInstanceOf[js.Any])
    if (onconfig != null) __obj.updateDynamic("onconfig")(js.Any.fromFunction2((t0: /* config */ typingsJapgolly.std.Map[java.lang.String, js.Any], t1: /* next */ js.Function2[/* err */ js.Error | scala.Null, /* config */ js.UndefOr[js.Object], js.Any]) => onconfig(t0, t1).runNow()))
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (startupHeaders != null) __obj.updateDynamic("startupHeaders")(startupHeaders.asInstanceOf[js.Any])
    if (uncaughtException != null) __obj.updateDynamic("uncaughtException")(js.Any.fromFunction1((t0: /* err */ js.Error) => uncaughtException(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

