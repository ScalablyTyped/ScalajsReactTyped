package typingsJapgolly.antDesignPro.loginMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var defaultActiveKey: js.UndefOr[String] = js.undefined
  var onSubmit: js.UndefOr[js.Function2[/* error */ js.Any, /* values */ js.Any, Unit]] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LoginProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultActiveKey: String = null,
    onSubmit: (/* error */ js.Any, /* values */ js.Any) => Callback = null,
    onTabChange: /* key */ String => Callback = null,
    style: CSSProperties = null
  ): LoginProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction2((t0: /* error */ js.Any, t1: /* values */ js.Any) => onSubmit(t0, t1).runNow()))
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => onTabChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginProps]
  }
}

