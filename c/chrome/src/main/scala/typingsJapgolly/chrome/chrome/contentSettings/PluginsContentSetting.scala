package typingsJapgolly.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginsContentSetting extends ContentSetting {
  def set(details: PluginsSetDetails): Unit = js.native
  def set(details: PluginsSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

