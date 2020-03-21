package typingsJapgolly.puppeteer.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.puppeteer.AnonDeviceScaleFactor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchOptions
  extends ChromeArgOptions
     with BrowserOptions
     with Timeoutable {
  /**
    * Whether to pipe browser process stdout and stderr into process.stdout and
    * process.stderr.
    * @default false
    */
  var dumpio: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify environment variables that will be visible to Chromium.
    * @default `process.env`.
    */
  var env: js.UndefOr[StringDictionary[String | Boolean | Double]] = js.undefined
  /**
    * Path to a Chromium executable to run instead of bundled Chromium. If
    * executablePath is a relative path, then it is resolved relative to current
    * working directory.
    */
  var executablePath: js.UndefOr[String] = js.undefined
  /**
    * Close chrome process on SIGHUP.
    * @default true
    */
  var handleSIGHUP: js.UndefOr[Boolean] = js.undefined
  /**
    * Close chrome process on Ctrl-C.
    * @default true
    */
  var handleSIGINT: js.UndefOr[Boolean] = js.undefined
  /**
    * Close chrome process on SIGTERM.
    * @default true
    */
  var handleSIGTERM: js.UndefOr[Boolean] = js.undefined
  /**
    * Do not use `puppeteer.defaultArgs()` for launching Chromium.
    * @default false
    */
  var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * Connects to the browser over a pipe instead of a WebSocket.
    * @default false
    */
  var pipe: js.UndefOr[Boolean] = js.undefined
}

object LaunchOptions {
  @scala.inline
  def apply(
    args: js.Array[String] = null,
    defaultViewport: AnonDeviceScaleFactor = null,
    devtools: js.UndefOr[Boolean] = js.undefined,
    dumpio: js.UndefOr[Boolean] = js.undefined,
    env: StringDictionary[String | Boolean | Double] = null,
    executablePath: String = null,
    handleSIGHUP: js.UndefOr[Boolean] = js.undefined,
    handleSIGINT: js.UndefOr[Boolean] = js.undefined,
    handleSIGTERM: js.UndefOr[Boolean] = js.undefined,
    headless: js.UndefOr[Boolean] = js.undefined,
    ignoreDefaultArgs: Boolean | js.Array[String] = null,
    ignoreHTTPSErrors: js.UndefOr[Boolean] = js.undefined,
    pipe: js.UndefOr[Boolean] = js.undefined,
    slowMo: Int | Double = null,
    timeout: Int | Double = null,
    userDataDir: String = null
  ): LaunchOptions = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (defaultViewport != null) __obj.updateDynamic("defaultViewport")(defaultViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(devtools)) __obj.updateDynamic("devtools")(devtools.asInstanceOf[js.Any])
    if (!js.isUndefined(dumpio)) __obj.updateDynamic("dumpio")(dumpio.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (executablePath != null) __obj.updateDynamic("executablePath")(executablePath.asInstanceOf[js.Any])
    if (!js.isUndefined(handleSIGHUP)) __obj.updateDynamic("handleSIGHUP")(handleSIGHUP.asInstanceOf[js.Any])
    if (!js.isUndefined(handleSIGINT)) __obj.updateDynamic("handleSIGINT")(handleSIGINT.asInstanceOf[js.Any])
    if (!js.isUndefined(handleSIGTERM)) __obj.updateDynamic("handleSIGTERM")(handleSIGTERM.asInstanceOf[js.Any])
    if (!js.isUndefined(headless)) __obj.updateDynamic("headless")(headless.asInstanceOf[js.Any])
    if (ignoreDefaultArgs != null) __obj.updateDynamic("ignoreDefaultArgs")(ignoreDefaultArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreHTTPSErrors)) __obj.updateDynamic("ignoreHTTPSErrors")(ignoreHTTPSErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(pipe)) __obj.updateDynamic("pipe")(pipe.asInstanceOf[js.Any])
    if (slowMo != null) __obj.updateDynamic("slowMo")(slowMo.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userDataDir != null) __obj.updateDynamic("userDataDir")(userDataDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchOptions]
  }
}

