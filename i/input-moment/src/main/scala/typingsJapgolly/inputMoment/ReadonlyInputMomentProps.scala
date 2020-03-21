package typingsJapgolly.inputMoment

import japgolly.scalajs.react.Callback
import typingsJapgolly.inputMoment.mod.OnChangeListener
import typingsJapgolly.inputMoment.mod.OnSaveListener
import typingsJapgolly.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<input-moment.input-moment.InputMomentProps> */
trait ReadonlyInputMomentProps extends js.Object {
  val hourStep: js.UndefOr[Double] = js.undefined
  val minStep: js.UndefOr[Double] = js.undefined
  val moment: Moment
  val nextMonthIcon: js.UndefOr[String] = js.undefined
  val onChange: js.UndefOr[OnChangeListener] = js.undefined
  val onSave: js.UndefOr[OnSaveListener] = js.undefined
  val prevMonthIcon: js.UndefOr[String] = js.undefined
}

object ReadonlyInputMomentProps {
  @scala.inline
  def apply(
    moment: Moment,
    hourStep: Int | Double = null,
    minStep: Int | Double = null,
    nextMonthIcon: String = null,
    onChange: /* m */ Moment => Callback = null,
    onSave: js.UndefOr[Callback] = js.undefined,
    prevMonthIcon: String = null
  ): ReadonlyInputMomentProps = {
    val __obj = js.Dynamic.literal(moment = moment.asInstanceOf[js.Any])
    if (hourStep != null) __obj.updateDynamic("hourStep")(hourStep.asInstanceOf[js.Any])
    if (minStep != null) __obj.updateDynamic("minStep")(minStep.asInstanceOf[js.Any])
    if (nextMonthIcon != null) __obj.updateDynamic("nextMonthIcon")(nextMonthIcon.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* m */ typingsJapgolly.moment.mod.Moment) => onChange(t0).runNow()))
    onSave.foreach(p => __obj.updateDynamic("onSave")(p.toJsFn))
    if (prevMonthIcon != null) __obj.updateDynamic("prevMonthIcon")(prevMonthIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyInputMomentProps]
  }
}

