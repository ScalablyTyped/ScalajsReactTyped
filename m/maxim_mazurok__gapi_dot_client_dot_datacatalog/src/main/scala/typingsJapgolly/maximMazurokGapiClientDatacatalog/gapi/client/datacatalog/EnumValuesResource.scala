package typingsJapgolly.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDatacatalog.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientDatacatalog.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesResource extends StObject {
  
  /** Renames an enum value in a tag template. Within a single enum field, enum values must be unique. */
  def rename(request: CallbackFields): Request[GoogleCloudDatacatalogV1TagTemplateField] = js.native
  def rename(request: Key, body: GoogleCloudDatacatalogV1RenameTagTemplateFieldEnumValueRequest): Request[GoogleCloudDatacatalogV1TagTemplateField] = js.native
}
