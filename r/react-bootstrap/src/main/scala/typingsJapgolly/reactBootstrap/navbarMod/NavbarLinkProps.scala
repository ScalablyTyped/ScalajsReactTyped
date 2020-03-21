package typingsJapgolly.reactBootstrap.navbarMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the classes below aren't present in lib/
  */
trait NavbarLinkProps
  extends AllHTMLAttributes[NavbarLink]
     with ClassAttributes[NavbarLink] {
  @JSName("href")
  var href_NavbarLinkProps: String
  @JSName("onClick")
  var onClick_NavbarLinkProps: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object NavbarLinkProps {
  @scala.inline
  def apply(
    href: String,
    AllHTMLAttributes: AllHTMLAttributes[NavbarLink] = null,
    ClassAttributes: ClassAttributes[NavbarLink] = null,
    onClick: ReactMouseEventFrom[Element] => Callback = null
  ): NavbarLinkProps = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    __obj.asInstanceOf[NavbarLinkProps]
  }
}

