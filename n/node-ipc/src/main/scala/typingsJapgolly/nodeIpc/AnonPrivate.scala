package typingsJapgolly.nodeIpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivate extends js.Object {
  var `private`: js.UndefOr[String] = js.undefined
  var public: js.UndefOr[String] = js.undefined
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
}

object AnonPrivate {
  @scala.inline
  def apply(
    `private`: String = null,
    public: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  ): AnonPrivate = {
    val __obj = js.Dynamic.literal()
    if (`private` != null) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivate]
  }
}

