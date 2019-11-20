package typingsJapgolly.expo

import typingsJapgolly.expo.buildUpdatesUpdatesMod.Manifest
import typingsJapgolly.expo.buildUpdatesUpdatesMod.UpdateEvent
import typingsJapgolly.expo.expoStrings.downloadFinished
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DownloadFinished extends UpdateEvent {
  var manifest: Manifest
  var `type`: downloadFinished
}

object Anon_DownloadFinished {
  @scala.inline
  def apply(manifest: Manifest, `type`: downloadFinished): Anon_DownloadFinished = {
    val __obj = js.Dynamic.literal(manifest = manifest.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DownloadFinished]
  }
}

