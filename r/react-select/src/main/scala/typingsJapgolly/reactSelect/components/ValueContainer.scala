package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactSelect.distDeclarationsSrcComponentsContainersMod.ValueContainerProps
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

object ValueContainer {
  
  inline def apply[Option_20, IsMulti_20 /* <: Boolean */, Group_20 /* <: GroupBase[Option_20] */](
    clearValue: Callback,
    cx: (/* state */ ClassNamesState, /* className */ js.UndefOr[String]) => String,
    getStyles: (/* keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group> */ /* propertyName */ clearIndicator | container | control | dropdownIndicator | group | groupHeading | indicatorsContainer | indicatorSeparator | input | loadingIndicator | loadingMessage | menu | menuList | menuPortal | multiValue | multiValueLabel | multiValueRemove | noOptionsMessage | option | placeholder | singleValue | valueContainer, /* import warning: importer.ImportType#apply Failed type conversion: react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>[keyof react-select.react-select/dist/declarations/src/styles.StylesProps<Option, IsMulti, Group>] */ /* props */ js.Any) => CSSObjectWithLabel,
    getValue: CallbackTo[Options[Option_20]],
    hasValue: Boolean,
    isDisabled: Boolean,
    isMulti: Boolean,
    isRtl: Boolean,
    options: OptionsOrGroups[Option_20, Group_20],
    selectOption: Option_20 => Callback,
    selectProps: Props[Option_20, IsMulti_20, Group_20],
    setValue: (OnChangeValue[Option_20, IsMulti_20], SetValueAction, js.UndefOr[Option_20]) => Callback,
    theme: Theme
  ): Builder[Option_20, IsMulti_20, Group_20] = {
    val __props = js.Dynamic.literal(clearValue = clearValue.toJsFn, cx = js.Any.fromFunction2(cx), getStyles = js.Any.fromFunction2(getStyles), getValue = getValue.toJsFn, hasValue = hasValue.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], isMulti = isMulti.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectOption = js.Any.fromFunction1((t0: Option_20) => selectOption(t0).runNow()), selectProps = selectProps.asInstanceOf[js.Any], setValue = js.Any.fromFunction3((t0: OnChangeValue[Option_20, IsMulti_20], t1: SetValueAction, t2: js.UndefOr[Option_20]) => (setValue(t0, t1, t2)).runNow()), theme = theme.asInstanceOf[js.Any])
    new Builder[Option_20, IsMulti_20, Group_20](js.Array(this.component, __props.asInstanceOf[ValueContainerProps[Option_20, IsMulti_20, Group_20]]))
  }
  
  @JSImport("react-select", "components.ValueContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Option_20, IsMulti_20 /* <: Boolean */, Group_20 /* <: GroupBase[Option_20] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def innerProps(value: DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]): this.type = set("innerProps", value.asInstanceOf[js.Any])
  }
  
  def withProps[Option_20, IsMulti_20 /* <: Boolean */, Group_20 /* <: GroupBase[Option_20] */](p: ValueContainerProps[Option_20, IsMulti_20, Group_20]): Builder[Option_20, IsMulti_20, Group_20] = new Builder[Option_20, IsMulti_20, Group_20](js.Array(this.component, p.asInstanceOf[js.Any]))
}
