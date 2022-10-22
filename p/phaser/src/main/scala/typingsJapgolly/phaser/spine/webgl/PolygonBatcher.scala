package typingsJapgolly.phaser.spine.webgl

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.spine.ArrayLike
import typingsJapgolly.phaser.spine.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonBatcher
  extends StObject
     with Disposable {
  
  def begin(shader: Shader): Unit
  
  /* private */ var context: Any
  
  def draw(texture: GLTexture, vertices: ArrayLike[Double], indices: js.Array[Double]): Unit
  
  /* private */ var drawCalls: Any
  
  /* private */ var dstBlend: Any
  
  def end(): Unit
  
  /* private */ var flush: Any
  
  def getDrawCalls(): Double
  
  /* private */ var indicesLength: Any
  
  /* private */ var isDrawing: Any
  
  /* private */ var lastTexture: Any
  
  /* private */ var mesh: Any
  
  def setBlendMode(srcBlend: Double, dstBlend: Double): Unit
  
  /* private */ var shader: Any
  
  /* private */ var srcBlend: Any
  
  /* private */ var verticesLength: Any
}
object PolygonBatcher {
  
  inline def apply(
    begin: Shader => Callback,
    context: Any,
    dispose: Callback,
    draw: (GLTexture, ArrayLike[Double], js.Array[Double]) => Callback,
    drawCalls: Any,
    dstBlend: Any,
    end: Callback,
    flush: Any,
    getDrawCalls: CallbackTo[Double],
    indicesLength: Any,
    isDrawing: Any,
    lastTexture: Any,
    mesh: Any,
    setBlendMode: (Double, Double) => Callback,
    shader: Any,
    srcBlend: Any,
    verticesLength: Any
  ): PolygonBatcher = {
    val __obj = js.Dynamic.literal(begin = js.Any.fromFunction1((t0: Shader) => begin(t0).runNow()), context = context.asInstanceOf[js.Any], dispose = dispose.toJsFn, draw = js.Any.fromFunction3((t0: GLTexture, t1: ArrayLike[Double], t2: js.Array[Double]) => (draw(t0, t1, t2)).runNow()), drawCalls = drawCalls.asInstanceOf[js.Any], dstBlend = dstBlend.asInstanceOf[js.Any], end = end.toJsFn, flush = flush.asInstanceOf[js.Any], getDrawCalls = getDrawCalls.toJsFn, indicesLength = indicesLength.asInstanceOf[js.Any], isDrawing = isDrawing.asInstanceOf[js.Any], lastTexture = lastTexture.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], setBlendMode = js.Any.fromFunction2((t0: Double, t1: Double) => (setBlendMode(t0, t1)).runNow()), shader = shader.asInstanceOf[js.Any], srcBlend = srcBlend.asInstanceOf[js.Any], verticesLength = verticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonBatcher]
  }
  
  extension [Self <: PolygonBatcher](x: Self) {
    
    inline def setBegin(value: Shader => Callback): Self = StObject.set(x, "begin", js.Any.fromFunction1((t0: Shader) => value(t0).runNow()))
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDraw(value: (GLTexture, ArrayLike[Double], js.Array[Double]) => Callback): Self = StObject.set(x, "draw", js.Any.fromFunction3((t0: GLTexture, t1: ArrayLike[Double], t2: js.Array[Double]) => (value(t0, t1, t2)).runNow()))
    
    inline def setDrawCalls(value: Any): Self = StObject.set(x, "drawCalls", value.asInstanceOf[js.Any])
    
    inline def setDstBlend(value: Any): Self = StObject.set(x, "dstBlend", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Callback): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setFlush(value: Any): Self = StObject.set(x, "flush", value.asInstanceOf[js.Any])
    
    inline def setGetDrawCalls(value: CallbackTo[Double]): Self = StObject.set(x, "getDrawCalls", value.toJsFn)
    
    inline def setIndicesLength(value: Any): Self = StObject.set(x, "indicesLength", value.asInstanceOf[js.Any])
    
    inline def setIsDrawing(value: Any): Self = StObject.set(x, "isDrawing", value.asInstanceOf[js.Any])
    
    inline def setLastTexture(value: Any): Self = StObject.set(x, "lastTexture", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: Any): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setSetBlendMode(value: (Double, Double) => Callback): Self = StObject.set(x, "setBlendMode", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setShader(value: Any): Self = StObject.set(x, "shader", value.asInstanceOf[js.Any])
    
    inline def setSrcBlend(value: Any): Self = StObject.set(x, "srcBlend", value.asInstanceOf[js.Any])
    
    inline def setVerticesLength(value: Any): Self = StObject.set(x, "verticesLength", value.asInstanceOf[js.Any])
  }
}
