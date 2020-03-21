package typingsJapgolly.ibmMobilefirst.WL.Client

import japgolly.scalajs.react.Callback
import typingsJapgolly.ibmMobilefirst.WL.FailureResponse
import typingsJapgolly.ibmMobilefirst.WL.IResponse
import typingsJapgolly.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends Options {
  var authenticator: js.UndefOr[js.Object] = js.undefined
  var autoHideSplash: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated. If you would like your application to connect to the Worklight Server, use WL.Client.connect().
    */
  var connectOnStartup: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated since version 6.2. Use WL.Logger.config function with an object specifying the level instead.
    */
  var enableLogger: js.UndefOr[Boolean] = js.undefined
  var heartBeatIntervalInSecs: js.UndefOr[Double] = js.undefined
  var messages: js.UndefOr[String] = js.undefined
  var onConnectionFailure: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onDisabledCookies: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  /**
    * @deprecated since version 5.0.6. Instead, use onErrorRemoteDisableDenial.
    */
  var onErrorAppVersionAccessDenial: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onErrorRemoteDisableDenial: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onRequestTimeout: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onUnsupportedBrowser: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onUnsupportedVersion: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var onUserInstanceAccessViolation: js.UndefOr[js.Function1[/* response */ FailureResponse, Unit]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var validateArguments: js.UndefOr[Boolean] = js.undefined
  def onGetCustomDeviceProvisioningProperties(resumeDeviceProvisioningProcess: js.Function1[/* data */ js.Any, Unit]): Unit
}

object InitOptions {
  @scala.inline
  def apply(
    onGetCustomDeviceProvisioningProperties: js.Function1[/* data */ js.Any, Unit] => Callback,
    authenticator: js.Object = null,
    autoHideSplash: js.UndefOr[Boolean] = js.undefined,
    connectOnStartup: js.UndefOr[Boolean] = js.undefined,
    enableLogger: js.UndefOr[Boolean] = js.undefined,
    heartBeatIntervalInSecs: Int | Double = null,
    invocationContext: js.Any = null,
    messages: String = null,
    onConnectionFailure: /* response */ FailureResponse => Callback = null,
    onDisabledCookies: /* response */ FailureResponse => Callback = null,
    onErrorAppVersionAccessDenial: /* response */ FailureResponse => Callback = null,
    onErrorRemoteDisableDenial: /* response */ FailureResponse => Callback = null,
    onFailure: /* response */ IResponse => Callback = null,
    onRequestTimeout: /* response */ FailureResponse => Callback = null,
    onSuccess: /* response */ IResponse => Callback = null,
    onUnsupportedBrowser: /* response */ FailureResponse => Callback = null,
    onUnsupportedVersion: /* response */ FailureResponse => Callback = null,
    onUserInstanceAccessViolation: /* response */ FailureResponse => Callback = null,
    timeout: Int | Double = null,
    validateArguments: js.UndefOr[Boolean] = js.undefined
  ): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onGetCustomDeviceProvisioningProperties")(js.Any.fromFunction1((t0: js.Function1[/* data */ js.Any, scala.Unit]) => onGetCustomDeviceProvisioningProperties(t0).runNow()))
    if (authenticator != null) __obj.updateDynamic("authenticator")(authenticator.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash.asInstanceOf[js.Any])
    if (!js.isUndefined(connectOnStartup)) __obj.updateDynamic("connectOnStartup")(connectOnStartup.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLogger)) __obj.updateDynamic("enableLogger")(enableLogger.asInstanceOf[js.Any])
    if (heartBeatIntervalInSecs != null) __obj.updateDynamic("heartBeatIntervalInSecs")(heartBeatIntervalInSecs.asInstanceOf[js.Any])
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (onConnectionFailure != null) __obj.updateDynamic("onConnectionFailure")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.FailureResponse) => onConnectionFailure(t0).runNow()))
    if (onDisabledCookies != null) __obj.updateDynamic("onDisabledCookies")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.FailureResponse) => onDisabledCookies(t0).runNow()))
    if (onErrorAppVersionAccessDenial != null) __obj.updateDynamic("onErrorAppVersionAccessDenial")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.FailureResponse) => onErrorAppVersionAccessDenial(t0).runNow()))
    if (onErrorRemoteDisableDenial != null) __obj.updateDynamic("onErrorRemoteDisableDenial")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.FailureResponse) => onErrorRemoteDisableDenial(t0).runNow()))
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.IResponse) => onFailure(t0).runNow()))
    if (onRequestTimeout != null) __obj.updateDynamic("onRequestTimeout")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.FailureResponse) => onRequestTimeout(t0).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.IResponse) => onSuccess(t0).runNow()))
    if (onUnsupportedBrowser != null) __obj.updateDynamic("onUnsupportedBrowser")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.FailureResponse) => onUnsupportedBrowser(t0).runNow()))
    if (onUnsupportedVersion != null) __obj.updateDynamic("onUnsupportedVersion")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.FailureResponse) => onUnsupportedVersion(t0).runNow()))
    if (onUserInstanceAccessViolation != null) __obj.updateDynamic("onUserInstanceAccessViolation")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.FailureResponse) => onUserInstanceAccessViolation(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(validateArguments)) __obj.updateDynamic("validateArguments")(validateArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
}

