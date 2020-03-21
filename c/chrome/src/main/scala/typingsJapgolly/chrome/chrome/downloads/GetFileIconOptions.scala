package typingsJapgolly.chrome.chrome.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileIconOptions extends js.Object {
  /** Optional. * The size of the returned icon. The icon will be square with dimensions size * size pixels. The default and largest size for the icon is 32x32 pixels. The only supported sizes are 16 and 32. It is an error to specify any other size.
    */
  var size: js.UndefOr[Double] = js.undefined
}

object GetFileIconOptions {
  @scala.inline
  def apply(size: Int | Double = null): GetFileIconOptions = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileIconOptions]
  }
}

