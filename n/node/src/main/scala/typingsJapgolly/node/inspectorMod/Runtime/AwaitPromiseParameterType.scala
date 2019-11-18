package typingsJapgolly.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwaitPromiseParameterType extends js.Object {
  /**
    * Whether preview should be generated for the result.
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  /**
    * Identifier of the promise.
    */
  var promiseObjectId: RemoteObjectId
  /**
    * Whether the result is expected to be a JSON object that should be sent by value.
    */
  var returnByValue: js.UndefOr[Boolean] = js.undefined
}

object AwaitPromiseParameterType {
  @scala.inline
  def apply(
    promiseObjectId: RemoteObjectId,
    generatePreview: js.UndefOr[Boolean] = js.undefined,
    returnByValue: js.UndefOr[Boolean] = js.undefined
  ): AwaitPromiseParameterType = {
    val __obj = js.Dynamic.literal(promiseObjectId = promiseObjectId.asInstanceOf[js.Any])
    if (!js.isUndefined(generatePreview)) __obj.updateDynamic("generatePreview")(generatePreview.asInstanceOf[js.Any])
    if (!js.isUndefined(returnByValue)) __obj.updateDynamic("returnByValue")(returnByValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwaitPromiseParameterType]
  }
}

