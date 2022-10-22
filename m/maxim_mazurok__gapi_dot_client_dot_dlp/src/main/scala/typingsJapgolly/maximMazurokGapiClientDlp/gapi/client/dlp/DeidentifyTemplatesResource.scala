package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Callback
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Key
import typingsJapgolly.maximMazurokGapiClientDlp.anon.LocationId
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeidentifyTemplatesResource extends StObject {
  
  /**
    * Creates a DeidentifyTemplate for reusing frequently used configuration for de-identifying content, images, and storage. See https://cloud.google.com/dlp/docs/creating-templates-deid
    * to learn more.
    */
  def create(request: Callback): Request[GooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def create(request: Fields, body: GooglePrivacyDlpV2CreateDeidentifyTemplateRequest): Request[GooglePrivacyDlpV2DeidentifyTemplate] = js.native
  
  /** Deletes a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  /** Gets a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more. */
  def get(): Request[GooglePrivacyDlpV2DeidentifyTemplate] = js.native
  def get(request: Key): Request[GooglePrivacyDlpV2DeidentifyTemplate] = js.native
  
  /** Lists DeidentifyTemplates. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more. */
  def list(): Request[GooglePrivacyDlpV2ListDeidentifyTemplatesResponse] = js.native
  def list(request: LocationId): Request[GooglePrivacyDlpV2ListDeidentifyTemplatesResponse] = js.native
  
  def patch(request: Key, body: GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest): Request[GooglePrivacyDlpV2DeidentifyTemplate] = js.native
  /** Updates the DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more. */
  def patch(request: Name): Request[GooglePrivacyDlpV2DeidentifyTemplate] = js.native
}
