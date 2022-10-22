package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientAndroidpublisher.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountryavailabilityResource extends StObject {
  
  /** Gets country availability. */
  def get(): Request[TrackCountryAvailability] = js.native
  def get(request: Key): Request[TrackCountryAvailability] = js.native
}
