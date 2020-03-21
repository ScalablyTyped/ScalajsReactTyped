package typingsJapgolly.antd.formContextMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.rcFieldForm.formContextMod.FormChangeInfo
import typingsJapgolly.rcFieldForm.formContextMod.FormFinishInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<rc-field-form.rc-field-form/lib/FormContext.FormProviderProps, 'validateMessages'> */
trait FormProviderProps extends js.Object {
  var onFormChange: js.UndefOr[js.Function2[/* name */ String, /* info */ FormChangeInfo, Unit]] = js.undefined
  var onFormFinish: js.UndefOr[js.Function2[/* name */ String, /* info */ FormFinishInfo, Unit]] = js.undefined
}

object FormProviderProps {
  @scala.inline
  def apply(
    onFormChange: (/* name */ String, /* info */ FormChangeInfo) => Callback = null,
    onFormFinish: (/* name */ String, /* info */ FormFinishInfo) => Callback = null
  ): FormProviderProps = {
    val __obj = js.Dynamic.literal()
    if (onFormChange != null) __obj.updateDynamic("onFormChange")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* info */ typingsJapgolly.rcFieldForm.formContextMod.FormChangeInfo) => onFormChange(t0, t1).runNow()))
    if (onFormFinish != null) __obj.updateDynamic("onFormFinish")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* info */ typingsJapgolly.rcFieldForm.formContextMod.FormFinishInfo) => onFormFinish(t0, t1).runNow()))
    __obj.asInstanceOf[FormProviderProps]
  }
}

