package typingsJapgolly.rcCascader

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcCascader.esCascaderMod.DefaultOptionType
import typingsJapgolly.rcCascader.esCascaderMod.InternalFieldNames
import typingsJapgolly.rcCascader.esCascaderMod.SingleValueType
import typingsJapgolly.rcCascader.rcCascaderStrings.click
import typingsJapgolly.rcCascader.rcCascaderStrings.hover
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esContextMod extends Shortcut {
  
  @JSImport("rc-cascader/es/context", JSImport.Default)
  @js.native
  val default: Context[CascaderContextProps] = js.native
  
  trait CascaderContextProps extends StObject {
    
    var changeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var checkable: js.UndefOr[Boolean | Node] = js.undefined
    
    var dropdownMenuColumnStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var dropdownPrefixCls: js.UndefOr[String] = js.undefined
    
    var expandIcon: js.UndefOr[Node] = js.undefined
    
    var expandTrigger: js.UndefOr[hover | click] = js.undefined
    
    var fieldNames: InternalFieldNames
    
    var halfValues: js.Array[SingleValueType]
    
    var loadData: js.UndefOr[js.Function1[/* selectOptions */ js.Array[DefaultOptionType], Unit]] = js.undefined
    
    var loadingIcon: js.UndefOr[Node] = js.undefined
    
    def onSelect(valuePath: SingleValueType): Unit
    
    var options: js.UndefOr[js.Array[DefaultOptionType]] = js.undefined
    
    var searchOptions: js.Array[DefaultOptionType]
    
    var values: js.Array[SingleValueType]
  }
  object CascaderContextProps {
    
    inline def apply(
      fieldNames: InternalFieldNames,
      halfValues: js.Array[SingleValueType],
      onSelect: SingleValueType => Callback,
      searchOptions: js.Array[DefaultOptionType],
      values: js.Array[SingleValueType]
    ): CascaderContextProps = {
      val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], halfValues = halfValues.asInstanceOf[js.Any], onSelect = js.Any.fromFunction1((t0: SingleValueType) => onSelect(t0).runNow()), searchOptions = searchOptions.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[CascaderContextProps]
    }
    
    extension [Self <: CascaderContextProps](x: Self) {
      
      inline def setChangeOnSelect(value: Boolean): Self = StObject.set(x, "changeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setChangeOnSelectUndefined: Self = StObject.set(x, "changeOnSelect", js.undefined)
      
      inline def setCheckable(value: Boolean | Node): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableNull: Self = StObject.set(x, "checkable", null)
      
      inline def setCheckableUndefined: Self = StObject.set(x, "checkable", js.undefined)
      
      inline def setCheckableVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checkable", js.Array(value*))
      
      inline def setCheckableVdomElement(value: VdomElement): Self = StObject.set(x, "checkable", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDropdownMenuColumnStyle(value: CSSProperties): Self = StObject.set(x, "dropdownMenuColumnStyle", value.asInstanceOf[js.Any])
      
      inline def setDropdownMenuColumnStyleUndefined: Self = StObject.set(x, "dropdownMenuColumnStyle", js.undefined)
      
      inline def setDropdownPrefixCls(value: String): Self = StObject.set(x, "dropdownPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setDropdownPrefixClsUndefined: Self = StObject.set(x, "dropdownPrefixCls", js.undefined)
      
      inline def setExpandIcon(value: VdomNode): Self = StObject.set(x, "expandIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExpandIconNull: Self = StObject.set(x, "expandIcon", null)
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "expandIcon", js.Array(value*))
      
      inline def setExpandIconVdomElement(value: VdomElement): Self = StObject.set(x, "expandIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExpandTrigger(value: hover | click): Self = StObject.set(x, "expandTrigger", value.asInstanceOf[js.Any])
      
      inline def setExpandTriggerUndefined: Self = StObject.set(x, "expandTrigger", js.undefined)
      
      inline def setFieldNames(value: InternalFieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setHalfValues(value: js.Array[SingleValueType]): Self = StObject.set(x, "halfValues", value.asInstanceOf[js.Any])
      
      inline def setHalfValuesVarargs(value: SingleValueType*): Self = StObject.set(x, "halfValues", js.Array(value*))
      
      inline def setLoadData(value: /* selectOptions */ js.Array[DefaultOptionType] => Callback): Self = StObject.set(x, "loadData", js.Any.fromFunction1((t0: /* selectOptions */ js.Array[DefaultOptionType]) => value(t0).runNow()))
      
      inline def setLoadDataUndefined: Self = StObject.set(x, "loadData", js.undefined)
      
      inline def setLoadingIcon(value: VdomNode): Self = StObject.set(x, "loadingIcon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLoadingIconNull: Self = StObject.set(x, "loadingIcon", null)
      
      inline def setLoadingIconUndefined: Self = StObject.set(x, "loadingIcon", js.undefined)
      
      inline def setLoadingIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "loadingIcon", js.Array(value*))
      
      inline def setLoadingIconVdomElement(value: VdomElement): Self = StObject.set(x, "loadingIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: SingleValueType => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: SingleValueType) => value(t0).runNow()))
      
      inline def setOptions(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: DefaultOptionType*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSearchOptions(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "searchOptions", value.asInstanceOf[js.Any])
      
      inline def setSearchOptionsVarargs(value: DefaultOptionType*): Self = StObject.set(x, "searchOptions", js.Array(value*))
      
      inline def setValues(value: js.Array[SingleValueType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: SingleValueType*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type _To = Context[CascaderContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esContextMod.foo` */
  override def _to: Context[CascaderContextProps] = default
}
