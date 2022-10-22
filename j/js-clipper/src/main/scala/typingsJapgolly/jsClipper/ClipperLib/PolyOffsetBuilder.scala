package typingsJapgolly.jsClipper.ClipperLib

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolyOffsetBuilder extends StObject {
  
  def AddPoint(pt: IntPoint): Unit
  
  def DoMiter(): Unit
  
  def DoRound(): Unit
  
  def DoSquare(mul: Double): Unit
  
  def UpdateBotPt(pt: IntPoint): Boolean
  
  var botPt: PolyOffsetBuilder
  
  var currentPoly: Polygon
  
  var delta: Double
  
  var m_R: Double
  
  var m_i: Double
  
  var m_j: Double
  
  var m_k: Double
  
  var normals: ArrayLike[IntPoint]
  
  var pts: Polygons
}
object PolyOffsetBuilder {
  
  inline def apply(
    AddPoint: IntPoint => Callback,
    DoMiter: Callback,
    DoRound: Callback,
    DoSquare: Double => Callback,
    UpdateBotPt: IntPoint => Boolean,
    botPt: PolyOffsetBuilder,
    currentPoly: Polygon,
    delta: Double,
    m_R: Double,
    m_i: Double,
    m_j: Double,
    m_k: Double,
    normals: ArrayLike[IntPoint],
    pts: Polygons
  ): PolyOffsetBuilder = {
    val __obj = js.Dynamic.literal(AddPoint = js.Any.fromFunction1((t0: IntPoint) => AddPoint(t0).runNow()), DoMiter = DoMiter.toJsFn, DoRound = DoRound.toJsFn, DoSquare = js.Any.fromFunction1((t0: Double) => DoSquare(t0).runNow()), UpdateBotPt = js.Any.fromFunction1(UpdateBotPt), botPt = botPt.asInstanceOf[js.Any], currentPoly = currentPoly.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], m_R = m_R.asInstanceOf[js.Any], m_i = m_i.asInstanceOf[js.Any], m_j = m_j.asInstanceOf[js.Any], m_k = m_k.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any], pts = pts.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyOffsetBuilder]
  }
  
  extension [Self <: PolyOffsetBuilder](x: Self) {
    
    inline def setAddPoint(value: IntPoint => Callback): Self = StObject.set(x, "AddPoint", js.Any.fromFunction1((t0: IntPoint) => value(t0).runNow()))
    
    inline def setBotPt(value: PolyOffsetBuilder): Self = StObject.set(x, "botPt", value.asInstanceOf[js.Any])
    
    inline def setCurrentPoly(value: Polygon): Self = StObject.set(x, "currentPoly", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: Double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDoMiter(value: Callback): Self = StObject.set(x, "DoMiter", value.toJsFn)
    
    inline def setDoRound(value: Callback): Self = StObject.set(x, "DoRound", value.toJsFn)
    
    inline def setDoSquare(value: Double => Callback): Self = StObject.set(x, "DoSquare", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setM_R(value: Double): Self = StObject.set(x, "m_R", value.asInstanceOf[js.Any])
    
    inline def setM_i(value: Double): Self = StObject.set(x, "m_i", value.asInstanceOf[js.Any])
    
    inline def setM_j(value: Double): Self = StObject.set(x, "m_j", value.asInstanceOf[js.Any])
    
    inline def setM_k(value: Double): Self = StObject.set(x, "m_k", value.asInstanceOf[js.Any])
    
    inline def setNormals(value: ArrayLike[IntPoint]): Self = StObject.set(x, "normals", value.asInstanceOf[js.Any])
    
    inline def setPts(value: Polygons): Self = StObject.set(x, "pts", value.asInstanceOf[js.Any])
    
    inline def setUpdateBotPt(value: IntPoint => Boolean): Self = StObject.set(x, "UpdateBotPt", js.Any.fromFunction1(value))
  }
}
