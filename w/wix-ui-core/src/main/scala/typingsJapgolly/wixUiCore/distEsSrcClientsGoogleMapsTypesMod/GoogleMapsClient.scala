package typingsJapgolly.wixUiCore.distEsSrcClientsGoogleMapsTypesMod

import typingsJapgolly.wixUiCore.wixUiCoreStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsClient
  extends StObject
     with BaseMapsClient[Geocode]
     with MapsClient {
  
  @JSName("name")
  var name_GoogleMapsClient: google = js.native
  
  def placeDetails(apiKey: String, lang: String, request: Any): js.Promise[PlaceDetails] = js.native
  
  def useClientId(): Unit = js.native
}
