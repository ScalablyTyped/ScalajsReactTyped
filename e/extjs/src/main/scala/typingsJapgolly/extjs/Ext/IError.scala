package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IError extends js.Object {
  /** [Property] (Boolean) */
  var ignore: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  @JSName("notify")
  var notify_FIError: js.UndefOr[Boolean] = js.undefined
  /** [Method] Provides a custom string representation of the error object
  		* @returns String The error message. If raised from within the Ext 4 class system, the error message will also include the raising class and method names, if available.
  		*/
  @JSName("toString")
  var toString_FIError: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object IError {
  @scala.inline
  def apply(
    ignore: js.UndefOr[Boolean] = js.undefined,
    notify: js.UndefOr[Boolean] = js.undefined,
    toString: js.UndefOr[CallbackTo[java.lang.String]] = js.undefined
  ): IError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignore)) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify.asInstanceOf[js.Any])
    toString.foreach(p => __obj.updateDynamic("toString")(p.toJsFn))
    __obj.asInstanceOf[IError]
  }
}

