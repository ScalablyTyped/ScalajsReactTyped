package typingsJapgolly.navermaps.global.naver.maps

import typingsJapgolly.navermaps.naver.maps.drawing.DrawingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  // Sub module: drawing
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSGlobal("naver.maps.drawing")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("naver.maps.drawing.DrawingEvent")
  @js.native
  object DrawingEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.navermaps.naver.maps.drawing.DrawingEvent & Double] = js.native
    
    /* 0 */ val ADD: typingsJapgolly.navermaps.naver.maps.drawing.DrawingEvent.ADD & Double = js.native
    
    /* 3 */ val Added: typingsJapgolly.navermaps.naver.maps.drawing.DrawingEvent.Added & Double = js.native
    
    /* 1 */ val REMOVE: typingsJapgolly.navermaps.naver.maps.drawing.DrawingEvent.REMOVE & Double = js.native
    
    /* 4 */ val Removed: typingsJapgolly.navermaps.naver.maps.drawing.DrawingEvent.Removed & Double = js.native
    
    /* 2 */ val SELECT: typingsJapgolly.navermaps.naver.maps.drawing.DrawingEvent.SELECT & Double = js.native
    
    /* 5 */ val Selected: typingsJapgolly.navermaps.naver.maps.drawing.DrawingEvent.Selected & Double = js.native
  }
  
  @JSGlobal("naver.maps.drawing.DrawingManager")
  @js.native
  open class DrawingManager ()
    extends StObject
       with typingsJapgolly.navermaps.naver.maps.drawing.DrawingManager {
    def this(options: DrawingOptions) = this()
  }
  
  @JSGlobal("naver.maps.drawing.DrawingMode")
  @js.native
  object DrawingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.navermaps.naver.maps.drawing.DrawingMode & Double] = js.native
    
    /* 3 */ val ARROWLINE: typingsJapgolly.navermaps.naver.maps.drawing.DrawingMode.ARROWLINE & Double = js.native
    
    /* 1 */ val ELLIPSE: typingsJapgolly.navermaps.naver.maps.drawing.DrawingMode.ELLIPSE & Double = js.native
    
    /* 0 */ val HAND: typingsJapgolly.navermaps.naver.maps.drawing.DrawingMode.HAND & Double = js.native
    
    /* 5 */ val MARKER: typingsJapgolly.navermaps.naver.maps.drawing.DrawingMode.MARKER & Double = js.native
    
    /* 4 */ val POLYGON: typingsJapgolly.navermaps.naver.maps.drawing.DrawingMode.POLYGON & Double = js.native
    
    /* 2 */ val POLYLINE: typingsJapgolly.navermaps.naver.maps.drawing.DrawingMode.POLYLINE & Double = js.native
    
    /* 0 */ val RECTANGLE: typingsJapgolly.navermaps.naver.maps.drawing.DrawingMode.RECTANGLE & Double = js.native
  }
  
  @JSGlobal("naver.maps.drawing.DrawingStyle")
  @js.native
  object DrawingStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.navermaps.naver.maps.drawing.DrawingStyle & Double] = js.native
    
    /* 0 */ val HORIZONTAL: typingsJapgolly.navermaps.naver.maps.drawing.DrawingStyle.HORIZONTAL & Double = js.native
    
    /* 1 */ val HORIZONTAL_2: typingsJapgolly.navermaps.naver.maps.drawing.DrawingStyle.HORIZONTAL_2 & Double = js.native
    
    /* 0 */ val VERTICAL: typingsJapgolly.navermaps.naver.maps.drawing.DrawingStyle.VERTICAL & Double = js.native
    
    /* 2 */ val VERTICAL_2: typingsJapgolly.navermaps.naver.maps.drawing.DrawingStyle.VERTICAL_2 & Double = js.native
  }
}
