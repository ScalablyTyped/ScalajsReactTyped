package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationJobResourceLimit extends StObject {
  
  /**
    * Defines the maximum number of load tests.
    */
  var MaxNumberOfTests: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.MaxNumberOfTests] = js.undefined
  
  /**
    * Defines the maximum number of parallel load tests.
    */
  var MaxParallelOfTests: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.MaxParallelOfTests] = js.undefined
}
object RecommendationJobResourceLimit {
  
  inline def apply(): RecommendationJobResourceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationJobResourceLimit]
  }
  
  extension [Self <: RecommendationJobResourceLimit](x: Self) {
    
    inline def setMaxNumberOfTests(value: MaxNumberOfTests): Self = StObject.set(x, "MaxNumberOfTests", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfTestsUndefined: Self = StObject.set(x, "MaxNumberOfTests", js.undefined)
    
    inline def setMaxParallelOfTests(value: MaxParallelOfTests): Self = StObject.set(x, "MaxParallelOfTests", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelOfTestsUndefined: Self = StObject.set(x, "MaxParallelOfTests", js.undefined)
  }
}
