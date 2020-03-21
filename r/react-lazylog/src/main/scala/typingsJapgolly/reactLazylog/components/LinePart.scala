package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.AnonText
import typingsJapgolly.reactLazylog.linePartMod.LinePartProps
import typingsJapgolly.reactLazylog.linePartMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LinePart {
  def apply(
    part: AnonText,
    format: /* text */ String => CallbackTo[Node] = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LinePartProps, default, Unit, LinePartProps] = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
  
      if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => format(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLazylog.linePartMod.LinePartProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLazylog.linePartMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLazylog.linePartMod.LinePartProps])(children: _*)
  }
  @JSImport("react-lazylog/build/LinePart", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

