package typingsJapgolly.maximMazurokGapiClientBigquerydatatransfer.gapi.client.bigquerydatatransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceParameter extends StObject {
  
  /** All possible values for the parameter. */
  var allowedValues: js.UndefOr[js.Array[String]] = js.undefined
  
  /** If true, it should not be used in new transfers, and it should not be visible to users. */
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  /** Parameter description. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Parameter display name in the user interface. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Deprecated. This field has no effect. */
  var fields: js.UndefOr[js.Array[DataSourceParameter]] = js.undefined
  
  /** Cannot be changed after initial creation. */
  var immutable: js.UndefOr[Boolean] = js.undefined
  
  /** For integer and double values specifies maxminum allowed value. */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /** For integer and double values specifies minimum allowed value. */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /** Parameter identifier. */
  var paramId: js.UndefOr[String] = js.undefined
  
  /** Deprecated. This field has no effect. */
  var recurse: js.UndefOr[Boolean] = js.undefined
  
  /** Deprecated. This field has no effect. */
  var repeated: js.UndefOr[Boolean] = js.undefined
  
  /** Is parameter required. */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /** Parameter type. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Description of the requirements for this field, in case the user input does not fulfill the regex pattern or min/max values. */
  var validationDescription: js.UndefOr[String] = js.undefined
  
  /** URL to a help document to further explain the naming requirements. */
  var validationHelpUrl: js.UndefOr[String] = js.undefined
  
  /** Regular expression which can be used for parameter validation. */
  var validationRegex: js.UndefOr[String] = js.undefined
}
object DataSourceParameter {
  
  inline def apply(): DataSourceParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceParameter]
  }
  
  extension [Self <: DataSourceParameter](x: Self) {
    
    inline def setAllowedValues(value: js.Array[String]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
    
    inline def setAllowedValuesVarargs(value: String*): Self = StObject.set(x, "allowedValues", js.Array(value*))
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFields(value: js.Array[DataSourceParameter]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: DataSourceParameter*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setImmutable(value: Boolean): Self = StObject.set(x, "immutable", value.asInstanceOf[js.Any])
    
    inline def setImmutableUndefined: Self = StObject.set(x, "immutable", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setParamId(value: String): Self = StObject.set(x, "paramId", value.asInstanceOf[js.Any])
    
    inline def setParamIdUndefined: Self = StObject.set(x, "paramId", js.undefined)
    
    inline def setRecurse(value: Boolean): Self = StObject.set(x, "recurse", value.asInstanceOf[js.Any])
    
    inline def setRecurseUndefined: Self = StObject.set(x, "recurse", js.undefined)
    
    inline def setRepeated(value: Boolean): Self = StObject.set(x, "repeated", value.asInstanceOf[js.Any])
    
    inline def setRepeatedUndefined: Self = StObject.set(x, "repeated", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValidationDescription(value: String): Self = StObject.set(x, "validationDescription", value.asInstanceOf[js.Any])
    
    inline def setValidationDescriptionUndefined: Self = StObject.set(x, "validationDescription", js.undefined)
    
    inline def setValidationHelpUrl(value: String): Self = StObject.set(x, "validationHelpUrl", value.asInstanceOf[js.Any])
    
    inline def setValidationHelpUrlUndefined: Self = StObject.set(x, "validationHelpUrl", js.undefined)
    
    inline def setValidationRegex(value: String): Self = StObject.set(x, "validationRegex", value.asInstanceOf[js.Any])
    
    inline def setValidationRegexUndefined: Self = StObject.set(x, "validationRegex", js.undefined)
  }
}
