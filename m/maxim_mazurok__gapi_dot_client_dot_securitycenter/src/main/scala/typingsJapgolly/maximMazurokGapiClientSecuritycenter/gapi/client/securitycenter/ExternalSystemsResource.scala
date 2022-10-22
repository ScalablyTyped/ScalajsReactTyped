package typingsJapgolly.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientSecuritycenter.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalSystemsResource extends StObject {
  
  /** Updates external system. This is for a given finding. */
  def patch(request: FieldsKey): Request[GoogleCloudSecuritycenterV1ExternalSystem] = js.native
  def patch(request: QuotaUser, body: GoogleCloudSecuritycenterV1ExternalSystem): Request[GoogleCloudSecuritycenterV1ExternalSystem] = js.native
}
