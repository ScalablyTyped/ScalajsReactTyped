package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.AltBroadcastStatus
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.BroadcastStatus
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.FieldsId
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.IdKey
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.KeyOauthtoken
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.StreamId
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveBroadcastsResource extends StObject {
  
  /** Bind a broadcast to a stream. */
  def bind(): Request[LiveBroadcast] = js.native
  def bind(request: StreamId): Request[LiveBroadcast] = js.native
  
  /** Delete a given broadcast. */
  def delete(): Request[Unit] = js.native
  def delete(request: FieldsId): Request[Unit] = js.native
  
  /** Inserts a new stream for the authenticated user. */
  def insert(request: FieldsKey): Request[LiveBroadcast] = js.native
  def insert(request: UploadType, body: LiveBroadcast): Request[LiveBroadcast] = js.native
  
  /** Insert cuepoints in a broadcast */
  def insertCuepoint(request: IdKey): Request[Cuepoint] = js.native
  def insertCuepoint(request: KeyOauthtoken, body: Cuepoint): Request[Cuepoint] = js.native
  
  /** Retrieve the list of broadcasts associated with the given channel. */
  def list(): Request[LiveBroadcastListResponse] = js.native
  def list(request: BroadcastStatus): Request[LiveBroadcastListResponse] = js.native
  
  /** Transition a broadcast to a given status. */
  def transition(): Request[LiveBroadcast] = js.native
  def transition(request: AltBroadcastStatus): Request[LiveBroadcast] = js.native
  
  /** Updates an existing broadcast for the authenticated user. */
  def update(request: FieldsKey): Request[LiveBroadcast] = js.native
  def update(request: UploadType, body: LiveBroadcast): Request[LiveBroadcast] = js.native
}
