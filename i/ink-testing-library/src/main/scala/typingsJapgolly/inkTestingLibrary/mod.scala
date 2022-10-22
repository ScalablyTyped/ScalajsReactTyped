package typingsJapgolly.inkTestingLibrary

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inkTestingLibrary.anon.Write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ink-testing-library", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
  
  inline def render(
    tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ Any
  ): RenderResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(tree.asInstanceOf[js.Any]).asInstanceOf[RenderResponse]
  
  trait RenderResponse extends StObject {
    
    var frames: js.Array[String]
    
    def lastFrame(): String
    
    def rerender(
      tree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ Any
    ): Unit
    
    var stdin: Write
    
    def unmount(): Unit
  }
  object RenderResponse {
    
    inline def apply(
      frames: js.Array[String],
      lastFrame: CallbackTo[String],
      rerender: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ Any => Callback,
      stdin: Write,
      unmount: Callback
    ): RenderResponse = {
      val __obj = js.Dynamic.literal(frames = frames.asInstanceOf[js.Any], lastFrame = lastFrame.toJsFn, rerender = js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ Any) => rerender(t0).runNow()), stdin = stdin.asInstanceOf[js.Any], unmount = unmount.toJsFn)
      __obj.asInstanceOf[RenderResponse]
    }
    
    extension [Self <: RenderResponse](x: Self) {
      
      inline def setFrames(value: js.Array[String]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: String*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setLastFrame(value: CallbackTo[String]): Self = StObject.set(x, "lastFrame", value.toJsFn)
      
      inline def setRerender(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ Any => Callback
      ): Self = StObject.set(x, "rerender", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InkElement */ Any) => value(t0).runNow()))
      
      inline def setStdin(value: Write): Self = StObject.set(x, "stdin", value.asInstanceOf[js.Any])
      
      inline def setUnmount(value: Callback): Self = StObject.set(x, "unmount", value.toJsFn)
    }
  }
}
