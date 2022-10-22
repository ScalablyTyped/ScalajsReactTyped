package typingsJapgolly.jsonnet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jsonnet", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Jsonnet {
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def eval(code: String): Any = js.native
    
    /* CompleteClass */
    override def evalFile(): Any = js.native
  }
  
  trait Jsonnet extends StObject {
    
    def destroy(): Unit
    
    def eval(code: String): Any
    
    def evalFile(): Any
  }
  object Jsonnet {
    
    inline def apply(destroy: Callback, eval: String => Any, evalFile: CallbackTo[Any]): Jsonnet = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, eval = js.Any.fromFunction1(eval), evalFile = evalFile.toJsFn)
      __obj.asInstanceOf[Jsonnet]
    }
    
    extension [Self <: Jsonnet](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setEval(value: String => Any): Self = StObject.set(x, "eval", js.Any.fromFunction1(value))
      
      inline def setEvalFile(value: CallbackTo[Any]): Self = StObject.set(x, "evalFile", value.toJsFn)
    }
  }
}
