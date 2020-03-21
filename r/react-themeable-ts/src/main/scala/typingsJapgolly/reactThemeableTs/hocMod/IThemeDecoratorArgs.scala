package typingsJapgolly.reactThemeableTs.hocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeDecoratorArgs extends js.Object {
  var contextPath: js.UndefOr[String | js.Array[String]] = js.undefined
  var memoizeeOpts: js.UndefOr[js.Any] = js.undefined
  var themeKey: js.UndefOr[String] = js.undefined
  var themeProp: js.UndefOr[String] = js.undefined
}

object IThemeDecoratorArgs {
  @scala.inline
  def apply(
    contextPath: String | js.Array[String] = null,
    memoizeeOpts: js.Any = null,
    themeKey: String = null,
    themeProp: String = null
  ): IThemeDecoratorArgs = {
    val __obj = js.Dynamic.literal()
    if (contextPath != null) __obj.updateDynamic("contextPath")(contextPath.asInstanceOf[js.Any])
    if (memoizeeOpts != null) __obj.updateDynamic("memoizeeOpts")(memoizeeOpts.asInstanceOf[js.Any])
    if (themeKey != null) __obj.updateDynamic("themeKey")(themeKey.asInstanceOf[js.Any])
    if (themeProp != null) __obj.updateDynamic("themeProp")(themeProp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeDecoratorArgs]
  }
}

