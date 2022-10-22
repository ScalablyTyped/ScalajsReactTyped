package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopChannelResponse extends StObject {
  
  /**
    * The unique arn of the channel.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * Specification of CDI inputs for this channel
    */
  var CdiInputSpecification: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.CdiInputSpecification] = js.undefined
  
  /**
    * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one pipeline.
    */
  var ChannelClass: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.ChannelClass] = js.undefined
  
  /**
    * A list of destinations of the channel. For UDP outputs, there is one
  destination per output. For other types (HLS, for example), there is
  one destination per packager.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.undefined
  
  /**
    * The endpoints where outgoing connections initiate from
    */
  var EgressEndpoints: js.UndefOr[listOfChannelEgressEndpoint] = js.undefined
  
  var EncoderSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.EncoderSettings] = js.undefined
  
  /**
    * The unique id of the channel.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * List of input attachments for channel.
    */
  var InputAttachments: js.UndefOr[listOfInputAttachment] = js.undefined
  
  /**
    * Specification of network and file inputs for this channel
    */
  var InputSpecification: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.InputSpecification] = js.undefined
  
  /**
    * The log level being written to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.LogLevel] = js.undefined
  
  /**
    * Maintenance settings for this channel.
    */
  var Maintenance: js.UndefOr[MaintenanceStatus] = js.undefined
  
  /**
    * The name of the channel. (user-mutable)
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * Runtime details for the pipelines of a running channel.
    */
  var PipelineDetails: js.UndefOr[listOfPipelineDetail] = js.undefined
  
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[integer] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
    */
  var RoleArn: js.UndefOr[string] = js.undefined
  
  var State: js.UndefOr[ChannelState] = js.undefined
  
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.Tags] = js.undefined
  
  /**
    * Settings for VPC output
    */
  var Vpc: js.UndefOr[VpcOutputSettingsDescription] = js.undefined
}
object StopChannelResponse {
  
  inline def apply(): StopChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopChannelResponse]
  }
  
  extension [Self <: StopChannelResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCdiInputSpecification(value: CdiInputSpecification): Self = StObject.set(x, "CdiInputSpecification", value.asInstanceOf[js.Any])
    
    inline def setCdiInputSpecificationUndefined: Self = StObject.set(x, "CdiInputSpecification", js.undefined)
    
    inline def setChannelClass(value: ChannelClass): Self = StObject.set(x, "ChannelClass", value.asInstanceOf[js.Any])
    
    inline def setChannelClassUndefined: Self = StObject.set(x, "ChannelClass", js.undefined)
    
    inline def setDestinations(value: listOfOutputDestination): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: OutputDestination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setEgressEndpoints(value: listOfChannelEgressEndpoint): Self = StObject.set(x, "EgressEndpoints", value.asInstanceOf[js.Any])
    
    inline def setEgressEndpointsUndefined: Self = StObject.set(x, "EgressEndpoints", js.undefined)
    
    inline def setEgressEndpointsVarargs(value: ChannelEgressEndpoint*): Self = StObject.set(x, "EgressEndpoints", js.Array(value*))
    
    inline def setEncoderSettings(value: EncoderSettings): Self = StObject.set(x, "EncoderSettings", value.asInstanceOf[js.Any])
    
    inline def setEncoderSettingsUndefined: Self = StObject.set(x, "EncoderSettings", js.undefined)
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInputAttachments(value: listOfInputAttachment): Self = StObject.set(x, "InputAttachments", value.asInstanceOf[js.Any])
    
    inline def setInputAttachmentsUndefined: Self = StObject.set(x, "InputAttachments", js.undefined)
    
    inline def setInputAttachmentsVarargs(value: InputAttachment*): Self = StObject.set(x, "InputAttachments", js.Array(value*))
    
    inline def setInputSpecification(value: InputSpecification): Self = StObject.set(x, "InputSpecification", value.asInstanceOf[js.Any])
    
    inline def setInputSpecificationUndefined: Self = StObject.set(x, "InputSpecification", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
    
    inline def setMaintenance(value: MaintenanceStatus): Self = StObject.set(x, "Maintenance", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceUndefined: Self = StObject.set(x, "Maintenance", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPipelineDetails(value: listOfPipelineDetail): Self = StObject.set(x, "PipelineDetails", value.asInstanceOf[js.Any])
    
    inline def setPipelineDetailsUndefined: Self = StObject.set(x, "PipelineDetails", js.undefined)
    
    inline def setPipelineDetailsVarargs(value: PipelineDetail*): Self = StObject.set(x, "PipelineDetails", js.Array(value*))
    
    inline def setPipelinesRunningCount(value: integer): Self = StObject.set(x, "PipelinesRunningCount", value.asInstanceOf[js.Any])
    
    inline def setPipelinesRunningCountUndefined: Self = StObject.set(x, "PipelinesRunningCount", js.undefined)
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setState(value: ChannelState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVpc(value: VpcOutputSettingsDescription): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
