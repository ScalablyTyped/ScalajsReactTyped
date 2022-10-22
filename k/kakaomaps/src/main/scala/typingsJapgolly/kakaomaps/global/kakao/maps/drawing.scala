package typingsJapgolly.kakaomaps.global.kakao.maps

import typingsJapgolly.kakaomaps.kakao.maps.drawing.DrawingManagerOptions
import typingsJapgolly.kakaomaps.kakao.maps.drawing.OverlayType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// services
// ## drawing namespace
object drawing {
  
  object AnalyzeType {
    
    @JSGlobal("kakao.maps.drawing.AnalyzeType.ARROW")
    @js.native
    val ARROW: OverlayType = js.native
    
    @JSGlobal("kakao.maps.drawing.AnalyzeType.CIRCLE")
    @js.native
    val CIRCLE: OverlayType = js.native
    
    @JSGlobal("kakao.maps.drawing.AnalyzeType.ELLIPSE")
    @js.native
    val ELLIPSE: OverlayType = js.native
    
    @JSGlobal("kakao.maps.drawing.AnalyzeType.MARKER")
    @js.native
    val MARKER: OverlayType = js.native
    
    @JSGlobal("kakao.maps.drawing.AnalyzeType.POLYGON")
    @js.native
    val POLYGON: OverlayType = js.native
    
    @JSGlobal("kakao.maps.drawing.AnalyzeType.POLYLINE")
    @js.native
    val POLYLINE: OverlayType = js.native
    
    @JSGlobal("kakao.maps.drawing.AnalyzeType.RECTANGLE")
    @js.native
    val RECTANGLE: OverlayType = js.native
  }
  
  @JSGlobal("kakao.maps.drawing.DrawingManager")
  @js.native
  open class DrawingManager ()
    extends StObject
       with typingsJapgolly.kakaomaps.kakao.maps.drawing.DrawingManager {
    def this(options: DrawingManagerOptions) = this()
  }
  
  @JSGlobal("kakao.maps.drawing.OverlayType")
  @js.native
  object OverlayType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.kakaomaps.kakao.maps.drawing.OverlayType & String] = js.native
    
    /* "arrow" */ val ARROW: typingsJapgolly.kakaomaps.kakao.maps.drawing.OverlayType.ARROW & String = js.native
    
    /* "circle" */ val CIRCLE: typingsJapgolly.kakaomaps.kakao.maps.drawing.OverlayType.CIRCLE & String = js.native
    
    /* "ellipse" */ val ELLIPSE: typingsJapgolly.kakaomaps.kakao.maps.drawing.OverlayType.ELLIPSE & String = js.native
    
    /* "marker" */ val MARKER: typingsJapgolly.kakaomaps.kakao.maps.drawing.OverlayType.MARKER & String = js.native
    
    /* "polygon" */ val POLYGON: typingsJapgolly.kakaomaps.kakao.maps.drawing.OverlayType.POLYGON & String = js.native
    
    /* "polyline" */ val POLYLINE: typingsJapgolly.kakaomaps.kakao.maps.drawing.OverlayType.POLYLINE & String = js.native
    
    /* "rectangle" */ val RECTANGLE: typingsJapgolly.kakaomaps.kakao.maps.drawing.OverlayType.RECTANGLE & String = js.native
  }
  
  @JSGlobal("kakao.maps.drawing.Toolbox")
  @js.native
  open class Toolbox ()
    extends StObject
       with typingsJapgolly.kakaomaps.kakao.maps.drawing.Toolbox {
    def this(options: typingsJapgolly.kakaomaps.anon.DrawingManager) = this()
    
    /* CompleteClass */
    override def getElement(): Any = js.native
  }
}
