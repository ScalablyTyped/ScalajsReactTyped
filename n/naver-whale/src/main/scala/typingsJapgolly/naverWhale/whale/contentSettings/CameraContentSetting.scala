package typingsJapgolly.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraContentSetting
  extends typingsJapgolly.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typingsJapgolly.chrome.chrome.contentSettings.CameraSetDetails): Unit = js.native
  def set(
    details: typingsJapgolly.chrome.chrome.contentSettings.CameraSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

