package typingsJapgolly.reactTypist.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactTypist.mod.Typist.CurrentTextProps
import typingsJapgolly.reactTypist.mod.Typist.CursorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypistProps extends js.Object {
  var avgTypingDelay: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[CursorProps] = js.undefined
  var delayGenerator: js.UndefOr[
    js.Function3[/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps, Double]
  ] = js.undefined
  var onCharacterTyped: js.UndefOr[js.Function2[/* char */ String, /* charIndex */ Double, Unit]] = js.undefined
  var onLineTyped: js.UndefOr[js.Function2[/* line */ String, /* lineIndex */ Double, Unit]] = js.undefined
  var onTypingDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  var startDelay: js.UndefOr[Double] = js.undefined
  var stdTypingDelay: js.UndefOr[Double] = js.undefined
}

object TypistProps {
  @scala.inline
  def apply(
    avgTypingDelay: Int | Double = null,
    className: String = null,
    cursor: CursorProps = null,
    delayGenerator: (/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps) => CallbackTo[Double] = null,
    onCharacterTyped: (/* char */ String, /* charIndex */ Double) => Callback = null,
    onLineTyped: (/* line */ String, /* lineIndex */ Double) => Callback = null,
    onTypingDone: js.UndefOr[Callback] = js.undefined,
    startDelay: Int | Double = null,
    stdTypingDelay: Int | Double = null
  ): TypistProps = {
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
    __obj.asInstanceOf[TypistProps]
  }
}

