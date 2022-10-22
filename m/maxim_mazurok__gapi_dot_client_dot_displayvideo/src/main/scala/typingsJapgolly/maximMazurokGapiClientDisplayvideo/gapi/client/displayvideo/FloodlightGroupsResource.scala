package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.FieldsFloodlightGroupId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.FloodlightGroupId
import typingsJapgolly.maximMazurokGapiClientDisplayvideo.anon.FloodlightGroupIdKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightGroupsResource extends StObject {
  
  /** Gets a Floodlight group. */
  def get(): Request[FloodlightGroup] = js.native
  def get(request: FloodlightGroupId): Request[FloodlightGroup] = js.native
  
  /** Updates an existing Floodlight group. Returns the updated Floodlight group if successful. */
  def patch(request: FieldsFloodlightGroupId): Request[FloodlightGroup] = js.native
  def patch(request: FloodlightGroupIdKey, body: FloodlightGroup): Request[FloodlightGroup] = js.native
}
