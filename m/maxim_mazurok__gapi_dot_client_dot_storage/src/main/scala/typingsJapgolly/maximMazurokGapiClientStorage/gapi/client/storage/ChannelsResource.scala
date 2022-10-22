package typingsJapgolly.maximMazurokGapiClientStorage.gapi.client.storage

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientStorage.anon.UploadType
import typingsJapgolly.maximMazurokGapiClientStorage.anon.UserIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelsResource extends StObject {
  
  /** Stop watching resources through this channel */
  def stop(request: UploadType): Request[Unit] = js.native
  def stop(request: UserIp, body: Channel): Request[Unit] = js.native
}
