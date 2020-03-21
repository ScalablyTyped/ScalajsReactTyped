package typingsJapgolly.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendObjectOptions extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
   // custom mime, will send with Content-Type entity header
  var meta: js.UndefOr[UserMeta] = js.undefined
   // the operation timeout
  var mime: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[String] = js.undefined
   // specify the position which is the content length of the latest object
  var timeout: js.UndefOr[Double] = js.undefined
}

object AppendObjectOptions {
  @scala.inline
  def apply(
    headers: js.Object = null,
    meta: UserMeta = null,
    mime: String = null,
    position: String = null,
    timeout: Int | Double = null
  ): AppendObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendObjectOptions]
  }
}

