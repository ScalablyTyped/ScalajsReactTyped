package typingsJapgolly.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKnowledgeBaseResponse extends StObject {
  
  /**
    * The knowledge base.
    */
  var knowledgeBase: js.UndefOr[KnowledgeBaseData] = js.undefined
}
object GetKnowledgeBaseResponse {
  
  inline def apply(): GetKnowledgeBaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKnowledgeBaseResponse]
  }
  
  extension [Self <: GetKnowledgeBaseResponse](x: Self) {
    
    inline def setKnowledgeBase(value: KnowledgeBaseData): Self = StObject.set(x, "knowledgeBase", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseUndefined: Self = StObject.set(x, "knowledgeBase", js.undefined)
  }
}
