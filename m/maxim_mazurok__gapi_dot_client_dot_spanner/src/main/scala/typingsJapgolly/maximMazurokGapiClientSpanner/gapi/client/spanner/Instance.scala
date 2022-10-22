package typingsJapgolly.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /** Required. The name of the instance's configuration. Values are of the form `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs. */
  var config: js.UndefOr[String] = js.undefined
  
  /** Output only. The time at which the instance was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Required. The descriptive name for this instance as it appears in UIs. Must be unique per project and between 4 and 30 characters in length. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Deprecated. This field is not populated. */
  var endpointUris: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Free instance metadata. Only populated for free instances. */
  var freeInstanceMetadata: js.UndefOr[FreeInstanceMetadata] = js.undefined
  
  /** The `InstanceType` of the current instance. */
  var instanceType: js.UndefOr[String] = js.undefined
  
  /**
    * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into groups that reflect a customer's organizational needs and deployment strategies. Cloud
    * Labels can be used to filter collections of resources. They can be used to control how resource metrics are aggregated. And they can be used as arguments to policy management rules
    * (e.g. route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `a-z{0,62}`. * Label values
    * must be between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`. * No more than 64 labels can be associated with a given resource. See
    * https://goo.gl/xmQnxf for more information on and examples of labels. If you plan to use labels in your own code, please note that additional characters may be allowed in the
    * future. And so you are advised to use an internal label representation, such as JSON, which doesn't rely upon specific characters being disallowed. For example, representing labels
    * as the string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Required. A unique identifier for the instance, which cannot be changed after the instance is created. Values are of the form `projects//instances/a-z*[a-z0-9]`. The final segment
    * of the name must be between 2 and 64 characters in length.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The number of nodes allocated to this instance. At most one of either node_count or processing_units should be present in the message. This may be zero in API responses for
    * instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
    */
  var nodeCount: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of processing units allocated to this instance. At most one of processing_units or node_count should be present in the message. This may be zero in API responses for
    * instances that are not yet in state `READY`. See [the documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information about nodes and processing units.
    */
  var processingUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * Output only. The current instance state. For CreateInstance, the state must be either omitted or set to `CREATING`. For UpdateInstance, the state must be either omitted or set to
    * `READY`.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. The time at which the instance was most recently updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEndpointUris(value: js.Array[String]): Self = StObject.set(x, "endpointUris", value.asInstanceOf[js.Any])
    
    inline def setEndpointUrisUndefined: Self = StObject.set(x, "endpointUris", js.undefined)
    
    inline def setEndpointUrisVarargs(value: String*): Self = StObject.set(x, "endpointUris", js.Array(value*))
    
    inline def setFreeInstanceMetadata(value: FreeInstanceMetadata): Self = StObject.set(x, "freeInstanceMetadata", value.asInstanceOf[js.Any])
    
    inline def setFreeInstanceMetadataUndefined: Self = StObject.set(x, "freeInstanceMetadata", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeCount(value: Double): Self = StObject.set(x, "nodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeCountUndefined: Self = StObject.set(x, "nodeCount", js.undefined)
    
    inline def setProcessingUnits(value: Double): Self = StObject.set(x, "processingUnits", value.asInstanceOf[js.Any])
    
    inline def setProcessingUnitsUndefined: Self = StObject.set(x, "processingUnits", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
