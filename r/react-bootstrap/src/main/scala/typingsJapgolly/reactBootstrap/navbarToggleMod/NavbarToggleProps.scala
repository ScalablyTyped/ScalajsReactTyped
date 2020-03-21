package typingsJapgolly.reactBootstrap.navbarToggleMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavbarToggleProps
  extends AllHTMLAttributes[NavbarToggle]
     with ClassAttributes[NavbarToggle] {
  @JSName("onClick")
  var onClick_NavbarToggleProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object NavbarToggleProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[NavbarToggle] = null,
    ClassAttributes: ClassAttributes[NavbarToggle] = null,
    onClick: ReactMouseEventFrom[Element] => Callback = null
  ): NavbarToggleProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    __obj.asInstanceOf[NavbarToggleProps]
  }
}

