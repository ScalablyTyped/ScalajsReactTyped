package typingsJapgolly.awsSdk.clientsCloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleArrayOptions extends StObject {
  
  /**
    * A value to use for the field if the field isn't specified for a document.
    */
  var DefaultValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether facet information can be returned for the field.
    */
  var FacetEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the contents of the field can be returned in the search results.
    */
  var ReturnEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the contents of the field are searchable.
    */
  var SearchEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of source fields to map to the field. 
    */
  var SourceFields: js.UndefOr[FieldNameCommaList] = js.undefined
}
object DoubleArrayOptions {
  
  inline def apply(): DoubleArrayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleArrayOptions]
  }
  
  extension [Self <: DoubleArrayOptions](x: Self) {
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setFacetEnabled(value: Boolean): Self = StObject.set(x, "FacetEnabled", value.asInstanceOf[js.Any])
    
    inline def setFacetEnabledUndefined: Self = StObject.set(x, "FacetEnabled", js.undefined)
    
    inline def setReturnEnabled(value: Boolean): Self = StObject.set(x, "ReturnEnabled", value.asInstanceOf[js.Any])
    
    inline def setReturnEnabledUndefined: Self = StObject.set(x, "ReturnEnabled", js.undefined)
    
    inline def setSearchEnabled(value: Boolean): Self = StObject.set(x, "SearchEnabled", value.asInstanceOf[js.Any])
    
    inline def setSearchEnabledUndefined: Self = StObject.set(x, "SearchEnabled", js.undefined)
    
    inline def setSourceFields(value: FieldNameCommaList): Self = StObject.set(x, "SourceFields", value.asInstanceOf[js.Any])
    
    inline def setSourceFieldsUndefined: Self = StObject.set(x, "SourceFields", js.undefined)
  }
}
