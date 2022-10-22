package typingsJapgolly.maximMazurokGapiClientPrivateca.gapi.client.privateca

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.Callback
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.CertificateId
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.IssuingCertificateAuthorityId
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.Key
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.UpdateMask
import typingsJapgolly.maximMazurokGapiClientPrivateca.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificatesResource extends StObject {
  
  /** Create a new Certificate in a given Project, Location from a particular CaPool. */
  def create(request: CertificateId): Request[Certificate] = js.native
  def create(request: IssuingCertificateAuthorityId, body: Certificate): Request[Certificate] = js.native
  
  /** Returns a Certificate. */
  def get(): Request[Certificate] = js.native
  def get(request: Accesstoken): Request[Certificate] = js.native
  
  /** Lists Certificates. */
  def list(): Request[ListCertificatesResponse] = js.native
  def list(request: Callback): Request[ListCertificatesResponse] = js.native
  
  def patch(request: Key, body: Certificate): Request[Certificate] = js.native
  /** Update a Certificate. Currently, the only field you can update is the labels field. */
  def patch(request: UpdateMask): Request[Certificate] = js.native
  
  def revoke(request: Accesstoken, body: RevokeCertificateRequest): Request[Certificate] = js.native
  /** Revoke a Certificate. */
  def revoke(request: UploadType): Request[Certificate] = js.native
}
