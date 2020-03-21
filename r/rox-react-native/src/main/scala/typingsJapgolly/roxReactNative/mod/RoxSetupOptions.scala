package typingsJapgolly.roxReactNative.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.roxReactNative.roxReactNativeStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoxSetupOptions extends js.Object {
  // https://support.rollout.io/docs/reactnative#section--asyncstorage-
  var AsyncStorage: js.UndefOr[js.Any] = js.undefined
  // https://support.rollout.io/docs/reactnative#section-configurationfetchedhandler
  var configurationFetchedHandler: js.UndefOr[js.Function1[/* fetcherResult */ RoxFetcherResult, Unit]] = js.undefined
  var debugLevel: js.UndefOr[verbose] = js.undefined
  var devModeSecret: js.UndefOr[String] = js.undefined
  var disableNetworkFetch: js.UndefOr[Boolean] = js.undefined
  var freeze: js.UndefOr[FreezeOptions] = js.undefined
  // https://support.rollout.io/docs/reactnative#section-using-the-impressionhandler-option
  var impressionHandler: js.UndefOr[
    js.Function3[
      /* reporting */ RoxReporting, 
      /* experiment */ RoxExperiment, 
      /* context */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  /**
    * Set Roxy's URL for automated tests or local development.
    *
    * https://support.rollout.io/docs/microservices-automated-testing-and-local-development
    */
  var roxy: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object RoxSetupOptions {
  @scala.inline
  def apply(
    AsyncStorage: js.Any = null,
    configurationFetchedHandler: /* fetcherResult */ RoxFetcherResult => Callback = null,
    debugLevel: verbose = null,
    devModeSecret: String = null,
    disableNetworkFetch: js.UndefOr[Boolean] = js.undefined,
    freeze: FreezeOptions = null,
    impressionHandler: (/* reporting */ RoxReporting, /* experiment */ RoxExperiment, /* context */ js.Any) => Callback = null,
    platform: String = null,
    roxy: String = null,
    version: String = null
  ): RoxSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (AsyncStorage != null) __obj.updateDynamic("AsyncStorage")(AsyncStorage.asInstanceOf[js.Any])
    if (configurationFetchedHandler != null) __obj.updateDynamic("configurationFetchedHandler")(js.Any.fromFunction1((t0: /* fetcherResult */ typingsJapgolly.roxReactNative.mod.RoxFetcherResult) => configurationFetchedHandler(t0).runNow()))
    if (debugLevel != null) __obj.updateDynamic("debugLevel")(debugLevel.asInstanceOf[js.Any])
    if (devModeSecret != null) __obj.updateDynamic("devModeSecret")(devModeSecret.asInstanceOf[js.Any])
    if (!js.isUndefined(disableNetworkFetch)) __obj.updateDynamic("disableNetworkFetch")(disableNetworkFetch.asInstanceOf[js.Any])
    if (freeze != null) __obj.updateDynamic("freeze")(freeze.asInstanceOf[js.Any])
    if (impressionHandler != null) __obj.updateDynamic("impressionHandler")(js.Any.fromFunction3((t0: /* reporting */ typingsJapgolly.roxReactNative.mod.RoxReporting, t1: /* experiment */ typingsJapgolly.roxReactNative.mod.RoxExperiment, t2: /* context */ js.Any) => impressionHandler(t0, t1, t2).runNow()))
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (roxy != null) __obj.updateDynamic("roxy")(roxy.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoxSetupOptions]
  }
}

