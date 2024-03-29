package typingsJapgolly.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutClusterCapacityProvidersRequest extends StObject {
  
  /**
    * The name of one or more capacity providers to associate with the cluster. If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created. New capacity providers can be created with the CreateCapacityProvider API operation. To use a Fargate capacity provider, specify either the FARGATE or FARGATE_SPOT capacity providers. The Fargate capacity providers are available to all accounts and only need to be associated with a cluster to be used.
    */
  var capacityProviders: StringList
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to modify the capacity provider settings for. If you don't specify a cluster, the default cluster is assumed.
    */
  var cluster: String
  
  /**
    * The capacity provider strategy to use by default for the cluster. When creating a service or running a task on a cluster, if no capacity provider or launch type is specified then the default capacity provider strategy for the cluster is used. A capacity provider strategy consists of one or more capacity providers along with the base and weight to assign to them. A capacity provider must be associated with the cluster to be used in a capacity provider strategy. The PutClusterCapacityProviders API is used to associate a capacity provider with a cluster. Only capacity providers with an ACTIVE or UPDATING status can be used. If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created. New capacity providers can be created with the CreateCapacityProvider API operation. To use a Fargate capacity provider, specify either the FARGATE or FARGATE_SPOT capacity providers. The Fargate capacity providers are available to all accounts and only need to be associated with a cluster to be used.
    */
  var defaultCapacityProviderStrategy: CapacityProviderStrategy
}
object PutClusterCapacityProvidersRequest {
  
  inline def apply(
    capacityProviders: StringList,
    cluster: String,
    defaultCapacityProviderStrategy: CapacityProviderStrategy
  ): PutClusterCapacityProvidersRequest = {
    val __obj = js.Dynamic.literal(capacityProviders = capacityProviders.asInstanceOf[js.Any], cluster = cluster.asInstanceOf[js.Any], defaultCapacityProviderStrategy = defaultCapacityProviderStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutClusterCapacityProvidersRequest]
  }
  
  extension [Self <: PutClusterCapacityProvidersRequest](x: Self) {
    
    inline def setCapacityProviders(value: StringList): Self = StObject.set(x, "capacityProviders", value.asInstanceOf[js.Any])
    
    inline def setCapacityProvidersVarargs(value: String*): Self = StObject.set(x, "capacityProviders", js.Array(value*))
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setDefaultCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "defaultCapacityProviderStrategy", value.asInstanceOf[js.Any])
    
    inline def setDefaultCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "defaultCapacityProviderStrategy", js.Array(value*))
  }
}
