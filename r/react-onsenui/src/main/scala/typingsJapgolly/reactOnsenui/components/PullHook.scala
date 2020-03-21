package typingsJapgolly.reactOnsenui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameFixedContent
import typingsJapgolly.reactOnsenui.mod.PullHookChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PullHook {
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fixedContent: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    id: String = null,
    onChange: /* e */ PullHookChangeEvent => Callback = null,
    onLoad: /* done */ js.Function0[Unit] => Callback = null,
    onPull: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null,
    thresholdHeight: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HTMLAttributesidclassNameFixedContent, 
    typingsJapgolly.reactOnsenui.mod.PullHook, 
    Unit, 
    HTMLAttributesidclassNameFixedContent
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedContent)) __obj.updateDynamic("fixedContent")(fixedContent.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactOnsenui.mod.PullHookChangeEvent) => onChange(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* done */ js.Function0[scala.Unit]) => onLoad(t0).runNow()))
    onPull.foreach(p => __obj.updateDynamic("onPull")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thresholdHeight != null) __obj.updateDynamic("thresholdHeight")(thresholdHeight.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameFixedContent, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactOnsenui.mod.PullHook](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactOnsenui.HTMLAttributesidclassNameFixedContent])(children: _*)
  }
  @JSImport("react-onsenui", "PullHook")
  @js.native
  object componentImport extends js.Object
  
}

