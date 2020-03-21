package typingsJapgolly.antdMobileRn.localeProviderMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antdMobileRn.AnonDatePicker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[Element] = js.undefined
  var locale: AnonDatePicker
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: AnonDatePicker, children: VdomElement = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

