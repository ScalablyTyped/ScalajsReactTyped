package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends js.Object {
  var duration: Double
  var mask: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  def onClose(): Unit
}

object AnonDuration {
  @scala.inline
  def apply(duration: Double, mask: Boolean, onClose: Callback, styles: StringDictionary[RegisteredStyle[_]]): AnonDuration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.asInstanceOf[AnonDuration]
  }
}

