package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonButtonClick extends js.Object {
  var buttonType: String
  var styles: StringDictionary[RegisteredStyle[_]]
  def buttonClick(): Unit
}

object AnonButtonClick {
  @scala.inline
  def apply(buttonClick: Callback, buttonType: String, styles: StringDictionary[RegisteredStyle[_]]): AnonButtonClick = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("buttonClick")(buttonClick.toJsFn)
    __obj.asInstanceOf[AnonButtonClick]
  }
}

