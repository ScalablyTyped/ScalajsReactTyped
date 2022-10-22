package typingsJapgolly.forgeViewer.Autodesk.Viewing.Private

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoundsCallback
  extends StObject
     with GeometryCallback {
  
  @JSName("onCircularArc")
  def onCircularArc_MBoundsCallback(cx: Double, cy: Double, start: Double, end: Double, radius: Double, vpId: Double): Unit
  
  @JSName("onEllipticalArc")
  def onEllipticalArc_MBoundsCallback(
    cx: Double,
    cy: Double,
    start: Double,
    end: Double,
    major: Double,
    minor: Double,
    tilt: Double,
    vpId: Double
  ): Unit
  
  @JSName("onLineSegment")
  def onLineSegment_MBoundsCallback(x1: Double, y1: Double, x2: Double, y2: Double, vpId: Double): Unit
  
  @JSName("onOneTriangle")
  def onOneTriangle_MBoundsCallback(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, vpId: Double): Unit
  
  @JSName("onTexQuad")
  def onTexQuad_MBoundsCallback(centerX: Double, centerY: Double, width: Double, height: Double, rotation: Double, vpId: Double): Unit
  
  @JSName("onVertex")
  def onVertex_MBoundsCallback(cx: Double, cy: Double, vpId: Double): Unit
}
object BoundsCallback {
  
  inline def apply(
    onCircularArc: (Double, Double, Double, Double, Double, Double) => Callback,
    onEllipticalArc: (Double, Double, Double, Double, Double, Double, Double, Double) => Callback,
    onLineSegment: (Double, Double, Double, Double, Double) => Callback,
    onOneTriangle: (Double, Double, Double, Double, Double, Double, Double) => Callback,
    onTexQuad: (Double, Double, Double, Double, Double, Double) => Callback,
    onVertex: (Double, Double, Double) => Callback
  ): BoundsCallback = {
    val __obj = js.Dynamic.literal(onCircularArc = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (onCircularArc(t0, t1, t2, t3, t4, t5)).runNow()), onEllipticalArc = js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (onEllipticalArc(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), onLineSegment = js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (onLineSegment(t0, t1, t2, t3, t4)).runNow()), onOneTriangle = js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double) => (onOneTriangle(t0, t1, t2, t3, t4, t5, t6)).runNow()), onTexQuad = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (onTexQuad(t0, t1, t2, t3, t4, t5)).runNow()), onVertex = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (onVertex(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[BoundsCallback]
  }
  
  extension [Self <: BoundsCallback](x: Self) {
    
    inline def setOnCircularArc(value: (Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "onCircularArc", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setOnEllipticalArc(value: (Double, Double, Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "onEllipticalArc", js.Any.fromFunction8((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setOnLineSegment(value: (Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "onLineSegment", js.Any.fromFunction5((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setOnOneTriangle(value: (Double, Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "onOneTriangle", js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setOnTexQuad(value: (Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "onTexQuad", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
    
    inline def setOnVertex(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "onVertex", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
