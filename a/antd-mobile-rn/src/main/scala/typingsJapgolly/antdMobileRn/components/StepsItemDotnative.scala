package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.stepsItemNativeMod.StepsItemProps
import typingsJapgolly.antdMobileRn.stepsItemNativeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StepsItemDotnative {
  def apply(
    current: Int | Double = null,
    description: String = null,
    direction: String = null,
    errorTail: Int | Double = null,
    icon: String = null,
    index: Int | Double = null,
    last: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    status: String = null,
    styles: js.Any = null,
    title: String = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StepsItemProps, default, Unit, StepsItemProps] = {
    val __obj = js.Dynamic.literal()
  
      if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (errorTail != null) __obj.updateDynamic("errorTail")(errorTail.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.stepsItemNativeMod.StepsItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.stepsItemNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.stepsItemNativeMod.StepsItemProps])(children: _*)
  }
  @JSImport("antd-mobile-rn/lib/steps/StepsItem.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

