package typingsJapgolly.raml1Parser.distTypingsSpec1Dot0DatamodelMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.raml1Parser.anon.Namespace
import typingsJapgolly.raml1Parser.distTypingsSpec1Dot0CommonMod.AnnotationInstance
import typingsJapgolly.raml1Parser.distTypingsSpec1Dot0CommonMod.FragmentDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.raml1Parser.distTypingsSpec1Dot0CommonMod.Annotable because Already inherited
- typingsJapgolly.raml1Parser.distTypingsSpec1Dot0DatamodelMod.TypeDeclaration because var conflicts: __METADATA__, annotations, scalarsAnnotations. Inlined `type`, example, examples, structuredExample, name, default, description, allowedTargets, xml, required, displayName, facets, fixedFacets
- typingsJapgolly.raml1Parser.distTypingsSpec1Dot0DatamodelMod.StringTypeDeclaration because var conflicts: __METADATA__, annotations, scalarsAnnotations. Inlined `enum`, pattern, minLength, maxLength */ trait StringTypeFragment
  extends StObject
     with FragmentDeclaration
     with TypeDeclarationFragment {
  
  /**
    * Provides default value for a property
    */
  var default: js.UndefOr[Any] = js.undefined
  
  /**
    * Restrictions on where annotations of this type can be applied.
    * If this property is specified, annotations of this type may only
    * be applied on a property corresponding to one of the target names
    * specified as the value of this property.
    */
  var allowedTargets: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A longer, human-friendly description of the type
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The displayName attribute specifies the type display name.
    * It is a friendly name used only for  display or documentation purposes.
    * If displayName is not specified, it defaults to the element's key
    * (the name of the property itself
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The enum attribute provides an enumeration of the parameter's valid values.
    * This MUST be an array. If the enum attribute is defined, API clients
    * and servers MUST verify that a parameter's value matches a value in the enum array.
    * If there is no matching value, the clients and servers MUST treat this as an error.
    */
  var `enum`: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An example of this type instance represented as string or
    * yaml map/sequence. This can be used, e.g., by documentation
    * generators to generate sample values for an object of this type.
    * Cannot be present if the examples property is present
    */
  var example: js.UndefOr[Any] = js.undefined
  
  /**
    * An example of this type instance represented as string.
    * This can be used, e.g., by documentation generators to generate
    * sample values for an object of this type. Cannot be present
    * if the example property is present
    */
  var examples: js.UndefOr[js.Array[ExampleSpec10]] = js.undefined
  
  /**
    * When extending from a type you can define new facets
    * (which can then be set to concrete values by subtypes).
    */
  var facets: js.UndefOr[StringDictionary[TypeReference10]] = js.undefined
  
  /**
    * Returns facets fixed by the type. Value is an object with
    * properties named after facets fixed. Value of each property is
    * a value of the corresponding facet.
    */
  var fixedFacets: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Maximum length of the string
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum length of the string
    */
  var minLength: js.UndefOr[Double] = js.undefined
  
  /**
    * name of the parameter
    */
  var name: String
  
  /**
    * Regular expression that this string should path
    */
  var pattern: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Sets if property is optional or not
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  var structuredExample: js.UndefOr[ExampleSpec10] = js.undefined
  
  var `type`: TypeReference10
  
  var xml: js.UndefOr[Namespace] = js.undefined
}
object StringTypeFragment {
  
  inline def apply(
    __METADATA__ : Any,
    annotations: StringDictionary[AnnotationInstance | js.Array[AnnotationInstance]],
    name: String,
    scalarsAnnotations: StringDictionary[js.Array[AnnotationInstance | js.Array[AnnotationInstance]]],
    `type`: TypeReference10
  ): StringTypeFragment = {
    val __obj = js.Dynamic.literal(__METADATA__ = __METADATA__.asInstanceOf[js.Any], annotations = annotations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scalarsAnnotations = scalarsAnnotations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringTypeFragment]
  }
  
  extension [Self <: StringTypeFragment](x: Self) {
    
    inline def setAllowedTargets(value: js.Array[String]): Self = StObject.set(x, "allowedTargets", value.asInstanceOf[js.Any])
    
    inline def setAllowedTargetsUndefined: Self = StObject.set(x, "allowedTargets", js.undefined)
    
    inline def setAllowedTargetsVarargs(value: String*): Self = StObject.set(x, "allowedTargets", js.Array(value*))
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value*))
    
    inline def setExample(value: Any): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
    
    inline def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
    
    inline def setExamples(value: js.Array[ExampleSpec10]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: ExampleSpec10*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setFacets(value: StringDictionary[TypeReference10]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setFixedFacets(value: StringDictionary[Any]): Self = StObject.set(x, "fixedFacets", value.asInstanceOf[js.Any])
    
    inline def setFixedFacetsUndefined: Self = StObject.set(x, "fixedFacets", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: js.Array[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPatternVarargs(value: String*): Self = StObject.set(x, "pattern", js.Array(value*))
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setStructuredExample(value: ExampleSpec10): Self = StObject.set(x, "structuredExample", value.asInstanceOf[js.Any])
    
    inline def setStructuredExampleUndefined: Self = StObject.set(x, "structuredExample", js.undefined)
    
    inline def setType(value: TypeReference10): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setXml(value: Namespace): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
