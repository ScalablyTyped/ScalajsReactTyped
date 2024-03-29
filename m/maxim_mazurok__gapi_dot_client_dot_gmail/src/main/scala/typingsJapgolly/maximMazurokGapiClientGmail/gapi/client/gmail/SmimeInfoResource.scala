package typingsJapgolly.maximMazurokGapiClientGmail.gapi.client.gmail

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientGmail.anon.CallbackFields
import typingsJapgolly.maximMazurokGapiClientGmail.anon.FieldsKey
import typingsJapgolly.maximMazurokGapiClientGmail.anon.SendAsEmail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmimeInfoResource extends StObject {
  
  /** Deletes the specified S/MIME config for the specified send-as alias. */
  def delete(): Request[Unit] = js.native
  def delete(request: SendAsEmail): Request[Unit] = js.native
  
  /** Gets the specified S/MIME config for the specified send-as alias. */
  def get(): Request[SmimeInfo] = js.native
  def get(request: SendAsEmail): Request[SmimeInfo] = js.native
  
  /** Insert (upload) the given S/MIME config for the specified send-as alias. Note that pkcs12 format is required for the key. */
  def insert(request: CallbackFields): Request[SmimeInfo] = js.native
  def insert(request: FieldsKey, body: SmimeInfo): Request[SmimeInfo] = js.native
  
  /** Lists S/MIME configs for the specified send-as alias. */
  def list(): Request[ListSmimeInfoResponse] = js.native
  def list(request: FieldsKey): Request[ListSmimeInfoResponse] = js.native
  
  /** Sets the default S/MIME config for the specified send-as alias. */
  def setDefault(): Request[Unit] = js.native
  def setDefault(request: SendAsEmail): Request[Unit] = js.native
}
