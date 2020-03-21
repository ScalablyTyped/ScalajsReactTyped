package typingsJapgolly.semanticUiReact.formFormMod

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.semanticUiReact.formButtonMod.FormButtonProps
import typingsJapgolly.semanticUiReact.formCheckboxMod.FormCheckboxProps
import typingsJapgolly.semanticUiReact.formDropdownMod.FormDropdownProps
import typingsJapgolly.semanticUiReact.formFieldMod.FormFieldProps
import typingsJapgolly.semanticUiReact.formGroupMod.FormGroupProps
import typingsJapgolly.semanticUiReact.formInputMod.FormInputProps
import typingsJapgolly.semanticUiReact.formRadioMod.FormRadioProps
import typingsJapgolly.semanticUiReact.formSelectMod.FormSelectProps
import typingsJapgolly.semanticUiReact.formTextAreaMod.FormTextAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormComponent extends FunctionComponent[FormProps] {
  var Button: StatelessComponent[FormButtonProps] = js.native
  var Checkbox: StatelessComponent[FormCheckboxProps] = js.native
  var Dropdown: StatelessComponent[FormDropdownProps] = js.native
  var Field: StatelessComponent[FormFieldProps] = js.native
  var Group: StatelessComponent[FormGroupProps] = js.native
  var Input: StatelessComponent[FormInputProps] = js.native
  var Radio: StatelessComponent[FormRadioProps] = js.native
  var Select: StatelessComponent[FormSelectProps] = js.native
  var TextArea: StatelessComponent[FormTextAreaProps] = js.native
}

