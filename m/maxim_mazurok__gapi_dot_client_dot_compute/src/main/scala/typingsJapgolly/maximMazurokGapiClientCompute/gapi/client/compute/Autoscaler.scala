package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autoscaler extends StObject {
  
  /**
    * The configuration parameters for the autoscaling algorithm. You can define one or more signals for an autoscaler: cpuUtilization, customMetricUtilizations, and
    * loadBalancingUtilization. If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
    */
  var autoscalingPolicy: js.UndefOr[AutoscalingPolicy] = js.undefined
  
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Type of the resource. Always compute#autoscaler for autoscalers. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
    * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a
    * dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Target recommended MIG size (number of instances) computed by autoscaler. Autoscaler calculates the recommended MIG size even when the autoscaling policy mode is
    * different from ON. This field is empty when autoscaler is not connected to an existing managed instance group or autoscaler did not generate its prediction.
    */
  var recommendedSize: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] URL of the region where the instance group resides (for autoscalers living in regional scope). */
  var region: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Status information of existing scaling schedules. */
  var scalingScheduleStatus: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.ScalingScheduleStatus} */ js.Any
  ] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The status of the autoscaler configuration. Current set of possible values: - PENDING: Autoscaler backend hasn't read new/updated configuration. - DELETING:
    * Configuration is being deleted. - ACTIVE: Configuration is acknowledged to be effective. Some warnings might be present in the statusDetails field. - ERROR: Configuration has
    * errors. Actionable for users. Details are present in the statusDetails field. New values might be added in the future.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for examples of status messages you
    * might encounter.
    */
  var statusDetails: js.UndefOr[js.Array[AutoscalerStatusDetails]] = js.undefined
  
  /** URL of the managed instance group that this autoscaler will scale. This field is required when creating an autoscaler. */
  var target: js.UndefOr[String] = js.undefined
  
  /** [Output Only] URL of the zone where the instance group resides (for autoscalers living in zonal scope). */
  var zone: js.UndefOr[String] = js.undefined
}
object Autoscaler {
  
  inline def apply(): Autoscaler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autoscaler]
  }
  
  extension [Self <: Autoscaler](x: Self) {
    
    inline def setAutoscalingPolicy(value: AutoscalingPolicy): Self = StObject.set(x, "autoscalingPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoscalingPolicyUndefined: Self = StObject.set(x, "autoscalingPolicy", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecommendedSize(value: Double): Self = StObject.set(x, "recommendedSize", value.asInstanceOf[js.Any])
    
    inline def setRecommendedSizeUndefined: Self = StObject.set(x, "recommendedSize", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setScalingScheduleStatus(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.compute.gapi.client.compute.ScalingScheduleStatus} */ js.Any
    ): Self = StObject.set(x, "scalingScheduleStatus", value.asInstanceOf[js.Any])
    
    inline def setScalingScheduleStatusUndefined: Self = StObject.set(x, "scalingScheduleStatus", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: js.Array[AutoscalerStatusDetails]): Self = StObject.set(x, "statusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "statusDetails", js.undefined)
    
    inline def setStatusDetailsVarargs(value: AutoscalerStatusDetails*): Self = StObject.set(x, "statusDetails", js.Array(value*))
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
