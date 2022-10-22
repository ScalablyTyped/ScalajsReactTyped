package typingsJapgolly.mapboxMapboxSdk.anon

import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic`
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.motorway
import typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.toll
import typingsJapgolly.mapboxMapboxSdk.servicesDirectionsMod.DirectionsProfileExclusion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeProfile
  extends StObject
     with DirectionsProfileExclusion {
  
  var exclude: js.UndefOr[js.Array[ferry | toll | motorway]] = js.undefined
  
  var profile: driving | `driving-traffic`
}
object ExcludeProfile {
  
  inline def apply(profile: driving | `driving-traffic`): ExcludeProfile = {
    val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcludeProfile]
  }
  
  extension [Self <: ExcludeProfile](x: Self) {
    
    inline def setExclude(value: js.Array[ferry | toll | motorway]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: (ferry | toll | motorway)*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setProfile(value: driving | `driving-traffic`): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
