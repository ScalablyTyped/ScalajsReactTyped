package typingsJapgolly.rcMentions.keywordTriggerMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcMentions.mentionsMod.Placement
import typingsJapgolly.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeywordTriggerProps extends js.Object {
  var children: js.UndefOr[Element] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function0[HTMLElement]] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var options: js.Array[OptionProps]
  var placement: js.UndefOr[Placement] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object KeywordTriggerProps {
  @scala.inline
  def apply(
    options: js.Array[OptionProps],
    children: VdomElement = null,
    getPopupContainer: js.UndefOr[CallbackTo[HTMLElement]] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    placement: Placement = null,
    prefixCls: String = null,
    transitionName: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): KeywordTriggerProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    getPopupContainer.foreach(p => __obj.updateDynamic("getPopupContainer")(p.toJsFn))
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordTriggerProps]
  }
}

