package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedJustification extends StObject {
  
  /** Time the action took place. */
  var actionTime: js.UndefOr[String] = js.undefined
  
  /** Type of action performed on the document. */
  var actionType: js.UndefOr[String] = js.undefined
  
  /** Owner of the document. */
  var documentOwner: js.UndefOr[AppsDynamiteSharedJustificationPerson] = js.undefined
  
  /**
    * Words or phrases from the user's query that describes the document content. (Ex: Users query is "Can you share the document about Bullseye?" the extracted topic would be
    * "Bullseye").
    */
  var topics: js.UndefOr[js.Array[String]] = js.undefined
}
object AppsDynamiteSharedJustification {
  
  inline def apply(): AppsDynamiteSharedJustification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedJustification]
  }
  
  extension [Self <: AppsDynamiteSharedJustification](x: Self) {
    
    inline def setActionTime(value: String): Self = StObject.set(x, "actionTime", value.asInstanceOf[js.Any])
    
    inline def setActionTimeUndefined: Self = StObject.set(x, "actionTime", js.undefined)
    
    inline def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setDocumentOwner(value: AppsDynamiteSharedJustificationPerson): Self = StObject.set(x, "documentOwner", value.asInstanceOf[js.Any])
    
    inline def setDocumentOwnerUndefined: Self = StObject.set(x, "documentOwner", js.undefined)
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
