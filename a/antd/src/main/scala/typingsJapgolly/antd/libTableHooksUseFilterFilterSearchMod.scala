package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.antd.libTableInterfaceMod.FilterSearchType
import typingsJapgolly.antd.libTableInterfaceMod.TableLocale
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTableHooksUseFilterFilterSearchMod {
  
  @JSImport("antd/lib/table/hooks/useFilter/FilterSearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RecordType](hasValueOnChangeFilterSearchTablePrefixClsLocale: FilterSearchProps[RecordType]): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasValueOnChangeFilterSearchTablePrefixClsLocale.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait FilterSearchProps[RecordType] extends StObject {
    
    var filterSearch: FilterSearchType[RecordType]
    
    var locale: TableLocale
    
    def onChange(e: ReactEventFrom[HTMLInputElement]): Unit
    
    var tablePrefixCls: String
    
    var value: String
  }
  object FilterSearchProps {
    
    inline def apply[RecordType](
      filterSearch: FilterSearchType[RecordType],
      locale: TableLocale,
      onChange: ReactEventFrom[HTMLInputElement] => Callback,
      tablePrefixCls: String,
      value: String
    ): FilterSearchProps[RecordType] = {
      val __obj = js.Dynamic.literal(filterSearch = filterSearch.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => onChange(t0).runNow()), tablePrefixCls = tablePrefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterSearchProps[RecordType]]
    }
    
    extension [Self <: FilterSearchProps[?], RecordType](x: Self & FilterSearchProps[RecordType]) {
      
      inline def setFilterSearch(value: FilterSearchType[RecordType]): Self = StObject.set(x, "filterSearch", value.asInstanceOf[js.Any])
      
      inline def setFilterSearchFunction2(value: (/* input */ String, RecordType) => Boolean): Self = StObject.set(x, "filterSearch", js.Any.fromFunction2(value))
      
      inline def setLocale(value: TableLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setTablePrefixCls(value: String): Self = StObject.set(x, "tablePrefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
