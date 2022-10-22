package typingsJapgolly.googleMaps.google.maps.localContext

import japgolly.scalajs.react.Callback
import typingsJapgolly.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Shows a Local Context experience with a {@link google.maps.Map}.
  */
trait LocalContextMapView
  extends StObject
     with LocalContextMapViewOptions {
  
  /**
    * Adds the given listener function to the given event name.
    */
  def addListener(eventName: String, handler: js.Function): MapsEventListener
  
  /**
    * Hides the place details.
    */
  def hidePlaceDetailsView(): Unit
  
  /**
    * Is set to <code>true</code> before {@link
    * google.maps.localContext.LocalContextMapView} begins changing the bounds
    * of the inner {@link google.maps.Map}, and set to <code>false</code>
    * after {@link google.maps.localContext.LocalContextMapView} finishes
    * changing the bounds of the inner {@link google.maps.Map}. (Not set when
    * layout mode changes happen due to responsive resizing.)
    */
  var isTransitioningMapBounds: Boolean
  
  /**
    * Searches for places to show the user based on the current
    * <code>maxPlaceCount</code>, <code>placeTypePreferences</code>,
    * <code>locationRestriction</code>, and <code>locationBias</code>.
    */
  def search(): Unit
}
object LocalContextMapView {
  
  inline def apply(
    addListener: (String, js.Function) => MapsEventListener,
    hidePlaceDetailsView: Callback,
    isTransitioningMapBounds: Boolean,
    maxPlaceCount: Double,
    placeTypePreferences: js.Array[PlaceTypePreference],
    search: Callback
  ): LocalContextMapView = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hidePlaceDetailsView = hidePlaceDetailsView.toJsFn, isTransitioningMapBounds = isTransitioningMapBounds.asInstanceOf[js.Any], maxPlaceCount = maxPlaceCount.asInstanceOf[js.Any], placeTypePreferences = placeTypePreferences.asInstanceOf[js.Any], search = search.toJsFn)
    __obj.asInstanceOf[LocalContextMapView]
  }
  
  extension [Self <: LocalContextMapView](x: Self) {
    
    inline def setAddListener(value: (String, js.Function) => MapsEventListener): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setHidePlaceDetailsView(value: Callback): Self = StObject.set(x, "hidePlaceDetailsView", value.toJsFn)
    
    inline def setIsTransitioningMapBounds(value: Boolean): Self = StObject.set(x, "isTransitioningMapBounds", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: Callback): Self = StObject.set(x, "search", value.toJsFn)
  }
}
