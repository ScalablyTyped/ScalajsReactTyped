package typingsJapgolly.ibmMobilefirst.WL.JSONStore

import japgolly.scalajs.react.Callback
import typingsJapgolly.ibmMobilefirst.WL.IResponse
import typingsJapgolly.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeOptions extends Options {
  var addNew: js.UndefOr[Boolean] = js.undefined
  var markDirty: js.UndefOr[Boolean] = js.undefined
  var replaceCriteria: js.UndefOr[js.Array[String]] = js.undefined
}

object ChangeOptions {
  @scala.inline
  def apply(
    addNew: js.UndefOr[Boolean] = js.undefined,
    invocationContext: js.Any = null,
    markDirty: js.UndefOr[Boolean] = js.undefined,
    onFailure: /* response */ IResponse => Callback = null,
    onSuccess: /* response */ IResponse => Callback = null,
    replaceCriteria: js.Array[String] = null
  ): ChangeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addNew)) __obj.updateDynamic("addNew")(addNew.asInstanceOf[js.Any])
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirty)) __obj.updateDynamic("markDirty")(markDirty.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.IResponse) => onFailure(t0).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.ibmMobilefirst.WL.IResponse) => onSuccess(t0).runNow()))
    if (replaceCriteria != null) __obj.updateDynamic("replaceCriteria")(replaceCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeOptions]
  }
}

