package typingsJapgolly.reactMdForm

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdForm.typesToggleAsyncSwitchMod.AsyncSwitchProps
import typingsJapgolly.reactMdForm.typesToggleCheckboxMod.CheckboxProps
import typingsJapgolly.reactMdForm.typesToggleInputToggleIconMod.InputToggleIconProps
import typingsJapgolly.reactMdForm.typesToggleInputToggleMod.Props
import typingsJapgolly.reactMdForm.typesToggleRadioMod.RadioProps
import typingsJapgolly.reactMdForm.typesToggleSwitchMod.SwitchProps
import typingsJapgolly.reactMdForm.typesToggleSwitchTrackMod.SwitchTrackProps
import typingsJapgolly.reactMdForm.typesToggleToggleContainerMod.ToggleContainerProps
import typingsJapgolly.reactMdForm.typesToggleUseCheckedMod.ChangeEventHandler
import typingsJapgolly.reactMdForm.typesToggleUseCheckedMod.SetChecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesToggleMod {
  
  @JSImport("@react-md/form/types/toggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/form/types/toggle", "AsyncSwitch")
  @js.native
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Checkbox")
  @js.native
  val Checkbox: ForwardRefExoticComponent[CheckboxProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "InputToggle")
  @js.native
  val InputToggle: ForwardRefExoticComponent[Props & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "InputToggleIcon")
  @js.native
  val InputToggleIcon: ForwardRefExoticComponent[InputToggleIconProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Radio")
  @js.native
  val Radio: ForwardRefExoticComponent[RadioProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Switch")
  @js.native
  val Switch: ForwardRefExoticComponent[SwitchProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "SwitchTrack")
  @js.native
  val SwitchTrack: ForwardRefExoticComponent[SwitchTrackProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "ToggleContainer")
  @js.native
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
}
