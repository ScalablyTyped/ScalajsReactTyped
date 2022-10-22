package typingsJapgolly.geolib

import typingsJapgolly.geolib.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.geolib.geolibInts.`2`
    - typingsJapgolly.geolib.geolibStrings.alt
    - typingsJapgolly.geolib.geolibStrings.altitude
    - typingsJapgolly.geolib.geolibStrings.elevation
    - typingsJapgolly.geolib.geolibStrings.elev
  */
  trait AltitudeKeys extends StObject
  object AltitudeKeys {
    
    inline def `2`: typingsJapgolly.geolib.geolibInts.`2` = 2.asInstanceOf[typingsJapgolly.geolib.geolibInts.`2`]
    
    inline def alt: typingsJapgolly.geolib.geolibStrings.alt = "alt".asInstanceOf[typingsJapgolly.geolib.geolibStrings.alt]
    
    inline def altitude: typingsJapgolly.geolib.geolibStrings.altitude = "altitude".asInstanceOf[typingsJapgolly.geolib.geolibStrings.altitude]
    
    inline def elev: typingsJapgolly.geolib.geolibStrings.elev = "elev".asInstanceOf[typingsJapgolly.geolib.geolibStrings.elev]
    
    inline def elevation: typingsJapgolly.geolib.geolibStrings.elevation = "elevation".asInstanceOf[typingsJapgolly.geolib.geolibStrings.elevation]
  }
  
  type GeolibAltitudeInputValue = Double
  
  type GeolibDistanceFn = js.Function2[/* point */ GeolibInputCoordinates, /* dest */ GeolibInputCoordinates, Double]
  
  type GeolibGeoJSONPoint = js.Tuple3[
    GeolibLongitudeInputValue, 
    GeolibLatitudeInputValue, 
    js.UndefOr[GeolibAltitudeInputValue]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.geolib.anon.Alt
    - typingsJapgolly.geolib.anon.`0`
    - typingsJapgolly.geolib.anon.Elevation
    - typingsJapgolly.geolib.anon.Elev
  */
  trait GeolibInputAltitude extends StObject
  object GeolibInputAltitude {
    
    inline def `0`(): typingsJapgolly.geolib.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.geolib.anon.`0`]
    }
    
    inline def Alt(): typingsJapgolly.geolib.anon.Alt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.geolib.anon.Alt]
    }
    
    inline def Elev(): typingsJapgolly.geolib.anon.Elev = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.geolib.anon.Elev]
    }
    
    inline def Elevation(): typingsJapgolly.geolib.anon.Elevation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.geolib.anon.Elevation]
    }
  }
  
  type GeolibInputCoordinates = UserInputCoordinates | GeolibGeoJSONPoint
  
  type GeolibInputCoordinatesWithTime = GeolibInputCoordinates & Time
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.geolib.anon.Lat
    - typingsJapgolly.geolib.anon.LatitudeGeolibLatitudeInputValue
  */
  trait GeolibInputLatitude extends StObject
  object GeolibInputLatitude {
    
    inline def Lat(lat: GeolibLatitudeInputValue): typingsJapgolly.geolib.anon.Lat = {
      val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.geolib.anon.Lat]
    }
    
    inline def LatitudeGeolibLatitudeInputValue(latitude: GeolibLatitudeInputValue): typingsJapgolly.geolib.anon.LatitudeGeolibLatitudeInputValue = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.geolib.anon.LatitudeGeolibLatitudeInputValue]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.geolib.anon.Lng
    - typingsJapgolly.geolib.anon.Lon
    - typingsJapgolly.geolib.anon.LongitudeGeolibLongitudeInputValue
  */
  trait GeolibInputLongitude extends StObject
  object GeolibInputLongitude {
    
    inline def Lng(lng: GeolibLongitudeInputValue): typingsJapgolly.geolib.anon.Lng = {
      val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.geolib.anon.Lng]
    }
    
    inline def Lon(lon: GeolibLongitudeInputValue): typingsJapgolly.geolib.anon.Lon = {
      val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.geolib.anon.Lon]
    }
    
    inline def LongitudeGeolibLongitudeInputValue(longitude: GeolibLongitudeInputValue): typingsJapgolly.geolib.anon.LongitudeGeolibLongitudeInputValue = {
      val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.geolib.anon.LongitudeGeolibLongitudeInputValue]
    }
  }
  
  type GeolibLatitudeInputValue = Double | String
  
  type GeolibLongitudeInputValue = Double | String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.geolib.geolibInts.`1`
    - typingsJapgolly.geolib.geolibStrings.lat
    - typingsJapgolly.geolib.geolibStrings.latitude
  */
  trait LatitudeKeys extends StObject
  object LatitudeKeys {
    
    inline def `1`: typingsJapgolly.geolib.geolibInts.`1` = 1.asInstanceOf[typingsJapgolly.geolib.geolibInts.`1`]
    
    inline def lat: typingsJapgolly.geolib.geolibStrings.lat = "lat".asInstanceOf[typingsJapgolly.geolib.geolibStrings.lat]
    
    inline def latitude: typingsJapgolly.geolib.geolibStrings.latitude = "latitude".asInstanceOf[typingsJapgolly.geolib.geolibStrings.latitude]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.geolib.geolibInts.`0`
    - typingsJapgolly.geolib.geolibStrings.lng
    - typingsJapgolly.geolib.geolibStrings.lon
    - typingsJapgolly.geolib.geolibStrings.longitude
  */
  trait LongitudeKeys extends StObject
  object LongitudeKeys {
    
    inline def `0`: typingsJapgolly.geolib.geolibInts.`0` = 0.asInstanceOf[typingsJapgolly.geolib.geolibInts.`0`]
    
    inline def lng: typingsJapgolly.geolib.geolibStrings.lng = "lng".asInstanceOf[typingsJapgolly.geolib.geolibStrings.lng]
    
    inline def lon: typingsJapgolly.geolib.geolibStrings.lon = "lon".asInstanceOf[typingsJapgolly.geolib.geolibStrings.lon]
    
    inline def longitude: typingsJapgolly.geolib.geolibStrings.longitude = "longitude".asInstanceOf[typingsJapgolly.geolib.geolibStrings.longitude]
  }
  
  type Timestamp = Double
  
  type UserInputCoordinates = GeolibInputLongitude & GeolibInputLatitude & GeolibInputAltitude
}
