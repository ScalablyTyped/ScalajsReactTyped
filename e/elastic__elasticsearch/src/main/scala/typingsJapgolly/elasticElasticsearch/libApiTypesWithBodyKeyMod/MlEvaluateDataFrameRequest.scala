package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.anon.Evaluation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Evaluation] = js.undefined
}
object MlEvaluateDataFrameRequest {
  
  inline def apply(): MlEvaluateDataFrameRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlEvaluateDataFrameRequest]
  }
  
  extension [Self <: MlEvaluateDataFrameRequest](x: Self) {
    
    inline def setBody(value: Evaluation): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
