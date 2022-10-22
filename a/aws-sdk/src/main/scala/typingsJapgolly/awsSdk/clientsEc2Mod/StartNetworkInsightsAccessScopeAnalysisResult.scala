package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNetworkInsightsAccessScopeAnalysisResult extends StObject {
  
  /**
    * The Network Access Scope analysis.
    */
  var NetworkInsightsAccessScopeAnalysis: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeAnalysis] = js.undefined
}
object StartNetworkInsightsAccessScopeAnalysisResult {
  
  inline def apply(): StartNetworkInsightsAccessScopeAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartNetworkInsightsAccessScopeAnalysisResult]
  }
  
  extension [Self <: StartNetworkInsightsAccessScopeAnalysisResult](x: Self) {
    
    inline def setNetworkInsightsAccessScopeAnalysis(value: NetworkInsightsAccessScopeAnalysis): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysis", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeAnalysisUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysis", js.undefined)
  }
}
