package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1

import typingsJapgolly.dialogflow.mod.google.protobuf.IStruct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Context. */
trait IContext extends js.Object {
  /** Context lifespanCount */
  var lifespanCount: js.UndefOr[Double | Null] = js.undefined
  /** Context name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** Context parameters */
  var parameters: js.UndefOr[IStruct | Null] = js.undefined
}

object IContext {
  @scala.inline
  def apply(lifespanCount: Int | Double = null, name: String = null, parameters: IStruct = null): IContext = {
    val __obj = js.Dynamic.literal()
    if (lifespanCount != null) __obj.updateDynamic("lifespanCount")(lifespanCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContext]
  }
}

