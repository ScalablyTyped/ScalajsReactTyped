package typingsJapgolly.baseui.accordionMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.AnonExpanded
import typingsJapgolly.baseui.SharedPropsexpandednever
import typingsJapgolly.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionProps extends js.Object {
  var accordion: js.UndefOr[Boolean] = js.undefined
  var children: Node
  var disabled: js.UndefOr[Boolean] = js.undefined
  var initialState: js.UndefOr[AccordionState] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ AnonExpanded, _]] = js.undefined
  var overrides: js.UndefOr[AccordionOverrides[SharedPropsexpandednever]] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var renderPanelContent: js.UndefOr[Boolean] = js.undefined
  var stateReducer: js.UndefOr[StateReducer[AccordionState]] = js.undefined
}

object AccordionProps {
  @scala.inline
  def apply(
    accordion: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: AccordionState = null,
    onChange: /* args */ AnonExpanded => CallbackTo[js.Any] = null,
    overrides: AccordionOverrides[SharedPropsexpandednever] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderPanelContent: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (expand, AccordionState, AccordionState) => CallbackTo[AccordionState] = null
  ): AccordionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonExpanded) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPanelContent)) __obj.updateDynamic("renderPanelContent")(renderPanelContent.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.expand, t1: typingsJapgolly.baseui.accordionMod.AccordionState, t2: typingsJapgolly.baseui.accordionMod.AccordionState) => stateReducer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AccordionProps]
  }
}

