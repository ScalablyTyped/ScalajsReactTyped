package typingsJapgolly.firefoxWebextBrowser.browser.manifest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The context that initiates a search, required if condition is "purpose". */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.contextmenu
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.searchbar
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.homepage
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword
  - typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.newtab
*/
trait WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose extends js.Object

object WebExtensionManifestChromeSettingsOverridesSearchProviderParamsPurpose {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contextmenu: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.contextmenu = this.cast("contextmenu")
  @scala.inline
  def homepage: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.homepage = this.cast("homepage")
  @scala.inline
  def keyword: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.keyword = this.cast("keyword")
  @scala.inline
  def newtab: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.newtab = this.cast("newtab")
  @scala.inline
  def searchbar: typingsJapgolly.firefoxWebextBrowser.firefoxWebextBrowserStrings.searchbar = this.cast("searchbar")
}

