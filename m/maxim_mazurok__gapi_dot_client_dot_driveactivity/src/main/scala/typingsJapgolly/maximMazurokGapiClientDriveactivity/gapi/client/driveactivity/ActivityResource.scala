package typingsJapgolly.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDriveactivity.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientDriveactivity.anon.Alt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityResource extends StObject {
  
  /** Query past activity in Google Drive. */
  def query(request: Accesstoken): Request[QueryDriveActivityResponse] = js.native
  def query(request: Alt, body: QueryDriveActivityRequest): Request[QueryDriveActivityResponse] = js.native
}
