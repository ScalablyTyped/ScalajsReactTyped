package typingsJapgolly.reactBootstrapTable2Filter

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactBootstrapTable2Filter.mod.MultiSelectFilterOptions
import typingsJapgolly.reactBootstrapTable2Filter.mod.SelectFilterOptions
import typingsJapgolly.reactBootstrapTable2Filter.reactBootstrapTable2FilterStrings._empty
import typingsJapgolly.reactBootstrapTableNext.mod.ColumnDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Comparator extends StObject {
    
    var comparator: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator
    
    var date: js.Date
  }
  object Comparator {
    
    inline def apply(comparator: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator, date: js.Date): Comparator = {
      val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comparator]
    }
    
    extension [Self <: Comparator](x: Self) {
      
      inline def setComparator(value: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComparatorNumber extends StObject {
    
    var comparator: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator
    
    var number: Double
  }
  object ComparatorNumber {
    
    inline def apply(comparator: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator, number: Double): ComparatorNumber = {
      val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComparatorNumber]
    }
    
    extension [Self <: ComparatorNumber](x: Self) {
      
      inline def setComparator(value: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait Label extends StObject {
    
    var label: String
    
    var value: Double
  }
  object Label {
    
    inline def apply(label: String, value: Double): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Number extends StObject {
    
    var comparator: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator
    
    var number: Double | _empty
  }
  object Number {
    
    inline def apply(comparator: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator, number: Double | _empty): Number = {
      val __obj = js.Dynamic.literal(comparator = comparator.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Number]
    }
    
    extension [Self <: Number](x: Self) {
      
      inline def setComparator(value: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double | _empty): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.MultiSelectFilterProps<any>> */
  trait PartialMultiSelectFilterP extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var comparator: js.UndefOr[typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var getFilter: js.UndefOr[
        js.Function1[
          /* filter */ js.Function1[/* value */ js.Array[String], Unit | js.Array[Any]], 
          Unit
        ]
      ] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ js.Array[String], Unit | js.Array[Any]]] = js.undefined
    
    var options: js.UndefOr[MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  }
  object PartialMultiSelectFilterP {
    
    inline def apply(): PartialMultiSelectFilterP = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMultiSelectFilterP]
    }
    
    extension [Self <: PartialMultiSelectFilterP](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComparator(value: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setGetFilter(value: /* filter */ js.Function1[/* value */ js.Array[String], Unit | js.Array[Any]] => Callback): Self = StObject.set(x, "getFilter", js.Any.fromFunction1((t0: /* filter */ js.Function1[/* value */ js.Array[String], Unit | js.Array[Any]]) => value(t0).runNow()))
      
      inline def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnFilter(value: /* filterValue */ js.Array[String] => Unit | js.Array[Any]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      inline def setOptions(value: MultiSelectFilterOptions | js.Function0[MultiSelectFilterOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsCallbackTo(value: CallbackTo[MultiSelectFilterOptions]): Self = StObject.set(x, "options", value.toJsFn)
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
      
      inline def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.NumberFilterProps<any>> */
  trait PartialNumberFilterPropsa extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var comparatorClassName: js.UndefOr[String] = js.undefined
    
    var comparatorStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var comparators: js.UndefOr[js.Array[typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator]] = js.undefined
    
    var defaultValue: js.UndefOr[ComparatorNumber] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var getFilter: js.UndefOr[
        js.Function1[/* filter */ js.Function1[/* value */ Number, Unit | js.Array[Any]], Unit]
      ] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var numberClassName: js.UndefOr[String] = js.undefined
    
    var numberStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ Number, Unit | js.Array[Any]]] = js.undefined
    
    var options: js.UndefOr[js.Array[Double]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var withoutEmptyComparatorOption: js.UndefOr[Boolean] = js.undefined
    
    var withoutEmptyNumberOption: js.UndefOr[Boolean] = js.undefined
  }
  object PartialNumberFilterPropsa {
    
    inline def apply(): PartialNumberFilterPropsa = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNumberFilterPropsa]
    }
    
    extension [Self <: PartialNumberFilterPropsa](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComparatorClassName(value: String): Self = StObject.set(x, "comparatorClassName", value.asInstanceOf[js.Any])
      
      inline def setComparatorClassNameUndefined: Self = StObject.set(x, "comparatorClassName", js.undefined)
      
      inline def setComparatorStyle(value: CSSProperties): Self = StObject.set(x, "comparatorStyle", value.asInstanceOf[js.Any])
      
      inline def setComparatorStyleUndefined: Self = StObject.set(x, "comparatorStyle", js.undefined)
      
      inline def setComparators(value: js.Array[typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator]): Self = StObject.set(x, "comparators", value.asInstanceOf[js.Any])
      
      inline def setComparatorsUndefined: Self = StObject.set(x, "comparators", js.undefined)
      
      inline def setComparatorsVarargs(value: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator*): Self = StObject.set(x, "comparators", js.Array(value*))
      
      inline def setDefaultValue(value: ComparatorNumber): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setGetFilter(value: /* filter */ js.Function1[/* value */ Number, Unit | js.Array[Any]] => Callback): Self = StObject.set(x, "getFilter", js.Any.fromFunction1((t0: /* filter */ js.Function1[/* value */ Number, Unit | js.Array[Any]]) => value(t0).runNow()))
      
      inline def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNumberClassName(value: String): Self = StObject.set(x, "numberClassName", value.asInstanceOf[js.Any])
      
      inline def setNumberClassNameUndefined: Self = StObject.set(x, "numberClassName", js.undefined)
      
      inline def setNumberStyle(value: CSSProperties): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
      
      inline def setNumberStyleUndefined: Self = StObject.set(x, "numberStyle", js.undefined)
      
      inline def setOnFilter(value: /* filterValue */ Number => Unit | js.Array[Any]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      inline def setOptions(value: js.Array[Double]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Double*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWithoutEmptyComparatorOption(value: Boolean): Self = StObject.set(x, "withoutEmptyComparatorOption", value.asInstanceOf[js.Any])
      
      inline def setWithoutEmptyComparatorOptionUndefined: Self = StObject.set(x, "withoutEmptyComparatorOption", js.undefined)
      
      inline def setWithoutEmptyNumberOption(value: Boolean): Self = StObject.set(x, "withoutEmptyNumberOption", value.asInstanceOf[js.Any])
      
      inline def setWithoutEmptyNumberOptionUndefined: Self = StObject.set(x, "withoutEmptyNumberOption", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.SelectFilterProps<any>> */
  trait PartialSelectFilterPropsa extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var comparator: js.UndefOr[typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var getFilter: js.UndefOr[
        js.Function1[/* filter */ js.Function1[/* value */ String, Unit | js.Array[Any]], Unit]
      ] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[Any]]] = js.undefined
    
    var options: js.UndefOr[
        SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[Any, Any], SelectFilterOptions])
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var withoutEmptyOption: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSelectFilterPropsa {
    
    inline def apply(): PartialSelectFilterPropsa = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSelectFilterPropsa]
    }
    
    extension [Self <: PartialSelectFilterPropsa](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComparator(value: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setGetFilter(value: /* filter */ js.Function1[/* value */ String, Unit | js.Array[Any]] => Callback): Self = StObject.set(x, "getFilter", js.Any.fromFunction1((t0: /* filter */ js.Function1[/* value */ String, Unit | js.Array[Any]]) => value(t0).runNow()))
      
      inline def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnFilter(value: /* filterValue */ String => Unit | js.Array[Any]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      inline def setOptions(
        value: SelectFilterOptions | (js.Function1[/* column */ ColumnDescription[Any, Any], SelectFilterOptions])
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsFunction1(value: /* column */ ColumnDescription[Any, Any] => SelectFilterOptions): Self = StObject.set(x, "options", js.Any.fromFunction1(value))
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: Label*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWithoutEmptyOption(value: Boolean): Self = StObject.set(x, "withoutEmptyOption", value.asInstanceOf[js.Any])
      
      inline def setWithoutEmptyOptionUndefined: Self = StObject.set(x, "withoutEmptyOption", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-bootstrap-table2-filter.react-bootstrap-table2-filter.TextFilterProps<any>> */
  trait PartialTextFilterPropsany extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var comparator: js.UndefOr[typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator] = js.undefined
    
    var defaultValue: js.UndefOr[Any] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var getFilter: js.UndefOr[
        js.Function1[/* filter */ js.Function1[/* value */ String, Unit | js.Array[Any]], Unit]
      ] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* e */ ReactEventFrom[Element], Unit]] = js.undefined
    
    var onFilter: js.UndefOr[js.Function1[/* filterValue */ String, Unit | js.Array[Any]]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PartialTextFilterPropsany {
    
    inline def apply(): PartialTextFilterPropsany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialTextFilterPropsany]
    }
    
    extension [Self <: PartialTextFilterPropsany](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComparator(value: typingsJapgolly.reactBootstrapTable2Filter.mod.Comparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
      
      inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
      
      inline def setDefaultValue(value: Any): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setGetFilter(value: /* filter */ js.Function1[/* value */ String, Unit | js.Array[Any]] => Callback): Self = StObject.set(x, "getFilter", js.Any.fromFunction1((t0: /* filter */ js.Function1[/* value */ String, Unit | js.Array[Any]]) => value(t0).runNow()))
      
      inline def setGetFilterUndefined: Self = StObject.set(x, "getFilter", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnClick(value: /* e */ ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnFilter(value: /* filterValue */ String => Unit | js.Array[Any]): Self = StObject.set(x, "onFilter", js.Any.fromFunction1(value))
      
      inline def setOnFilterUndefined: Self = StObject.set(x, "onFilter", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
