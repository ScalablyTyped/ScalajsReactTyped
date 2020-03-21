package typingsJapgolly.reactDayPicker.propsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactDayPicker.commonMod.ClassNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionElementProps extends js.Object {
  var classNames: ClassNames
  var date: js.Date
  var locale: String
  var localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
}

object CaptionElementProps {
  @scala.inline
  def apply(
    classNames: ClassNames,
    date: js.Date,
    locale: String,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any,
    months: js.Array[String] = null,
    onClick: ReactMouseEventFrom[HTMLElement] => Callback = null
  ): CaptionElementProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onClick(t0).runNow()))
    __obj.asInstanceOf[CaptionElementProps]
  }
}

