package typingsJapgolly.reactBootstrap.safeAnchorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeAnchorProps
  extends AllHTMLAttributes[SafeAnchor]
     with ClassAttributes[SafeAnchor] {
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
  @JSName("onClick")
  var onClick_SafeAnchorProps: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
}

object SafeAnchorProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[SafeAnchor] = null,
    ClassAttributes: ClassAttributes[SafeAnchor] = null,
    componentClass: ReactType[_] = null,
    onClick: ReactMouseEventFrom[js.Object with Element] => Callback = null
  ): SafeAnchorProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    __obj.asInstanceOf[SafeAnchorProps]
  }
}

