package typingsJapgolly.naverWhale.whale.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesContentSetting
  extends typingsJapgolly.chrome.chrome.contentSettings.ContentSetting {
  def set(details: typingsJapgolly.chrome.chrome.contentSettings.ImagesSetDetails): Unit = js.native
  def set(
    details: typingsJapgolly.chrome.chrome.contentSettings.ImagesSetDetails,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

