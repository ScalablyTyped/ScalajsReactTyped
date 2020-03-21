package typingsJapgolly.antDesignReactNative.localeProviderMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antDesignReactNative.PartialLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[Element] = js.undefined
  var locale: js.UndefOr[PartialLocale] = js.undefined
}

object LocaleProviderProps {
  @scala.inline
  def apply(children: VdomElement = null, locale: PartialLocale = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

