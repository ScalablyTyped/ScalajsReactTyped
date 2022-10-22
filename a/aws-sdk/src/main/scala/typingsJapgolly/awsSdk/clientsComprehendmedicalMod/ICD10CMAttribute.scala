package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICD10CMAttribute extends StObject {
  
  /**
    * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The category of attribute. Can be either of DX_NAME or TIME_EXPRESSION.
    */
  var Category: js.UndefOr[ICD10CMEntityType] = js.undefined
  
  /**
    * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to this entity.
    */
  var RelationshipScore: js.UndefOr[Float] = js.undefined
  
  /**
    * The type of relationship between the entity and attribute. Type for the relationship can be either of OVERLAP or SYSTEM_ORGAN_SITE.
    */
  var RelationshipType: js.UndefOr[ICD10CMRelationshipType] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as an attribute.
    */
  var Score: js.UndefOr[Float] = js.undefined
  
  /**
    * The segment of input text which contains the detected attribute.
    */
  var Text: js.UndefOr[String] = js.undefined
  
  /**
    * The contextual information for the attribute. The traits recognized by InferICD10CM are DIAGNOSIS, SIGN, SYMPTOM, and NEGATION.
    */
  var Traits: js.UndefOr[ICD10CMTraitList] = js.undefined
  
  /**
    * The type of attribute. InferICD10CM detects entities of the type DX_NAME. 
    */
  var Type: js.UndefOr[ICD10CMAttributeType] = js.undefined
}
object ICD10CMAttribute {
  
  inline def apply(): ICD10CMAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMAttribute]
  }
  
  extension [Self <: ICD10CMAttribute](x: Self) {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setCategory(value: ICD10CMEntityType): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
    
    inline def setId(value: Integer): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setRelationshipScore(value: Float): Self = StObject.set(x, "RelationshipScore", value.asInstanceOf[js.Any])
    
    inline def setRelationshipScoreUndefined: Self = StObject.set(x, "RelationshipScore", js.undefined)
    
    inline def setRelationshipType(value: ICD10CMRelationshipType): Self = StObject.set(x, "RelationshipType", value.asInstanceOf[js.Any])
    
    inline def setRelationshipTypeUndefined: Self = StObject.set(x, "RelationshipType", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setTraits(value: ICD10CMTraitList): Self = StObject.set(x, "Traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsUndefined: Self = StObject.set(x, "Traits", js.undefined)
    
    inline def setTraitsVarargs(value: ICD10CMTrait*): Self = StObject.set(x, "Traits", js.Array(value*))
    
    inline def setType(value: ICD10CMAttributeType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
