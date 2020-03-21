package typingsJapgolly.antdMobileRn.indexNativeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobileRn.indexDotnativeMod.AccordionStyle
import typingsJapgolly.antdMobileRn.propsTypeMod.AccordionPropsTypes
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionNativeProps extends AccordionPropsTypes {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[AccordionStyle] = js.undefined
}

object AccordionNativeProps {
  @scala.inline
  def apply(
    activeKey: String | js.Array[String] = null,
    defaultActiveKey: String | js.Array[String] = null,
    onChange: /* x */ js.Any => Callback = null,
    style: StyleProp[ViewStyle] = null,
    styles: AccordionStyle = null
  ): AccordionNativeProps = {
    val __obj = js.Dynamic.literal()
    if (activeKey != null) __obj.updateDynamic("activeKey")(activeKey.asInstanceOf[js.Any])
    if (defaultActiveKey != null) __obj.updateDynamic("defaultActiveKey")(defaultActiveKey.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* x */ js.Any) => onChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionNativeProps]
  }
}

