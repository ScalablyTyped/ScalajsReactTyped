package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GetSessionEntityTypeRequest. */
trait IGetSessionEntityTypeRequest extends js.Object {
  /** GetSessionEntityTypeRequest name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object IGetSessionEntityTypeRequest {
  @scala.inline
  def apply(name: String = null): IGetSessionEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetSessionEntityTypeRequest]
  }
}

