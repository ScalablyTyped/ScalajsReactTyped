package typingsJapgolly.reactNativeSettingsList.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  /**
    * default: 1
    */
  var headerNumberOfLines: js.UndefOr[Double] = js.undefined
  var headerRef: js.UndefOr[js.Function0[Unit]] = js.undefined
  var headerStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var headerText: js.UndefOr[String] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    headerNumberOfLines: Int | Double = null,
    headerRef: js.UndefOr[Callback] = js.undefined,
    headerStyle: StyleProp[TextStyle] = null,
    headerText: String = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal()
    if (headerNumberOfLines != null) __obj.updateDynamic("headerNumberOfLines")(headerNumberOfLines.asInstanceOf[js.Any])
    headerRef.foreach(p => __obj.updateDynamic("headerRef")(p.toJsFn))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
}

