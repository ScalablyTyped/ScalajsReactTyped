package typingsJapgolly.reactLazylog.linePartMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinePartProps extends js.Object {
  var format: js.UndefOr[js.Function1[/* text */ String, Node]] = js.undefined
  var part: AnonText
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LinePartProps {
  @scala.inline
  def apply(part: AnonText, format: /* text */ String => CallbackTo[Node] = null, style: CSSProperties = null): LinePartProps = {
    val __obj = js.Dynamic.literal(part = part.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => format(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinePartProps]
  }
}

