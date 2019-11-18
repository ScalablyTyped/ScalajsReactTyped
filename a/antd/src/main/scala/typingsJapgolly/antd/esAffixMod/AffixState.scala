package typingsJapgolly.antd.esAffixMod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffixState extends js.Object {
  var affixStyle: js.UndefOr[CSSProperties] = js.undefined
  var lastAffix: Boolean
  var placeholderStyle: js.UndefOr[CSSProperties] = js.undefined
  var prevTarget: Window | HTMLElement | Null
  var status: AffixStatus
}

object AffixState {
  @scala.inline
  def apply(
    lastAffix: Boolean,
    status: AffixStatus,
    affixStyle: CSSProperties = null,
    placeholderStyle: CSSProperties = null,
    prevTarget: Window | HTMLElement = null
  ): AffixState = {
    val __obj = js.Dynamic.literal(lastAffix = lastAffix.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (affixStyle != null) __obj.updateDynamic("affixStyle")(affixStyle.asInstanceOf[js.Any])
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    if (prevTarget != null) __obj.updateDynamic("prevTarget")(prevTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[AffixState]
  }
}

