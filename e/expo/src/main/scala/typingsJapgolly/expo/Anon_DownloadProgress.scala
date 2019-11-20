package typingsJapgolly.expo

import typingsJapgolly.expo.buildUpdatesUpdatesMod.UpdateEvent
import typingsJapgolly.expo.expoStrings.downloadProgress
import typingsJapgolly.expo.expoStrings.downloadStart
import typingsJapgolly.expo.expoStrings.noUpdateAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DownloadProgress extends UpdateEvent {
  var `type`: downloadStart | downloadProgress | noUpdateAvailable
}

object Anon_DownloadProgress {
  @scala.inline
  def apply(`type`: downloadStart | downloadProgress | noUpdateAvailable): Anon_DownloadProgress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DownloadProgress]
  }
}

