package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenProps
  extends AllHTMLAttributes[div]
     with ClassAttributes[div] {
  var active: js.UndefOr[Boolean] = js.undefined
  var onRemove: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object TokenProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[div] = null,
    ClassAttributes: ClassAttributes[div] = null,
    active: js.UndefOr[Boolean] = js.undefined,
    onRemove: js.UndefOr[Callback] = js.undefined
  ): TokenProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    onRemove.foreach(p => __obj.updateDynamic("onRemove")(p.toJsFn))
    __obj.asInstanceOf[TokenProps]
  }
}

