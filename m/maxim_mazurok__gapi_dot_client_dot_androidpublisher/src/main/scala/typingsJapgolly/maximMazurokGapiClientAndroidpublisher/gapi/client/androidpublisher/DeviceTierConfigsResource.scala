package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.AllowUnknownDevices
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Alt
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceTierConfigsResource extends StObject {
  
  /** Creates a new device tier config for an app. */
  def create(request: Accesstoken): Request[DeviceTierConfig] = js.native
  def create(request: AllowUnknownDevices, body: DeviceTierConfig): Request[DeviceTierConfig] = js.native
  
  /** Returns a particular device tier config. */
  def get(): Request[DeviceTierConfig] = js.native
  def get(request: Alt): Request[DeviceTierConfig] = js.native
  
  /** Returns created device tier configs, ordered by descending creation time. */
  def list(): Request[ListDeviceTierConfigsResponse] = js.native
  def list(request: Callback): Request[ListDeviceTierConfigsResponse] = js.native
}
