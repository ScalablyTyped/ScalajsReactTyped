package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallMediaState extends js.Object {
  var audio: js.UndefOr[MediaState] = js.undefined
}

object CallMediaState {
  @scala.inline
  def apply(audio: MediaState = null): CallMediaState = {
    val __obj = js.Dynamic.literal()
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallMediaState]
  }
}

