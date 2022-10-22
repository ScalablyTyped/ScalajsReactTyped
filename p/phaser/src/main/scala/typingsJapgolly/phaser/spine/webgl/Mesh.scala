package typingsJapgolly.phaser.spine.webgl

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.spine.Disposable
import typingsJapgolly.phaser.spine.Restorable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mesh
  extends StObject
     with Disposable
     with Restorable {
  
  /* private */ var attributes: Any
  
  def bind(shader: Shader): Unit
  
  /* private */ var context: Any
  
  /* private */ var dirtyIndices: Any
  
  /* private */ var dirtyVertices: Any
  
  def draw(shader: Shader, primitiveType: Double): Unit
  
  def drawWithOffset(shader: Shader, primitiveType: Double, offset: Double, count: Double): Unit
  
  /* private */ var elementsPerVertex: Any
  
  def getAttributes(): js.Array[VertexAttribute]
  
  def getIndices(): js.typedarray.Uint16Array
  
  def getVertexSizeInFloats(): Double
  
  def getVertices(): js.typedarray.Float32Array
  
  /* private */ var indices: Any
  
  /* private */ var indicesBuffer: Any
  
  /* private */ var indicesLength: Any
  
  def maxIndices(): Double
  
  def maxVertices(): Double
  
  def numIndices(): Double
  
  def numVertices(): Double
  
  def setIndices(indices: js.Array[Double]): Unit
  
  def setIndicesLength(length: Double): Unit
  
  def setVertices(vertices: js.Array[Double]): Unit
  
  def setVerticesLength(length: Double): Unit
  
  def unbind(shader: Shader): Unit
  
  /* private */ var update: Any
  
  /* private */ var vertices: Any
  
  /* private */ var verticesBuffer: Any
  
  /* private */ var verticesLength: Any
}
object Mesh {
  
  inline def apply(
    attributes: Any,
    bind: Shader => Callback,
    context: Any,
    dirtyIndices: Any,
    dirtyVertices: Any,
    dispose: Callback,
    draw: (Shader, Double) => Callback,
    drawWithOffset: (Shader, Double, Double, Double) => Callback,
    elementsPerVertex: Any,
    getAttributes: CallbackTo[js.Array[VertexAttribute]],
    getIndices: CallbackTo[js.typedarray.Uint16Array],
    getVertexSizeInFloats: CallbackTo[Double],
    getVertices: CallbackTo[js.typedarray.Float32Array],
    indices: Any,
    indicesBuffer: Any,
    indicesLength: Any,
    maxIndices: CallbackTo[Double],
    maxVertices: CallbackTo[Double],
    numIndices: CallbackTo[Double],
    numVertices: CallbackTo[Double],
    restore: Callback,
    setIndices: js.Array[Double] => Callback,
    setIndicesLength: Double => Callback,
    setVertices: js.Array[Double] => Callback,
    setVerticesLength: Double => Callback,
    unbind: Shader => Callback,
    update: Any,
    vertices: Any,
    verticesBuffer: Any,
    verticesLength: Any
  ): Mesh = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], bind = js.Any.fromFunction1((t0: Shader) => bind(t0).runNow()), context = context.asInstanceOf[js.Any], dirtyIndices = dirtyIndices.asInstanceOf[js.Any], dirtyVertices = dirtyVertices.asInstanceOf[js.Any], dispose = dispose.toJsFn, draw = js.Any.fromFunction2((t0: Shader, t1: Double) => (draw(t0, t1)).runNow()), drawWithOffset = js.Any.fromFunction4((t0: Shader, t1: Double, t2: Double, t3: Double) => (drawWithOffset(t0, t1, t2, t3)).runNow()), elementsPerVertex = elementsPerVertex.asInstanceOf[js.Any], getAttributes = getAttributes.toJsFn, getIndices = getIndices.toJsFn, getVertexSizeInFloats = getVertexSizeInFloats.toJsFn, getVertices = getVertices.toJsFn, indices = indices.asInstanceOf[js.Any], indicesBuffer = indicesBuffer.asInstanceOf[js.Any], indicesLength = indicesLength.asInstanceOf[js.Any], maxIndices = maxIndices.toJsFn, maxVertices = maxVertices.toJsFn, numIndices = numIndices.toJsFn, numVertices = numVertices.toJsFn, restore = restore.toJsFn, setIndices = js.Any.fromFunction1((t0: js.Array[Double]) => setIndices(t0).runNow()), setIndicesLength = js.Any.fromFunction1((t0: Double) => setIndicesLength(t0).runNow()), setVertices = js.Any.fromFunction1((t0: js.Array[Double]) => setVertices(t0).runNow()), setVerticesLength = js.Any.fromFunction1((t0: Double) => setVerticesLength(t0).runNow()), unbind = js.Any.fromFunction1((t0: Shader) => unbind(t0).runNow()), update = update.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any], verticesBuffer = verticesBuffer.asInstanceOf[js.Any], verticesLength = verticesLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mesh]
  }
  
  extension [Self <: Mesh](x: Self) {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setBind(value: Shader => Callback): Self = StObject.set(x, "bind", js.Any.fromFunction1((t0: Shader) => value(t0).runNow()))
    
    inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDirtyIndices(value: Any): Self = StObject.set(x, "dirtyIndices", value.asInstanceOf[js.Any])
    
    inline def setDirtyVertices(value: Any): Self = StObject.set(x, "dirtyVertices", value.asInstanceOf[js.Any])
    
    inline def setDraw(value: (Shader, Double) => Callback): Self = StObject.set(x, "draw", js.Any.fromFunction2((t0: Shader, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setDrawWithOffset(value: (Shader, Double, Double, Double) => Callback): Self = StObject.set(x, "drawWithOffset", js.Any.fromFunction4((t0: Shader, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setElementsPerVertex(value: Any): Self = StObject.set(x, "elementsPerVertex", value.asInstanceOf[js.Any])
    
    inline def setGetAttributes(value: CallbackTo[js.Array[VertexAttribute]]): Self = StObject.set(x, "getAttributes", value.toJsFn)
    
    inline def setGetIndices(value: CallbackTo[js.typedarray.Uint16Array]): Self = StObject.set(x, "getIndices", value.toJsFn)
    
    inline def setGetVertexSizeInFloats(value: CallbackTo[Double]): Self = StObject.set(x, "getVertexSizeInFloats", value.toJsFn)
    
    inline def setGetVertices(value: CallbackTo[js.typedarray.Float32Array]): Self = StObject.set(x, "getVertices", value.toJsFn)
    
    inline def setIndices(value: Any): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesBuffer(value: Any): Self = StObject.set(x, "indicesBuffer", value.asInstanceOf[js.Any])
    
    inline def setIndicesLength(value: Any): Self = StObject.set(x, "indicesLength", value.asInstanceOf[js.Any])
    
    inline def setMaxIndices(value: CallbackTo[Double]): Self = StObject.set(x, "maxIndices", value.toJsFn)
    
    inline def setMaxVertices(value: CallbackTo[Double]): Self = StObject.set(x, "maxVertices", value.toJsFn)
    
    inline def setNumIndices(value: CallbackTo[Double]): Self = StObject.set(x, "numIndices", value.toJsFn)
    
    inline def setNumVertices(value: CallbackTo[Double]): Self = StObject.set(x, "numVertices", value.toJsFn)
    
    inline def setSetIndices(value: js.Array[Double] => Callback): Self = StObject.set(x, "setIndices", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setSetIndicesLength(value: Double => Callback): Self = StObject.set(x, "setIndicesLength", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetVertices(value: js.Array[Double] => Callback): Self = StObject.set(x, "setVertices", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setSetVerticesLength(value: Double => Callback): Self = StObject.set(x, "setVerticesLength", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUnbind(value: Shader => Callback): Self = StObject.set(x, "unbind", js.Any.fromFunction1((t0: Shader) => value(t0).runNow()))
    
    inline def setUpdate(value: Any): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setVertices(value: Any): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesBuffer(value: Any): Self = StObject.set(x, "verticesBuffer", value.asInstanceOf[js.Any])
    
    inline def setVerticesLength(value: Any): Self = StObject.set(x, "verticesLength", value.asInstanceOf[js.Any])
  }
}
