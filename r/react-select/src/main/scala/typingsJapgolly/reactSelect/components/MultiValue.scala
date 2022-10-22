package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueComponents
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsMultiValueMod.MultiValueProps
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.Props
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.CSSObjectWithLabel
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.ClassNamesState
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.OnChangeValue
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Options
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.OptionsOrGroups
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.SetValueAction
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Theme
import typingsJapgolly.reactSelect.reactSelectStrings.clearIndicator
import typingsJapgolly.reactSelect.reactSelectStrings.container
import typingsJapgolly.reactSelect.reactSelectStrings.control
import typingsJapgolly.reactSelect.reactSelectStrings.dropdownIndicator
import typingsJapgolly.reactSelect.reactSelectStrings.group
import typingsJapgolly.reactSelect.reactSelectStrings.groupHeading
import typingsJapgolly.reactSelect.reactSelectStrings.indicatorSeparator
import typingsJapgolly.reactSelect.reactSelectStrings.indicatorsContainer
import typingsJapgolly.reactSelect.reactSelectStrings.input
import typingsJapgolly.reactSelect.reactSelectStrings.loadingIndicator
import typingsJapgolly.reactSelect.reactSelectStrings.loadingMessage
import typingsJapgolly.reactSelect.reactSelectStrings.menu
import typingsJapgolly.reactSelect.reactSelectStrings.menuList
import typingsJapgolly.reactSelect.reactSelectStrings.menuPortal
import typingsJapgolly.reactSelect.reactSelectStrings.multiValue
import typingsJapgolly.reactSelect.reactSelectStrings.multiValueLabel
import typingsJapgolly.reactSelect.reactSelectStrings.multiValueRemove
import typingsJapgolly.reactSelect.reactSelectStrings.noOptionsMessage
import typingsJapgolly.reactSelect.reactSelectStrings.option
import typingsJapgolly.reactSelect.reactSelectStrings.placeholder
import typingsJapgolly.reactSelect.reactSelectStrings.singleValue
import typingsJapgolly.reactSelect.reactSelectStrings.valueContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiValue {
  
  inline def apply[Option_14, IsMulti_14 /* <: Boolean */, Group_14 /* <: GroupBase[Option_14] */](
    clearValue: Callback,
    components: MultiValueComponents[Option_14, IsMulti_14, Group_14],
    cx: (/* state */ ClassNamesState, /* className */ js.UndefOr[String]) => String,
    data: Option_14,
    getStyles: (/* keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group> */ /* propertyName */ clearIndicator | container | control | dropdownIndicator | group | groupHeading | indicatorsContainer | indicatorSeparator | input | loadingIndicator | loadingMessage | menu | menuList | menuPortal | multiValue | multiValueLabel | multiValueRemove | noOptionsMessage | option | placeholder | singleValue | valueContainer, /* import warning: importer.ImportType#apply Failed type conversion: react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>[keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>] */ /* props */ js.Any) => CSSObjectWithLabel,
    getValue: CallbackTo[Options[Option_14]],
    hasValue: Boolean,
    index: Double,
    innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement],
    isDisabled: Boolean,
    isFocused: Boolean,
    isMulti: Boolean,
    isRtl: Boolean,
    options: OptionsOrGroups[Option_14, Group_14],
    removeProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement],
    selectOption: Option_14 => Callback,
    selectProps: Props[Option_14, IsMulti_14, Group_14],
    setValue: (OnChangeValue[Option_14, IsMulti_14], SetValueAction, js.UndefOr[Option_14]) => Callback,
    theme: Theme
  ): Builder[Option_14, IsMulti_14, Group_14] = {
    val __props = js.Dynamic.literal(clearValue = clearValue.toJsFn, components = components.asInstanceOf[js.Any], cx = js.Any.fromFunction2(cx), data = data.asInstanceOf[js.Any], getStyles = js.Any.fromFunction2(getStyles), getValue = getValue.toJsFn, hasValue = hasValue.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], removeProps = removeProps.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1((t0: Option_14) => selectOption(t0).runNow()), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction3((t0: OnChangeValue[Option_14, IsMulti_14], t1: SetValueAction, t2: js.UndefOr[Option_14]) => (setValue(t0, t1, t2)).runNow()), theme = theme.asInstanceOf[js.Any])
    new Builder[Option_14, IsMulti_14, Group_14](js.Array(this.component, __props.asInstanceOf[MultiValueProps[Option_14, IsMulti_14, Group_14]]))
  }
  
  @JSImport("react-select", "components.MultiValue")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Option_14, IsMulti_14 /* <: Boolean */, Group_14 /* <: GroupBase[Option_14] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def cropWithEllipsis(value: Boolean): this.type = set("cropWithEllipsis", value.asInstanceOf[js.Any])
  }
  
  def withProps[Option_14, IsMulti_14 /* <: Boolean */, Group_14 /* <: GroupBase[Option_14] */](p: MultiValueProps[Option_14, IsMulti_14, Group_14]): Builder[Option_14, IsMulti_14, Group_14] = new Builder[Option_14, IsMulti_14, Group_14](js.Array(this.component, p.asInstanceOf[js.Any]))
}
