package typingsJapgolly.vscodeJsonrpc

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonDisposableMod {
  
  trait Disposable extends StObject {
    
    /**
      * Dispose this object.
      */
    def dispose(): Unit
  }
  object Disposable {
    
    inline def apply(dispose: Callback): Disposable = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
      __obj.asInstanceOf[Disposable]
    }
    
    @JSImport("vscode-jsonrpc/lib/common/disposable", "Disposable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(func: js.Function0[Unit]): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(func.asInstanceOf[js.Any]).asInstanceOf[Disposable]
    
    extension [Self <: Disposable](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
}
