package typingsJapgolly.maximMazurokGapiClientWorkflows

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientWorkflows.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientWorkflows.anon.Alt
import typingsJapgolly.maximMazurokGapiClientWorkflows.anon.Callback
import typingsJapgolly.maximMazurokGapiClientWorkflows.anon.Fields
import typingsJapgolly.maximMazurokGapiClientWorkflows.anon.Filter
import typingsJapgolly.maximMazurokGapiClientWorkflows.anon.Key
import typingsJapgolly.maximMazurokGapiClientWorkflows.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object workflows {
      
      // tslint:disable-next-line:no-empty-interface
      trait Empty extends StObject
      
      trait ListLocationsResponse extends StObject {
        
        /** A list of locations that matches the specified filter in the request. */
        var locations: js.UndefOr[js.Array[Location]] = js.undefined
        
        /** The standard List next-page token. */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object ListLocationsResponse {
        
        inline def apply(): ListLocationsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListLocationsResponse]
        }
        
        extension [Self <: ListLocationsResponse](x: Self) {
          
          inline def setLocations(value: js.Array[Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
          
          inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
          
          inline def setLocationsVarargs(value: Location*): Self = StObject.set(x, "locations", js.Array(value*))
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      trait ListOperationsResponse extends StObject {
        
        /** The standard List next-page token. */
        var nextPageToken: js.UndefOr[String] = js.undefined
        
        /** A list of operations that matches the specified filter in the request. */
        var operations: js.UndefOr[js.Array[Operation]] = js.undefined
      }
      object ListOperationsResponse {
        
        inline def apply(): ListOperationsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListOperationsResponse]
        }
        
        extension [Self <: ListOperationsResponse](x: Self) {
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          inline def setOperations(value: js.Array[Operation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
          
          inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
          
          inline def setOperationsVarargs(value: Operation*): Self = StObject.set(x, "operations", js.Array(value*))
        }
      }
      
      trait ListWorkflowsResponse extends StObject {
        
        /** A token, which can be sent as `page_token` to retrieve the next page. If this field is omitted, there are no subsequent pages. */
        var nextPageToken: js.UndefOr[String] = js.undefined
        
        /** Unreachable resources. */
        var unreachable: js.UndefOr[js.Array[String]] = js.undefined
        
        /** The workflows which match the request. */
        var workflows: js.UndefOr[js.Array[Workflow]] = js.undefined
      }
      object ListWorkflowsResponse {
        
        inline def apply(): ListWorkflowsResponse = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ListWorkflowsResponse]
        }
        
        extension [Self <: ListWorkflowsResponse](x: Self) {
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
          
          inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
          
          inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
          
          inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
          
          inline def setWorkflows(value: js.Array[Workflow]): Self = StObject.set(x, "workflows", value.asInstanceOf[js.Any])
          
          inline def setWorkflowsUndefined: Self = StObject.set(x, "workflows", js.undefined)
          
          inline def setWorkflowsVarargs(value: Workflow*): Self = StObject.set(x, "workflows", js.Array(value*))
        }
      }
      
      trait Location extends StObject {
        
        /** The friendly name for this location, typically a nearby city name. For example, "Tokyo". */
        var displayName: js.UndefOr[String] = js.undefined
        
        /** Cross-service attributes for the location. For example {"cloud.googleapis.com/region": "us-east1"} */
        var labels: js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
              ] = js.undefined
        
        /** The canonical id for this location. For example: `"us-east1"`. */
        var locationId: js.UndefOr[String] = js.undefined
        
        /** Service-specific metadata. For example the available capacity at the given location. */
        var metadata: js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
              ] = js.undefined
        
        /** Resource name for the location, which may vary between implementations. For example: `"projects/example-project/locations/us-east1"` */
        var name: js.UndefOr[String] = js.undefined
      }
      object Location {
        
        inline def apply(): Location = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Location]
        }
        
        extension [Self <: Location](x: Self) {
          
          inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
          
          inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
          
          inline def setLabels(
            value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
          ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
          
          inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
          
          inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
          
          inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
          
          inline def setMetadata(
            value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
          ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
          
          inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
        }
      }
      
      @js.native
      trait LocationsResource extends StObject {
        
        /** Gets information about a location. */
        def get(): Request[Location] = js.native
        def get(request: Accesstoken): Request[Location] = js.native
        
        /** Lists information about the supported locations for this service. */
        def list(): Request[ListLocationsResponse] = js.native
        def list(request: Alt): Request[ListLocationsResponse] = js.native
        
        var operations: OperationsResource = js.native
        
        var workflows: WorkflowsResource = js.native
      }
      
      trait Operation extends StObject {
        
        /** If the value is `false`, it means the operation is still in progress. If `true`, the operation is completed, and either `error` or `response` is available. */
        var done: js.UndefOr[Boolean] = js.undefined
        
        /** The error result of the operation in case of failure or cancellation. */
        var error: js.UndefOr[Status] = js.undefined
        
        /**
          * Service-specific metadata associated with the operation. It typically contains progress information and common metadata such as create time. Some services might not provide such
          * metadata. Any method that returns a long-running operation should document the metadata type, if any.
          */
        var metadata: js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
              ] = js.undefined
        
        /**
          * The server-assigned name, which is only unique within the same service that originally returns it. If you use the default HTTP mapping, the `name` should be a resource name ending
          * with `operations/{unique_id}`.
          */
        var name: js.UndefOr[String] = js.undefined
        
        /**
          * The normal response of the operation in case of success. If the original method returns no data on success, such as `Delete`, the response is `google.protobuf.Empty`. If the
          * original method is standard `Get`/`Create`/`Update`, the response should be the resource. For other methods, the response should have the type `XxxResponse`, where `Xxx` is the
          * original method name. For example, if the original method name is `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
          */
        var response: js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
              ] = js.undefined
      }
      object Operation {
        
        inline def apply(): Operation = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Operation]
        }
        
        extension [Self <: Operation](x: Self) {
          
          inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
          
          inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
          
          inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
          
          inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
          
          inline def setMetadata(
            value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
          ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
          
          inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setResponse(
            value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
          ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
          
          inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
        }
      }
      
      trait OperationMetadata extends StObject {
        
        /** API version used to start the operation. */
        var apiVersion: js.UndefOr[String] = js.undefined
        
        /** The time the operation was created. */
        var createTime: js.UndefOr[String] = js.undefined
        
        /** The time the operation finished running. */
        var endTime: js.UndefOr[String] = js.undefined
        
        /** Server-defined resource path for the target of the operation. */
        var target: js.UndefOr[String] = js.undefined
        
        /** Name of the verb executed by the operation. */
        var verb: js.UndefOr[String] = js.undefined
      }
      object OperationMetadata {
        
        inline def apply(): OperationMetadata = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[OperationMetadata]
        }
        
        extension [Self <: OperationMetadata](x: Self) {
          
          inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
          
          inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
          
          inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
          
          inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
          
          inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
          
          inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
          
          inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
          
          inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
          
          inline def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
          
          inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
        }
      }
      
      @js.native
      trait OperationsResource extends StObject {
        
        /**
          * Deletes a long-running operation. This method indicates that the client is no longer interested in the operation result. It does not cancel the operation. If the server doesn't
          * support this method, it returns `google.rpc.Code.UNIMPLEMENTED`.
          */
        def delete(): Request[js.Object] = js.native
        def delete(request: Accesstoken): Request[js.Object] = js.native
        
        /** Gets the latest state of a long-running operation. Clients can use this method to poll the operation result at intervals as recommended by the API service. */
        def get(): Request[Operation] = js.native
        def get(request: Accesstoken): Request[Operation] = js.native
        
        /**
          * Lists operations that match the specified filter in the request. If the server doesn't support this method, it returns `UNIMPLEMENTED`. NOTE: the `name` binding allows API services
          * to override the binding to use different resource name schemes, such as `users/ *‍/operations`. To override the binding, API services can add a binding such as
          * `"/v1/{name=users/ *}/operations"` to their service configuration. For backwards compatibility, the default name includes the operations collection id, however overriding users must
          * ensure the name binding is the parent resource, without the operations collection id.
          */
        def list(): Request[ListOperationsResponse] = js.native
        def list(request: Alt): Request[ListOperationsResponse] = js.native
      }
      
      trait ProjectsResource extends StObject {
        
        var locations: LocationsResource
      }
      object ProjectsResource {
        
        inline def apply(locations: LocationsResource): ProjectsResource = {
          val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProjectsResource]
        }
        
        extension [Self <: ProjectsResource](x: Self) {
          
          inline def setLocations(value: LocationsResource): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
        }
      }
      
      trait Status extends StObject {
        
        /** The status code, which should be an enum value of google.rpc.Code. */
        var code: js.UndefOr[Double] = js.undefined
        
        /** A list of messages that carry the error details. There is a common set of message types for APIs to use. */
        var details: js.UndefOr[
                js.Array[
                  /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
                ]
              ] = js.undefined
        
        /**
          * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the
          * client.
          */
        var message: js.UndefOr[String] = js.undefined
      }
      object Status {
        
        inline def apply(): Status = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Status]
        }
        
        extension [Self <: Status](x: Self) {
          
          inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
          
          inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
          
          inline def setDetails(
            value: js.Array[
                      /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
                    ]
          ): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
          
          inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
          
          inline def setDetailsVarargs(
            value: (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any)*
          ): Self = StObject.set(x, "details", js.Array(value*))
          
          inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
          
          inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        }
      }
      
      trait Workflow extends StObject {
        
        /** Output only. The timestamp of when the workflow was created. */
        var createTime: js.UndefOr[String] = js.undefined
        
        /** Description of the workflow provided by the user. Must be at most 1000 unicode characters long. */
        var description: js.UndefOr[String] = js.undefined
        
        /**
          * Labels associated with this workflow. Labels can contain at most 64 entries. Keys and values can be no longer than 63 characters and can only contain lowercase letters, numeric
          * characters, underscores and dashes. Label keys must start with a letter. International characters are allowed.
          */
        var labels: js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
              ] = js.undefined
        
        /** The resource name of the workflow. Format: projects/{project}/locations/{location}/workflows/{workflow} */
        var name: js.UndefOr[String] = js.undefined
        
        /** Output only. The timestamp that the latest revision of the workflow was created. */
        var revisionCreateTime: js.UndefOr[String] = js.undefined
        
        /**
          * Output only. The revision of the workflow. A new revision of a workflow is created as a result of updating the following properties of a workflow: - Service account - Workflow code
          * to be executed The format is "000001-a4d", where the first 6 characters define the zero-padded revision ordinal number. They are followed by a hyphen and 3 hexadecimal random
          * characters.
          */
        var revisionId: js.UndefOr[String] = js.undefined
        
        /**
          * The service account associated with the latest workflow version. This service account represents the identity of the workflow and determines what permissions the workflow has.
          * Format: projects/{project}/serviceAccounts/{account} or {account} Using `-` as a wildcard for the `{project}` or not providing one at all will infer the project from the account.
          * The `{account}` value can be the `email` address or the `unique_id` of the service account. If not provided, workflow will use the project's default service account. Modifying this
          * field for an existing workflow results in a new workflow revision.
          */
        var serviceAccount: js.UndefOr[String] = js.undefined
        
        /** Workflow code to be executed. The size limit is 128KB. */
        var sourceContents: js.UndefOr[String] = js.undefined
        
        /** Output only. State of the workflow deployment. */
        var state: js.UndefOr[String] = js.undefined
        
        /** Output only. The last update timestamp of the workflow. */
        var updateTime: js.UndefOr[String] = js.undefined
      }
      object Workflow {
        
        inline def apply(): Workflow = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Workflow]
        }
        
        extension [Self <: Workflow](x: Self) {
          
          inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
          
          inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
          
          inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
          
          inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
          
          inline def setLabels(
            value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
          ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
          
          inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
          
          inline def setRevisionCreateTime(value: String): Self = StObject.set(x, "revisionCreateTime", value.asInstanceOf[js.Any])
          
          inline def setRevisionCreateTimeUndefined: Self = StObject.set(x, "revisionCreateTime", js.undefined)
          
          inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
          
          inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
          
          inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
          
          inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
          
          inline def setSourceContents(value: String): Self = StObject.set(x, "sourceContents", value.asInstanceOf[js.Any])
          
          inline def setSourceContentsUndefined: Self = StObject.set(x, "sourceContents", js.undefined)
          
          inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
          
          inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
          
          inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
          
          inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
        }
      }
      
      @js.native
      trait WorkflowsResource extends StObject {
        
        /** Creates a new workflow. If a workflow with the specified name already exists in the specified project and location, the long running operation will return ALREADY_EXISTS error. */
        def create(request: Callback): Request[Operation] = js.native
        def create(request: Fields, body: Workflow): Request[Operation] = js.native
        
        /** Deletes a workflow with the specified name. This method also cancels and deletes all running executions of the workflow. */
        def delete(): Request[Operation] = js.native
        def delete(request: Accesstoken): Request[Operation] = js.native
        
        /** Gets details of a single Workflow. */
        def get(): Request[Workflow] = js.native
        def get(request: Accesstoken): Request[Workflow] = js.native
        
        /** Lists Workflows in a given project and location. The default order is not specified. */
        def list(): Request[ListWorkflowsResponse] = js.native
        def list(request: Filter): Request[ListWorkflowsResponse] = js.native
        
        /**
          * Updates an existing workflow. Running this method has no impact on already running executions of the workflow. A new revision of the workflow may be created as a result of a
          * successful update operation. In that case, such revision will be used in new workflow executions.
          */
        def patch(request: Key): Request[Operation] = js.native
        def patch(request: Name, body: Workflow): Request[Operation] = js.native
      }
    }
  }
}
