package typingsJapgolly.koaJoiRouter

import typingsJapgolly.joi.mod.SchemaLike
import typingsJapgolly.koaJoiRouter.mod.OutputValidation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends OutputValidation {
  var body: SchemaLike
}

object AnonBody {
  @scala.inline
  def apply(body: SchemaLike = null): AnonBody = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

