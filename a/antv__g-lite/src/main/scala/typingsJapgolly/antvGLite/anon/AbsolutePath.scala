package typingsJapgolly.antvGLite.anon

import typingsJapgolly.antvGLite.distDisplayObjectsPathMod.PathSegment
import typingsJapgolly.antvGLite.distShapesRectangleMod.Rectangle
import typingsJapgolly.antvUtil.libPathTypesMod.AbsoluteArray
import typingsJapgolly.antvUtil.libPathTypesMod.CurveArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbsolutePath extends StObject {
  
  var absolutePath: AbsoluteArray
  
  var curve: CurveArray
  
  var hasArc: Boolean
  
  var polygons: js.Array[js.Array[js.Tuple2[Double, Double]]]
  
  var polylines: js.Array[js.Array[js.Tuple2[Double, Double]]]
  
  var rect: Rectangle
  
  var segments: js.Array[PathSegment]
  
  var totalLength: Double
  
  var zCommandIndexes: js.Array[Double]
}
object AbsolutePath {
  
  inline def apply(
    absolutePath: AbsoluteArray,
    curve: CurveArray,
    hasArc: Boolean,
    polygons: js.Array[js.Array[js.Tuple2[Double, Double]]],
    polylines: js.Array[js.Array[js.Tuple2[Double, Double]]],
    rect: Rectangle,
    segments: js.Array[PathSegment],
    totalLength: Double,
    zCommandIndexes: js.Array[Double]
  ): AbsolutePath = {
    val __obj = js.Dynamic.literal(absolutePath = absolutePath.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], hasArc = hasArc.asInstanceOf[js.Any], polygons = polygons.asInstanceOf[js.Any], polylines = polylines.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], totalLength = totalLength.asInstanceOf[js.Any], zCommandIndexes = zCommandIndexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbsolutePath]
  }
  
  extension [Self <: AbsolutePath](x: Self) {
    
    inline def setAbsolutePath(value: AbsoluteArray): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    inline def setCurve(value: CurveArray): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setHasArc(value: Boolean): Self = StObject.set(x, "hasArc", value.asInstanceOf[js.Any])
    
    inline def setPolygons(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "polygons", value.asInstanceOf[js.Any])
    
    inline def setPolygonsVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = StObject.set(x, "polygons", js.Array(value*))
    
    inline def setPolylines(value: js.Array[js.Array[js.Tuple2[Double, Double]]]): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    inline def setPolylinesVarargs(value: (js.Array[js.Tuple2[Double, Double]])*): Self = StObject.set(x, "polylines", js.Array(value*))
    
    inline def setRect(value: Rectangle): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: js.Array[PathSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: PathSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setTotalLength(value: Double): Self = StObject.set(x, "totalLength", value.asInstanceOf[js.Any])
    
    inline def setZCommandIndexes(value: js.Array[Double]): Self = StObject.set(x, "zCommandIndexes", value.asInstanceOf[js.Any])
    
    inline def setZCommandIndexesVarargs(value: Double*): Self = StObject.set(x, "zCommandIndexes", js.Array(value*))
  }
}
