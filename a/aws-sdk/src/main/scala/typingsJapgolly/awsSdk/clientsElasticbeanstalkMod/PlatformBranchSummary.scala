package typingsJapgolly.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlatformBranchSummary extends StObject {
  
  /**
    * The name of the platform branch.
    */
  var BranchName: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.BranchName] = js.undefined
  
  /**
    * An ordinal number that designates the order in which platform branches have been added to a platform. This can be helpful, for example, if your code calls the ListPlatformBranches action and then displays a list of platform branches. A larger BranchOrder value designates a newer platform branch within the platform.
    */
  var BranchOrder: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.BranchOrder] = js.undefined
  
  /**
    * The support life cycle state of the platform branch. Possible values: beta | supported | deprecated | retired 
    */
  var LifecycleState: js.UndefOr[PlatformBranchLifecycleState] = js.undefined
  
  /**
    * The name of the platform to which this platform branch belongs.
    */
  var PlatformName: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.PlatformName] = js.undefined
  
  /**
    * The environment tiers that platform versions in this branch support. Possible values: WebServer/Standard | Worker/SQS/HTTP 
    */
  var SupportedTierList: js.UndefOr[typingsJapgolly.awsSdk.clientsElasticbeanstalkMod.SupportedTierList] = js.undefined
}
object PlatformBranchSummary {
  
  inline def apply(): PlatformBranchSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlatformBranchSummary]
  }
  
  extension [Self <: PlatformBranchSummary](x: Self) {
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "BranchName", value.asInstanceOf[js.Any])
    
    inline def setBranchNameUndefined: Self = StObject.set(x, "BranchName", js.undefined)
    
    inline def setBranchOrder(value: BranchOrder): Self = StObject.set(x, "BranchOrder", value.asInstanceOf[js.Any])
    
    inline def setBranchOrderUndefined: Self = StObject.set(x, "BranchOrder", js.undefined)
    
    inline def setLifecycleState(value: PlatformBranchLifecycleState): Self = StObject.set(x, "LifecycleState", value.asInstanceOf[js.Any])
    
    inline def setLifecycleStateUndefined: Self = StObject.set(x, "LifecycleState", js.undefined)
    
    inline def setPlatformName(value: PlatformName): Self = StObject.set(x, "PlatformName", value.asInstanceOf[js.Any])
    
    inline def setPlatformNameUndefined: Self = StObject.set(x, "PlatformName", js.undefined)
    
    inline def setSupportedTierList(value: SupportedTierList): Self = StObject.set(x, "SupportedTierList", value.asInstanceOf[js.Any])
    
    inline def setSupportedTierListUndefined: Self = StObject.set(x, "SupportedTierList", js.undefined)
    
    inline def setSupportedTierListVarargs(value: SupportedTier*): Self = StObject.set(x, "SupportedTierList", js.Array(value*))
  }
}
