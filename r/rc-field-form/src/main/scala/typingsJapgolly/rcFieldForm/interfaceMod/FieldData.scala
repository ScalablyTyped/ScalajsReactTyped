package typingsJapgolly.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<std.Omit<rc-field-form.rc-field-form/lib/interface.Meta, 'name'>> */
trait FieldData extends js.Object {
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  var name: NamePath
  var touched: js.UndefOr[Boolean] = js.undefined
  var validating: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[StoreValue] = js.undefined
}

object FieldData {
  @scala.inline
  def apply(
    name: NamePath,
    errors: js.Array[String] = null,
    touched: js.UndefOr[Boolean] = js.undefined,
    validating: js.UndefOr[Boolean] = js.undefined,
    value: StoreValue = null
  ): FieldData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(touched)) __obj.updateDynamic("touched")(touched.asInstanceOf[js.Any])
    if (!js.isUndefined(validating)) __obj.updateDynamic("validating")(validating.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldData]
  }
}

