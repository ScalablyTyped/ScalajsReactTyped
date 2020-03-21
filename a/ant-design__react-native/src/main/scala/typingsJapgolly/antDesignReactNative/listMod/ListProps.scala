package typingsJapgolly.antDesignReactNative.listMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antDesignReactNative.antDesignReactNativeBooleans.`false`
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.antDesignReactNative.listPropsTypeMod.ListPropsType
import typingsJapgolly.antDesignReactNative.listStyleMod.ListStyle
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProps
  extends ListPropsType
     with WithThemeStyles[ListStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ListProps {
  @scala.inline
  def apply(
    children: `false` | Element | js.Array[Element] = null,
    renderFooter: js.Function0[ReactType[_]] | String | Element = null,
    renderHeader: js.Function0[ReactType[_]] | String | Element = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[ListStyle] = null
  ): ListProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProps]
  }
}

