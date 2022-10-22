package typingsJapgolly.winrt.global.Windows.Devices

import typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Geolocation {
  
  @JSGlobal("Windows.Devices.Geolocation.CivicAddress")
  @js.native
  open class CivicAddress ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Geolocation.CivicAddress {
    
    /* CompleteClass */
    var city: String = js.native
    
    /* CompleteClass */
    var country: String = js.native
    
    /* CompleteClass */
    var postalCode: String = js.native
    
    /* CompleteClass */
    var state: String = js.native
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  @JSGlobal("Windows.Devices.Geolocation.Geocoordinate")
  @js.native
  open class Geocoordinate ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Geolocation.Geocoordinate {
    
    /* CompleteClass */
    var accuracy: Double = js.native
    
    /* CompleteClass */
    var altitude: Double = js.native
    
    /* CompleteClass */
    var altitudeAccuracy: Double = js.native
    
    /* CompleteClass */
    var heading: Double = js.native
    
    /* CompleteClass */
    var latitude: Double = js.native
    
    /* CompleteClass */
    var longitude: Double = js.native
    
    /* CompleteClass */
    var speed: Double = js.native
    
    /* CompleteClass */
    var timestamp: js.Date = js.native
  }
  
  @JSGlobal("Windows.Devices.Geolocation.Geolocator")
  @js.native
  open class Geolocator ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Geolocation.Geolocator
  
  @JSGlobal("Windows.Devices.Geolocation.Geoposition")
  @js.native
  open class Geoposition ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Geolocation.Geoposition {
    
    /* CompleteClass */
    var civicAddress: typingsJapgolly.winrt.Windows.Devices.Geolocation.CivicAddress = js.native
    
    /* CompleteClass */
    var coordinate: typingsJapgolly.winrt.Windows.Devices.Geolocation.Geocoordinate = js.native
  }
  
  @JSGlobal("Windows.Devices.Geolocation.PositionAccuracy")
  @js.native
  object PositionAccuracy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionAccuracy & Double] = js.native
    
    /* 0 */ val default: typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionAccuracy.default & Double = js.native
    
    /* 1 */ val high: typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionAccuracy.high & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Geolocation.PositionChangedEventArgs")
  @js.native
  open class PositionChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionChangedEventArgs {
    
    /* CompleteClass */
    var position: typingsJapgolly.winrt.Windows.Devices.Geolocation.Geoposition = js.native
  }
  
  @JSGlobal("Windows.Devices.Geolocation.PositionStatus")
  @js.native
  object PositionStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionStatus & Double] = js.native
    
    /* 3 */ val disabled: typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionStatus.disabled & Double = js.native
    
    /* 1 */ val initializing: typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionStatus.initializing & Double = js.native
    
    /* 2 */ val noData: typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionStatus.noData & Double = js.native
    
    /* 5 */ val notAvailable: typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionStatus.notAvailable & Double = js.native
    
    /* 4 */ val notInitialized: typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionStatus.notInitialized & Double = js.native
    
    /* 0 */ val ready: typingsJapgolly.winrt.Windows.Devices.Geolocation.PositionStatus.ready & Double = js.native
  }
  
  @JSGlobal("Windows.Devices.Geolocation.StatusChangedEventArgs")
  @js.native
  open class StatusChangedEventArgs ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Devices.Geolocation.StatusChangedEventArgs {
    
    /* CompleteClass */
    var status: PositionStatus = js.native
  }
}
