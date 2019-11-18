package typingsJapgolly.materialDashUi.__MaterialUI.Card

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardTitleProps extends js.Object {
  var actAsExpander: js.UndefOr[Boolean] = js.undefined
  var expandable: js.UndefOr[Boolean] = js.undefined
  var showExpandableButton: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subtitle: js.UndefOr[Node] = js.undefined
  var subtitleColor: js.UndefOr[String] = js.undefined
  var subtitleStyle: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
  var titleColor: js.UndefOr[String] = js.undefined
  var titleStyle: js.UndefOr[CSSProperties] = js.undefined
}

object CardTitleProps {
  @scala.inline
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    expandable: js.UndefOr[Boolean] = js.undefined,
    showExpandableButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    subtitle: VdomNode = null,
    subtitleColor: String = null,
    subtitleStyle: CSSProperties = null,
    title: VdomNode = null,
    titleColor: String = null,
    titleStyle: CSSProperties = null
  ): CardTitleProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.rawNode.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor.asInstanceOf[js.Any])
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardTitleProps]
  }
}

