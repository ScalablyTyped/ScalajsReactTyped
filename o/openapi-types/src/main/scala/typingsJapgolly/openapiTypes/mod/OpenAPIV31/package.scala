package typingsJapgolly.openapiTypes.mod.OpenAPIV31

import typingsJapgolly.openapiTypes.anon.Info
import typingsJapgolly.openapiTypes.anon.Parameters
import typingsJapgolly.openapiTypes.anon.RequestBody
import typingsJapgolly.openapiTypes.openapiTypesStrings.components
import typingsJapgolly.openapiTypes.openapiTypesStrings.paths
import typingsJapgolly.openapiTypes.openapiTypesStrings.webhooks
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApiKeySecurityScheme = typingsJapgolly.openapiTypes.mod.OpenAPIV3.ApiKeySecurityScheme

type ArraySchemaObjectType = typingsJapgolly.openapiTypes.mod.OpenAPIV3.ArraySchemaObjectType

type CallbackObject = Record[String, PathItemObject[js.Object] | ReferenceObject]

type ContactObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.ContactObject

type DiscriminatorObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.DiscriminatorObject

type Document[T /* <: js.Object */] = Modify[
Omit[typingsJapgolly.openapiTypes.mod.OpenAPIV3.Document[T], paths | components], 
((Pick[PathsWebhooksComponents[T], paths]) & (Omit[Partial[PathsWebhooksComponents[T]], paths]) & Info) | ((Pick[PathsWebhooksComponents[T], webhooks]) & (Omit[Partial[PathsWebhooksComponents[T]], webhooks]) & Info) | ((Pick[PathsWebhooksComponents[T], components]) & (Omit[Partial[PathsWebhooksComponents[T]], components]) & Info)]

type EncodingObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.EncodingObject

type ExampleObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.ExampleObject

type ExternalDocumentationObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.ExternalDocumentationObject

type HeaderObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.HeaderObject

type HttpMethods = typingsJapgolly.openapiTypes.mod.OpenAPIV3.HttpMethods

type HttpSecurityScheme = typingsJapgolly.openapiTypes.mod.OpenAPIV3.HttpSecurityScheme

type Modify[T, R] = (Omit[T, /* keyof R */ String]) & R

type OAuth2SecurityScheme = typingsJapgolly.openapiTypes.mod.OpenAPIV3.OAuth2SecurityScheme

type OpenIdSecurityScheme = typingsJapgolly.openapiTypes.mod.OpenAPIV3.OpenIdSecurityScheme

type OperationObject[T /* <: js.Object */] = (Modify[typingsJapgolly.openapiTypes.mod.OpenAPIV3.OperationObject[T], RequestBody]) & T

type ParameterBaseObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.ParameterBaseObject

type ParameterObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.ParameterObject

type PathItemObject[T /* <: js.Object */] = (Modify[typingsJapgolly.openapiTypes.mod.OpenAPIV3.PathItemObject[T], Parameters]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ method in openapi-types.openapi-types.OpenAPIV3_1.HttpMethods ]:? openapi-types.openapi-types.OpenAPIV3_1.OperationObject<T>} */ js.Any)

type PathsObject[T /* <: js.Object */, P /* <: js.Object */] = Record[String, js.UndefOr[PathItemObject[T] & P]]

type ResponsesObject = Record[String, ReferenceObject | ResponseObject]

type SecurityRequirementObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject

type SecuritySchemeObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.SecuritySchemeObject

type TagObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.TagObject

type XMLObject = typingsJapgolly.openapiTypes.mod.OpenAPIV3.XMLObject
