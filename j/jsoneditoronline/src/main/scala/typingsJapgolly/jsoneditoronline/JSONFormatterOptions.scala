package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONFormatterOptions extends js.Object {
  var change: js.UndefOr[js.Function0[Unit]] = js.undefined
  var indentation: js.UndefOr[Double] = js.undefined
}

object JSONFormatterOptions {
  @scala.inline
  def apply(change: js.UndefOr[Callback] = js.undefined, indentation: Int | Double = null): JSONFormatterOptions = {
    val __obj = js.Dynamic.literal()
    change.foreach(p => __obj.updateDynamic("change")(p.toJsFn))
    if (indentation != null) __obj.updateDynamic("indentation")(indentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONFormatterOptions]
  }
}

