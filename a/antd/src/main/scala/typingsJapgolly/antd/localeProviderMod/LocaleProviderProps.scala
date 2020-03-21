package typingsJapgolly.antd.localeProviderMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocaleProviderProps extends js.Object {
  var _ANT_MARK__ : js.UndefOr[String] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var locale: Locale
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: Locale, _ANT_MARK__ : String = null, children: VdomNode = null): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    if (_ANT_MARK__ != null) __obj.updateDynamic("_ANT_MARK__")(_ANT_MARK__.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
}

