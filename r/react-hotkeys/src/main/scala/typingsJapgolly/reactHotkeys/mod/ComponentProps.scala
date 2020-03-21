package typingsJapgolly.reactHotkeys.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.MutableRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentProps extends ComponentPropsBase {
  var ref: js.UndefOr[MutableRefObject[ComponentClassP[js.Object]]] = js.undefined
}

object ComponentProps {
  @scala.inline
  def apply(
    onBlur: Callback,
    onFocus: Callback,
    tabIndex: TabIndex,
    ref: MutableRefObject[ComponentClassP[js.Object]] = null
  ): ComponentProps = {
    val __obj = js.Dynamic.literal(tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("onBlur")(onBlur.toJsFn)
    __obj.updateDynamic("onFocus")(onFocus.toJsFn)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentProps]
  }
}

