package typingsJapgolly.plottable

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCoreRenderPolicyMod {
  
  @JSImport("plottable/build/src/core/renderPolicy", "AnimationFrame")
  @js.native
  open class AnimationFrame ()
    extends StObject
       with IRenderPolicy {
    
    /* CompleteClass */
    override def render(): Any = js.native
  }
  
  @JSImport("plottable/build/src/core/renderPolicy", "Immediate")
  @js.native
  open class Immediate ()
    extends StObject
       with IRenderPolicy {
    
    /* CompleteClass */
    override def render(): Any = js.native
  }
  
  @JSImport("plottable/build/src/core/renderPolicy", "Timeout")
  @js.native
  open class Timeout ()
    extends StObject
       with IRenderPolicy {
    
    /* private */ var _timeoutMsec: Any = js.native
    
    /* CompleteClass */
    override def render(): Any = js.native
  }
  
  trait IRenderPolicy extends StObject {
    
    def render(): Any
  }
  object IRenderPolicy {
    
    inline def apply(render: CallbackTo[Any]): IRenderPolicy = {
      val __obj = js.Dynamic.literal(render = render.toJsFn)
      __obj.asInstanceOf[IRenderPolicy]
    }
    
    extension [Self <: IRenderPolicy](x: Self) {
      
      inline def setRender(value: CallbackTo[Any]): Self = StObject.set(x, "render", value.toJsFn)
    }
  }
}
