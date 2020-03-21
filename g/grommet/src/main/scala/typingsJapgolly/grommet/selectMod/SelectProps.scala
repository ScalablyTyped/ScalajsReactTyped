package typingsJapgolly.grommet.selectMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.grommet.AnonLeft
import typingsJapgolly.grommet.AnonMultiple
import typingsJapgolly.grommet.dropMod.DropProps
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.utilsMod.A11yTitleType
import typingsJapgolly.grommet.utilsMod.AlignSelfType
import typingsJapgolly.grommet.utilsMod.GridAreaType
import typingsJapgolly.grommet.utilsMod.MarginType
import typingsJapgolly.grommet.utilsMod.PlaceHolderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  var children: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var closeOnChange: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean | (js.Array[Double | String | js.Object])] = js.undefined
  var disabledKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var dropAlign: js.UndefOr[AnonLeft] = js.undefined
  var dropHeight: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
  var dropProps: js.UndefOr[DropProps] = js.undefined
  var dropTarget: js.UndefOr[js.Object] = js.undefined
  var emptySearchMessage: js.UndefOr[String] = js.undefined
  var focusIndicator: js.UndefOr[Boolean] = js.undefined
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  var icon: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, _]) | Node] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var labelKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var margin: js.UndefOr[MarginType] = js.undefined
  var messages: js.UndefOr[AnonMultiple] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onMore: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onOpen: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* search */ String, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var options: js.Array[String | Boolean | Double | Element | js.Object]
  var placeholder: js.UndefOr[PlaceHolderType] = js.undefined
  var plain: js.UndefOr[Boolean] = js.undefined
  var replace: js.UndefOr[Boolean] = js.undefined
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
  var value: js.UndefOr[String | Element | js.Object | (js.Array[String | js.Object])] = js.undefined
  var valueKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  var valueLabel: js.UndefOr[Node] = js.undefined
}

object SelectProps {
  @scala.inline
  def apply(
    options: js.Array[String | Boolean | Double | Element | js.Object],
    a11yTitle: A11yTitleType = null,
    alignSelf: AlignSelfType = null,
    children: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    closeOnChange: js.UndefOr[Boolean] = js.undefined,
    disabled: Boolean | (js.Array[Double | String | js.Object]) = null,
    disabledKey: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    dropAlign: AnonLeft = null,
    dropHeight: xsmall | small | medium | large | xlarge | String = null,
    dropProps: DropProps = null,
    dropTarget: js.Object = null,
    emptySearchMessage: String = null,
    focusIndicator: js.UndefOr[Boolean] = js.undefined,
    gridArea: GridAreaType = null,
    icon: Boolean | (js.Function1[/* repeated */ js.Any, _]) | Node = null,
    id: String = null,
    labelKey: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    margin: MarginType = null,
    messages: AnonMultiple = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* repeated */ js.Any => Callback = null,
    onClose: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onMore: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onOpen: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    onSearch: /* search */ String => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: PlaceHolderType = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Boolean] = js.undefined,
    searchPlaceholder: String = null,
    selected: Double | js.Array[Double] = null,
    size: small | medium | large | xlarge | String = null,
    value: String | Element | js.Object | (js.Array[String | js.Object]) = null,
    valueKey: String | (js.Function1[/* repeated */ js.Any, _]) = null,
    valueLabel: VdomNode = null
  ): SelectProps = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (a11yTitle != null) __obj.updateDynamic("a11yTitle")(a11yTitle.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => children(t0).runNow()))
    if (!js.isUndefined(closeOnChange)) __obj.updateDynamic("closeOnChange")(closeOnChange.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (disabledKey != null) __obj.updateDynamic("disabledKey")(disabledKey.asInstanceOf[js.Any])
    if (dropAlign != null) __obj.updateDynamic("dropAlign")(dropAlign.asInstanceOf[js.Any])
    if (dropHeight != null) __obj.updateDynamic("dropHeight")(dropHeight.asInstanceOf[js.Any])
    if (dropProps != null) __obj.updateDynamic("dropProps")(dropProps.asInstanceOf[js.Any])
    if (dropTarget != null) __obj.updateDynamic("dropTarget")(dropTarget.asInstanceOf[js.Any])
    if (emptySearchMessage != null) __obj.updateDynamic("emptySearchMessage")(emptySearchMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(focusIndicator)) __obj.updateDynamic("focusIndicator")(focusIndicator.asInstanceOf[js.Any])
    if (gridArea != null) __obj.updateDynamic("gridArea")(gridArea.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onChange(t0).runNow()))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onClose(t0).runNow()))
    if (onMore != null) __obj.updateDynamic("onMore")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onMore(t0).runNow()))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onOpen(t0).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1((t0: /* search */ java.lang.String) => onSearch(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (valueLabel != null) __obj.updateDynamic("valueLabel")(valueLabel.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectProps]
  }
}

