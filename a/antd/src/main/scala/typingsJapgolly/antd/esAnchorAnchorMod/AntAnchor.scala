package typingsJapgolly.antd.esAnchorAnchorMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntAnchor extends js.Object {
  var activeLink: String | Null
  var onClick: js.UndefOr[
    js.Function2[/* e */ ReactMouseEventFrom[HTMLElement], /* link */ Anon_Href, Unit]
  ] = js.undefined
  def registerLink(link: String): Unit
  def scrollTo(link: String): Unit
  def unregisterLink(link: String): Unit
}

object AntAnchor {
  @scala.inline
  def apply(
    registerLink: String => Callback,
    scrollTo: String => Callback,
    unregisterLink: String => Callback,
    activeLink: String = null,
    onClick: (/* e */ ReactMouseEventFrom[HTMLElement], /* link */ Anon_Href) => Callback = null
  ): AntAnchor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerLink")(js.Any.fromFunction1((t0: java.lang.String) => registerLink(t0).runNow()))
    __obj.updateDynamic("scrollTo")(js.Any.fromFunction1((t0: java.lang.String) => scrollTo(t0).runNow()))
    __obj.updateDynamic("unregisterLink")(js.Any.fromFunction1((t0: java.lang.String) => unregisterLink(t0).runNow()))
    if (activeLink != null) __obj.updateDynamic("activeLink")(activeLink.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement], t1: /* link */ typingsJapgolly.antd.Anon_Href) => onClick(t0, t1).runNow()))
    __obj.asInstanceOf[AntAnchor]
  }
}

