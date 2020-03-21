package typingsJapgolly.reactLazylog

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-lazylog.react-lazylog/build/LineContent.LineContentProps> */
trait PartialLineContentProps extends js.Object {
  var data: js.UndefOr[js.Array[AnonText]] = js.undefined
  var formatPart: js.UndefOr[js.Function1[/* text */ String, Node]] = js.undefined
  var number: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialLineContentProps {
  @scala.inline
  def apply(
    data: js.Array[AnonText] = null,
    formatPart: /* text */ String => CallbackTo[Node] = null,
    number: Int | Double = null,
    style: CSSProperties = null
  ): PartialLineContentProps = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => formatPart(t0).runNow()))
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLineContentProps]
  }
}

