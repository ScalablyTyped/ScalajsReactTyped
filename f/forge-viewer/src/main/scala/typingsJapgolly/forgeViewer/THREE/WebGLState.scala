package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.forgeViewer.anon.Stencil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLState extends StObject {
  
  def activeTexture(webglSlot: Any): Unit
  
  def bindTexture(webglType: Any, webglTexture: Any): Unit
  
  var buffers: Stencil
  
  def clearColor(r: Double, g: Double, b: Double, a: Double): Unit
  
  def clearDepth(depth: Double): Unit
  
  def clearStencil(stencil: Any): Unit
  
  def compressedTexImage2D(): Unit
  
  def disable(id: String): Unit
  
  def disableUnusedAttributes(): Unit
  
  def enable(id: String): Unit
  
  def enableAttribute(attribute: String): Unit
  
  def enableAttributeAndDivisor(attribute: String, meshPerAttribute: Any, `extension`: Any): Unit
  
  def getCompressedTextureFormats(): js.Array[Any]
  
  def getScissorTest(): Boolean
  
  def init(): Unit
  
  def initAttributes(): Unit
  
  def reset(): Unit
  
  def scissor(scissor: Any): Unit
  
  def setBlending(
    blending: Double,
    blendEquation: Double,
    blendSrc: Double,
    blendDst: Double,
    blendEquationAlpha: Double,
    blendSrcAlpha: Double,
    blendDstAlpha: Double
  ): Unit
  
  def setColorWrite(colorWrite: Double): Unit
  
  def setCullFace(cullFace: CullFace): Unit
  
  def setDepthFunc(depthFunc: Any): Unit
  
  def setDepthTest(depthTest: Double): Unit
  
  def setDepthWrite(depthWrite: Double): Unit
  
  def setFlipSided(flipSided: Double): Unit
  
  def setLineWidth(width: Double): Unit
  
  def setPolygonOffset(polygonoffset: Double, factor: Double, units: Double): Unit
  
  def setScissorTest(scissorTest: Boolean): Unit
  
  def setStencilFunc(stencilFunc: Any, stencilRef: Any, stencilMask: Double): Unit
  
  def setStencilOp(stencilFail: Any, stencilZFail: Any, stencilZPass: Any): Unit
  
  def setStencilTest(stencilTest: Boolean): Unit
  
  def setStencilWrite(stencilWrite: Any): Unit
  
  def texImage2D(): Unit
  
  def viewport(viewport: Any): Unit
}
object WebGLState {
  
  inline def apply(
    activeTexture: Any => Callback,
    bindTexture: (Any, Any) => Callback,
    buffers: Stencil,
    clearColor: (Double, Double, Double, Double) => Callback,
    clearDepth: Double => Callback,
    clearStencil: Any => Callback,
    compressedTexImage2D: Callback,
    disable: String => Callback,
    disableUnusedAttributes: Callback,
    enable: String => Callback,
    enableAttribute: String => Callback,
    enableAttributeAndDivisor: (String, Any, Any) => Callback,
    getCompressedTextureFormats: CallbackTo[js.Array[Any]],
    getScissorTest: CallbackTo[Boolean],
    init: Callback,
    initAttributes: Callback,
    reset: Callback,
    scissor: Any => Callback,
    setBlending: (Double, Double, Double, Double, Double, Double, Double) => Callback,
    setColorWrite: Double => Callback,
    setCullFace: CullFace => Callback,
    setDepthFunc: Any => Callback,
    setDepthTest: Double => Callback,
    setDepthWrite: Double => Callback,
    setFlipSided: Double => Callback,
    setLineWidth: Double => Callback,
    setPolygonOffset: (Double, Double, Double) => Callback,
    setScissorTest: Boolean => Callback,
    setStencilFunc: (Any, Any, Double) => Callback,
    setStencilOp: (Any, Any, Any) => Callback,
    setStencilTest: Boolean => Callback,
    setStencilWrite: Any => Callback,
    texImage2D: Callback,
    viewport: Any => Callback
  ): WebGLState = {
    val __obj = js.Dynamic.literal(activeTexture = js.Any.fromFunction1((t0: Any) => activeTexture(t0).runNow()), bindTexture = js.Any.fromFunction2((t0: Any, t1: Any) => (bindTexture(t0, t1)).runNow()), buffers = buffers.asInstanceOf[js.Any], clearColor = js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (clearColor(t0, t1, t2, t3)).runNow()), clearDepth = js.Any.fromFunction1((t0: Double) => clearDepth(t0).runNow()), clearStencil = js.Any.fromFunction1((t0: Any) => clearStencil(t0).runNow()), compressedTexImage2D = compressedTexImage2D.toJsFn, disable = js.Any.fromFunction1((t0: String) => disable(t0).runNow()), disableUnusedAttributes = disableUnusedAttributes.toJsFn, enable = js.Any.fromFunction1((t0: String) => enable(t0).runNow()), enableAttribute = js.Any.fromFunction1((t0: String) => enableAttribute(t0).runNow()), enableAttributeAndDivisor = js.Any.fromFunction3((t0: String, t1: Any, t2: Any) => (enableAttributeAndDivisor(t0, t1, t2)).runNow()), getCompressedTextureFormats = getCompressedTextureFormats.toJsFn, getScissorTest = getScissorTest.toJsFn, init = init.toJsFn, initAttributes = initAttributes.toJsFn, reset = reset.toJsFn, scissor = js.Any.fromFunction1((t0: Any) => scissor(t0).runNow()), setBlending = js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double) => (setBlending(t0, t1, t2, t3, t4, t5, t6)).runNow()), setColorWrite = js.Any.fromFunction1((t0: Double) => setColorWrite(t0).runNow()), setCullFace = js.Any.fromFunction1((t0: CullFace) => setCullFace(t0).runNow()), setDepthFunc = js.Any.fromFunction1((t0: Any) => setDepthFunc(t0).runNow()), setDepthTest = js.Any.fromFunction1((t0: Double) => setDepthTest(t0).runNow()), setDepthWrite = js.Any.fromFunction1((t0: Double) => setDepthWrite(t0).runNow()), setFlipSided = js.Any.fromFunction1((t0: Double) => setFlipSided(t0).runNow()), setLineWidth = js.Any.fromFunction1((t0: Double) => setLineWidth(t0).runNow()), setPolygonOffset = js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (setPolygonOffset(t0, t1, t2)).runNow()), setScissorTest = js.Any.fromFunction1((t0: Boolean) => setScissorTest(t0).runNow()), setStencilFunc = js.Any.fromFunction3((t0: Any, t1: Any, t2: Double) => (setStencilFunc(t0, t1, t2)).runNow()), setStencilOp = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (setStencilOp(t0, t1, t2)).runNow()), setStencilTest = js.Any.fromFunction1((t0: Boolean) => setStencilTest(t0).runNow()), setStencilWrite = js.Any.fromFunction1((t0: Any) => setStencilWrite(t0).runNow()), texImage2D = texImage2D.toJsFn, viewport = js.Any.fromFunction1((t0: Any) => viewport(t0).runNow()))
    __obj.asInstanceOf[WebGLState]
  }
  
  extension [Self <: WebGLState](x: Self) {
    
    inline def setActiveTexture(value: Any => Callback): Self = StObject.set(x, "activeTexture", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setBindTexture(value: (Any, Any) => Callback): Self = StObject.set(x, "bindTexture", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setBuffers(value: Stencil): Self = StObject.set(x, "buffers", value.asInstanceOf[js.Any])
    
    inline def setClearColor(value: (Double, Double, Double, Double) => Callback): Self = StObject.set(x, "clearColor", js.Any.fromFunction4((t0: Double, t1: Double, t2: Double, t3: Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setClearDepth(value: Double => Callback): Self = StObject.set(x, "clearDepth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setClearStencil(value: Any => Callback): Self = StObject.set(x, "clearStencil", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setCompressedTexImage2D(value: Callback): Self = StObject.set(x, "compressedTexImage2D", value.toJsFn)
    
    inline def setDisable(value: String => Callback): Self = StObject.set(x, "disable", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setDisableUnusedAttributes(value: Callback): Self = StObject.set(x, "disableUnusedAttributes", value.toJsFn)
    
    inline def setEnable(value: String => Callback): Self = StObject.set(x, "enable", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setEnableAttribute(value: String => Callback): Self = StObject.set(x, "enableAttribute", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setEnableAttributeAndDivisor(value: (String, Any, Any) => Callback): Self = StObject.set(x, "enableAttributeAndDivisor", js.Any.fromFunction3((t0: String, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetCompressedTextureFormats(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getCompressedTextureFormats", value.toJsFn)
    
    inline def setGetScissorTest(value: CallbackTo[Boolean]): Self = StObject.set(x, "getScissorTest", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setInitAttributes(value: Callback): Self = StObject.set(x, "initAttributes", value.toJsFn)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setScissor(value: Any => Callback): Self = StObject.set(x, "scissor", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetBlending(value: (Double, Double, Double, Double, Double, Double, Double) => Callback): Self = StObject.set(x, "setBlending", js.Any.fromFunction7((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setSetColorWrite(value: Double => Callback): Self = StObject.set(x, "setColorWrite", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetCullFace(value: CullFace => Callback): Self = StObject.set(x, "setCullFace", js.Any.fromFunction1((t0: CullFace) => value(t0).runNow()))
    
    inline def setSetDepthFunc(value: Any => Callback): Self = StObject.set(x, "setDepthFunc", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetDepthTest(value: Double => Callback): Self = StObject.set(x, "setDepthTest", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetDepthWrite(value: Double => Callback): Self = StObject.set(x, "setDepthWrite", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetFlipSided(value: Double => Callback): Self = StObject.set(x, "setFlipSided", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetLineWidth(value: Double => Callback): Self = StObject.set(x, "setLineWidth", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetPolygonOffset(value: (Double, Double, Double) => Callback): Self = StObject.set(x, "setPolygonOffset", js.Any.fromFunction3((t0: Double, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetScissorTest(value: Boolean => Callback): Self = StObject.set(x, "setScissorTest", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetStencilFunc(value: (Any, Any, Double) => Callback): Self = StObject.set(x, "setStencilFunc", js.Any.fromFunction3((t0: Any, t1: Any, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetStencilOp(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "setStencilOp", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setSetStencilTest(value: Boolean => Callback): Self = StObject.set(x, "setStencilTest", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetStencilWrite(value: Any => Callback): Self = StObject.set(x, "setStencilWrite", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setTexImage2D(value: Callback): Self = StObject.set(x, "texImage2D", value.toJsFn)
    
    inline def setViewport(value: Any => Callback): Self = StObject.set(x, "viewport", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
