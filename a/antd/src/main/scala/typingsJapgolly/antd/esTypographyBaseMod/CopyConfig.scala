package typingsJapgolly.antd.esTypographyBaseMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyConfig extends js.Object {
  var onCopy: js.UndefOr[js.Function0[Unit]] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object CopyConfig {
  @scala.inline
  def apply(onCopy: js.UndefOr[Callback] = js.undefined, text: String = null): CopyConfig = {
    val __obj = js.Dynamic.literal()
    onCopy.foreach(p => __obj.updateDynamic("onCopy")(p.toJsFn))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyConfig]
  }
}

