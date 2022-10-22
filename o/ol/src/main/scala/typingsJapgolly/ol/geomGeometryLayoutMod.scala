package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomGeometryLayoutMod {
  
  @JSImport("ol/geom/GeometryLayout", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GeometryLayout & String] = js.native
    
    /* "XY" */ val XY: typingsJapgolly.ol.geomGeometryLayoutMod.GeometryLayout.XY & String = js.native
    
    /* "XYM" */ val XYM: typingsJapgolly.ol.geomGeometryLayoutMod.GeometryLayout.XYM & String = js.native
    
    /* "XYZ" */ val XYZ: typingsJapgolly.ol.geomGeometryLayoutMod.GeometryLayout.XYZ & String = js.native
    
    /* "XYZM" */ val XYZM: typingsJapgolly.ol.geomGeometryLayoutMod.GeometryLayout.XYZM & String = js.native
  }
  
  @js.native
  sealed trait GeometryLayout extends StObject
  @JSImport("ol/geom/GeometryLayout", "GeometryLayout")
  @js.native
  object GeometryLayout extends StObject {
    
    @js.native
    sealed trait XY
      extends StObject
         with GeometryLayout
    
    @js.native
    sealed trait XYM
      extends StObject
         with GeometryLayout
    
    @js.native
    sealed trait XYZ
      extends StObject
         with GeometryLayout
    
    @js.native
    sealed trait XYZM
      extends StObject
         with GeometryLayout
  }
}
