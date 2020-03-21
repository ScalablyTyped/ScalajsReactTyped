package typingsJapgolly.chromeApps.chrome.contextMenus

import typingsJapgolly.chromeApps.chromeAppsStrings.all_
import typingsJapgolly.chromeApps.chromeAppsStrings.audio
import typingsJapgolly.chromeApps.chromeAppsStrings.browser_action
import typingsJapgolly.chromeApps.chromeAppsStrings.editable
import typingsJapgolly.chromeApps.chromeAppsStrings.frame
import typingsJapgolly.chromeApps.chromeAppsStrings.image
import typingsJapgolly.chromeApps.chromeAppsStrings.launcher
import typingsJapgolly.chromeApps.chromeAppsStrings.link
import typingsJapgolly.chromeApps.chromeAppsStrings.page
import typingsJapgolly.chromeApps.chromeAppsStrings.page_action
import typingsJapgolly.chromeApps.chromeAppsStrings.selection
import typingsJapgolly.chromeApps.chromeAppsStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The different contexts a menu can appear in.
  * Specifying 'all' is equivalent to the combination of all other contexts except for 'launcher'.
  * The 'launcher' context is only supported by apps and is used to add menu items to the context menu that appears when clicking on the app icon in the launcher/taskbar/dock/etc.
  * Different platforms might put limitations on what is actually supported in a launcher context menu.
  **/
@JSGlobal("chrome.contextMenus.ContextType")
@js.native
object ContextType extends js.Object {
  var ALL: all_ = js.native
  var AUDIO: audio = js.native
  var BROWSER_ACTION: browser_action = js.native
  var EDITABLE: editable = js.native
  var FRAME: frame = js.native
  var IMAGE: image = js.native
  var LAUNCHER: launcher = js.native
  var LINK: link = js.native
  var PAGE: page = js.native
  var PAGE_ACTION: page_action = js.native
  var SELECTION: selection = js.native
  var VIDEO: video = js.native
}

