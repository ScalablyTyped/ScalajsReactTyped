package typingsJapgolly.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginsContentSetting
  extends typingsJapgolly.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typingsJapgolly.chrome.chrome.contentSettings.PluginsSetDetails): Unit = js.native
  def set(
    details: typingsJapgolly.chrome.chrome.contentSettings.PluginsSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

