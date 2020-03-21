package typingsJapgolly.reduxForm.mod

import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in keyof FormData ]:? react.react.ReactElement | T} & redux-form.redux-form.ErrorOther<T> */
trait FormErrors[FormData, T] extends js.Object {
  var _error: js.UndefOr[T] = js.undefined
  var append: js.UndefOr[Element | T] = js.undefined
  var delete: js.UndefOr[Element | T] = js.undefined
  var entries: js.UndefOr[Element | T] = js.undefined
  var forEach: js.UndefOr[Element | T] = js.undefined
  var get: js.UndefOr[Element | T] = js.undefined
  var getAll: js.UndefOr[Element | T] = js.undefined
  var has: js.UndefOr[Element | T] = js.undefined
  var keys: js.UndefOr[Element | T] = js.undefined
  var set: js.UndefOr[Element | T] = js.undefined
  var values: js.UndefOr[Element | T] = js.undefined
}

object FormErrors {
  @scala.inline
  def apply[FormData, T](
    _error: T = null,
    append: Element | T = null,
    delete: Element | T = null,
    entries: Element | T = null,
    forEach: Element | T = null,
    get: Element | T = null,
    getAll: Element | T = null,
    has: Element | T = null,
    keys: Element | T = null,
    set: Element | T = null,
    values: Element | T = null
  ): FormErrors[FormData, T] = {
    val __obj = js.Dynamic.literal()
    if (_error != null) __obj.updateDynamic("_error")(_error.asInstanceOf[js.Any])
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (forEach != null) __obj.updateDynamic("forEach")(forEach.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (getAll != null) __obj.updateDynamic("getAll")(getAll.asInstanceOf[js.Any])
    if (has != null) __obj.updateDynamic("has")(has.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormErrors[FormData, T]]
  }
}

