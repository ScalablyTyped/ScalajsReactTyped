package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.RegisteredStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterClose extends js.Object {
  var closable: Boolean
  var disabled: Boolean
  var selected: Boolean
  var small: Boolean
  var styles: StringDictionary[RegisteredStyle[_]]
  def afterClose(): Unit
  def onChange(): Unit
  def onClose(): Unit
  def onLongPress(): Unit
}

object AnonAfterClose {
  @scala.inline
  def apply(
    afterClose: Callback,
    closable: Boolean,
    disabled: Boolean,
    onChange: Callback,
    onClose: Callback,
    onLongPress: Callback,
    selected: Boolean,
    small: Boolean,
    styles: StringDictionary[RegisteredStyle[_]]
  ): AnonAfterClose = {
    val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("afterClose")(afterClose.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onLongPress")(onLongPress.toJsFn)
    __obj.asInstanceOf[AnonAfterClose]
  }
}

