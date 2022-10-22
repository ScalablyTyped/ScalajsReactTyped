package typingsJapgolly.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProfilingGroupRequest extends StObject {
  
  /**
    *  Specifies whether profiling is enabled or disabled for the created profiling group. 
    */
  var agentOrchestrationConfig: js.UndefOr[AgentOrchestrationConfig] = js.undefined
  
  /**
    *  Amazon CodeGuru Profiler uses this universally unique identifier (UUID) to prevent the accidental creation of duplicate profiling groups if there are failures and retries. 
    */
  var clientToken: ClientToken
  
  /**
    *  The compute platform of the profiling group. Use AWSLambda if your application runs on AWS Lambda. Use Default if your application runs on a compute platform that is not AWS Lambda, such an Amazon EC2 instance, an on-premises server, or a different platform. If not specified, Default is used. 
    */
  var computePlatform: js.UndefOr[ComputePlatform] = js.undefined
  
  /**
    * The name of the profiling group to create.
    */
  var profilingGroupName: ProfilingGroupName
  
  /**
    *  A list of tags to add to the created profiling group. 
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateProfilingGroupRequest {
  
  inline def apply(clientToken: ClientToken, profilingGroupName: ProfilingGroupName): CreateProfilingGroupRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfilingGroupRequest]
  }
  
  extension [Self <: CreateProfilingGroupRequest](x: Self) {
    
    inline def setAgentOrchestrationConfig(value: AgentOrchestrationConfig): Self = StObject.set(x, "agentOrchestrationConfig", value.asInstanceOf[js.Any])
    
    inline def setAgentOrchestrationConfigUndefined: Self = StObject.set(x, "agentOrchestrationConfig", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setComputePlatform(value: ComputePlatform): Self = StObject.set(x, "computePlatform", value.asInstanceOf[js.Any])
    
    inline def setComputePlatformUndefined: Self = StObject.set(x, "computePlatform", js.undefined)
    
    inline def setProfilingGroupName(value: ProfilingGroupName): Self = StObject.set(x, "profilingGroupName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
