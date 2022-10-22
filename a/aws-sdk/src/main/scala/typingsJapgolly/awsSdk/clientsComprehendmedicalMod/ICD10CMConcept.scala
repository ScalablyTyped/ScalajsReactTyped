package typingsJapgolly.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICD10CMConcept extends StObject {
  
  /**
    * The ICD-10-CM code that identifies the concept found in the knowledge base from the Centers for Disease Control.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The long description of the ICD-10-CM code in the ontology.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to an ICD-10-CM concept.
    */
  var Score: js.UndefOr[Float] = js.undefined
}
object ICD10CMConcept {
  
  inline def apply(): ICD10CMConcept = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICD10CMConcept]
  }
  
  extension [Self <: ICD10CMConcept](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setScore(value: Float): Self = StObject.set(x, "Score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "Score", js.undefined)
  }
}
