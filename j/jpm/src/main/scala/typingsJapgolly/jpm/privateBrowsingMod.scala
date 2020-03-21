package typingsJapgolly.jpm

import typingsJapgolly.jpm.FFAddonSDK.BrowserWindow
import typingsJapgolly.jpm.FFAddonSDK.ContentWorker
import typingsJapgolly.jpm.FFAddonSDK.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Check whether a given object is private, so an add-on can respect private browsing
  */
@JSImport("sdk/private-browsing", JSImport.Namespace)
@js.native
object privateBrowsingMod extends js.Object {
  def isPrivate(`object`: BrowserWindow): Boolean = js.native
  def isPrivate(`object`: ContentWorker): Boolean = js.native
  def isPrivate(`object`: Tab): Boolean = js.native
}

