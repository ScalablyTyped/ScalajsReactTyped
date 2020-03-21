package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.AnonText
import typingsJapgolly.reactLazylog.lineContentMod.LineContentProps
import typingsJapgolly.reactLazylog.lineContentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LineContent {
  def apply(
    data: js.Array[AnonText],
    number: Double,
    formatPart: /* text */ String => CallbackTo[Node] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LineContentProps, default, Unit, LineContentProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
  
      if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => formatPart(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLazylog.lineContentMod.LineContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLazylog.lineContentMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLazylog.lineContentMod.LineContentProps])(children: _*)
  }
  @JSImport("react-lazylog/build/LineContent", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

