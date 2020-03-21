package typingsJapgolly.koaJoiRouter.mod

import typingsJapgolly.koaJoiRouter.AnonContinueOnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends Config {
  var handler: Handler
  var method: String | js.Array[String]
  var path: String | js.RegExp
}

object Spec {
  @scala.inline
  def apply(
    handler: Handler,
    method: String | js.Array[String],
    path: String | js.RegExp,
    meta: js.Any = null,
    pre: Handler = null,
    validate: AnonContinueOnError = null
  ): Spec = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (pre != null) __obj.updateDynamic("pre")(pre.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec]
  }
}

