package typingsJapgolly.reactCountup.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactCountup.AnonPauseResume
import typingsJapgolly.reactCountup.AnonPauseResumeReset
import typingsJapgolly.reactCountup.AnonReset
import typingsJapgolly.reactCountup.AnonStart
import typingsJapgolly.reactCountup.AnonUpdate
import typingsJapgolly.reactCountup.mod.Props
import typingsJapgolly.reactCountup.mod.RenderProps
import typingsJapgolly.reactCountup.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactCountup {
  def apply(
    className: String = null,
    decimal: String = null,
    decimals: Int | Double = null,
    delay: Int | Double = null,
    duration: Int | Double = null,
    easingFn: (/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double) => Callback = null,
    end: Int | Double = null,
    formattingFn: /* value */ Double => CallbackTo[String] = null,
    onComplete: js.UndefOr[Callback] = js.undefined,
    onEnd: /* providedFn */ AnonPauseResume => Callback = null,
    onPauseResume: js.UndefOr[CallbackTo[js.Function1[/* providedFn */ AnonStart, Unit]]] = js.undefined,
    onReset: js.UndefOr[CallbackTo[js.Function1[/* providedFn */ AnonUpdate, Unit]]] = js.undefined,
    onStart: /* providedFn */ AnonReset => Callback = null,
    onUpdate: /* providedFn */ AnonPauseResumeReset => Callback = null,
    prefix: String = null,
    redraw: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    start: Int | Double = null,
    style: CSSProperties = null,
    suffix: String = null,
    useEasing: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* data */ RenderProps => CallbackTo[Element] = null
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.reactCountup.mod.RenderProps) => children(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easingFn != null) __obj.updateDynamic("easingFn")(js.Any.fromFunction4((t0: /* t */ scala.Double, t1: /* b */ scala.Double, t2: /* c */ scala.Double, t3: /* d */ scala.Double) => easingFn(t0, t1, t2, t3).runNow()))
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (formattingFn != null) __obj.updateDynamic("formattingFn")(js.Any.fromFunction1((t0: /* value */ scala.Double) => formattingFn(t0).runNow()))
    onComplete.foreach(p => __obj.updateDynamic("onComplete")(p.toJsFn))
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1((t0: /* providedFn */ typingsJapgolly.reactCountup.AnonPauseResume) => onEnd(t0).runNow()))
    onPauseResume.foreach(p => __obj.updateDynamic("onPauseResume")(p.toJsFn))
    onReset.foreach(p => __obj.updateDynamic("onReset")(p.toJsFn))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1((t0: /* providedFn */ typingsJapgolly.reactCountup.AnonReset) => onStart(t0).runNow()))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1((t0: /* providedFn */ typingsJapgolly.reactCountup.AnonPauseResumeReset) => onUpdate(t0).runNow()))
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(redraw)) __obj.updateDynamic("redraw")(redraw.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (!js.isUndefined(useEasing)) __obj.updateDynamic("useEasing")(useEasing.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactCountup.mod.Props, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactCountup.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactCountup.mod.Props])
  }
  @JSImport("react-countup", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

