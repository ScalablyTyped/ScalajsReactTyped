package typingsJapgolly.reactTypist.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTypist.mod.Typist.CurrentTextProps
import typingsJapgolly.reactTypist.mod.Typist.CursorProps
import typingsJapgolly.reactTypist.mod.TypistProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TypistProps1272862686[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    avgTypingDelay: Int | Double = null,
    className: String = null,
    cursor: CursorProps = null,
    delayGenerator: (/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps) => CallbackTo[Double] = null,
    onCharacterTyped: (/* char */ String, /* charIndex */ Double) => Callback = null,
    onLineTyped: (/* line */ String, /* lineIndex */ Double) => Callback = null,
    onTypingDone: js.UndefOr[Callback] = js.undefined,
    startDelay: Int | Double = null,
    stdTypingDelay: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TypistProps, ComponentRef, Unit, TypistProps] = {
    val __obj = js.Dynamic.literal()
  
      if (avgTypingDelay != null) __obj.updateDynamic("avgTypingDelay")(avgTypingDelay.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (delayGenerator != null) __obj.updateDynamic("delayGenerator")(js.Any.fromFunction3((t0: /* mean */ scala.Double, t1: /* std */ scala.Double, t2: /* current */ typingsJapgolly.reactTypist.mod.Typist.CurrentTextProps) => delayGenerator(t0, t1, t2).runNow()))
    if (onCharacterTyped != null) __obj.updateDynamic("onCharacterTyped")(js.Any.fromFunction2((t0: /* char */ java.lang.String, t1: /* charIndex */ scala.Double) => onCharacterTyped(t0, t1).runNow()))
    if (onLineTyped != null) __obj.updateDynamic("onLineTyped")(js.Any.fromFunction2((t0: /* line */ java.lang.String, t1: /* lineIndex */ scala.Double) => onLineTyped(t0, t1).runNow()))
    onTypingDone.foreach(p => __obj.updateDynamic("onTypingDone")(p.toJsFn))
    if (startDelay != null) __obj.updateDynamic("startDelay")(startDelay.asInstanceOf[js.Any])
    if (stdTypingDelay != null) __obj.updateDynamic("stdTypingDelay")(stdTypingDelay.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTypist.mod.TypistProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTypist.mod.TypistProps])(children: _*)
  }
}

