package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsControlMod.ControlProps
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

object Control {
  
  inline def apply[Option_1, IsMulti_1 /* <: Boolean */, Group_1 /* <: GroupBase[Option_1] */](
    clearValue: Callback,
    cx: (/* state */ ClassNamesState, /* className */ js.UndefOr[String]) => String,
    getStyles: (/* keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group> */ /* propertyName */ clearIndicator | container | control | dropdownIndicator | group | groupHeading | indicatorsContainer | indicatorSeparator | input | loadingIndicator | loadingMessage | menu | menuList | menuPortal | multiValue | multiValueLabel | multiValueRemove | noOptionsMessage | option | placeholder | singleValue | valueContainer, /* import warning: importer.ImportType#apply Failed type conversion: react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>[keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>] */ /* props */ js.Any) => CSSObjectWithLabel,
    getValue: CallbackTo[Options[Option_1]],
    hasValue: Boolean,
    innerProps: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement],
    isDisabled: Boolean,
    isFocused: Boolean,
    isMulti: Boolean,
    isRtl: Boolean,
    menuIsOpen: Boolean,
    options: OptionsOrGroups[Option_1, Group_1],
    selectOption: Option_1 => Callback,
    selectProps: Props[Option_1, IsMulti_1, Group_1],
    setValue: (OnChangeValue[Option_1, IsMulti_1], SetValueAction, js.UndefOr[Option_1]) => Callback,
    theme: Theme
  ): Builder[Option_1, IsMulti_1, Group_1] = {
    val __props = js.Dynamic.literal(clearValue = clearValue.toJsFn, cx = js.Any.fromFunction2(cx), getStyles = js.Any.fromFunction2(getStyles), getValue = getValue.toJsFn, hasValue = hasValue.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], menuIsOpen = menuIsOpen.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1((t0: Option_1) => selectOption(t0).runNow()), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction3((t0: OnChangeValue[Option_1, IsMulti_1], t1: SetValueAction, t2: js.UndefOr[Option_1]) => (setValue(t0, t1, t2)).runNow()), theme = theme.asInstanceOf[js.Any])
    new Builder[Option_1, IsMulti_1, Group_1](js.Array(this.component, __props.asInstanceOf[ControlProps[Option_1, IsMulti_1, Group_1]]))
  }
  
  @JSImport("react-select", "components.Control")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Option_1, IsMulti_1 /* <: Boolean */, Group_1 /* <: GroupBase[Option_1] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def innerRef(value: Ref[HTMLDivElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
    
    inline def innerRefFunction1(value: HTMLDivElement | Null => Callback): this.type = set("innerRef", js.Any.fromFunction1((t0: HTMLDivElement | Null) => value(t0).runNow()))
    
    inline def innerRefNull: this.type = set("innerRef", null)
  }
  
  def withProps[Option_1, IsMulti_1 /* <: Boolean */, Group_1 /* <: GroupBase[Option_1] */](p: ControlProps[Option_1, IsMulti_1, Group_1]): Builder[Option_1, IsMulti_1, Group_1] = new Builder[Option_1, IsMulti_1, Group_1](js.Array(this.component, p.asInstanceOf[js.Any]))
}
