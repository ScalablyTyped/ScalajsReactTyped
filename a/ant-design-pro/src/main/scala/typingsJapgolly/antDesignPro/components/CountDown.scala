package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.countDownMod.ICountDownProps
import typingsJapgolly.antDesignPro.countDownMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CountDown {
  def apply(
    target: js.Date | Double,
    format: /* time */ Double => Callback = null,
    onEnd: js.UndefOr[Callback] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ICountDownProps, default, Unit, ICountDownProps] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
  
      if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1((t0: /* time */ scala.Double) => format(t0).runNow()))
    onEnd.foreach(p => __obj.updateDynamic("onEnd")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.countDownMod.ICountDownProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignPro.countDownMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.countDownMod.ICountDownProps])(children: _*)
  }
  @JSImport("ant-design-pro/lib/CountDown", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

