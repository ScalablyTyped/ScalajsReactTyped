package typingsJapgolly.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightResult extends StObject {
  
  /**
    * The summary information of an insight.
    */
  var Insight: js.UndefOr[typingsJapgolly.awsSdk.clientsXrayMod.Insight] = js.undefined
}
object GetInsightResult {
  
  inline def apply(): GetInsightResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightResult]
  }
  
  extension [Self <: GetInsightResult](x: Self) {
    
    inline def setInsight(value: Insight): Self = StObject.set(x, "Insight", value.asInstanceOf[js.Any])
    
    inline def setInsightUndefined: Self = StObject.set(x, "Insight", js.undefined)
  }
}
