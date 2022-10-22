package typingsJapgolly.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudiot.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigVersionsResource extends StObject {
  
  /** Lists the last few versions of the device configuration in descending order (i.e.: newest first). */
  def list(): Request[ListDeviceConfigVersionsResponse] = js.native
  def list(request: Accesstoken): Request[ListDeviceConfigVersionsResponse] = js.native
}
