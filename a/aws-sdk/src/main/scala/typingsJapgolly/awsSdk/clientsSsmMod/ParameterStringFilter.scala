package typingsJapgolly.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterStringFilter extends StObject {
  
  /**
    * The name of the filter. The ParameterStringFilter object is used by the DescribeParameters and GetParametersByPath API operations. However, not all of the pattern values listed for Key can be used with both operations. For DescribeParameters, all of the listed patterns are valid except Label. For GetParametersByPath, the following patterns listed for Key aren't valid: tag, DataType, Name, Path, and Tier. For examples of Amazon Web Services CLI commands demonstrating valid parameter filter constructions, see Searching for Systems Manager parameters in the Amazon Web Services Systems Manager User Guide.
    */
  var Key: ParameterStringFilterKey
  
  /**
    * For all filters used with DescribeParameters, valid options include Equals and BeginsWith. The Name filter additionally supports the Contains option. (Exception: For filters using the key Path, valid options include Recursive and OneLevel.) For filters used with GetParametersByPath, valid options include Equals and BeginsWith. (Exception: For filters using Label as the Key name, the only valid option is Equals.)
    */
  var Option: js.UndefOr[ParameterStringQueryOption] = js.undefined
  
  /**
    * The value you want to search for.
    */
  var Values: js.UndefOr[ParameterStringFilterValueList] = js.undefined
}
object ParameterStringFilter {
  
  inline def apply(Key: ParameterStringFilterKey): ParameterStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterStringFilter]
  }
  
  extension [Self <: ParameterStringFilter](x: Self) {
    
    inline def setKey(value: ParameterStringFilterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setOption(value: ParameterStringQueryOption): Self = StObject.set(x, "Option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "Option", js.undefined)
    
    inline def setValues(value: ParameterStringFilterValueList): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: ParameterStringFilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
