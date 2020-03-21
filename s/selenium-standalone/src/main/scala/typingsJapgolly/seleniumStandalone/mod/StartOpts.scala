package typingsJapgolly.seleniumStandalone.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.childProcessMod.ChildProcess
import typingsJapgolly.node.childProcessMod.SpawnOptions
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.seleniumStandalone.AnonArch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOpts extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var cb: js.UndefOr[js.Function2[/* error */ js.Error, /* child */ ChildProcess, Unit]] = js.undefined
  var drivers: js.UndefOr[StringDictionary[AnonArch]] = js.undefined
  var javaArgs: js.UndefOr[js.Array[String]] = js.undefined
  var javaPath: js.UndefOr[String] = js.undefined
  var requestOpts: js.UndefOr[RequestOptions | String | URL_] = js.undefined
  var seleniumArgs: js.UndefOr[js.Array[String]] = js.undefined
  var spawnCb: js.UndefOr[js.Function1[/* selenium */ js.UndefOr[ChildProcess], Unit]] = js.undefined
  var spawnOptions: js.UndefOr[SpawnOptions] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object StartOpts {
  @scala.inline
  def apply(
    basePath: String = null,
    cb: (/* error */ js.Error, /* child */ ChildProcess) => Callback = null,
    drivers: StringDictionary[AnonArch] = null,
    javaArgs: js.Array[String] = null,
    javaPath: String = null,
    requestOpts: RequestOptions | String | URL_ = null,
    seleniumArgs: js.Array[String] = null,
    spawnCb: /* selenium */ js.UndefOr[ChildProcess] => Callback = null,
    spawnOptions: SpawnOptions = null,
    version: String = null
  ): StartOpts = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (cb != null) __obj.updateDynamic("cb")(js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* child */ typingsJapgolly.node.childProcessMod.ChildProcess) => cb(t0, t1).runNow()))
    if (drivers != null) __obj.updateDynamic("drivers")(drivers.asInstanceOf[js.Any])
    if (javaArgs != null) __obj.updateDynamic("javaArgs")(javaArgs.asInstanceOf[js.Any])
    if (javaPath != null) __obj.updateDynamic("javaPath")(javaPath.asInstanceOf[js.Any])
    if (requestOpts != null) __obj.updateDynamic("requestOpts")(requestOpts.asInstanceOf[js.Any])
    if (seleniumArgs != null) __obj.updateDynamic("seleniumArgs")(seleniumArgs.asInstanceOf[js.Any])
    if (spawnCb != null) __obj.updateDynamic("spawnCb")(js.Any.fromFunction1((t0: /* selenium */ js.UndefOr[typingsJapgolly.node.childProcessMod.ChildProcess]) => spawnCb(t0).runNow()))
    if (spawnOptions != null) __obj.updateDynamic("spawnOptions")(spawnOptions.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOpts]
  }
}

