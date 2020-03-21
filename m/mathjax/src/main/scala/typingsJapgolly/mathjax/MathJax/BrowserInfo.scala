package typingsJapgolly.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserInfo extends js.Object {
  var isChrome: js.UndefOr[Boolean] = js.undefined
  /*These are true when the browser is the indicated one, and false otherwise.*/
  var isFirefox: js.UndefOr[Boolean] = js.undefined
  var isKonqueror: js.UndefOr[Boolean] = js.undefined
  var isMSIE: js.UndefOr[Boolean] = js.undefined
  /*These are boolean values that indicate whether the browser is running on a Macintosh computer or a Windows
    * computer. They will both be false for a Linux computer.
    */
  var isMac: js.UndefOr[Boolean] = js.undefined
  /*This is true when MathJax is running a mobile version of a WebKit or Gecko-based browser.*/
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var isOpera: js.UndefOr[Boolean] = js.undefined
  var isPC: js.UndefOr[Boolean] = js.undefined
  var isSafari: js.UndefOr[Boolean] = js.undefined
  /*The browser version number, e.g., "4.0"*/
  var version: String
  /* This lets you perform browser-specific functions. Here, choices is an object whose properties are the names of the browsers and whose values are the functions to be performed. Each function is passed one parameter, which is the MathJax.Hub.Browser object. You do not need to include every browser as one of your choices — only those for which you need to do special processing. For example:
    *MathJax.Hub.Browser.Select({
    *    MSIE: function (browser) {
    *    if (browser.versionAtLeast("8.0")) {... do version 8 stuff ... }
    *        ... do general MSIE stuff ...
    *    },
    *    Firefox: function (browser) {
    *    if (browser.isMac) {... do Mac stuff ... }
    *        ... do general Firefox stuff
    *    }
    *});*/
  def Select(choices: js.Any): Unit
  /*This tests whether the browser version is at least that given in the version string. Note that you can not
    * simply do a numeric comparison, as version 4.10 should be considered later than 4.9, for example. Similarly,
    * 4.10 is different from 4.1, for instance.*/
  def versionAtLeast(version: String): Unit
}

object BrowserInfo {
  @scala.inline
  def apply(
    Select: js.Any => japgolly.scalajs.react.Callback,
    version: String,
    versionAtLeast: String => japgolly.scalajs.react.Callback,
    isChrome: js.UndefOr[Boolean] = js.undefined,
    isFirefox: js.UndefOr[Boolean] = js.undefined,
    isKonqueror: js.UndefOr[Boolean] = js.undefined,
    isMSIE: js.UndefOr[Boolean] = js.undefined,
    isMac: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    isOpera: js.UndefOr[Boolean] = js.undefined,
    isPC: js.UndefOr[Boolean] = js.undefined,
    isSafari: js.UndefOr[Boolean] = js.undefined
  ): BrowserInfo = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("Select")(js.Any.fromFunction1((t0: js.Any) => Select(t0).runNow()))
    __obj.updateDynamic("versionAtLeast")(js.Any.fromFunction1((t0: java.lang.String) => versionAtLeast(t0).runNow()))
    if (!js.isUndefined(isChrome)) __obj.updateDynamic("isChrome")(isChrome.asInstanceOf[js.Any])
    if (!js.isUndefined(isFirefox)) __obj.updateDynamic("isFirefox")(isFirefox.asInstanceOf[js.Any])
    if (!js.isUndefined(isKonqueror)) __obj.updateDynamic("isKonqueror")(isKonqueror.asInstanceOf[js.Any])
    if (!js.isUndefined(isMSIE)) __obj.updateDynamic("isMSIE")(isMSIE.asInstanceOf[js.Any])
    if (!js.isUndefined(isMac)) __obj.updateDynamic("isMac")(isMac.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpera)) __obj.updateDynamic("isOpera")(isOpera.asInstanceOf[js.Any])
    if (!js.isUndefined(isPC)) __obj.updateDynamic("isPC")(isPC.asInstanceOf[js.Any])
    if (!js.isUndefined(isSafari)) __obj.updateDynamic("isSafari")(isSafari.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserInfo]
  }
}

