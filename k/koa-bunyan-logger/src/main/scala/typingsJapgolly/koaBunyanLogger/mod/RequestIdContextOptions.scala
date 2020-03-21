package typingsJapgolly.koaBunyanLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestIdContextOptions extends js.Object {
  var field: js.UndefOr[String] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var prop: js.UndefOr[String] = js.undefined
  var requestProp: js.UndefOr[String] = js.undefined
}

object RequestIdContextOptions {
  @scala.inline
  def apply(field: String = null, header: String = null, prop: String = null, requestProp: String = null): RequestIdContextOptions = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (prop != null) __obj.updateDynamic("prop")(prop.asInstanceOf[js.Any])
    if (requestProp != null) __obj.updateDynamic("requestProp")(requestProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestIdContextOptions]
  }
}

