package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalappsharingartifactsResource extends StObject {
  
  /**
    * Uploads an APK to internal app sharing. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a timeout of
    * 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
    */
  def uploadapk(): Request[InternalAppSharingArtifact] = js.native
  def uploadapk(request: Uploadprotocol): Request[InternalAppSharingArtifact] = js.native
  
  /**
    * Uploads an app bundle to internal app sharing. If you are using the Google API client libraries, please increase the timeout of the http request before calling this endpoint (a
    * timeout of 2 minutes is recommended). See [Timeouts and Errors](https://developers.google.com/api-client-library/java/google-api-java-client/errors) for an example in java.
    */
  def uploadbundle(): Request[InternalAppSharingArtifact] = js.native
  def uploadbundle(request: Uploadprotocol): Request[InternalAppSharingArtifact] = js.native
}
