package typingsJapgolly.expo.buildUpdatesUpdatesMod

import typingsJapgolly.expo.expoStrings.downloadFinished
import typingsJapgolly.expo.expoStrings.downloadProgress
import typingsJapgolly.expo.expoStrings.downloadStart
import typingsJapgolly.expo.expoStrings.error
import typingsJapgolly.expo.expoStrings.noUpdateAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEvent extends js.Object {
  var manifest: js.UndefOr[Manifest] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[
    (downloadStart | downloadProgress | noUpdateAvailable) with downloadFinished with error
  ] = js.undefined
}

object UpdateEvent {
  @scala.inline
  def apply(
    manifest: Manifest = null,
    message: String = null,
    `type`: (downloadStart | downloadProgress | noUpdateAvailable) with downloadFinished with error = null
  ): UpdateEvent = {
    val __obj = js.Dynamic.literal()
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEvent]
  }
}

