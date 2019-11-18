package typingsJapgolly.materialDashUi.__MaterialUI.DatePicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialDashUi.Anon_Locales
import typingsJapgolly.materialDashUi.__MaterialUI.Popover.PopoverAnimationProps
import typingsJapgolly.materialDashUi.__MaterialUI.propTypes.utils
import typingsJapgolly.materialDashUi.materialDashUiStrings.`inline`
import typingsJapgolly.materialDashUi.materialDashUiStrings.dialog
import typingsJapgolly.materialDashUi.materialDashUiStrings.landscape
import typingsJapgolly.materialDashUi.materialDashUiStrings.portrait
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePickerDialogProps extends js.Object {
  // <Container/> is the element that get the 'other' properties
  var DateTimeFormat: js.UndefOr[Anon_Locales] = js.undefined
  var animation: js.UndefOr[ComponentClassP[PopoverAnimationProps with js.Object]] = js.undefined
  var autoOk: js.UndefOr[Boolean] = js.undefined
  var cancelLabel: js.UndefOr[Node] = js.undefined
  var container: js.UndefOr[dialog | `inline`] = js.undefined
  var disableYearSelection: js.UndefOr[Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[Double] = js.undefined
  var initialDate: js.UndefOr[js.Date] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var mode: js.UndefOr[portrait | landscape] = js.undefined
  var okLabel: js.UndefOr[Node] = js.undefined
  var onAccept: js.UndefOr[js.Function1[/* d */ js.Date, Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var shouldDisableDate: js.UndefOr[js.Function1[/* day */ js.Date, Boolean]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var utils: js.UndefOr[typingsJapgolly.materialDashUi.__MaterialUI.propTypes.utils] = js.undefined
}

object DatePickerDialogProps {
  @scala.inline
  def apply(
    DateTimeFormat: Anon_Locales = null,
    animation: ComponentClassP[PopoverAnimationProps with js.Object] = null,
    autoOk: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: VdomNode = null,
    container: dialog | `inline` = null,
    disableYearSelection: js.UndefOr[Boolean] = js.undefined,
    firstDayOfWeek: Int | Double = null,
    initialDate: js.Date = null,
    locale: String = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    mode: portrait | landscape = null,
    okLabel: VdomNode = null,
    onAccept: /* d */ js.Date => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onShow: js.UndefOr[Callback] = js.undefined,
    shouldDisableDate: /* day */ js.Date => CallbackTo[Boolean] = null,
    style: CSSProperties = null,
    utils: utils = null
  ): DatePickerDialogProps = {
    val __obj = js.Dynamic.literal()
    if (DateTimeFormat != null) __obj.updateDynamic("DateTimeFormat")(DateTimeFormat.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(autoOk)) __obj.updateDynamic("autoOk")(autoOk.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.rawNode.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(disableYearSelection)) __obj.updateDynamic("disableYearSelection")(disableYearSelection.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (initialDate != null) __obj.updateDynamic("initialDate")(initialDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.rawNode.asInstanceOf[js.Any])
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1((t0: /* d */ js.Date) => onAccept(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    onShow.foreach(p => __obj.updateDynamic("onShow")(p.toJsFn))
    if (shouldDisableDate != null) __obj.updateDynamic("shouldDisableDate")(js.Any.fromFunction1((t0: /* day */ js.Date) => shouldDisableDate(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (utils != null) __obj.updateDynamic("utils")(utils.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerDialogProps]
  }
}

