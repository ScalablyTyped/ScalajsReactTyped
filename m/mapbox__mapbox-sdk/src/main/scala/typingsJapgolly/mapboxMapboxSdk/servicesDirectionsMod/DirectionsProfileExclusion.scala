package typingsJapgolly.mapboxMapboxSdk.servicesDirectionsMod

import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic`
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxMapboxSdk.anon.Exclude
  - typingsJapgolly.mapboxMapboxSdk.anon.Profile
  - typingsJapgolly.mapboxMapboxSdk.anon.ExcludeProfile
*/
trait DirectionsProfileExclusion extends StObject
object DirectionsProfileExclusion {
  
  inline def Exclude(): typingsJapgolly.mapboxMapboxSdk.anon.Exclude = {
    val __obj = js.Dynamic.literal(profile = "walking")
    __obj.asInstanceOf[typingsJapgolly.mapboxMapboxSdk.anon.Exclude]
  }
  
  inline def ExcludeProfile(profile: driving | `driving-traffic`): typingsJapgolly.mapboxMapboxSdk.anon.ExcludeProfile = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.mapboxMapboxSdk.anon.ExcludeProfile]
  }
  
  inline def Profile(): typingsJapgolly.mapboxMapboxSdk.anon.Profile = {
    val __obj = js.Dynamic.literal(profile = "cycling")
    __obj.asInstanceOf[typingsJapgolly.mapboxMapboxSdk.anon.Profile]
  }
}
