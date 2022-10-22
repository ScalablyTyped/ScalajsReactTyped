package typingsJapgolly.heremaps.global.H.map

import typingsJapgolly.heremaps.H.geo.IPoint
import typingsJapgolly.heremaps.H.map.Marker.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A marker with a visual representation in the form of a bitmap icon. Marker are predestinated if large amounts of markers with static icons should be displayed om the map.
  */
@JSGlobal("H.map.Marker")
@js.native
open class Marker protected ()
  extends StObject
     with typingsJapgolly.heremaps.H.map.AbstractMarker {
  /**
    * Constructor
    * @param position {H.geo.IPoint} - The location of this marker
    * @param opt_options {H.map.Marker.Options=} - The values to initialize this marker
    */
  def this(position: IPoint) = this()
  def this(position: IPoint, opt_options: Options) = this()
}
