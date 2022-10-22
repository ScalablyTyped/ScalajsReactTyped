package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGatewayInformationOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon CloudWatch log group that is used to monitor events in the gateway. This field only only exist and returns once it have been chosen and set by the SGW service, based on the OS version of the gateway VM
    */
  var CloudWatchLogGroupARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.CloudWatchLogGroupARN] = js.undefined
  
  /**
    * Date after which this gateway will not receive software updates for new features and bug fixes.
    */
  var DeprecationDate: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.DeprecationDate] = js.undefined
  
  /**
    * The ID of the Amazon EC2 instance that was used to launch the gateway.
    */
  var Ec2InstanceId: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.Ec2InstanceId] = js.undefined
  
  /**
    * The Amazon Web Services Region where the Amazon EC2 instance is located.
    */
  var Ec2InstanceRegion: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.Ec2InstanceRegion] = js.undefined
  
  /**
    * The type of endpoint for your gateway. Valid Values: STANDARD | FIPS 
    */
  var EndpointType: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.EndpointType] = js.undefined
  
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  
  /**
    * Specifies the size of the gateway's metadata cache.
    */
  var GatewayCapacity: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayCapacity] = js.undefined
  
  /**
    * The unique identifier assigned to your gateway during activation. This ID becomes part of the gateway Amazon Resource Name (ARN), which you use as input for other operations.
    */
  var GatewayId: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayId] = js.undefined
  
  /**
    * The name you configured for your gateway.
    */
  var GatewayName: js.UndefOr[String] = js.undefined
  
  /**
    * A NetworkInterface array that contains descriptions of the gateway network interfaces.
    */
  var GatewayNetworkInterfaces: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayNetworkInterfaces] = js.undefined
  
  /**
    * A value that indicates the operating state of the gateway.
    */
  var GatewayState: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayState] = js.undefined
  
  /**
    * A value that indicates the time zone configured for the gateway.
    */
  var GatewayTimezone: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayTimezone] = js.undefined
  
  /**
    * The type of the gateway.
    */
  var GatewayType: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayType] = js.undefined
  
  /**
    * The type of hardware or software platform on which the gateway is running.
    */
  var HostEnvironment: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.HostEnvironment] = js.undefined
  
  /**
    * A unique identifier for the specific instance of the host platform running the gateway. This value is only available for certain host environments, and its format depends on the host environment type.
    */
  var HostEnvironmentId: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.HostEnvironmentId] = js.undefined
  
  /**
    * The date on which the last software update was applied to the gateway. If the gateway has never been updated, this field does not return a value in the response. This only only exist and returns once it have been chosen and set by the SGW service, based on the OS version of the gateway VM
    */
  var LastSoftwareUpdate: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.LastSoftwareUpdate] = js.undefined
  
  /**
    * The date on which an update to the gateway is available. This date is in the time zone of the gateway. If the gateway is not available for an update this field is not returned in the response.
    */
  var NextUpdateAvailabilityDate: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.NextUpdateAvailabilityDate] = js.undefined
  
  /**
    * Date after which this gateway will not receive software updates for new features.
    */
  var SoftwareUpdatesEndDate: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.SoftwareUpdatesEndDate] = js.undefined
  
  /**
    * A list of the metadata cache sizes that the gateway can support based on its current hardware specifications.
    */
  var SupportedGatewayCapacities: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.SupportedGatewayCapacities] = js.undefined
  
  /**
    * A list of up to 50 tags assigned to the gateway, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.Tags] = js.undefined
  
  /**
    * The configuration settings for the virtual private cloud (VPC) endpoint for your gateway.
    */
  var VPCEndpoint: js.UndefOr[String] = js.undefined
}
object DescribeGatewayInformationOutput {
  
  inline def apply(): DescribeGatewayInformationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGatewayInformationOutput]
  }
  
  extension [Self <: DescribeGatewayInformationOutput](x: Self) {
    
    inline def setCloudWatchLogGroupARN(value: CloudWatchLogGroupARN): Self = StObject.set(x, "CloudWatchLogGroupARN", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogGroupARNUndefined: Self = StObject.set(x, "CloudWatchLogGroupARN", js.undefined)
    
    inline def setDeprecationDate(value: DeprecationDate): Self = StObject.set(x, "DeprecationDate", value.asInstanceOf[js.Any])
    
    inline def setDeprecationDateUndefined: Self = StObject.set(x, "DeprecationDate", js.undefined)
    
    inline def setEc2InstanceId(value: Ec2InstanceId): Self = StObject.set(x, "Ec2InstanceId", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceIdUndefined: Self = StObject.set(x, "Ec2InstanceId", js.undefined)
    
    inline def setEc2InstanceRegion(value: Ec2InstanceRegion): Self = StObject.set(x, "Ec2InstanceRegion", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceRegionUndefined: Self = StObject.set(x, "Ec2InstanceRegion", js.undefined)
    
    inline def setEndpointType(value: EndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setGatewayCapacity(value: GatewayCapacity): Self = StObject.set(x, "GatewayCapacity", value.asInstanceOf[js.Any])
    
    inline def setGatewayCapacityUndefined: Self = StObject.set(x, "GatewayCapacity", js.undefined)
    
    inline def setGatewayId(value: GatewayId): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
    
    inline def setGatewayName(value: String): Self = StObject.set(x, "GatewayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayNameUndefined: Self = StObject.set(x, "GatewayName", js.undefined)
    
    inline def setGatewayNetworkInterfaces(value: GatewayNetworkInterfaces): Self = StObject.set(x, "GatewayNetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setGatewayNetworkInterfacesUndefined: Self = StObject.set(x, "GatewayNetworkInterfaces", js.undefined)
    
    inline def setGatewayNetworkInterfacesVarargs(value: NetworkInterface*): Self = StObject.set(x, "GatewayNetworkInterfaces", js.Array(value*))
    
    inline def setGatewayState(value: GatewayState): Self = StObject.set(x, "GatewayState", value.asInstanceOf[js.Any])
    
    inline def setGatewayStateUndefined: Self = StObject.set(x, "GatewayState", js.undefined)
    
    inline def setGatewayTimezone(value: GatewayTimezone): Self = StObject.set(x, "GatewayTimezone", value.asInstanceOf[js.Any])
    
    inline def setGatewayTimezoneUndefined: Self = StObject.set(x, "GatewayTimezone", js.undefined)
    
    inline def setGatewayType(value: GatewayType): Self = StObject.set(x, "GatewayType", value.asInstanceOf[js.Any])
    
    inline def setGatewayTypeUndefined: Self = StObject.set(x, "GatewayType", js.undefined)
    
    inline def setHostEnvironment(value: HostEnvironment): Self = StObject.set(x, "HostEnvironment", value.asInstanceOf[js.Any])
    
    inline def setHostEnvironmentId(value: HostEnvironmentId): Self = StObject.set(x, "HostEnvironmentId", value.asInstanceOf[js.Any])
    
    inline def setHostEnvironmentIdUndefined: Self = StObject.set(x, "HostEnvironmentId", js.undefined)
    
    inline def setHostEnvironmentUndefined: Self = StObject.set(x, "HostEnvironment", js.undefined)
    
    inline def setLastSoftwareUpdate(value: LastSoftwareUpdate): Self = StObject.set(x, "LastSoftwareUpdate", value.asInstanceOf[js.Any])
    
    inline def setLastSoftwareUpdateUndefined: Self = StObject.set(x, "LastSoftwareUpdate", js.undefined)
    
    inline def setNextUpdateAvailabilityDate(value: NextUpdateAvailabilityDate): Self = StObject.set(x, "NextUpdateAvailabilityDate", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateAvailabilityDateUndefined: Self = StObject.set(x, "NextUpdateAvailabilityDate", js.undefined)
    
    inline def setSoftwareUpdatesEndDate(value: SoftwareUpdatesEndDate): Self = StObject.set(x, "SoftwareUpdatesEndDate", value.asInstanceOf[js.Any])
    
    inline def setSoftwareUpdatesEndDateUndefined: Self = StObject.set(x, "SoftwareUpdatesEndDate", js.undefined)
    
    inline def setSupportedGatewayCapacities(value: SupportedGatewayCapacities): Self = StObject.set(x, "SupportedGatewayCapacities", value.asInstanceOf[js.Any])
    
    inline def setSupportedGatewayCapacitiesUndefined: Self = StObject.set(x, "SupportedGatewayCapacities", js.undefined)
    
    inline def setSupportedGatewayCapacitiesVarargs(value: GatewayCapacity*): Self = StObject.set(x, "SupportedGatewayCapacities", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVPCEndpoint(value: String): Self = StObject.set(x, "VPCEndpoint", value.asInstanceOf[js.Any])
    
    inline def setVPCEndpointUndefined: Self = StObject.set(x, "VPCEndpoint", js.undefined)
  }
}
