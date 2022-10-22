package typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebEntity extends StObject {
  
  /** Canonical description of the entity, in English. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Opaque entity ID. */
  var entityId: js.UndefOr[String] = js.undefined
  
  /** Overall relevancy score for the entity. Not normalized and not comparable across different image queries. */
  var score: js.UndefOr[Double] = js.undefined
}
object WebEntity {
  
  inline def apply(): WebEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebEntity]
  }
  
  extension [Self <: WebEntity](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
