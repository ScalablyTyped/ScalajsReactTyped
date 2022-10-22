package typingsJapgolly.googleMaps.google.maps.places

import typingsJapgolly.googleMaps.google.maps.LatLngBounds
import typingsJapgolly.googleMaps.google.maps.LatLngBoundsLiteral
import typingsJapgolly.googleMaps.google.maps.MVCObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A widget that provides query predictions based on a user&#39;s text input.
  * It attaches to an input element of type <code>text</code>, and listens for
  * text entry in that field. The list of predictions is presented as a
  * drop-down list, and is updated as text is entered.
  */
@js.native
trait SearchBox
  extends StObject
     with MVCObject {
  
  /**
    * Returns the bounds to which query predictions are biased.
    */
  def getBounds(): js.UndefOr[LatLngBounds] = js.native
  
  /**
    * Returns the query selected by the user to be used with
    * <code>places_changed</code> event.
    */
  def getPlaces(): js.UndefOr[js.Array[PlaceResult]] = js.native
  
  /**
    * Sets the region to use for biasing query predictions. Results will only
    * be biased towards this area and not be completely restricted to it.
    */
  def setBounds(): Unit = js.native
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): Unit = js.native
}
