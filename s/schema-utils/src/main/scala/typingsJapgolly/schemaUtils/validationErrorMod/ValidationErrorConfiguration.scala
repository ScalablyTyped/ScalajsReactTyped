package typingsJapgolly.schemaUtils.validationErrorMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.schemaUtils.ErrorObjectchildrenArrayE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationErrorConfiguration extends js.Object {
  var baseDataPath: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var postFormatter: js.UndefOr[typingsJapgolly.schemaUtils.validateMod.PostFormatter] = js.undefined
}

object ValidationErrorConfiguration {
  @scala.inline
  def apply(
    baseDataPath: String = null,
    name: String = null,
    postFormatter: (/* formattedError */ String, /* error */ ErrorObjectchildrenArrayE) => CallbackTo[String] = null
  ): ValidationErrorConfiguration = {
    val __obj = js.Dynamic.literal()
    if (baseDataPath != null) __obj.updateDynamic("baseDataPath")(baseDataPath.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (postFormatter != null) __obj.updateDynamic("postFormatter")(js.Any.fromFunction2((t0: /* formattedError */ java.lang.String, t1: /* error */ typingsJapgolly.schemaUtils.ErrorObjectchildrenArrayE) => postFormatter(t0, t1).runNow()))
    __obj.asInstanceOf[ValidationErrorConfiguration]
  }
}

