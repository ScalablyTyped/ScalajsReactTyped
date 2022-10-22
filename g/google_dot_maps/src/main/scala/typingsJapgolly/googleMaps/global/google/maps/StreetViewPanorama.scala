package typingsJapgolly.googleMaps.global.google.maps

import org.scalajs.dom.HTMLElement
import typingsJapgolly.googleMaps.google.maps.StreetViewPanoramaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays the panorama for a given <code>LatLng</code> or panorama ID. A
  * <code>StreetViewPanorama</code> object provides a Street View
  * &quot;viewer&quot; which can be stand-alone within a separate
  * <code>&lt;div&gt;</code> or bound to a <code>Map</code>.
  */
@JSGlobal("google.maps.StreetViewPanorama")
@js.native
open class StreetViewPanorama protected ()
  extends StObject
     with typingsJapgolly.googleMaps.google.maps.StreetViewPanorama {
  /**
    * Displays the panorama for a given <code>LatLng</code> or panorama ID. A
    * <code>StreetViewPanorama</code> object provides a Street View
    * &quot;viewer&quot; which can be stand-alone within a separate
    * <code>&lt;div&gt;</code> or bound to a <code>Map</code>.
    */
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, opts: StreetViewPanoramaOptions) = this()
}
