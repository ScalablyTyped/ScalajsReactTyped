package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.LocationOauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlexTemplatesResource extends StObject {
  
  /** Launch a job with a FlexTemplate. */
  def launch(request: FieldsKey): Request[LaunchFlexTemplateResponse] = js.native
  def launch(request: LocationOauthtoken, body: LaunchFlexTemplateRequest): Request[LaunchFlexTemplateResponse] = js.native
}
