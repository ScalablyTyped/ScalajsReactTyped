package typingsJapgolly.reactRouterDom.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactRouterDom.reactRouterDomStrings.hashbang
import typingsJapgolly.reactRouterDom.reactRouterDomStrings.noslash
import typingsJapgolly.reactRouterDom.reactRouterDomStrings.slash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashRouterProps extends js.Object {
  var basename: js.UndefOr[String] = js.undefined
  var getUserConfirmation: js.UndefOr[
    js.Function2[/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit], Unit]
  ] = js.undefined
  var hashType: js.UndefOr[slash | noslash | hashbang] = js.undefined
}

object HashRouterProps {
  @scala.inline
  def apply(
    basename: String = null,
    getUserConfirmation: (/* message */ String, /* callback */ js.Function1[/* ok */ Boolean, Unit]) => Callback = null,
    hashType: slash | noslash | hashbang = null
  ): HashRouterProps = {
    val __obj = js.Dynamic.literal()
    if (basename != null) __obj.updateDynamic("basename")(basename.asInstanceOf[js.Any])
    if (getUserConfirmation != null) __obj.updateDynamic("getUserConfirmation")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* callback */ js.Function1[/* ok */ scala.Boolean, scala.Unit]) => getUserConfirmation(t0, t1).runNow()))
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    __obj.asInstanceOf[HashRouterProps]
  }
}

