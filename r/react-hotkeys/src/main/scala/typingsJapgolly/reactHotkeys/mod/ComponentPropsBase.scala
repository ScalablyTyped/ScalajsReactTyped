package typingsJapgolly.reactHotkeys.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPropsBase extends js.Object {
  /**
    * The value of the HTML tabindex attribute the root node will have
    */
  var tabIndex: TabIndex
  /**
    * Function to bind to root node, in order for react-hotkeys to work
    */
  def onBlur(): Unit
  /**
    * Function to bind to root node, in order for react-hotkeys to work
    */
  def onFocus(): Unit
}

object ComponentPropsBase {
  @scala.inline
  def apply(onBlur: Callback, onFocus: Callback, tabIndex: TabIndex): ComponentPropsBase = {
    val __obj = js.Dynamic.literal(tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    __obj.asInstanceOf[ComponentPropsBase]
  }
}

