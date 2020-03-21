package typingsJapgolly.reactLazylog.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLAnchorElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.lineNumberMod.LineNumberProps
import typingsJapgolly.reactLazylog.lineNumberMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LineNumber {
  def apply(
    number: Double,
    highlight: js.UndefOr[Boolean] = js.undefined,
    onClick: ReactMouseEventFrom[HTMLAnchorElement] => Callback = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[LineNumberProps, default, Unit, LineNumberProps] = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
  
      if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLAnchorElement]) => onClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactLazylog.lineNumberMod.LineNumberProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactLazylog.lineNumberMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactLazylog.lineNumberMod.LineNumberProps])(children: _*)
  }
  @JSImport("react-lazylog/build/LineNumber", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

