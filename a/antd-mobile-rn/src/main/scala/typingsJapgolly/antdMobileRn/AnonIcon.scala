package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var icon: Element
  var mode: String
  var styles: StringDictionary[RegisteredStyle[_]]
  def onClick(): Unit
}

object AnonIcon {
  @scala.inline
  def apply(icon: VdomElement, mode: String, onClick: Callback, styles: StringDictionary[RegisteredStyle[_]]): AnonIcon = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("onClick")(onClick.toJsFn)
    __obj.asInstanceOf[AnonIcon]
  }
}

