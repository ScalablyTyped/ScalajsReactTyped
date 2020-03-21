package typingsJapgolly.zui

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageCutter extends js.Object {
  def getData(): ImageData
  def resetImage(img: String): js.Any
}

object ImageCutter {
  @scala.inline
  def apply(getData: CallbackTo[ImageData], resetImage: String => CallbackTo[js.Any]): ImageCutter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("resetImage")(js.Any.fromFunction1((t0: java.lang.String) => resetImage(t0).runNow()))
    __obj.asInstanceOf[ImageCutter]
  }
}

