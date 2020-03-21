package typingsJapgolly.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  /**
    * The list of audio messages.
    */
  var AudioList: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.AudioList] = js.native
  /**
    * The list of SSML messages.
    */
  var SsmlList: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.SsmlList] = js.native
  /**
    * The list of text messages.
    */
  var TextList: js.UndefOr[typingsJapgolly.awsSdk.alexaforbusinessMod.TextList] = js.native
}

object Content {
  @scala.inline
  def apply(AudioList: AudioList = null, SsmlList: SsmlList = null, TextList: TextList = null): Content = {
    val __obj = js.Dynamic.literal()
    if (AudioList != null) __obj.updateDynamic("AudioList")(AudioList.asInstanceOf[js.Any])
    if (SsmlList != null) __obj.updateDynamic("SsmlList")(SsmlList.asInstanceOf[js.Any])
    if (TextList != null) __obj.updateDynamic("TextList")(TextList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

