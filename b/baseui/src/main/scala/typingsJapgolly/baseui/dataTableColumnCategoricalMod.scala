package typingsJapgolly.baseui

import japgolly.scalajs.react.Callback
import typingsJapgolly.baseui.dataTableTypesMod.ColumnOptions
import typingsJapgolly.baseui.dataTableTypesMod.SharedColumnOptions
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableColumnCategoricalMod {
  
  @JSImport("baseui/data-table/column-categorical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): CategoricalColumn = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[CategoricalColumn]
  
  inline def CategoricalFilter(props: CategoricalFilterProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CategoricalFilter")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type CategoricalColumn = ColumnOptions[String, FilterParameters]
  
  trait CategoricalFilterProps extends StObject {
    
    def close(): Unit
    
    var data: js.Array[String]
    
    var filterParams: js.UndefOr[FilterParameters] = js.undefined
    
    def setFilter(a: FilterParameters): Unit
  }
  object CategoricalFilterProps {
    
    inline def apply(close: Callback, data: js.Array[String], setFilter: FilterParameters => Callback): CategoricalFilterProps = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, data = data.asInstanceOf[js.Any], setFilter = js.Any.fromFunction1((t0: FilterParameters) => setFilter(t0).runNow()))
      __obj.asInstanceOf[CategoricalFilterProps]
    }
    
    extension [Self <: CategoricalFilterProps](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFilterParams(value: FilterParameters): Self = StObject.set(x, "filterParams", value.asInstanceOf[js.Any])
      
      inline def setFilterParamsUndefined: Self = StObject.set(x, "filterParams", js.undefined)
      
      inline def setSetFilter(value: FilterParameters => Callback): Self = StObject.set(x, "setFilter", js.Any.fromFunction1((t0: FilterParameters) => value(t0).runNow()))
    }
  }
  
  trait FilterParameters extends StObject {
    
    var description: String
    
    var exclude: Boolean
    
    var selection: Set[String]
  }
  object FilterParameters {
    
    inline def apply(description: String, exclude: Boolean, selection: Set[String]): FilterParameters = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], exclude = exclude.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterParameters]
    }
    
    extension [Self <: FilterParameters](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: Set[String]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    }
  }
  
  type Options = SharedColumnOptions[String]
}
