package typingsJapgolly.rcSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rcSelect.anon.Children
import typingsJapgolly.rcSelect.anon.OmitDefaultOptionTypechil
import typingsJapgolly.rcSelect.anon.OptGroup
import typingsJapgolly.rcSelect.anon.Selected
import typingsJapgolly.rcSelect.anon.`0`
import typingsJapgolly.rcSelect.libBaseSelectMod.BaseSelectPropsWithoutPrivate
import typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.rcSelect.rcSelectStrings.combobox
import typingsJapgolly.rcSelect.rcSelectStrings.multiple
import typingsJapgolly.rcSelect.rcSelectStrings.tags
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectMod extends Shortcut {
  
  @JSImport("rc-select/lib/Select", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children & (SelectProps[Any, DefaultOptionType]), Element]) & OptGroup = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<infer E> ? E : T
    }}}
    */
  @js.native
  trait ArrayElementType[T] extends StObject
  
  trait BaseOptionType
    extends StObject
       with /* name */ StringDictionary[Any] {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
  }
  object BaseOptionType {
    
    inline def apply(): BaseOptionType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptionType]
    }
    
    extension [Self <: BaseOptionType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait DefaultOptionType
    extends StObject
       with BaseOptionType {
    
    var children: js.UndefOr[js.Array[OmitDefaultOptionTypechil]] = js.undefined
    
    var label: Node
    
    var value: js.UndefOr[String | Double | Null] = js.undefined
  }
  object DefaultOptionType {
    
    inline def apply(): DefaultOptionType = {
      val __obj = js.Dynamic.literal(label = null)
      __obj.asInstanceOf[DefaultOptionType]
    }
    
    extension [Self <: DefaultOptionType](x: Self) {
      
      inline def setChildren(value: js.Array[OmitDefaultOptionTypechil]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: OmitDefaultOptionTypechil*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rcSelect.libSelectMod.RawValueType
    - typingsJapgolly.rcSelect.libSelectMod.LabelInValueType
    - typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType
    - js.Array[
  typingsJapgolly.rcSelect.libSelectMod.RawValueType | typingsJapgolly.rcSelect.libSelectMod.LabelInValueType | typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType]
  */
  type DraftValueType = _DraftValueType | (js.Array[RawValueType | LabelInValueType | DisplayValueType]) | RawValueType
  
  trait FieldNames extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object FieldNames {
    
    inline def apply(): FieldNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldNames]
    }
    
    extension [Self <: FieldNames](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type FilterFunc[OptionType] = js.Function2[/* inputValue */ String, /* option */ js.UndefOr[OptionType], Boolean]
  
  trait LabelInValueType
    extends StObject
       with _DraftValueType {
    
    /** @deprecated `key` is useless since it should always same as `value` */
    var key: js.UndefOr[Key] = js.undefined
    
    var label: Node
    
    var value: RawValueType
  }
  object LabelInValueType {
    
    inline def apply(value: RawValueType): LabelInValueType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], label = null)
      __obj.asInstanceOf[LabelInValueType]
    }
    
    extension [Self <: LabelInValueType](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type OnActiveValue = js.Function3[/* active */ RawValueType, /* index */ Double, /* info */ js.UndefOr[`0`], Unit]
  
  type OnInternalSelect = js.Function2[/* value */ RawValueType, /* info */ Selected, Unit]
  
  type RawValueType = String | Double
  
  type SelectHandler[ValueType, OptionType /* <: BaseOptionType */] = js.Function2[
    LabelInValueType | RawValueType | (/* value */ ValueType), 
    /* option */ OptionType, 
    Unit
  ]
  
  trait SelectProps[ValueType, OptionType /* <: BaseOptionType */]
    extends StObject
       with BaseSelectPropsWithoutPrivate {
    
    var autoClearSearchValue: js.UndefOr[Boolean] = js.undefined
    
    var backfill: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[ValueType | Null] = js.undefined
    
    var fieldNames: js.UndefOr[FieldNames] = js.undefined
    
    /**
      * In Select, `false` means do nothing.
      * In TreeSelect, `false` will highlight match item.
      * It's by design.
      */
    var filterOption: js.UndefOr[Boolean | FilterFunc[OptionType]] = js.undefined
    
    var filterSort: js.UndefOr[js.Function2[/* optionA */ OptionType, /* optionB */ OptionType, Double]] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    /** @deprecated Use `searchValue` instead */
    var inputValue: js.UndefOr[String] = js.undefined
    
    var labelInValue: js.UndefOr[Boolean] = js.undefined
    
    var listHeight: js.UndefOr[Double] = js.undefined
    
    var listItemHeight: js.UndefOr[Double] = js.undefined
    
    var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.undefined
    
    @JSName("mode")
    var mode_SelectProps: js.UndefOr[combobox | multiple | tags] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* value */ ValueType, /* option */ OptionType | js.Array[OptionType], Unit]
      ] = js.undefined
    
    var onDeselect: js.UndefOr[SelectHandler[ArrayElementType[ValueType], OptionType]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[SelectHandler[ArrayElementType[ValueType], OptionType]] = js.undefined
    
    var optionFilterProp: js.UndefOr[String] = js.undefined
    
    var optionLabelProp: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Array[OptionType]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var searchValue: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[ValueType | Null] = js.undefined
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object SelectProps {
    
    inline def apply[ValueType, OptionType /* <: BaseOptionType */](): SelectProps[ValueType, OptionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectProps[ValueType, OptionType]]
    }
    
    extension [Self <: SelectProps[?, ?], ValueType, OptionType /* <: BaseOptionType */](x: Self & (SelectProps[ValueType, OptionType])) {
      
      inline def setAutoClearSearchValue(value: Boolean): Self = StObject.set(x, "autoClearSearchValue", value.asInstanceOf[js.Any])
      
      inline def setAutoClearSearchValueUndefined: Self = StObject.set(x, "autoClearSearchValue", js.undefined)
      
      inline def setBackfill(value: Boolean): Self = StObject.set(x, "backfill", value.asInstanceOf[js.Any])
      
      inline def setBackfillUndefined: Self = StObject.set(x, "backfill", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultActiveFirstOption(value: Boolean): Self = StObject.set(x, "defaultActiveFirstOption", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveFirstOptionUndefined: Self = StObject.set(x, "defaultActiveFirstOption", js.undefined)
      
      inline def setDefaultValue(value: ValueType): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      inline def setFilterOption(value: Boolean | FilterFunc[OptionType]): Self = StObject.set(x, "filterOption", value.asInstanceOf[js.Any])
      
      inline def setFilterOptionFunction2(value: (/* inputValue */ String, /* option */ js.UndefOr[OptionType]) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
      
      inline def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
      
      inline def setFilterSort(value: (/* optionA */ OptionType, /* optionB */ OptionType) => Double): Self = StObject.set(x, "filterSort", js.Any.fromFunction2(value))
      
      inline def setFilterSortUndefined: Self = StObject.set(x, "filterSort", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      inline def setLabelInValue(value: Boolean): Self = StObject.set(x, "labelInValue", value.asInstanceOf[js.Any])
      
      inline def setLabelInValueUndefined: Self = StObject.set(x, "labelInValue", js.undefined)
      
      inline def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      inline def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
      
      inline def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      inline def setListItemHeightUndefined: Self = StObject.set(x, "listItemHeight", js.undefined)
      
      inline def setMenuItemSelectedIcon(value: RenderNode): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
      
      inline def setMenuItemSelectedIconFunction1(value: /* props */ Any => Node): Self = StObject.set(x, "menuItemSelectedIcon", js.Any.fromFunction1(value))
      
      inline def setMenuItemSelectedIconNull: Self = StObject.set(x, "menuItemSelectedIcon", null)
      
      inline def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
      
      inline def setMenuItemSelectedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "menuItemSelectedIcon", js.Array(value*))
      
      inline def setMenuItemSelectedIconVdomElement(value: VdomElement): Self = StObject.set(x, "menuItemSelectedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMode(value: combobox | multiple | tags): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnChange(value: (/* value */ ValueType, /* option */ OptionType | js.Array[OptionType]) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* value */ ValueType, t1: /* option */ OptionType | js.Array[OptionType]) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDeselect(value: (LabelInValueType | RawValueType | ArrayElementType[ValueType], OptionType) => Callback): Self = StObject.set(x, "onDeselect", js.Any.fromFunction2((t0: LabelInValueType | RawValueType | ArrayElementType[ValueType], t1: OptionType) => (value(t0, t1)).runNow()))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnSearch(value: /* value */ String => Callback): Self = StObject.set(x, "onSearch", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setOnSelect(value: (LabelInValueType | RawValueType | ArrayElementType[ValueType], OptionType) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: LabelInValueType | RawValueType | ArrayElementType[ValueType], t1: OptionType) => (value(t0, t1)).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptionFilterProp(value: String): Self = StObject.set(x, "optionFilterProp", value.asInstanceOf[js.Any])
      
      inline def setOptionFilterPropUndefined: Self = StObject.set(x, "optionFilterProp", js.undefined)
      
      inline def setOptionLabelProp(value: String): Self = StObject.set(x, "optionLabelProp", value.asInstanceOf[js.Any])
      
      inline def setOptionLabelPropUndefined: Self = StObject.set(x, "optionLabelProp", js.undefined)
      
      inline def setOptions(value: js.Array[OptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: OptionType*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSearchValue(value: String): Self = StObject.set(x, "searchValue", value.asInstanceOf[js.Any])
      
      inline def setSearchValueUndefined: Self = StObject.set(x, "searchValue", js.undefined)
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  trait _DraftValueType extends StObject
  object _DraftValueType {
    
    inline def DisplayValueType(): typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType]
    }
    
    inline def LabelInValueType(value: RawValueType): typingsJapgolly.rcSelect.libSelectMod.LabelInValueType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], label = null)
      __obj.asInstanceOf[typingsJapgolly.rcSelect.libSelectMod.LabelInValueType]
    }
  }
  
  type _To = (js.Function1[/* props */ Children & (SelectProps[Any, DefaultOptionType]), Element]) & OptGroup
  
  /* This means you don't have to write `default`, but can instead just say `libSelectMod.foo` */
  override def _to: (js.Function1[/* props */ Children & (SelectProps[Any, DefaultOptionType]), Element]) & OptGroup = default
}
