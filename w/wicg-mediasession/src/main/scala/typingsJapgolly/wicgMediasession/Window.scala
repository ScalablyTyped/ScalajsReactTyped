package typingsJapgolly.wicgMediasession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var MediaSession: js.UndefOr[typingsJapgolly.wicgMediasession.MediaSession] = js.undefined
}

object Window {
  @scala.inline
  def apply(MediaSession: MediaSession = null): Window = {
    val __obj = js.Dynamic.literal()
    if (MediaSession != null) __obj.updateDynamic("MediaSession")(MediaSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

