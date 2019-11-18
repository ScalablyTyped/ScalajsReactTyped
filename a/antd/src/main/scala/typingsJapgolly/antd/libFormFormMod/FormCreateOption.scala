package typingsJapgolly.antd.libFormFormMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormCreateOption[T] extends js.Object {
  var mapPropsToFields: js.UndefOr[js.Function1[/* props */ T, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onFieldsChange: js.UndefOr[js.Function3[/* props */ T, /* fields */ js.Any, /* allFields */ js.Any, Unit]] = js.undefined
  var onValuesChange: js.UndefOr[
    js.Function3[/* props */ T, /* changedValues */ js.Any, /* allValues */ js.Any, Unit]
  ] = js.undefined
  var validateMessages: js.UndefOr[FormCreateOptionMessages] = js.undefined
  var withRef: js.UndefOr[Boolean] = js.undefined
}

object FormCreateOption {
  @scala.inline
  def apply[T](
    mapPropsToFields: /* props */ T => Callback = null,
    name: String = null,
    onFieldsChange: (/* props */ T, /* fields */ js.Any, /* allFields */ js.Any) => Callback = null,
    onValuesChange: (/* props */ T, /* changedValues */ js.Any, /* allValues */ js.Any) => Callback = null,
    validateMessages: FormCreateOptionMessages = null,
    withRef: js.UndefOr[Boolean] = js.undefined
  ): FormCreateOption[T] = {
    val __obj = js.Dynamic.literal()
    if (mapPropsToFields != null) __obj.updateDynamic("mapPropsToFields")(js.Any.fromFunction1((t0: /* props */ T) => mapPropsToFields(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onFieldsChange != null) __obj.updateDynamic("onFieldsChange")(js.Any.fromFunction3((t0: /* props */ T, t1: /* fields */ js.Any, t2: /* allFields */ js.Any) => onFieldsChange(t0, t1, t2).runNow()))
    if (onValuesChange != null) __obj.updateDynamic("onValuesChange")(js.Any.fromFunction3((t0: /* props */ T, t1: /* changedValues */ js.Any, t2: /* allValues */ js.Any) => onValuesChange(t0, t1, t2).runNow()))
    if (validateMessages != null) __obj.updateDynamic("validateMessages")(validateMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(withRef)) __obj.updateDynamic("withRef")(withRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormCreateOption[T]]
  }
}

