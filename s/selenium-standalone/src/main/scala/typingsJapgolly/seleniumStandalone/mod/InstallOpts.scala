package typingsJapgolly.seleniumStandalone.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.seleniumStandalone.AnonArch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallOpts extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var baseURL: js.UndefOr[String] = js.undefined
  var cb: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var drivers: js.UndefOr[StringDictionary[AnonArch]] = js.undefined
  var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  var progressCb: js.UndefOr[
    js.Function3[/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double, Unit]
  ] = js.undefined
  var requestOpts: js.UndefOr[RequestOptions | String | URL_] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object InstallOpts {
  @scala.inline
  def apply(
    basePath: String = null,
    baseURL: String = null,
    cb: /* error */ js.Error => Callback = null,
    drivers: StringDictionary[AnonArch] = null,
    logger: /* message */ String => Callback = null,
    progressCb: (/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double) => Callback = null,
    requestOpts: RequestOptions | String | URL_ = null,
    version: String = null
  ): InstallOpts = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (cb != null) __obj.updateDynamic("cb")(js.Any.fromFunction1((t0: /* error */ js.Error) => cb(t0).runNow()))
    if (drivers != null) __obj.updateDynamic("drivers")(drivers.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => logger(t0).runNow()))
    if (progressCb != null) __obj.updateDynamic("progressCb")(js.Any.fromFunction3((t0: /* totalLength */ scala.Double, t1: /* progressLength */ scala.Double, t2: /* chunkLength */ scala.Double) => progressCb(t0, t1, t2).runNow()))
    if (requestOpts != null) __obj.updateDynamic("requestOpts")(requestOpts.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallOpts]
  }
}

