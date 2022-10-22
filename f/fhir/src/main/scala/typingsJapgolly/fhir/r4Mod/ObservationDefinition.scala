package typingsJapgolly.fhir.r4Mod

import typingsJapgolly.fhir.fhirStrings.boolean
import typingsJapgolly.fhir.fhirStrings.dateTime
import typingsJapgolly.fhir.fhirStrings.integer
import typingsJapgolly.fhir.fhirStrings.string
import typingsJapgolly.fhir.fhirStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObservationDefinition
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _multipleResultsAllowed: js.UndefOr[Element] = js.undefined
  
  var _permittedDataType: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _preferredReportName: js.UndefOr[Element] = js.undefined
  
  /**
    * The set of abnormal coded results for the observation conforming to this ObservationDefinition.
    */
  var abnormalCodedValueSet: js.UndefOr[Reference] = js.undefined
  
  /**
    * This element allows various categorization schemes based on the owner’s definition of the category and effectively multiple categories can be used for one instance of ObservationDefinition. The level of granularity is defined by the category concepts in the value set.
    */
  var category: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Describes what will be observed. Sometimes this is called the observation "name".
    */
  var code: CodeableConcept
  
  /**
    * The set of critical coded results for the observation conforming to this ObservationDefinition.
    */
  var criticalCodedValueSet: js.UndefOr[Reference] = js.undefined
  
  /**
    * A unique identifier assigned to this ObservationDefinition artifact.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Only used if not implicit in observation code.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * An example of observation allowing multiple results is "bacteria identified by culture". Conversely, the measurement of a potassium level allows a single result.
    */
  var multipleResultsAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The set of normal coded results for the observations conforming to this ObservationDefinition.
    */
  var normalCodedValueSet: js.UndefOr[Reference] = js.undefined
  
  /**
    * The data types allowed for the value element of the instance observations conforming to this ObservationDefinition.
    */
  var permittedDataType: js.UndefOr[
    js.Array[
      typingsJapgolly.fhir.fhirStrings.Quantity | typingsJapgolly.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typingsJapgolly.fhir.fhirStrings.Range | typingsJapgolly.fhir.fhirStrings.Ratio | typingsJapgolly.fhir.fhirStrings.SampledData | time | dateTime | typingsJapgolly.fhir.fhirStrings.Period
    ]
  ] = js.undefined
  
  /**
    * The preferred name to be used when reporting the results of observations conforming to this ObservationDefinition.
    */
  var preferredReportName: js.UndefOr[String] = js.undefined
  
  /**
    * Multiple  ranges of results qualified by different contexts for ordinal or continuous observations conforming to this ObservationDefinition.
    */
  var qualifiedInterval: js.UndefOr[js.Array[ObservationDefinitionQualifiedInterval]] = js.undefined
  
  /**
    * Characteristics for quantitative results of this observation.
    */
  var quantitativeDetails: js.UndefOr[ObservationDefinitionQuantitativeDetails] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_ObservationDefinition: typingsJapgolly.fhir.fhirStrings.ObservationDefinition
  
  /**
    * The set of valid coded results for the observations  conforming to this ObservationDefinition.
    */
  var validCodedValueSet: js.UndefOr[Reference] = js.undefined
}
object ObservationDefinition {
  
  inline def apply(code: CodeableConcept): ObservationDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], resourceType = "ObservationDefinition")
    __obj.asInstanceOf[ObservationDefinition]
  }
  
  extension [Self <: ObservationDefinition](x: Self) {
    
    inline def setAbnormalCodedValueSet(value: Reference): Self = StObject.set(x, "abnormalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setAbnormalCodedValueSetUndefined: Self = StObject.set(x, "abnormalCodedValueSet", js.undefined)
    
    inline def setCategory(value: js.Array[CodeableConcept]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: CodeableConcept*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCriticalCodedValueSet(value: Reference): Self = StObject.set(x, "criticalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setCriticalCodedValueSetUndefined: Self = StObject.set(x, "criticalCodedValueSet", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMultipleResultsAllowed(value: Boolean): Self = StObject.set(x, "multipleResultsAllowed", value.asInstanceOf[js.Any])
    
    inline def setMultipleResultsAllowedUndefined: Self = StObject.set(x, "multipleResultsAllowed", js.undefined)
    
    inline def setNormalCodedValueSet(value: Reference): Self = StObject.set(x, "normalCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setNormalCodedValueSetUndefined: Self = StObject.set(x, "normalCodedValueSet", js.undefined)
    
    inline def setPermittedDataType(
      value: js.Array[
          typingsJapgolly.fhir.fhirStrings.Quantity | typingsJapgolly.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typingsJapgolly.fhir.fhirStrings.Range | typingsJapgolly.fhir.fhirStrings.Ratio | typingsJapgolly.fhir.fhirStrings.SampledData | time | dateTime | typingsJapgolly.fhir.fhirStrings.Period
        ]
    ): Self = StObject.set(x, "permittedDataType", value.asInstanceOf[js.Any])
    
    inline def setPermittedDataTypeUndefined: Self = StObject.set(x, "permittedDataType", js.undefined)
    
    inline def setPermittedDataTypeVarargs(
      value: (typingsJapgolly.fhir.fhirStrings.Quantity | typingsJapgolly.fhir.fhirStrings.CodeableConcept | string | boolean | integer | typingsJapgolly.fhir.fhirStrings.Range | typingsJapgolly.fhir.fhirStrings.Ratio | typingsJapgolly.fhir.fhirStrings.SampledData | time | dateTime | typingsJapgolly.fhir.fhirStrings.Period)*
    ): Self = StObject.set(x, "permittedDataType", js.Array(value*))
    
    inline def setPreferredReportName(value: String): Self = StObject.set(x, "preferredReportName", value.asInstanceOf[js.Any])
    
    inline def setPreferredReportNameUndefined: Self = StObject.set(x, "preferredReportName", js.undefined)
    
    inline def setQualifiedInterval(value: js.Array[ObservationDefinitionQualifiedInterval]): Self = StObject.set(x, "qualifiedInterval", value.asInstanceOf[js.Any])
    
    inline def setQualifiedIntervalUndefined: Self = StObject.set(x, "qualifiedInterval", js.undefined)
    
    inline def setQualifiedIntervalVarargs(value: ObservationDefinitionQualifiedInterval*): Self = StObject.set(x, "qualifiedInterval", js.Array(value*))
    
    inline def setQuantitativeDetails(value: ObservationDefinitionQuantitativeDetails): Self = StObject.set(x, "quantitativeDetails", value.asInstanceOf[js.Any])
    
    inline def setQuantitativeDetailsUndefined: Self = StObject.set(x, "quantitativeDetails", js.undefined)
    
    inline def setResourceType(value: typingsJapgolly.fhir.fhirStrings.ObservationDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setValidCodedValueSet(value: Reference): Self = StObject.set(x, "validCodedValueSet", value.asInstanceOf[js.Any])
    
    inline def setValidCodedValueSetUndefined: Self = StObject.set(x, "validCodedValueSet", js.undefined)
    
    inline def set_multipleResultsAllowed(value: Element): Self = StObject.set(x, "_multipleResultsAllowed", value.asInstanceOf[js.Any])
    
    inline def set_multipleResultsAllowedUndefined: Self = StObject.set(x, "_multipleResultsAllowed", js.undefined)
    
    inline def set_permittedDataType(value: js.Array[Element]): Self = StObject.set(x, "_permittedDataType", value.asInstanceOf[js.Any])
    
    inline def set_permittedDataTypeUndefined: Self = StObject.set(x, "_permittedDataType", js.undefined)
    
    inline def set_permittedDataTypeVarargs(value: Element*): Self = StObject.set(x, "_permittedDataType", js.Array(value*))
    
    inline def set_preferredReportName(value: Element): Self = StObject.set(x, "_preferredReportName", value.asInstanceOf[js.Any])
    
    inline def set_preferredReportNameUndefined: Self = StObject.set(x, "_preferredReportName", js.undefined)
  }
}
