package typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod

import typingsJapgolly.raml1Parser.anon.NameValue
import typingsJapgolly.raml1Parser.anon.Namespace
import typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.FragmentDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.HasSource because Already inherited
- typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.Annotable because Already inherited
- typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod.TypeDeclaration because var conflicts: __METADATA__, annotations, scalarsAnnotations, sourceMap. Inlined `type`, examples, simplifiedExamples, name, default, description, allowedTargets, xml, required, displayName, facets, fixedFacets, anyOf
- typingsJapgolly.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod.ObjectTypeDeclaration because var conflicts: __METADATA__, annotations, scalarsAnnotations, sourceMap. Inlined discriminator, discriminatorValue, properties, minProperties, maxProperties, additionalProperties */ trait ObjectTypeFragment
  extends StObject
     with FragmentDeclaration
     with TypeDeclarationFragment {
  
  /**
    * Provides default value for a property
    */
  var default: js.UndefOr[Any] = js.undefined
  
  /**
    * A Boolean that indicates if an object instance has additional properties.
    */
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Restrictions on where annotations of this type can be applied.
    * If this property is specified, annotations of this type may only
    * be applied on a property corresponding to one of the target names
    * specified as the value of this property.
    */
  var allowedTargets: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Lists available options for union types.
    */
  var anyOf: js.UndefOr[js.Array[TypeReference10]] = js.undefined
  
  /**
    * A longer, human-friendly description of the type
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Type property name to be used as discriminator, or boolean
    */
  var discriminator: js.UndefOr[String] = js.undefined
  
  /**
    * The value of discriminator for the type
    */
  var discriminatorValue: js.UndefOr[String] = js.undefined
  
  /**
    * The displayName attribute specifies the type display name.
    * It is a friendly name used only for  display or documentation purposes.
    * If displayName is not specified, it defaults to the element's name
    * (the name of the property itself
    */
  var displayName: String
  
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
  var facets: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
  
  /**
    * Returns facets fixed by the type. Value is an object with
    * properties named after facets fixed. Value of each property is
    * a value of the corresponding facet.
    */
  var fixedFacets: js.UndefOr[js.Array[NameValue]] = js.undefined
  
  /**
    * The maximum number of properties allowed for instances of this type.
    */
  var maxProperties: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum number of properties allowed for instances of this type.
    */
  var minProperties: js.UndefOr[Double] = js.undefined
  
  /**
    * Type name for top level types. For properties and parameters -- property o parameter name, respectively.
    * For bodies -- media type.
    */
  var name: String
  
  /**
    * The properties that instances of this type may or must have.
    */
  var properties: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
  
  /**
    * For property or parameter states if it is required.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array containing plain example values.String, boolean and number
    * values remain as is, while object and array values are serialized to string.
    */
  var simplifiedExamples: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
  
  var `type`: js.Array[TypeReference10]
  
  var xml: js.UndefOr[Namespace] = js.undefined
}
object ObjectTypeFragment {
  
  inline def apply(displayName: String, name: String, `type`: js.Array[TypeReference10]): ObjectTypeFragment = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeFragment]
  }
  
  extension [Self <: ObjectTypeFragment](x: Self) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setAllowedTargets(value: js.Array[String]): Self = StObject.set(x, "allowedTargets", value.asInstanceOf[js.Any])
    
    inline def setAllowedTargetsUndefined: Self = StObject.set(x, "allowedTargets", js.undefined)
    
    inline def setAllowedTargetsVarargs(value: String*): Self = StObject.set(x, "allowedTargets", js.Array(value*))
    
    inline def setAnyOf(value: js.Array[TypeReference10]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
    
    inline def setAnyOfVarargs(value: TypeReference10*): Self = StObject.set(x, "anyOf", js.Array(value*))
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    inline def setDiscriminatorUndefined: Self = StObject.set(x, "discriminator", js.undefined)
    
    inline def setDiscriminatorValue(value: String): Self = StObject.set(x, "discriminatorValue", value.asInstanceOf[js.Any])
    
    inline def setDiscriminatorValueUndefined: Self = StObject.set(x, "discriminatorValue", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setExamples(value: js.Array[ExampleSpec10]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: ExampleSpec10*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setFacets(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setFacetsVarargs(value: TypeDeclaration*): Self = StObject.set(x, "facets", js.Array(value*))
    
    inline def setFixedFacets(value: js.Array[NameValue]): Self = StObject.set(x, "fixedFacets", value.asInstanceOf[js.Any])
    
    inline def setFixedFacetsUndefined: Self = StObject.set(x, "fixedFacets", js.undefined)
    
    inline def setFixedFacetsVarargs(value: NameValue*): Self = StObject.set(x, "fixedFacets", js.Array(value*))
    
    inline def setMaxProperties(value: Double): Self = StObject.set(x, "maxProperties", value.asInstanceOf[js.Any])
    
    inline def setMaxPropertiesUndefined: Self = StObject.set(x, "maxProperties", js.undefined)
    
    inline def setMinProperties(value: Double): Self = StObject.set(x, "minProperties", value.asInstanceOf[js.Any])
    
    inline def setMinPropertiesUndefined: Self = StObject.set(x, "minProperties", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: TypeDeclaration*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSimplifiedExamples(value: js.Array[String | Double | Boolean]): Self = StObject.set(x, "simplifiedExamples", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedExamplesUndefined: Self = StObject.set(x, "simplifiedExamples", js.undefined)
    
    inline def setSimplifiedExamplesVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "simplifiedExamples", js.Array(value*))
    
    inline def setType(value: js.Array[TypeReference10]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: TypeReference10*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setXml(value: Namespace): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
