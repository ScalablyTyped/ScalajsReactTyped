package typingsJapgolly.chromeApps.chrome.syncFileSystem

import typingsJapgolly.chromeApps.AnonLASTWRITEWIN
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.last_write_win
import typingsJapgolly.chromeApps.chromeAppsStrings.manual_
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getConflictResolutionPolicy")
@js.native
object getConflictResolutionPolicy extends js.Object {
  /**
    * Gets the current conflict resolution policy.
    * @see ConflictResolutionPolicy
    */
  def apply(
    callback: js.Function1[
      /* policy */ ToStringLiteral[AnonLASTWRITEWIN, String, Exclude[String, last_write_win | manual_]], 
      Unit
    ]
  ): Unit = js.native
}

