package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonExpandedBoolean
import typingsJapgolly.baseui.accordionMod.PanelState
import typingsJapgolly.baseui.accordionMod.StatefulPanelContainerProps
import typingsJapgolly.baseui.baseuiStrings.expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StatefulPanelContainer {
  def apply(
    initialState: PanelState = null,
    onChange: /* args */ AnonExpandedBoolean => CallbackTo[js.Any] = null,
    stateReducer: (expand, PanelState, PanelState) => CallbackTo[PanelState] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    StatefulPanelContainerProps, 
    typingsJapgolly.baseui.accordionMod.StatefulPanelContainer, 
    Unit, 
    StatefulPanelContainerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.AnonExpandedBoolean) => onChange(t0).runNow()))
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3((t0: typingsJapgolly.baseui.baseuiStrings.expand, t1: typingsJapgolly.baseui.accordionMod.PanelState, t2: typingsJapgolly.baseui.accordionMod.PanelState) => stateReducer(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.accordionMod.StatefulPanelContainerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.accordionMod.StatefulPanelContainer](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.accordionMod.StatefulPanelContainerProps])(children: _*)
  }
  @JSImport("baseui/accordion", "StatefulPanelContainer")
  @js.native
  object componentImport extends js.Object
  
}

