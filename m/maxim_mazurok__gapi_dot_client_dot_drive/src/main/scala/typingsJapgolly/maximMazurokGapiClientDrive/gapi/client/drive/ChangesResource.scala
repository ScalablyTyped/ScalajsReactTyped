package typingsJapgolly.maximMazurokGapiClientDrive.gapi.client.drive

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDrive.anon.DriveId
import typingsJapgolly.maximMazurokGapiClientDrive.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDrive.anon.IncludeCorpusRemovals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangesResource extends StObject {
  
  /** Gets the starting pageToken for listing future changes. */
  def getStartPageToken(): Request[StartPageToken] = js.native
  def getStartPageToken(request: DriveId): Request[StartPageToken] = js.native
  
  /** Lists the changes for a user or shared drive. */
  def list(): Request[ChangeList] = js.native
  def list(request: Fields): Request[ChangeList] = js.native
  
  def watch(request: Fields, body: Channel): Request[Channel] = js.native
  /** Subscribes to changes for a user. */
  def watch(request: IncludeCorpusRemovals): Request[Channel] = js.native
}
