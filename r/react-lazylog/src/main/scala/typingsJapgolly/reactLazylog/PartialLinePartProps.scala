package typingsJapgolly.reactLazylog

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-lazylog.react-lazylog/build/LinePart.LinePartProps> */
trait PartialLinePartProps extends js.Object {
  var format: js.UndefOr[js.Function1[/* text */ String, Node]] = js.undefined
  var part: js.UndefOr[AnonText] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PartialLinePartProps {
  @scala.inline
  def apply(
    format: /* text */ String => CallbackTo[Node] = null,
    part: AnonText = null,
    style: CSSProperties = null
  ): PartialLinePartProps = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => format(t0).runNow()))
    if (part != null) __obj.updateDynamic("part")(part.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLinePartProps]
  }
}

