package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonExpanded
import typingsJapgolly.baseui.SharedPropsexpandednever
import typingsJapgolly.baseui.accordionMod.AccordionOverrides
import typingsJapgolly.baseui.accordionMod.AccordionProps
import typingsJapgolly.baseui.accordionMod.AccordionState
import typingsJapgolly.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Accordion {
  def apply(
    accordion: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    initialState: AccordionState = null,
    onChange: /* args */ AnonExpanded => CallbackTo[js.Any] = null,
    overrides: AccordionOverrides[SharedPropsexpandednever] = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    renderPanelContent: js.UndefOr[Boolean] = js.undefined,
    stateReducer: (expand, AccordionState, AccordionState) => CallbackTo[AccordionState] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AccordionProps, typingsJapgolly.baseui.accordionMod.Accordion, Unit, AccordionProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(accordion)) __obj.updateDynamic("accordion")(accordion.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonExpanded) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(renderPanelContent)) __obj.updateDynamic("renderPanelContent")(renderPanelContent.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.expand, t1: typingsJapgolly.baseui.accordionMod.AccordionState, t2: typingsJapgolly.baseui.accordionMod.AccordionState) => stateReducer(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.accordionMod.AccordionProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.accordionMod.Accordion](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.accordionMod.AccordionProps])(children: _*)
  }
  @JSImport("baseui/accordion", "Accordion")
  @js.native
  object componentImport extends js.Object
  
}

