package typingsJapgolly.sipJs

import typingsJapgolly.sipJs.bodyMod.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCseq extends js.Object {
  var body: js.UndefOr[Body] = js.undefined
  var cseq: js.UndefOr[Double] = js.undefined
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonCseq {
  @scala.inline
  def apply(body: Body = null, cseq: Int | Double = null, extraHeaders: js.Array[String] = null): AnonCseq = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cseq != null) __obj.updateDynamic("cseq")(cseq.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCseq]
  }
}

