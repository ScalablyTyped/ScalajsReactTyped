package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: Double
  var indicatorStyle: Null
  var mode: String
  var simple: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  var total: Double
  def onChange(): Unit
}

object AnonCurrent {
  @scala.inline
  def apply(
    current: Double,
    indicatorStyle: Null,
    mode: String,
    onChange: Callback,
    simple: Boolean,
    styles: StringDictionary[RegisteredStyle[_]],
    total: Double
  ): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.asInstanceOf[AnonCurrent]
  }
}

