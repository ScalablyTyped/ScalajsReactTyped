package typingsJapgolly.soundmanager2.soundmanager

import japgolly.scalajs.react.Callback
import typingsJapgolly.soundmanager2.soundmanager2Booleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SoundManagerProps extends js.Object {
  var allowScriptAccess: js.UndefOr[ScriptAccess] = js.undefined
  var altURL: js.UndefOr[String] = js.undefined
  var bgColor: js.UndefOr[String] = js.undefined
  var consoleOnly: js.UndefOr[Boolean] = js.undefined
  var debugFlash: js.UndefOr[Boolean] = js.undefined
  var debugMode: js.UndefOr[Boolean] = js.undefined
  var defaultOptions: js.UndefOr[DefaultOptions] = js.undefined
  /**
    * Some properties are dynamic, determined at initialisation or later
    * during runtime, and should be treated as read-only.
    */
  val features: js.UndefOr[js.Object] = js.undefined
  var flash9Options: js.UndefOr[Flash9Options] = js.undefined
  // html5PollingInterval: number;
  // html5Test: string;
  var flashLoadTimeout: js.UndefOr[Double] = js.undefined
  var flashVersion: js.UndefOr[Double] = js.undefined
  // flashPollingInterval: number;
  var forceUseGlobalHTML5Audio: js.UndefOr[Boolean] = js.undefined
  val html5Only: js.UndefOr[Boolean] = js.undefined
  var idPrefix: js.UndefOr[String] = js.undefined
  var ignoreMobileRestrications: js.UndefOr[Boolean] = js.undefined
  var movieStarOptions: js.UndefOr[MovieStarOptions] = js.undefined
  var noSWFCache: js.UndefOr[Boolean] = js.undefined
  var onready: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ontimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preferFlash: js.UndefOr[Boolean] = js.undefined
  /**
    * The directory where SM2 can find the flash movies (soundmanager2.swf,
    * soundmanager2_flash9.swf and debug versions etc.) Note that SM2 will
    * append the correct SWF file name, depending on flashVersion and
    * debugMode settings.
    */
  var url: js.UndefOr[String] = js.undefined
  var useAltURL: js.UndefOr[Boolean] = js.undefined
  var useConsole: js.UndefOr[Boolean] = js.undefined
  var useFlashBlock: js.UndefOr[Boolean] = js.undefined
  var useHTML5Audio: js.UndefOr[Boolean] = js.undefined
  var useHighPerformance: js.UndefOr[Boolean] = js.undefined
  var waitForWindowLoad: js.UndefOr[`false`] = js.undefined
  var wmode: js.UndefOr[String | Null] = js.undefined
}

object SoundManagerProps {
  @scala.inline
  def apply(
    allowScriptAccess: ScriptAccess = null,
    altURL: String = null,
    bgColor: String = null,
    consoleOnly: js.UndefOr[Boolean] = js.undefined,
    debugFlash: js.UndefOr[Boolean] = js.undefined,
    debugMode: js.UndefOr[Boolean] = js.undefined,
    defaultOptions: DefaultOptions = null,
    features: js.Object = null,
    flash9Options: Flash9Options = null,
    flashLoadTimeout: Int | Double = null,
    flashVersion: Int | Double = null,
    forceUseGlobalHTML5Audio: js.UndefOr[Boolean] = js.undefined,
    html5Only: js.UndefOr[Boolean] = js.undefined,
    idPrefix: String = null,
    ignoreMobileRestrications: js.UndefOr[Boolean] = js.undefined,
    movieStarOptions: MovieStarOptions = null,
    noSWFCache: js.UndefOr[Boolean] = js.undefined,
    onready: js.UndefOr[Callback] = js.undefined,
    ontimeout: js.UndefOr[Callback] = js.undefined,
    preferFlash: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    useAltURL: js.UndefOr[Boolean] = js.undefined,
    useConsole: js.UndefOr[Boolean] = js.undefined,
    useFlashBlock: js.UndefOr[Boolean] = js.undefined,
    useHTML5Audio: js.UndefOr[Boolean] = js.undefined,
    useHighPerformance: js.UndefOr[Boolean] = js.undefined,
    waitForWindowLoad: `false` = null,
    wmode: String = null
  ): SoundManagerProps = {
    val __obj = js.Dynamic.literal()
    if (allowScriptAccess != null) __obj.updateDynamic("allowScriptAccess")(allowScriptAccess.asInstanceOf[js.Any])
    if (altURL != null) __obj.updateDynamic("altURL")(altURL.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (!js.isUndefined(consoleOnly)) __obj.updateDynamic("consoleOnly")(consoleOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(debugFlash)) __obj.updateDynamic("debugFlash")(debugFlash.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMode)) __obj.updateDynamic("debugMode")(debugMode.asInstanceOf[js.Any])
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (flash9Options != null) __obj.updateDynamic("flash9Options")(flash9Options.asInstanceOf[js.Any])
    if (flashLoadTimeout != null) __obj.updateDynamic("flashLoadTimeout")(flashLoadTimeout.asInstanceOf[js.Any])
    if (flashVersion != null) __obj.updateDynamic("flashVersion")(flashVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(forceUseGlobalHTML5Audio)) __obj.updateDynamic("forceUseGlobalHTML5Audio")(forceUseGlobalHTML5Audio.asInstanceOf[js.Any])
    if (!js.isUndefined(html5Only)) __obj.updateDynamic("html5Only")(html5Only.asInstanceOf[js.Any])
    if (idPrefix != null) __obj.updateDynamic("idPrefix")(idPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreMobileRestrications)) __obj.updateDynamic("ignoreMobileRestrications")(ignoreMobileRestrications.asInstanceOf[js.Any])
    if (movieStarOptions != null) __obj.updateDynamic("movieStarOptions")(movieStarOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(noSWFCache)) __obj.updateDynamic("noSWFCache")(noSWFCache.asInstanceOf[js.Any])
    onready.foreach(p => __obj.updateDynamic("onready")(p.toJsFn))
    ontimeout.foreach(p => __obj.updateDynamic("ontimeout")(p.toJsFn))
    if (!js.isUndefined(preferFlash)) __obj.updateDynamic("preferFlash")(preferFlash.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useAltURL)) __obj.updateDynamic("useAltURL")(useAltURL.asInstanceOf[js.Any])
    if (!js.isUndefined(useConsole)) __obj.updateDynamic("useConsole")(useConsole.asInstanceOf[js.Any])
    if (!js.isUndefined(useFlashBlock)) __obj.updateDynamic("useFlashBlock")(useFlashBlock.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML5Audio)) __obj.updateDynamic("useHTML5Audio")(useHTML5Audio.asInstanceOf[js.Any])
    if (!js.isUndefined(useHighPerformance)) __obj.updateDynamic("useHighPerformance")(useHighPerformance.asInstanceOf[js.Any])
    if (waitForWindowLoad != null) __obj.updateDynamic("waitForWindowLoad")(waitForWindowLoad.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundManagerProps]
  }
}

