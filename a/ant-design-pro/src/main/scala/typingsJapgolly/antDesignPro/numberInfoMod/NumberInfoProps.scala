package typingsJapgolly.antDesignPro.numberInfoMod

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antDesignPro.antDesignProStrings.down
import typingsJapgolly.antDesignPro.antDesignProStrings.up
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberInfoProps extends js.Object {
  var gap: js.UndefOr[Double] = js.undefined
  var status: js.UndefOr[up | down] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subTitle: js.UndefOr[Node | String] = js.undefined
  var subTotal: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[Node | String] = js.undefined
  var total: js.UndefOr[Node | String] = js.undefined
}

object NumberInfoProps {
  @scala.inline
  def apply(
    gap: Int | Double = null,
    status: up | down = null,
    style: CSSProperties = null,
    subTitle: Node | String = null,
    subTotal: Int | Double = null,
    suffix: String = null,
    theme: String = null,
    title: Node | String = null,
    total: Node | String = null
  ): NumberInfoProps = {
    val __obj = js.Dynamic.literal()
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subTitle != null) __obj.updateDynamic("subTitle")(subTitle.asInstanceOf[js.Any])
    if (subTotal != null) __obj.updateDynamic("subTotal")(subTotal.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberInfoProps]
  }
}

