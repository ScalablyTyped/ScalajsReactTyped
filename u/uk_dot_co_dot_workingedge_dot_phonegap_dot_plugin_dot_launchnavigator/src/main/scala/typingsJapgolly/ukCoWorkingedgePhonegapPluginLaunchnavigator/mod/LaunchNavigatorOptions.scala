package typingsJapgolly.ukCoWorkingedgePhonegapPluginLaunchnavigator.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchNavigatorOptions extends js.Object {
  /**
    * name of the navigation app to use for directions.
    * Specify using launchnavigator.APP constants.
    * e.g. `launchnavigator.APP.GOOGLE_MAPS`.
    * If not specified, defaults to User Selection.
    */
  var app: js.UndefOr[String] = js.undefined
  /**
    * options related to the default native actionsheet picker which enables user to select which navigation app to launch if `app` is not specified.
    */
  var appSelection: js.UndefOr[AppSelectionOptions] = js.undefined
  /**
    * nickname to display in app for destination. e.g. "Bob's House".
    */
  var destinationName: js.UndefOr[String] = js.undefined
  /**
    * (Android and iOS only) If true, and input location type(s) doesn't match those required by the app, use geocoding to obtain the address/coords as required. Defaults to true.
    */
  var enableGeocoding: js.UndefOr[Boolean] = js.undefined
  /**
    * (Windows only) If false, the plugin will NOT attempt to use the geolocation plugin to determine the current device position when the start location parameter is omitted. Defaults to true.
    */
  var enableGeolocation: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback to invoke if an error is encountered while launching the app.
    * A single string argument containing the error message will be passed in.
    */
  var errorCallback: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.undefined
  /**
    * a key/value map of extra app-specific parameters. For example, to tell Google Maps on Android to display Satellite view in "maps" launch mode: `{"t": "k"}`
    */
  var extras: js.UndefOr[js.Any] = js.undefined
  /**
    * (iOS only) method to use to open Apple Maps app.
    * `launchnavigator.LAUNCH_MODE.URI_SCHEME` or `launchnavigator.LAUNCH_MODE.MAPKIT`
    * Defaults to `launchnavigator.LAUNCH_MODE.URI_SCHEME` if not specified.
    */
  var launchModeAppleMaps: js.UndefOr[String] = js.undefined
  /**
    * (Android only) mode in which to open Google Maps app.
    * `launchnavigator.LAUNCH_MODE.MAPS` or `launchnavigator.LAUNCH_MODE.TURN_BY_TURN`
    * Defaults to `launchnavigator.LAUNCH_MODE.MAPS` if not specified.
    */
  var launchModeGoogleMaps: js.UndefOr[String] = js.undefined
  /**
    * Start point of the navigation.
    * If not specified, the current device location will be used.
    * Either:
    *  - a {string} containing the address. e.g. "Buckingham Palace, London"
    *  - a {string} containing a latitude/longitude coordinate. e.g. "50.1. -4.0"
    *  - an {array}, where the first element is the latitude and the second element is a longitude, as decimal numbers. e.g. [50.1, -4.0]
    */
  var start: js.UndefOr[String | js.Array[Double]] = js.undefined
  /**
    * nickname to display in app for start . e.g. "My House".
    */
  var startName: js.UndefOr[String] = js.undefined
  /**
    * A callback to invoke when the navigation app is successfully launched.
    */
  var successCallback: js.UndefOr[js.Function] = js.undefined
  /**
    * Transportation mode for navigation: "driving", "walking" or "transit". Defaults to "driving" if not specified.
    */
  var transportMode: js.UndefOr[String] = js.undefined
}

object LaunchNavigatorOptions {
  @scala.inline
  def apply(
    app: String = null,
    appSelection: AppSelectionOptions = null,
    destinationName: String = null,
    enableGeocoding: js.UndefOr[Boolean] = js.undefined,
    enableGeolocation: js.UndefOr[Boolean] = js.undefined,
    errorCallback: /* error */ String => Callback = null,
    extras: js.Any = null,
    launchModeAppleMaps: String = null,
    launchModeGoogleMaps: String = null,
    start: String | js.Array[Double] = null,
    startName: String = null,
    successCallback: js.Function = null,
    transportMode: String = null
  ): LaunchNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (appSelection != null) __obj.updateDynamic("appSelection")(appSelection.asInstanceOf[js.Any])
    if (destinationName != null) __obj.updateDynamic("destinationName")(destinationName.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGeocoding)) __obj.updateDynamic("enableGeocoding")(enableGeocoding.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGeolocation)) __obj.updateDynamic("enableGeolocation")(enableGeolocation.asInstanceOf[js.Any])
    if (errorCallback != null) __obj.updateDynamic("errorCallback")(js.Any.fromFunction1((t0: /* error */ java.lang.String) => errorCallback(t0).runNow()))
    if (extras != null) __obj.updateDynamic("extras")(extras.asInstanceOf[js.Any])
    if (launchModeAppleMaps != null) __obj.updateDynamic("launchModeAppleMaps")(launchModeAppleMaps.asInstanceOf[js.Any])
    if (launchModeGoogleMaps != null) __obj.updateDynamic("launchModeGoogleMaps")(launchModeGoogleMaps.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (startName != null) __obj.updateDynamic("startName")(startName.asInstanceOf[js.Any])
    if (successCallback != null) __obj.updateDynamic("successCallback")(successCallback.asInstanceOf[js.Any])
    if (transportMode != null) __obj.updateDynamic("transportMode")(transportMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchNavigatorOptions]
  }
}

