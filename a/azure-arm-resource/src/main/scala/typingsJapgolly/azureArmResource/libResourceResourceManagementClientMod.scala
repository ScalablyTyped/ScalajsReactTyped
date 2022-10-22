package typingsJapgolly.azureArmResource

import typingsJapgolly.azureArmResource.libResourceOperationsMod.DeploymentOperations
import typingsJapgolly.azureArmResource.libResourceOperationsMod.Deployments
import typingsJapgolly.azureArmResource.libResourceOperationsMod.Operations
import typingsJapgolly.azureArmResource.libResourceOperationsMod.Providers
import typingsJapgolly.azureArmResource.libResourceOperationsMod.ResourceGroups
import typingsJapgolly.azureArmResource.libResourceOperationsMod.Resources
import typingsJapgolly.azureArmResource.libResourceOperationsMod.Tags
import typingsJapgolly.msRest.mod.ServiceClientCredentials
import typingsJapgolly.msRestAzure.mod.AzureServiceClient
import typingsJapgolly.msRestAzure.mod.AzureServiceClientOptions
import typingsJapgolly.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResourceResourceManagementClientMod {
  
  @JSImport("azure-arm-resource/lib/resource/resourceManagementClient", JSImport.Default)
  @js.native
  open class default protected () extends ResourceManagementClient {
    /**
      * Initializes a new instance of the ResourceManagementClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
      *
      * @param {string} subscriptionId - The ID of the target subscription.
      *
      * @param {string} [baseUri] - The base URI of the service.
      *
      * @param {object} [options] - The parameter options
      *
      * @param {Array} [options.filters] - Filters to be added to the request pipeline
      *
      * @param {object} [options.requestOptions] - Options for the underlying request object
      * {@link https://github.com/request/request#requestoptions-callback Options doc}
      *
      * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
      *
      * @param {string} [options.acceptLanguage] - The preferred language for the response.
      *
      * @param {number} [options.longRunningOperationRetryTimeout] - The retry timeout in seconds for Long Running Operations. Default value is 30.
      *
      * @param {boolean} [options.generateClientRequestId] - Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
      *
      */
    def this(credentials: ServiceClientCredentials, subscriptionId: String) = this()
    def this(credentials: ServiceClientCredentials, subscriptionId: String, baseUri: String) = this()
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: String,
      options: AzureServiceClientOptions
    ) = this()
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: Unit,
      options: AzureServiceClientOptions
    ) = this()
  }
  
  @JSImport("azure-arm-resource/lib/resource/resourceManagementClient", "ResourceManagementClient")
  @js.native
  open class ResourceManagementClient protected () extends AzureServiceClient {
    /**
      * Initializes a new instance of the ResourceManagementClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
      *
      * @param {string} subscriptionId - The ID of the target subscription.
      *
      * @param {string} [baseUri] - The base URI of the service.
      *
      * @param {object} [options] - The parameter options
      *
      * @param {Array} [options.filters] - Filters to be added to the request pipeline
      *
      * @param {object} [options.requestOptions] - Options for the underlying request object
      * {@link https://github.com/request/request#requestoptions-callback Options doc}
      *
      * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
      *
      * @param {string} [options.acceptLanguage] - The preferred language for the response.
      *
      * @param {number} [options.longRunningOperationRetryTimeout] - The retry timeout in seconds for Long Running Operations. Default value is 30.
      *
      * @param {boolean} [options.generateClientRequestId] - Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
      *
      */
    def this(credentials: ServiceClientCredentials, subscriptionId: String) = this()
    def this(credentials: ServiceClientCredentials, subscriptionId: String, baseUri: String) = this()
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: String,
      options: AzureServiceClientOptions
    ) = this()
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: Unit,
      options: AzureServiceClientOptions
    ) = this()
    
    var acceptLanguage: String = js.native
    
    var apiVersion: String = js.native
    
    var credentials: ServiceClientCredentials = js.native
    
    var deploymentOperations: DeploymentOperations = js.native
    
    var deployments: Deployments = js.native
    
    var generateClientRequestId: Boolean = js.native
    
    var longRunningOperationRetryTimeout: Double = js.native
    
    // Operation groups
    var operations: Operations = js.native
    
    var providers: Providers = js.native
    
    var resourceGroups: ResourceGroups = js.native
    
    var resources: Resources = js.native
    
    var subscriptionId: String = js.native
    
    var tags: Tags = js.native
  }
  
  object ResourceManagementModels {
    
    @JSImport("azure-arm-resource/lib/resource/resourceManagementClient", "ResourceManagementModels.BaseResource")
    @js.native
    open class BaseResource ()
      extends typingsJapgolly.azureArmResource.libResourceModelsMod.BaseResource
    
    @JSImport("azure-arm-resource/lib/resource/resourceManagementClient", "ResourceManagementModels.CloudError")
    @js.native
    open class CloudError protected ()
      extends typingsJapgolly.azureArmResource.libResourceModelsMod.CloudError {
      def this(parameters: CloudErrorParameters) = this()
    }
  }
}
