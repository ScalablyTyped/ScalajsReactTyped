package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.stepsMod.StepsProps
import typingsJapgolly.antdMobile.stepsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps {
  def apply(
    current: Int | Double = null,
    direction: String = null,
    iconPrefix: String = null,
    labelPlacement: String = null,
    prefixCls: String = null,
    size: String = null,
    status: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[_]
  ): UnmountedWithRoot[StepsProps, default, Unit, StepsProps] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (iconPrefix != null) __obj.updateDynamic("iconPrefix")(iconPrefix.asInstanceOf[js.Any])
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.stepsMod.StepsProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antdMobile.stepsMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.stepsMod.StepsProps])
  }
  @JSImport("antd-mobile/lib/steps", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

