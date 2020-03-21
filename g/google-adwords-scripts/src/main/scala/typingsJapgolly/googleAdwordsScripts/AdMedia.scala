package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Media
trait AdMedia extends js.Object {
  def media(): AdWordsSelector[Media]
  def newImageBuilder(): ImageBuilder[Media]
  def newMediaBundleBuilder(): MediaBundleBuilder[Media]
  def newVideoBuilder(): VideoBuilder[Media]
}

object AdMedia {
  @scala.inline
  def apply(
    media: CallbackTo[AdWordsSelector[Media]],
    newImageBuilder: CallbackTo[ImageBuilder[Media]],
    newMediaBundleBuilder: CallbackTo[MediaBundleBuilder[Media]],
    newVideoBuilder: CallbackTo[VideoBuilder[Media]]
  ): AdMedia = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("media")(media.toJsFn)
    __obj.updateDynamic("newImageBuilder")(newImageBuilder.toJsFn)
    __obj.updateDynamic("newMediaBundleBuilder")(newMediaBundleBuilder.toJsFn)
    __obj.updateDynamic("newVideoBuilder")(newVideoBuilder.toJsFn)
    __obj.asInstanceOf[AdMedia]
  }
}

