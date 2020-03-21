package typingsJapgolly.reactTruncate.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactTruncate.reactTruncateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TruncateProps
  extends AllHTMLAttributes[Truncate]
     with ClassAttributes[Truncate] {
  var ellipsis: js.UndefOr[Node] = js.undefined
  var lines: js.UndefOr[Double | `false`] = js.undefined
  var onTruncate: js.UndefOr[js.Function1[/* isTruncated */ Boolean, Unit]] = js.undefined
  var trimWhitespace: js.UndefOr[Boolean] = js.undefined
}

object TruncateProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Truncate] = null,
    ClassAttributes: ClassAttributes[Truncate] = null,
    ellipsis: VdomNode = null,
    lines: Double | `false` = null,
    onTruncate: /* isTruncated */ Boolean => Callback = null,
    trimWhitespace: js.UndefOr[Boolean] = js.undefined
  ): TruncateProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (ellipsis != null) __obj.updateDynamic("ellipsis")(ellipsis.rawNode.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (onTruncate != null) __obj.updateDynamic("onTruncate")(js.Any.fromFunction1((t0: /* isTruncated */ scala.Boolean) => onTruncate(t0).runNow()))
    if (!js.isUndefined(trimWhitespace)) __obj.updateDynamic("trimWhitespace")(trimWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateProps]
  }
}

