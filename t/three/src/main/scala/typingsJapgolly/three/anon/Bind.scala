package typingsJapgolly.three.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.three.srcCoreUniformsGroupMod.UniformsGroup
import typingsJapgolly.three.srcRenderersWebglWebGLProgramMod.WebGLProgram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bind extends StObject {
  
  def bind(uniformsGroup: UniformsGroup, program: WebGLProgram): Unit
  
  def dispose(): Unit
  
  def update(uniformsGroup: UniformsGroup, program: WebGLProgram): Unit
}
object Bind {
  
  inline def apply(
    bind: (UniformsGroup, WebGLProgram) => Callback,
    dispose: Callback,
    update: (UniformsGroup, WebGLProgram) => Callback
  ): Bind = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction2((t0: UniformsGroup, t1: WebGLProgram) => (bind(t0, t1)).runNow()), dispose = dispose.toJsFn, update = js.Any.fromFunction2((t0: UniformsGroup, t1: WebGLProgram) => (update(t0, t1)).runNow()))
    __obj.asInstanceOf[Bind]
  }
  
  extension [Self <: Bind](x: Self) {
    
    inline def setBind(value: (UniformsGroup, WebGLProgram) => Callback): Self = StObject.set(x, "bind", js.Any.fromFunction2((t0: UniformsGroup, t1: WebGLProgram) => (value(t0, t1)).runNow()))
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setUpdate(value: (UniformsGroup, WebGLProgram) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: UniformsGroup, t1: WebGLProgram) => (value(t0, t1)).runNow()))
  }
}
