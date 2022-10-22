package typingsJapgolly.maximMazurokGapiClientSpeech.gapi.client.speech

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Fields
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Key
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.Parent
import typingsJapgolly.maximMazurokGapiClientSpeech.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhraseSetsResource extends StObject {
  
  def create(request: Fields, body: CreatePhraseSetRequest): Request[PhraseSet] = js.native
  /**
    * Create a set of phrase hints. Each item in the set can be a single word or a multi-word phrase. The items in the PhraseSet are favored by the recognition model when you send a call
    * that includes the PhraseSet.
    */
  def create(request: Parent): Request[PhraseSet] = js.native
  
  /** Delete a phrase set. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Get a phrase set. */
  def get(): Request[PhraseSet] = js.native
  def get(request: Accesstoken): Request[PhraseSet] = js.native
  
  /** List phrase sets. */
  def list(): Request[ListPhraseSetResponse] = js.native
  def list(request: Key): Request[ListPhraseSetResponse] = js.native
  
  def patch(request: Oauthtoken, body: PhraseSet): Request[PhraseSet] = js.native
  /** Update a phrase set. */
  def patch(request: PrettyPrint): Request[PhraseSet] = js.native
}
