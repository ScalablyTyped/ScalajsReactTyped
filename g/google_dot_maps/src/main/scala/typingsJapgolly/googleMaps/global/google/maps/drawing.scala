package typingsJapgolly.googleMaps.global.google.maps

import typingsJapgolly.googleMaps.google.maps.drawing.DrawingManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  /**
    * Allows users to draw markers, polygons, polylines, rectangles, and circles
    * on the map. The <code>DrawingManager</code>&#39;s drawing mode defines the
    * type of overlay that will be created by the user. Adds a control to the
    * map, allowing the user to switch drawing mode.
    */
  @JSGlobal("google.maps.drawing.DrawingManager")
  @js.native
  /**
    * Allows users to draw markers, polygons, polylines, rectangles, and
    * circles on the map. The <code>DrawingManager</code>&#39;s drawing mode
    * defines the type of overlay that will be created by the user. Adds a
    * control to the map, allowing the user to switch drawing mode.
    */
  open class DrawingManager ()
    extends StObject
       with typingsJapgolly.googleMaps.google.maps.drawing.DrawingManager {
    def this(options: DrawingManagerOptions) = this()
  }
  
  /**
    * The types of overlay that may be created by the
    * <code>DrawingManager</code>. Specify these by value, or by using the
    * constant&#39;s name. For example, <code>'polygon'</code> or
    * <code>google.maps.drawing.OverlayType.POLYGON</code>.
    */
  @JSGlobal("google.maps.drawing.OverlayType")
  @js.native
  object OverlayType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.googleMaps.google.maps.drawing.OverlayType & String] = js.native
    
    /* "circle" */ val CIRCLE: typingsJapgolly.googleMaps.google.maps.drawing.OverlayType.CIRCLE & String = js.native
    
    /* "marker" */ val MARKER: typingsJapgolly.googleMaps.google.maps.drawing.OverlayType.MARKER & String = js.native
    
    /* "polygon" */ val POLYGON: typingsJapgolly.googleMaps.google.maps.drawing.OverlayType.POLYGON & String = js.native
    
    /* "polyline" */ val POLYLINE: typingsJapgolly.googleMaps.google.maps.drawing.OverlayType.POLYLINE & String = js.native
    
    /* "rectangle" */ val RECTANGLE: typingsJapgolly.googleMaps.google.maps.drawing.OverlayType.RECTANGLE & String = js.native
  }
}
