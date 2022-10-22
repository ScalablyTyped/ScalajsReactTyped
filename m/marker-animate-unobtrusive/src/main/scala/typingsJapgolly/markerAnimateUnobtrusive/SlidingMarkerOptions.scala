package typingsJapgolly.markerAnimateUnobtrusive

import japgolly.scalajs.react.Callback
import typingsJapgolly.googleMaps.google.maps.LatLng
import typingsJapgolly.googleMaps.google.maps.MarkerOptions
import typingsJapgolly.googleMaps.google.maps.Marker_
import typingsJapgolly.markerAnimateUnobtrusive.jQuery.easing.IEasingType
import typingsJapgolly.markerAnimateUnobtrusive.markerAnimateUnobtrusiveStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlidingMarkerOptions
  extends StObject
     with MarkerOptions {
  
  var animateFunctionAdapter: js.UndefOr[
    js.Function4[
      /* marker */ Marker_, 
      /* destPoint */ LatLng, 
      /* easing */ linear | IEasingType, 
      /* duration */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[IEasingType] = js.undefined
}
object SlidingMarkerOptions {
  
  inline def apply(): SlidingMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlidingMarkerOptions]
  }
  
  extension [Self <: SlidingMarkerOptions](x: Self) {
    
    inline def setAnimateFunctionAdapter(
      value: (/* marker */ Marker_, /* destPoint */ LatLng, /* easing */ linear | IEasingType, /* duration */ Double) => Callback
    ): Self = StObject.set(x, "animateFunctionAdapter", js.Any.fromFunction4((t0: /* marker */ Marker_, t1: /* destPoint */ LatLng, t2: /* easing */ linear | IEasingType, t3: /* duration */ Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setAnimateFunctionAdapterUndefined: Self = StObject.set(x, "animateFunctionAdapter", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: IEasingType): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
