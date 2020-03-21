package typingsJapgolly.baseui

import typingsJapgolly.baseui.baseuiStrings.bottom
import typingsJapgolly.baseui.baseuiStrings.bottomLeft
import typingsJapgolly.baseui.baseuiStrings.bottomRight
import typingsJapgolly.baseui.baseuiStrings.top
import typingsJapgolly.baseui.baseuiStrings.topLeft
import typingsJapgolly.baseui.baseuiStrings.topRight
import typingsJapgolly.baseui.toastMod.ToasterOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<baseui.baseui/toast.ToasterProps> */
trait ReadonlyToasterProps extends js.Object {
  val autoHideDuration: js.UndefOr[Double] = js.undefined
  val overrides: js.UndefOr[ToasterOverrides] = js.undefined
  val placement: js.UndefOr[topLeft | topRight | bottomLeft | bottomRight | bottom | top] = js.undefined
  val usePortal: js.UndefOr[Boolean] = js.undefined
}

object ReadonlyToasterProps {
  @scala.inline
  def apply(
    autoHideDuration: Int | Double = null,
    overrides: ToasterOverrides = null,
    placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top = null,
    usePortal: js.UndefOr[Boolean] = js.undefined
  ): ReadonlyToasterProps = {
    val __obj = js.Dynamic.literal()
    if (autoHideDuration != null) __obj.updateDynamic("autoHideDuration")(autoHideDuration.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyToasterProps]
  }
}

