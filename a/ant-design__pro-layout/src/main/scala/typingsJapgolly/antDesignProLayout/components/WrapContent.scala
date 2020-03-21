package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignProLayout.AnonClassName
import typingsJapgolly.antDesignProLayout.wrapContentMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WrapContent {
  def apply(
    className: String = null,
    isChildrenLayout: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonClassName, default, Unit, AnonClassName] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isChildrenLayout)) __obj.updateDynamic("isChildrenLayout")(isChildrenLayout.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignProLayout.AnonClassName, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignProLayout.wrapContentMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignProLayout.AnonClassName])(children: _*)
  }
  @JSImport("@ant-design/pro-layout/lib/WrapContent", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

