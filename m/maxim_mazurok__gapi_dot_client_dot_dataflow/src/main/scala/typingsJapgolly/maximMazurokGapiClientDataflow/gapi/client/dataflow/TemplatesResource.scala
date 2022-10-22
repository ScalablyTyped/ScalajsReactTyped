package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.CallbackDynamicTemplategcsPath
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.DynamicTemplategcsPath
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.DynamicTemplatestagingLocation
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.FieldsGcsPath
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.GcsPath
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.LocationOauthtoken
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.QuotaUserResource
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.QuotaUserUploadType
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.ValidateOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplatesResource extends StObject {
  
  /** Creates a Cloud Dataflow job from a template. Do not enter confidential information when you supply string values using the API. */
  def create(request: KeyOauthtoken): Request[Job] = js.native
  def create(request: LocationOauthtoken, body: CreateJobFromTemplateRequest): Request[Job] = js.native
  /** Creates a Cloud Dataflow job from a template. Do not enter confidential information when you supply string values using the API. */
  def create(request: QuotaUserResource): Request[Job] = js.native
  def create(request: QuotaUserUploadType, body: CreateJobFromTemplateRequest): Request[Job] = js.native
  
  /** Get the template associated with a template. */
  def get(): Request[GetTemplateResponse] = js.native
  def get(request: FieldsGcsPath): Request[GetTemplateResponse] = js.native
  def get(request: GcsPath): Request[GetTemplateResponse] = js.native
  
  def launch(request: CallbackDynamicTemplategcsPath, body: LaunchTemplateParameters): Request[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: DynamicTemplategcsPath): Request[LaunchTemplateResponse] = js.native
  def launch(request: DynamicTemplatestagingLocation, body: LaunchTemplateParameters): Request[LaunchTemplateResponse] = js.native
  /** Launch a template. */
  def launch(request: ValidateOnly): Request[LaunchTemplateResponse] = js.native
}
