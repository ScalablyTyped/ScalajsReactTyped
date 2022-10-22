package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.File
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLFieldSetElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLLabelElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdForm.anon.FormMessagePropsPartialFo
import typingsJapgolly.reactMdForm.anon.Menu
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdef
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdefCounter
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdefDefaultValue
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdis
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdisCounter
import typingsJapgolly.reactMdForm.anon.NumberFieldHookOptionsdisDefaultValue
import typingsJapgolly.reactMdForm.anon.PasswordPropsmessageProps
import typingsJapgolly.reactMdForm.anon.TextAreaPropsmessageProps
import typingsJapgolly.reactMdForm.anon.TextFieldHookOptionsdisab
import typingsJapgolly.reactMdForm.anon.TextFieldHookOptionsdisabCounter
import typingsJapgolly.reactMdForm.anon.TextFieldHookOptionsdisabDefaultValue
import typingsJapgolly.reactMdForm.anon.TextFieldPropsmessageProp
import typingsJapgolly.reactMdForm.anon.`0`
import typingsJapgolly.reactMdForm.reactMdFormStrings.badInput
import typingsJapgolly.reactMdForm.reactMdFormStrings.customError
import typingsJapgolly.reactMdForm.reactMdFormStrings.max
import typingsJapgolly.reactMdForm.reactMdFormStrings.min
import typingsJapgolly.reactMdForm.reactMdFormStrings.patternMismatch
import typingsJapgolly.reactMdForm.reactMdFormStrings.rangeOverflow
import typingsJapgolly.reactMdForm.reactMdFormStrings.rangeUnderflow
import typingsJapgolly.reactMdForm.reactMdFormStrings.stepMismatch
import typingsJapgolly.reactMdForm.reactMdFormStrings.tooLong
import typingsJapgolly.reactMdForm.reactMdFormStrings.tooShort
import typingsJapgolly.reactMdForm.reactMdFormStrings.total
import typingsJapgolly.reactMdForm.reactMdFormStrings.typeMismatch
import typingsJapgolly.reactMdForm.reactMdFormStrings.valid
import typingsJapgolly.reactMdForm.reactMdFormStrings.valueMissing
import typingsJapgolly.reactMdForm.typesFieldsetMod.FieldsetProps
import typingsJapgolly.reactMdForm.typesFileInputFileInputMod.FileInputProps
import typingsJapgolly.reactMdForm.typesFileInputUseFileUploadMod.FileUploadHookReturnValue
import typingsJapgolly.reactMdForm.typesFileInputUseFileUploadMod.FileUploadOptions
import typingsJapgolly.reactMdForm.typesFileInputUtilsMod.FileUploadStats
import typingsJapgolly.reactMdForm.typesFileInputUtilsMod.FileValidationError
import typingsJapgolly.reactMdForm.typesFileInputUtilsMod.FilesValidationOptions
import typingsJapgolly.reactMdForm.typesFileInputUtilsMod.GetFileParser_
import typingsJapgolly.reactMdForm.typesFileInputUtilsMod.IsValidFileName_
import typingsJapgolly.reactMdForm.typesFileInputUtilsMod.SplitFileUploads
import typingsJapgolly.reactMdForm.typesFileInputUtilsMod.ValidatedFilesResult
import typingsJapgolly.reactMdForm.typesFormMessageContainerMod.FormMessageContainerProps
import typingsJapgolly.reactMdForm.typesFormMessageCounterMod.FormMessageCounterProps
import typingsJapgolly.reactMdForm.typesFormMod.FormProps
import typingsJapgolly.reactMdForm.typesFormThemeProviderMod.FormThemeContext
import typingsJapgolly.reactMdForm.typesFormThemeProviderMod.FormThemeOptions
import typingsJapgolly.reactMdForm.typesFormThemeProviderMod.FormThemeProviderProps
import typingsJapgolly.reactMdForm.typesLabelLabelMod.LabelProps
import typingsJapgolly.reactMdForm.typesLabelLabelMod.LabelStates
import typingsJapgolly.reactMdForm.typesMenuMenuItemCheckboxMod.MenuItemCheckboxProps
import typingsJapgolly.reactMdForm.typesMenuMenuItemFileInputMod.MenuItemFileInputProps
import typingsJapgolly.reactMdForm.typesMenuMenuItemInputToggleMod.BaseMenuItemInputToggleProps
import typingsJapgolly.reactMdForm.typesMenuMenuItemInputToggleMod.StrictMenuItemInputToggleProps
import typingsJapgolly.reactMdForm.typesMenuMenuItemSwitchMod.MenuItemSwitchProps
import typingsJapgolly.reactMdForm.typesMenuMenuItemTextFieldMod.MenuItemTextFieldProps
import typingsJapgolly.reactMdForm.typesSelectListboxMod.ListboxProps
import typingsJapgolly.reactMdForm.typesSelectNativeSelectMod.NativeSelectProps
import typingsJapgolly.reactMdForm.typesSelectOptionMod.OptionProps
import typingsJapgolly.reactMdForm.typesSelectSelectMod.SelectProps
import typingsJapgolly.reactMdForm.typesSelectUtilsMod.ListboxOption
import typingsJapgolly.reactMdForm.typesSliderRangeSliderMod.RangeSliderProps
import typingsJapgolly.reactMdForm.typesSliderSliderContainerMod.SliderContainerProps
import typingsJapgolly.reactMdForm.typesSliderSliderMod.SliderProps
import typingsJapgolly.reactMdForm.typesSliderSliderThumbMod.SliderThumbProps
import typingsJapgolly.reactMdForm.typesSliderSliderTrackMod.SliderTrackProps
import typingsJapgolly.reactMdForm.typesSliderTypesMod.RangeSliderDefaultValue
import typingsJapgolly.reactMdForm.typesSliderTypesMod.SliderDefaultValue
import typingsJapgolly.reactMdForm.typesSliderUseRangeSliderMod.RangeSliderValueReturnType
import typingsJapgolly.reactMdForm.typesSliderUseRangeSliderMod.UseRangeSliderOptions
import typingsJapgolly.reactMdForm.typesSliderUseSliderMod.SliderValueReturnType
import typingsJapgolly.reactMdForm.typesSliderUseSliderMod.UseSliderOptions
import typingsJapgolly.reactMdForm.typesTextFieldGetErrorIconMod.GetErrorIcon
import typingsJapgolly.reactMdForm.typesTextFieldGetErrorMessageMod.GetErrorMessage
import typingsJapgolly.reactMdForm.typesTextFieldIsErroredMod.IsErrored
import typingsJapgolly.reactMdForm.typesTextFieldPasswordMod.PasswordProps
import typingsJapgolly.reactMdForm.typesTextFieldTextAreaMod.TextAreaProps
import typingsJapgolly.reactMdForm.typesTextFieldTextFieldAddonMod.TextFieldAddonProps
import typingsJapgolly.reactMdForm.typesTextFieldTextFieldContainerMod.TextFieldContainerProps
import typingsJapgolly.reactMdForm.typesTextFieldTextFieldMod.TextFieldProps
import typingsJapgolly.reactMdForm.typesTextFieldUseNumberFieldMod.NumberFieldHookControls
import typingsJapgolly.reactMdForm.typesTextFieldUseNumberFieldMod.ProvidedNumberFieldMessageProps
import typingsJapgolly.reactMdForm.typesTextFieldUseNumberFieldMod.ProvidedNumberFieldProps
import typingsJapgolly.reactMdForm.typesTextFieldUseTextFieldMod.ProvidedTextFieldMessageProps
import typingsJapgolly.reactMdForm.typesTextFieldUseTextFieldMod.ProvidedTextFieldProps
import typingsJapgolly.reactMdForm.typesTextFieldUseTextFieldMod.TextFieldHookControls
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
import typingsJapgolly.reactMdForm.typesUseChoiceMod.InputElement
import typingsJapgolly.reactMdForm.typesUseChoiceMod.SetValue
import typingsJapgolly.reactMdForm.typesUseIndeterminateCheckedMod.IndeterminateCheckedHookOptions
import typingsJapgolly.reactMdForm.typesUseIndeterminateCheckedMod.OnChangeReturnValue
import typingsJapgolly.reactMdForm.typesUseIndeterminateCheckedMod.OnCheckedChangeReturnValue
import typingsJapgolly.reactMdForm.typesUseSelectStateMod.DefaultValue
import typingsJapgolly.reactMdForm.typesUseSelectStateMod.ReturnValue
import typingsJapgolly.reactMdList.typesListMod.ListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/form", "AsyncSwitch")
  @js.native
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "Checkbox")
  @js.native
  val Checkbox: ForwardRefExoticComponent[CheckboxProps & RefAttributes[HTMLInputElement]] = js.native
  
  inline def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_DISPLAY_LABEL")(option.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any], includeLeft.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_OPTION_ID")(baseId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_OPTION_LABEL")(option.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  @JSImport("@react-md/form", "DEFAULT_SLIDER_ANIMATION_TIME")
  @js.native
  val DEFAULT_SLIDER_ANIMATION_TIME: /* 150 */ Double = js.native
  
  inline def DEFAULT_SLIDER_GET_VALUE_TEXT(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_SLIDER_GET_VALUE_TEXT")().asInstanceOf[String]
  
  @JSImport("@react-md/form", "DEFAULT_SLIDER_MAX")
  @js.native
  val DEFAULT_SLIDER_MAX: /* 100 */ Double = js.native
  
  @JSImport("@react-md/form", "DEFAULT_SLIDER_MIN")
  @js.native
  val DEFAULT_SLIDER_MIN: /* 0 */ Double = js.native
  
  @JSImport("@react-md/form", "DEFAULT_SLIDER_STEP")
  @js.native
  val DEFAULT_SLIDER_STEP: /* 1 */ Double = js.native
  
  @JSImport("@react-md/form", "Fieldset")
  @js.native
  val Fieldset: ForwardRefExoticComponent[FieldsetProps & RefAttributes[HTMLFieldSetElement]] = js.native
  
  @JSImport("@react-md/form", "FileAccessError")
  @js.native
  /**
    *
    * @param message - An optional message for the error.
    */
  open class FileAccessError ()
    extends typingsJapgolly.reactMdForm.typesFileInputMod.FileAccessError {
    def this(message: String) = this()
  }
  
  @JSImport("@react-md/form", "FileExtensionError")
  @js.native
  open class FileExtensionError protected ()
    extends typingsJapgolly.reactMdForm.typesFileInputMod.FileExtensionError {
    /**
      *
      * @param files - The file that caused the error
      * @param extensions - The allowed list of file extensions
      */
    def this(files: js.Array[File], extensions: js.Array[String]) = this()
  }
  
  @JSImport("@react-md/form", "FileInput")
  @js.native
  val FileInput: ForwardRefExoticComponent[FileInputProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "FileSizeError")
  @js.native
  open class FileSizeError protected ()
    extends typingsJapgolly.reactMdForm.typesFileInputMod.FileSizeError {
    /**
      *
      * @param files - The list of files that have the file size error
      * @param type - The file size error type
      * @param limit - The number of bytes allowed based on the type
      */
    def this(files: js.Array[File], `type`: min | max | total, limit: Double) = this()
  }
  
  @JSImport("@react-md/form", "Form")
  @js.native
  val Form: ForwardRefExoticComponent[FormProps & RefAttributes[HTMLFormElement]] = js.native
  
  @JSImport("@react-md/form", "FormMessage")
  @js.native
  val FormMessage: ForwardRefExoticComponent[FormMessagePropsPartialFo] = js.native
  
  @JSImport("@react-md/form", "FormMessageContainer")
  @js.native
  val FormMessageContainer: ForwardRefExoticComponent[FormMessageContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def FormMessageCounter(hasChildrenClassNameProps: FormMessageCounterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FormMessageCounter")(hasChildrenClassNameProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def FormThemeProvider(hasThemeUnderlineDirectionChildren: FormThemeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FormThemeProvider")(hasThemeUnderlineDirectionChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@react-md/form", "GenericFileError")
  @js.native
  open class GenericFileError protected ()
    extends typingsJapgolly.reactMdForm.typesFileInputMod.GenericFileError {
    /**
      *
      * @param files - A list of files that caused the error.
      * @param reason - An optional reason for the error
      */
    def this(files: js.Array[File]) = this()
    def this(files: js.Array[File], reason: String) = this()
  }
  
  @JSImport("@react-md/form", "InputToggle")
  @js.native
  val InputToggle: ForwardRefExoticComponent[Props & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "InputToggleIcon")
  @js.native
  val InputToggleIcon: ForwardRefExoticComponent[InputToggleIconProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form", "Label")
  @js.native
  val Label: ForwardRefExoticComponent[LabelProps & RefAttributes[HTMLLabelElement]] = js.native
  
  @JSImport("@react-md/form", "Listbox")
  @js.native
  val Listbox: ForwardRefExoticComponent[ListboxProps & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/form", "MenuItemCheckbox")
  @js.native
  val MenuItemCheckbox: ForwardRefExoticComponent[MenuItemCheckboxProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form", "MenuItemFileInput")
  @js.native
  val MenuItemFileInput: ForwardRefExoticComponent[MenuItemFileInputProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form", "MenuItemInputToggle")
  @js.native
  val MenuItemInputToggle: ForwardRefExoticComponent[StrictMenuItemInputToggleProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form", "MenuItemRadio")
  @js.native
  val MenuItemRadio: ForwardRefExoticComponent[BaseMenuItemInputToggleProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form", "MenuItemSwitch")
  @js.native
  val MenuItemSwitch: ForwardRefExoticComponent[MenuItemSwitchProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form", "MenuItemTextField")
  @js.native
  val MenuItemTextField: ForwardRefExoticComponent[MenuItemTextFieldProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "NativeSelect")
  @js.native
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps & RefAttributes[HTMLSelectElement]] = js.native
  
  @JSImport("@react-md/form", "Option")
  @js.native
  val Option: ForwardRefExoticComponent[OptionProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form", "Password")
  @js.native
  val Password: ForwardRefExoticComponent[PasswordProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "PasswordWithMessage")
  @js.native
  val PasswordWithMessage: ForwardRefExoticComponent[PasswordPropsmessageProps] = js.native
  
  @JSImport("@react-md/form", "RECOMMENDED_NUMBER_STATE_KEYS")
  @js.native
  val RECOMMENDED_NUMBER_STATE_KEYS: js.Array[
    badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing
  ] = js.native
  
  @JSImport("@react-md/form", "RECOMMENDED_STATE_KEYS")
  @js.native
  val RECOMMENDED_STATE_KEYS: js.Array[
    badInput | customError | patternMismatch | rangeOverflow | rangeUnderflow | stepMismatch | tooLong | tooShort | typeMismatch | valid | valueMissing
  ] = js.native
  
  @JSImport("@react-md/form", "Radio")
  @js.native
  val Radio: ForwardRefExoticComponent[RadioProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "RangeSlider")
  @js.native
  val RangeSlider: ForwardRefExoticComponent[RangeSliderProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "Select")
  @js.native
  val Select: ForwardRefExoticComponent[SelectProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "Slider")
  @js.native
  val Slider: ForwardRefExoticComponent[SliderProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "SliderContainer")
  @js.native
  val SliderContainer: ForwardRefExoticComponent[SliderContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "SliderThumb")
  @js.native
  val SliderThumb: ForwardRefExoticComponent[SliderThumbProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form", "SliderTrack")
  @js.native
  val SliderTrack: ForwardRefExoticComponent[SliderTrackProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form", "Switch")
  @js.native
  val Switch: ForwardRefExoticComponent[SwitchProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "SwitchTrack")
  @js.native
  val SwitchTrack: ForwardRefExoticComponent[SwitchTrackProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "THUMB_1_VAR")
  @js.native
  val THUMB_1_VAR: /* "--offset1" */ String = js.native
  
  @JSImport("@react-md/form", "THUMB_2_VAR")
  @js.native
  val THUMB_2_VAR: /* "--offset2" */ String = js.native
  
  @JSImport("@react-md/form", "TextArea")
  @js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps & RefAttributes[HTMLTextAreaElement]] = js.native
  
  @JSImport("@react-md/form", "TextAreaWithMessage")
  @js.native
  val TextAreaWithMessage: ForwardRefExoticComponent[TextAreaPropsmessageProps] = js.native
  
  @JSImport("@react-md/form", "TextField")
  @js.native
  val TextField: ForwardRefExoticComponent[TextFieldProps & RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form", "TextFieldAddon")
  @js.native
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps & RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form", "TextFieldContainer")
  @js.native
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "TextFieldWithMessage")
  @js.native
  val TextFieldWithMessage: ForwardRefExoticComponent[TextFieldPropsmessageProp] = js.native
  
  @JSImport("@react-md/form", "ToggleContainer")
  @js.native
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form", "TooManyFilesError")
  @js.native
  open class TooManyFilesError protected ()
    extends typingsJapgolly.reactMdForm.typesFileInputMod.TooManyFilesError {
    /**
      *
      * @param files - The list of files that could not be uploaded due to the file
      * limit defined.
      * @param limit - The max limit of files allowed.
      */
    def this(files: js.Array[File], limit: Double) = this()
  }
  
  @JSImport("@react-md/form", "defaultGetErrorIcon")
  @js.native
  val defaultGetErrorIcon: GetErrorIcon = js.native
  
  @JSImport("@react-md/form", "defaultGetErrorMessage")
  @js.native
  val defaultGetErrorMessage: GetErrorMessage = js.native
  
  @JSImport("@react-md/form", "defaultIsErrored")
  @js.native
  val defaultIsErrored: IsErrored = js.native
  
  @JSImport("@react-md/form", "getFileParser")
  @js.native
  val getFileParser: GetFileParser_ = js.native
  
  inline def getSplitFileUploads(stats: js.Array[FileUploadStats]): SplitFileUploads = ^.asInstanceOf[js.Dynamic].applyDynamic("getSplitFileUploads")(stats.asInstanceOf[js.Any]).asInstanceOf[SplitFileUploads]
  
  inline def isAudioFile(file: File): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAudioFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFileAccessError[CustomError](error: FileValidationError[CustomError]): /* is @react-md/form.@react-md/form/types/file-input/utils.FileAccessError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileAccessError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/file-input/utils.FileAccessError */ Boolean]
  
  inline def isFileExtensionError[CustomError](error: FileValidationError[CustomError]): /* is @react-md/form.@react-md/form/types/file-input/utils.FileExtensionError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileExtensionError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/file-input/utils.FileExtensionError */ Boolean]
  
  inline def isFileSizeError[CustomError](error: FileValidationError[CustomError]): /* is @react-md/form.@react-md/form/types/file-input/utils.FileSizeError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileSizeError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/file-input/utils.FileSizeError */ Boolean]
  
  inline def isGenericFileError[CustomError](error: FileValidationError[CustomError]): /* is @react-md/form.@react-md/form/types/file-input/utils.GenericFileError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGenericFileError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/file-input/utils.GenericFileError */ Boolean]
  
  inline def isImageFile(file: File): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImageFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isListboxOptionProps")(option.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean]
  
  inline def isMediaFile(file: File): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMediaFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTextFile(file: File): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTooManyFilesError[CustomError](error: FileValidationError[CustomError]): /* is @react-md/form.@react-md/form/types/file-input/utils.TooManyFilesError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTooManyFilesError")(error.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/file-input/utils.TooManyFilesError */ Boolean]
  
  @JSImport("@react-md/form", "isValidFileName")
  @js.native
  val isValidFileName: IsValidFileName_ = js.native
  
  inline def isVideoFile(file: File): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVideoFile")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def labelStyles(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("labelStyles")().asInstanceOf[String]
  inline def labelStyles(hasErrorActiveDisabled: LabelStates): String = ^.asInstanceOf[js.Dynamic].applyDynamic("labelStyles")(hasErrorActiveDisabled.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  inline def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChecked")(defaultChecked.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[Boolean, ChangeEventHandler, SetChecked]]
  
  inline def useChoice[E /* <: InputElement */](defaultValue: String): js.Tuple3[
    String, 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[String]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    String, 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[String]
  ]]
  inline def useChoice[E /* <: InputElement */](
    defaultValue: String,
    onChange: typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E]
  ): js.Tuple3[
    String, 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[String]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    String, 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[String]
  ]]
  inline def useChoice[E /* <: InputElement */](defaultValue: js.Array[String]): js.Tuple3[
    js.Array[String], 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    js.Array[String], 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ]]
  inline def useChoice[E /* <: InputElement */](
    defaultValue: js.Array[String],
    onChange: typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E]
  ): js.Tuple3[
    js.Array[String], 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    js.Array[String], 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ]]
  inline def useChoice[E /* <: InputElement */](defaultValue: Double): js.Tuple3[
    Double, 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[Double]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[
    Double, 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[Double]
  ]]
  inline def useChoice[E /* <: InputElement */](
    defaultValue: Double,
    onChange: typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E]
  ): js.Tuple3[
    Double, 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[Double]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    Double, 
    typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], 
    SetValue[Double]
  ]]
  inline def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T): js.Tuple3[T, typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], SetValue[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[T, typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], SetValue[T]]]
  inline def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T, onChange: typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E]): js.Tuple3[T, typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], SetValue[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useChoice")(defaultValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[T, typingsJapgolly.reactMdForm.typesUseChoiceMod.ChangeEventHandler[E], SetValue[T]]]
  
  inline def useFileUpload[E /* <: HTMLElement */, CustomError](): FileUploadHookReturnValue[E, CustomError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFileUpload")().asInstanceOf[FileUploadHookReturnValue[E, CustomError]]
  inline def useFileUpload[E /* <: HTMLElement */, CustomError](
    hasMaxFilesExtensionsMinFileSizeMaxFileSizeTotalFileSizeConcurrencyPropOnDropPropOnChangeValidateFilesGetFileParserIsValidFileName: FileUploadOptions[E, CustomError]
  ): FileUploadHookReturnValue[E, CustomError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFileUpload")(hasMaxFilesExtensionsMinFileSizeMaxFileSizeTotalFileSizeConcurrencyPropOnDropPropOnChangeValidateFilesGetFileParserIsValidFileName.asInstanceOf[js.Any]).asInstanceOf[FileUploadHookReturnValue[E, CustomError]]
  
  inline def useFormTheme(): FormThemeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormTheme")().asInstanceOf[FormThemeContext]
  inline def useFormTheme(options: FormThemeOptions): FormThemeContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useFormTheme")(options.asInstanceOf[js.Any]).asInstanceOf[FormThemeContext]
  
  inline def useIndeterminateChecked[V /* <: String */](values: js.Array[V]): OnChangeReturnValue[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any]).asInstanceOf[OnChangeReturnValue[V]]
  inline def useIndeterminateChecked[V /* <: String */](values: js.Array[V], options: IndeterminateCheckedHookOptions[V] & `0`): OnCheckedChangeReturnValue[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OnCheckedChangeReturnValue[V]]
  inline def useIndeterminateChecked[V /* <: String */](values: js.Array[V], options: IndeterminateCheckedHookOptions[V] & Menu): OnChangeReturnValue[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("useIndeterminateChecked")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OnChangeReturnValue[V]]
  
  inline def useNumberField(options: NumberFieldHookOptionsdef): js.Tuple3[Double, ProvidedNumberFieldProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdefCounter): js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdefDefaultValue): js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[Double, ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdis): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdisCounter): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  inline def useNumberField(options: NumberFieldHookOptionsdisDefaultValue): js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNumberField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[js.UndefOr[Double], ProvidedNumberFieldMessageProps, NumberFieldHookControls]]
  
  inline def useRangeSlider(): RangeSliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")().asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: Unit, hasMinMaxStepPropJumpUpdateOnOnChange: UseRangeSliderOptions): RangeSliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(defaultValue: RangeSliderDefaultValue): RangeSliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[RangeSliderValueReturnType]
  inline def useRangeSlider(
    defaultValue: RangeSliderDefaultValue,
    hasMinMaxStepPropJumpUpdateOnOnChange: UseRangeSliderOptions
  ): RangeSliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useRangeSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[RangeSliderValueReturnType]
  
  inline def useSelectState[T /* <: String */](defaultValue: DefaultValue[T]): ReturnValue[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSelectState")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[T]]
  
  inline def useSlider(): SliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")().asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: Unit, hasMinMaxStepPropJumpUpdateOnOnChange: UseSliderOptions): SliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: SliderDefaultValue): SliderValueReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[SliderValueReturnType]
  inline def useSlider(defaultValue: SliderDefaultValue, hasMinMaxStepPropJumpUpdateOnOnChange: UseSliderOptions): SliderValueReturnType = (^.asInstanceOf[js.Dynamic].applyDynamic("useSlider")(defaultValue.asInstanceOf[js.Any], hasMinMaxStepPropJumpUpdateOnOnChange.asInstanceOf[js.Any])).asInstanceOf[SliderValueReturnType]
  
  inline def useTextField(options: TextFieldHookOptionsdisab): js.Tuple3[String, ProvidedTextFieldProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldProps, TextFieldHookControls]]
  inline def useTextField(options: TextFieldHookOptionsdisabCounter): js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls]]
  inline def useTextField(options: TextFieldHookOptionsdisabDefaultValue): js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTextField")(options.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[String, ProvidedTextFieldMessageProps, TextFieldHookControls]]
  
  inline def validateFiles[CustomError](
    files: js.Array[File],
    hasMaxFilesExtensionsMinFileSizeMaxFileSizeTotalBytesTotalFilesTotalFileSizeIsValidFileName: FilesValidationOptions
  ): ValidatedFilesResult[CustomError] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateFiles")(files.asInstanceOf[js.Any], hasMaxFilesExtensionsMinFileSizeMaxFileSizeTotalBytesTotalFilesTotalFileSizeIsValidFileName.asInstanceOf[js.Any])).asInstanceOf[ValidatedFilesResult[CustomError]]
}
