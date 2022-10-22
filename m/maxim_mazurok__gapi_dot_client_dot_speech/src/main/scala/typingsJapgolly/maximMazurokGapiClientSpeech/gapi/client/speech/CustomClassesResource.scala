package typingsJapgolly.maximMazurokGapiClientSpeech.gapi.client.speech

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Callback
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Fields
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Key
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Name
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomClassesResource extends StObject {
  
  /** Create a custom class. */
  def create(request: Callback): Request[CustomClass] = js.native
  def create(request: Fields, body: CreateCustomClassRequest): Request[CustomClass] = js.native
  
  /** Delete a custom class. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Get a custom class. */
  def get(): Request[CustomClass] = js.native
  def get(request: Accesstoken): Request[CustomClass] = js.native
  
  /** List custom classes. */
  def list(): Request[ListCustomClassesResponse] = js.native
  def list(request: Key): Request[ListCustomClassesResponse] = js.native
  
  /** Update a custom class. */
  def patch(request: Name): Request[CustomClass] = js.native
  def patch(request: Oauthtoken, body: CustomClass): Request[CustomClass] = js.native
}
