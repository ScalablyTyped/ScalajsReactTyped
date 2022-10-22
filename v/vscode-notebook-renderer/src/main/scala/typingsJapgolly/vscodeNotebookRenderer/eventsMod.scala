package typingsJapgolly.vscodeNotebookRenderer

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  trait Disposable extends StObject {
    
    def dispose(): Unit
  }
  object Disposable {
    
    inline def apply(dispose: Callback): Disposable = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
      __obj.asInstanceOf[Disposable]
    }
    
    extension [Self <: Disposable](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
  
  type VSCodeEvent[T] = js.Function3[
    /* listener */ js.Function1[/* e */ T, Any], 
    /* thisArgs */ js.UndefOr[Any], 
    /* disposables */ js.UndefOr[js.Array[Disposable]], 
    Disposable
  ]
}
