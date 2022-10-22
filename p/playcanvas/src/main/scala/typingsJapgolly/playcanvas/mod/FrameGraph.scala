package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../graphics/render-pass.js').RenderPass} RenderPass */
/** @typedef {import('../graphics/render-target.js').RenderTarget} RenderTarget */
/** @typedef {import('../graphics/texture.js').Texture} Texture */
/**
  * A frame graph represents a single rendering frame as a sequence of render passes.
  *
  * @ignore
  */
trait FrameGraph extends StObject {
  
  /**
    * Add a render pass to the frame.
    *
    * @param {RenderPass} renderPass - The render pass to add.
    */
  def addRenderPass(renderPass: RenderPass): Unit
  
  def compile(): Unit
  
  def log(): Unit
  
  def render(): Unit
  
  /** @type {RenderPass[]} */
  var renderPasses: js.Array[RenderPass]
  
  /**
    * Map used during frame graph compilation. It maps a render target to its previous occurrence.
    *
    *  @type {Map<RenderTarget, RenderPass>}
    */
  var renderTargetMap: Map[RenderTarget, RenderPass]
  
  def reset(): Unit
}
object FrameGraph {
  
  inline def apply(
    addRenderPass: RenderPass => Callback,
    compile: Callback,
    log: Callback,
    render: Callback,
    renderPasses: js.Array[RenderPass],
    renderTargetMap: Map[RenderTarget, RenderPass],
    reset: Callback
  ): FrameGraph = {
    val __obj = js.Dynamic.literal(addRenderPass = js.Any.fromFunction1((t0: RenderPass) => addRenderPass(t0).runNow()), compile = compile.toJsFn, log = log.toJsFn, render = render.toJsFn, renderPasses = renderPasses.asInstanceOf[js.Any], renderTargetMap = renderTargetMap.asInstanceOf[js.Any], reset = reset.toJsFn)
    __obj.asInstanceOf[FrameGraph]
  }
  
  extension [Self <: FrameGraph](x: Self) {
    
    inline def setAddRenderPass(value: RenderPass => Callback): Self = StObject.set(x, "addRenderPass", js.Any.fromFunction1((t0: RenderPass) => value(t0).runNow()))
    
    inline def setCompile(value: Callback): Self = StObject.set(x, "compile", value.toJsFn)
    
    inline def setLog(value: Callback): Self = StObject.set(x, "log", value.toJsFn)
    
    inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setRenderPasses(value: js.Array[RenderPass]): Self = StObject.set(x, "renderPasses", value.asInstanceOf[js.Any])
    
    inline def setRenderPassesVarargs(value: RenderPass*): Self = StObject.set(x, "renderPasses", js.Array(value*))
    
    inline def setRenderTargetMap(value: Map[RenderTarget, RenderPass]): Self = StObject.set(x, "renderTargetMap", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
