package typingsJapgolly.vueTemplateCompiler.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.vueRuntimeCore.mod.RendererElement
import typingsJapgolly.vueRuntimeCore.mod.RendererNode
import typingsJapgolly.vueRuntimeCore.mod.VNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledResultFunctions extends StObject {
  
  def render(): VNode[RendererNode, RendererElement, StringDictionary[Any]]
  
  var staticRenderFns: js.Array[js.Function0[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
}
object CompiledResultFunctions {
  
  inline def apply(
    render: CallbackTo[VNode[RendererNode, RendererElement, StringDictionary[Any]]],
    staticRenderFns: js.Array[js.Function0[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]
  ): CompiledResultFunctions = {
    val __obj = js.Dynamic.literal(render = render.toJsFn, staticRenderFns = staticRenderFns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledResultFunctions]
  }
  
  extension [Self <: CompiledResultFunctions](x: Self) {
    
    inline def setRender(value: CallbackTo[VNode[RendererNode, RendererElement, StringDictionary[Any]]]): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setStaticRenderFns(value: js.Array[js.Function0[VNode[RendererNode, RendererElement, StringDictionary[Any]]]]): Self = StObject.set(x, "staticRenderFns", value.asInstanceOf[js.Any])
    
    inline def setStaticRenderFnsVarargs(value: (js.Function0[VNode[RendererNode, RendererElement, StringDictionary[Any]]])*): Self = StObject.set(x, "staticRenderFns", js.Array(value*))
  }
}
