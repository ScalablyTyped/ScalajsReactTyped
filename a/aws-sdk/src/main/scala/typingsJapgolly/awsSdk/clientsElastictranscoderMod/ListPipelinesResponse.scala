package typingsJapgolly.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelinesResponse extends StObject {
  
  /**
    * A value that you use to access the second and subsequent pages of results, if any. When the pipelines fit on one page or when you've reached the last page of results, the value of NextPageToken is null.
    */
  var NextPageToken: js.UndefOr[Id] = js.undefined
  
  /**
    * An array of Pipeline objects.
    */
  var Pipelines: js.UndefOr[typingsJapgolly.awsSdk.clientsElastictranscoderMod.Pipelines] = js.undefined
}
object ListPipelinesResponse {
  
  inline def apply(): ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesResponse]
  }
  
  extension [Self <: ListPipelinesResponse](x: Self) {
    
    inline def setNextPageToken(value: Id): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setPipelines(value: Pipelines): Self = StObject.set(x, "Pipelines", value.asInstanceOf[js.Any])
    
    inline def setPipelinesUndefined: Self = StObject.set(x, "Pipelines", js.undefined)
    
    inline def setPipelinesVarargs(value: Pipeline*): Self = StObject.set(x, "Pipelines", js.Array(value*))
  }
}
