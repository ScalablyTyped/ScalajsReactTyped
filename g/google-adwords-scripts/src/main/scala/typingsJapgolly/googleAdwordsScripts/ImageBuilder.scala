package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageBuilder[Media] extends AdWordsBuilder[Media] {
  def withData(data: Blob): ImageBuilder[Media]
  def withName(name: String): ImageBuilder[Media]
}

object ImageBuilder {
  @scala.inline
  def apply[Media](
    build: CallbackTo[AdWordsOperation[Media]],
    withData: Blob => CallbackTo[ImageBuilder[Media]],
    withName: String => CallbackTo[ImageBuilder[Media]]
  ): ImageBuilder[Media] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("withData")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob) => withData(t0).runNow()))
    __obj.updateDynamic("withName")(js.Any.fromFunction1((t0: java.lang.String) => withName(t0).runNow()))
    __obj.asInstanceOf[ImageBuilder[Media]]
  }
}

