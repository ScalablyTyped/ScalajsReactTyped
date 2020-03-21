package typingsJapgolly.reactStickyBox.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactStickyBox.mod.StickyBoxMode
import typingsJapgolly.reactStickyBox.mod.StickyBoxProps
import typingsJapgolly.reactStickyBox.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactStickyBox {
  def apply(
    bottom: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    offsetBottom: Int | Double = null,
    offsetTop: Int | Double = null,
    onChangeMode: (/* oldMode */ js.UndefOr[StickyBoxMode], /* newMode */ StickyBoxMode) => CallbackTo[js.Any] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StickyBoxProps, default, Unit, StickyBoxProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChangeMode != null) __obj.updateDynamic("onChangeMode")(js.Any.fromFunction2((t0: /* oldMode */ js.UndefOr[typingsJapgolly.reactStickyBox.mod.StickyBoxMode], t1: /* newMode */ typingsJapgolly.reactStickyBox.mod.StickyBoxMode) => onChangeMode(t0, t1).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactStickyBox.mod.StickyBoxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactStickyBox.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactStickyBox.mod.StickyBoxProps])(children: _*)
  }
  @JSImport("react-sticky-box", "default")
  @js.native
  object componentImport extends js.Object
  
}

