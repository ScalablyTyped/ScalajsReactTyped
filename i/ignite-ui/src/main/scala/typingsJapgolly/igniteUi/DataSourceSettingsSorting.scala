package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSettingsSorting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * If the sorting type is local and applyToAllData is true, sorting will be performed on the whole data source that's present locally, otherwise only on the current dataView. If sorting type is remote, this setting doesn't have any effect.
    *
    */
  var applyToAllData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if sorting will be case sensitive or not. Works only for local sorting
    *
    */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom comparison sorting function. Accepts the following arguments: fields, schema, booleand value whether sorting is ascending , convert function(please check option for customConvertFunc) and returns a value 0 indicating that values are equal, 1 indicating that val1 > val2 and -1 indicating that val1 < val2
    *
    */
  var compareFunc: js.UndefOr[Any] = js.undefined
  
  /**
    * Custom data value conversion function(called from sorting function). Accepts a value of the data cell and column key and should return the converted value
    *
    */
  var customConvertFunc: js.UndefOr[Any] = js.undefined
  
  /**
    * Custom sorting function that can point to either a string or a function object. When the function is called, the following arguments are passed: data array, fields (array of field definitions) , direction ("asc" or "desc"). The function should return a sorted data array
    *
    */
  var customFunc: js.UndefOr[Any] = js.undefined
  
  /**
    * Sorting direction
    *
    *
    * Valid values:
    * "none"
    * "asc"
    * "desc"
    */
  var defaultDirection: js.UndefOr[String] = js.undefined
  
  /**
    * When defaultDirection is different than "none", and defaultFields is specified, data will be initially sorted accordingly, directly after dataBind()
    *
    */
  var defaultFields: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Takes precedence over experssions, an "SQL-like" encoded expressions string  : see sort(). Example col2 > 100 ORDER BY asc
    *
    */
  var exprString: js.UndefOr[String] = js.undefined
  
  /**
    * A list of sorting expressions , consisting of the following keys (and their respective values): fieldName, direction and compareFunc (optional)
    *
    */
  var expressions: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * URL param value for ascending type of sorting. Default is null and uses OData conventions
    *
    */
  var sortUrlAscValueKey: js.UndefOr[String] = js.undefined
  
  /**
    * URL param value for descending type of sorting. Default is null and uses OData conventions
    *
    */
  var sortUrlDescValueKey: js.UndefOr[String] = js.undefined
  
  /**
    * URL param name which specifies how sorting expressions will be encoded in the URL. Default is null and uses OData conventions
    *
    */
  var sortUrlKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether sorting will be applied locally or remotely (via a remote request)
    *
    *
    * Valid values:
    * "remote"
    * "local"
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object DataSourceSettingsSorting {
  
  inline def apply(): DataSourceSettingsSorting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsSorting]
  }
  
  extension [Self <: DataSourceSettingsSorting](x: Self) {
    
    inline def setApplyToAllData(value: Boolean): Self = StObject.set(x, "applyToAllData", value.asInstanceOf[js.Any])
    
    inline def setApplyToAllDataUndefined: Self = StObject.set(x, "applyToAllData", js.undefined)
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setCompareFunc(value: Any): Self = StObject.set(x, "compareFunc", value.asInstanceOf[js.Any])
    
    inline def setCompareFuncUndefined: Self = StObject.set(x, "compareFunc", js.undefined)
    
    inline def setCustomConvertFunc(value: Any): Self = StObject.set(x, "customConvertFunc", value.asInstanceOf[js.Any])
    
    inline def setCustomConvertFuncUndefined: Self = StObject.set(x, "customConvertFunc", js.undefined)
    
    inline def setCustomFunc(value: Any): Self = StObject.set(x, "customFunc", value.asInstanceOf[js.Any])
    
    inline def setCustomFuncUndefined: Self = StObject.set(x, "customFunc", js.undefined)
    
    inline def setDefaultDirection(value: String): Self = StObject.set(x, "defaultDirection", value.asInstanceOf[js.Any])
    
    inline def setDefaultDirectionUndefined: Self = StObject.set(x, "defaultDirection", js.undefined)
    
    inline def setDefaultFields(value: js.Array[Any]): Self = StObject.set(x, "defaultFields", value.asInstanceOf[js.Any])
    
    inline def setDefaultFieldsUndefined: Self = StObject.set(x, "defaultFields", js.undefined)
    
    inline def setDefaultFieldsVarargs(value: Any*): Self = StObject.set(x, "defaultFields", js.Array(value*))
    
    inline def setExprString(value: String): Self = StObject.set(x, "exprString", value.asInstanceOf[js.Any])
    
    inline def setExprStringUndefined: Self = StObject.set(x, "exprString", js.undefined)
    
    inline def setExpressions(value: js.Array[Any]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsUndefined: Self = StObject.set(x, "expressions", js.undefined)
    
    inline def setExpressionsVarargs(value: Any*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setSortUrlAscValueKey(value: String): Self = StObject.set(x, "sortUrlAscValueKey", value.asInstanceOf[js.Any])
    
    inline def setSortUrlAscValueKeyUndefined: Self = StObject.set(x, "sortUrlAscValueKey", js.undefined)
    
    inline def setSortUrlDescValueKey(value: String): Self = StObject.set(x, "sortUrlDescValueKey", value.asInstanceOf[js.Any])
    
    inline def setSortUrlDescValueKeyUndefined: Self = StObject.set(x, "sortUrlDescValueKey", js.undefined)
    
    inline def setSortUrlKey(value: String): Self = StObject.set(x, "sortUrlKey", value.asInstanceOf[js.Any])
    
    inline def setSortUrlKeyUndefined: Self = StObject.set(x, "sortUrlKey", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
