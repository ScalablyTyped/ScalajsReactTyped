package typingsJapgolly.reactLazylog.lineContentMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactLazylog.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineContentProps extends js.Object {
  var data: js.Array[AnonText]
  var formatPart: js.UndefOr[js.Function1[/* text */ String, Node]] = js.undefined
  var number: Double
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LineContentProps {
  @scala.inline
  def apply(
    data: js.Array[AnonText],
    number: Double,
    formatPart: /* text */ String => CallbackTo[Node] = null,
    style: CSSProperties = null
  ): LineContentProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => formatPart(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineContentProps]
  }
}

