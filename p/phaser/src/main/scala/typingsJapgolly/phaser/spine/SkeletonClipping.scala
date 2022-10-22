package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkeletonClipping extends StObject {
  
  def clip(
    x1: Double,
    y1: Double,
    x2: Double,
    y2: Double,
    x3: Double,
    y3: Double,
    clippingArea: js.Array[Double],
    output: js.Array[Double]
  ): Boolean
  
  /* private */ var clipAttachment: Any
  
  def clipEnd(): Unit
  
  def clipEndWithSlot(slot: Slot): Unit
  
  /* private */ var clipOutput: Any
  
  def clipStart(slot: Slot, clip: ClippingAttachment): Double
  
  def clipTriangles(
    vertices: ArrayLike[Double],
    verticesLength: Double,
    triangles: ArrayLike[Double],
    trianglesLength: Double,
    uvs: ArrayLike[Double],
    light: Color,
    dark: Color,
    twoColor: Boolean
  ): Unit
  
  var clippedTriangles: js.Array[Double]
  
  var clippedVertices: js.Array[Double]
  
  /* private */ var clippingPolygon: Any
  
  /* private */ var clippingPolygons: Any
  
  def isClipping(): Boolean
  
  /* private */ var scratch: Any
  
  /* private */ var triangulator: Any
}
object SkeletonClipping {
  
  inline def apply(
    clip: (Double, Double, Double, Double, Double, Double, js.Array[Double], js.Array[Double]) => Boolean,
    clipAttachment: Any,
    clipEnd: Callback,
    clipEndWithSlot: Slot => Callback,
    clipOutput: Any,
    clipStart: (Slot, ClippingAttachment) => Double,
    clipTriangles: (ArrayLike[Double], Double, ArrayLike[Double], Double, ArrayLike[Double], Color, Color, Boolean) => Callback,
    clippedTriangles: js.Array[Double],
    clippedVertices: js.Array[Double],
    clippingPolygon: Any,
    clippingPolygons: Any,
    isClipping: CallbackTo[Boolean],
    scratch: Any,
    triangulator: Any
  ): SkeletonClipping = {
    val __obj = js.Dynamic.literal(clip = js.Any.fromFunction8(clip), clipAttachment = clipAttachment.asInstanceOf[js.Any], clipEnd = clipEnd.toJsFn, clipEndWithSlot = js.Any.fromFunction1((t0: Slot) => clipEndWithSlot(t0).runNow()), clipOutput = clipOutput.asInstanceOf[js.Any], clipStart = js.Any.fromFunction2(clipStart), clipTriangles = js.Any.fromFunction8((t0: ArrayLike[Double], t1: Double, t2: ArrayLike[Double], t3: Double, t4: ArrayLike[Double], t5: Color, t6: Color, t7: Boolean) => (clipTriangles(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()), clippedTriangles = clippedTriangles.asInstanceOf[js.Any], clippedVertices = clippedVertices.asInstanceOf[js.Any], clippingPolygon = clippingPolygon.asInstanceOf[js.Any], clippingPolygons = clippingPolygons.asInstanceOf[js.Any], isClipping = isClipping.toJsFn, scratch = scratch.asInstanceOf[js.Any], triangulator = triangulator.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonClipping]
  }
  
  extension [Self <: SkeletonClipping](x: Self) {
    
    inline def setClip(
      value: (Double, Double, Double, Double, Double, Double, js.Array[Double], js.Array[Double]) => Boolean
    ): Self = StObject.set(x, "clip", js.Any.fromFunction8(value))
    
    inline def setClipAttachment(value: Any): Self = StObject.set(x, "clipAttachment", value.asInstanceOf[js.Any])
    
    inline def setClipEnd(value: Callback): Self = StObject.set(x, "clipEnd", value.toJsFn)
    
    inline def setClipEndWithSlot(value: Slot => Callback): Self = StObject.set(x, "clipEndWithSlot", js.Any.fromFunction1((t0: Slot) => value(t0).runNow()))
    
    inline def setClipOutput(value: Any): Self = StObject.set(x, "clipOutput", value.asInstanceOf[js.Any])
    
    inline def setClipStart(value: (Slot, ClippingAttachment) => Double): Self = StObject.set(x, "clipStart", js.Any.fromFunction2(value))
    
    inline def setClipTriangles(
      value: (ArrayLike[Double], Double, ArrayLike[Double], Double, ArrayLike[Double], Color, Color, Boolean) => Callback
    ): Self = StObject.set(x, "clipTriangles", js.Any.fromFunction8((t0: ArrayLike[Double], t1: Double, t2: ArrayLike[Double], t3: Double, t4: ArrayLike[Double], t5: Color, t6: Color, t7: Boolean) => (value(t0, t1, t2, t3, t4, t5, t6, t7)).runNow()))
    
    inline def setClippedTriangles(value: js.Array[Double]): Self = StObject.set(x, "clippedTriangles", value.asInstanceOf[js.Any])
    
    inline def setClippedTrianglesVarargs(value: Double*): Self = StObject.set(x, "clippedTriangles", js.Array(value*))
    
    inline def setClippedVertices(value: js.Array[Double]): Self = StObject.set(x, "clippedVertices", value.asInstanceOf[js.Any])
    
    inline def setClippedVerticesVarargs(value: Double*): Self = StObject.set(x, "clippedVertices", js.Array(value*))
    
    inline def setClippingPolygon(value: Any): Self = StObject.set(x, "clippingPolygon", value.asInstanceOf[js.Any])
    
    inline def setClippingPolygons(value: Any): Self = StObject.set(x, "clippingPolygons", value.asInstanceOf[js.Any])
    
    inline def setIsClipping(value: CallbackTo[Boolean]): Self = StObject.set(x, "isClipping", value.toJsFn)
    
    inline def setScratch(value: Any): Self = StObject.set(x, "scratch", value.asInstanceOf[js.Any])
    
    inline def setTriangulator(value: Any): Self = StObject.set(x, "triangulator", value.asInstanceOf[js.Any])
  }
}
