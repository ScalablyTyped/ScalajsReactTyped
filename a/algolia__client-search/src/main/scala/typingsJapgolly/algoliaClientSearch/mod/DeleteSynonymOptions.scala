package typingsJapgolly.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSynonymOptions extends StObject {
  
  /**
    * If the delete synonym request should be forward to replicas.
    */
  val forwardToReplicas: js.UndefOr[Boolean] = js.undefined
}
object DeleteSynonymOptions {
  
  inline def apply(): DeleteSynonymOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSynonymOptions]
  }
  
  extension [Self <: DeleteSynonymOptions](x: Self) {
    
    inline def setForwardToReplicas(value: Boolean): Self = StObject.set(x, "forwardToReplicas", value.asInstanceOf[js.Any])
    
    inline def setForwardToReplicasUndefined: Self = StObject.set(x, "forwardToReplicas", js.undefined)
  }
}
