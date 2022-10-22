package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.DownloadId
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.VersionCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeneratedapksResource extends StObject {
  
  /** Downloads a single signed APK generated from an app bundle. */
  def download(): Request[Unit] = js.native
  def download(request: DownloadId): Request[Unit] = js.native
  
  /** Returns download metadata for all APKs that were generated from a given app bundle. */
  def list(): Request[GeneratedApksListResponse] = js.native
  def list(request: VersionCode): Request[GeneratedApksListResponse] = js.native
}
