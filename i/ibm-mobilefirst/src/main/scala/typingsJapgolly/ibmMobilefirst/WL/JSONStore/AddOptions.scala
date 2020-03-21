package typingsJapgolly.ibmMobilefirst.WL.JSONStore

import japgolly.scalajs.react.Callback
import typingsJapgolly.ibmMobilefirst.WL.IResponse
import typingsJapgolly.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends Options {
  var additionalSearchFields: js.UndefOr[js.Any] = js.undefined
  var markDirty: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated
    */
  var push: js.UndefOr[Boolean] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(
    additionalSearchFields: js.Any = null,
    invocationContext: js.Any = null,
    markDirty: js.UndefOr[Boolean] = js.undefined,
    onFailure: /* response */ IResponse => Callback = null,
    onSuccess: /* response */ IResponse => Callback = null,
    push: js.UndefOr[Boolean] = js.undefined
  ): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalSearchFields != null) __obj.updateDynamic("additionalSearchFields")(additionalSearchFields.asInstanceOf[js.Any])
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirty)) __obj.updateDynamic("markDirty")(markDirty.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.IResponse) => onFailure(t0).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.IResponse) => onSuccess(t0).runNow()))
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOptions]
  }
}

