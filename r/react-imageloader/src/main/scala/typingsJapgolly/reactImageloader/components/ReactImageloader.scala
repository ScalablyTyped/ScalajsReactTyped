package typingsJapgolly.reactImageloader.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactImageloader.mod.ImageLoaderProps
import typingsJapgolly.reactImageloader.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImageloader {
  def apply(
    src: String,
    className: String = null,
    imgProps: js.Any = null,
    onError: /* event */ js.Any => Callback = null,
    onLoad: /* event */ js.Any => Callback = null,
    preloader: /* params */ js.Any => CallbackTo[Element] = null,
    style: CSSProperties = null,
    wrapper: /* props */ js.Any => CallbackTo[Element] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ImageLoaderProps, ^, Unit, ImageLoaderProps] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (imgProps != null) __obj.updateDynamic("imgProps")(imgProps.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* event */ js.Any) => onError(t0).runNow()))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1((t0: /* event */ js.Any) => onLoad(t0).runNow()))
    if (preloader != null) __obj.updateDynamic("preloader")(js.Any.fromFunction1((t0: /* params */ js.Any) => preloader(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(js.Any.fromFunction1((t0: /* props */ js.Any) => wrapper(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactImageloader.mod.ImageLoaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactImageloader.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactImageloader.mod.ImageLoaderProps])(children: _*)
  }
  @JSImport("react-imageloader", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

