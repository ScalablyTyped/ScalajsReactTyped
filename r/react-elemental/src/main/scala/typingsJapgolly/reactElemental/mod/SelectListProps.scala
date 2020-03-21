package typingsJapgolly.reactElemental.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactElemental.AnonLabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectListProps extends js.Object {
  val error: js.UndefOr[String] = js.undefined
  val height: js.UndefOr[Double] = js.undefined
  val onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  val options: js.UndefOr[js.Array[AnonLabel]] = js.undefined
  val placeholder: js.UndefOr[String] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
  val width: js.UndefOr[Double | String] = js.undefined
}

object SelectListProps {
  @scala.inline
  def apply(
    error: String = null,
    height: Int | Double = null,
    onChange: /* value */ String => Callback = null,
    options: js.Array[AnonLabel] = null,
    placeholder: String = null,
    style: CSSProperties = null,
    width: Double | String = null
  ): SelectListProps = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectListProps]
  }
}

