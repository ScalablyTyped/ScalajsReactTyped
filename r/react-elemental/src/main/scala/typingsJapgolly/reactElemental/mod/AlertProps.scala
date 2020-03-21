package typingsJapgolly.reactElemental.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertProps extends js.Object {
  val dismissible: js.UndefOr[Boolean] = js.undefined
  val message: String | Element
  val onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  val size: js.UndefOr[AlertSize] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val title: String
  val `type`: js.UndefOr[AlertType] = js.undefined
}

object AlertProps {
  @scala.inline
  def apply(
    message: String | Element,
    title: String,
    dismissible: js.UndefOr[Boolean] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    size: AlertSize = null,
    style: CSSProperties = null,
    `type`: AlertType = null
  ): AlertProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissible)) __obj.updateDynamic("dismissible")(dismissible.asInstanceOf[js.Any])
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertProps]
  }
}

