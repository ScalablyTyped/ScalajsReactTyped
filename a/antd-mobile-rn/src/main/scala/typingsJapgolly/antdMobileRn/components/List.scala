package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.AnonArrowV
import typingsJapgolly.antdMobileRn.antdMobileRnBooleans.`false`
import typingsJapgolly.antdMobileRn.listIndexNativeMod.ListProps
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object List {
  def apply(
    renderFooter: js.Function0[ReactType[_]] | String | Element = null,
    renderHeader: js.Function0[ReactType[_]] | String | Element = null,
    style: StyleProp[ViewStyle] = null,
    styles: AnonArrowV = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: `false` | Element | js.Array[Element] = null
  ): UnmountedWithRoot[ListProps, typingsJapgolly.antdMobileRn.mod.List, Unit, ListProps] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.listIndexNativeMod.ListProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antdMobileRn.mod.List](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.listIndexNativeMod.ListProps])
  }
  @JSImport("antd-mobile-rn", "List")
  @js.native
  object componentImport extends js.Object
  
}

