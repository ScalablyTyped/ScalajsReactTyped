package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firefoxWebextBrowser.browser.clipboard.ArrayBuffer
import typingsJapgolly.firefoxWebextBrowser.browser.clipboard._SetImageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofclipboard extends js.Object {
  /* clipboard functions */
  /**
    * Copy an image to the clipboard. The image is re-encoded before it is written to the clipboard. If the image is
    * invalid, the clipboard is not modified.
    * @param imageData The image data to be copied.
    * @param imageType The type of imageData.
    */
  def setImageData(imageData: ArrayBuffer, imageType: _SetImageData): js.Promise[Unit]
}

object Typeofclipboard {
  @scala.inline
  def apply(setImageData: (ArrayBuffer, _SetImageData) => CallbackTo[js.Promise[Unit]]): Typeofclipboard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setImageData")(js.Any.fromFunction2((t0: typingsJapgolly.firefoxWebextBrowser.browser.clipboard.ArrayBuffer, t1: typingsJapgolly.firefoxWebextBrowser.browser.clipboard._SetImageData) => setImageData(t0, t1).runNow()))
    __obj.asInstanceOf[Typeofclipboard]
  }
}

