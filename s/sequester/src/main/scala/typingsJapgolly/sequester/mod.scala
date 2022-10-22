package typingsJapgolly.sequester

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sequester", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createLock(): Lock = ^.asInstanceOf[js.Dynamic].applyDynamic("createLock")().asInstanceOf[Lock]
  
  type Callback = js.Function0[Unit]
  
  trait Lock extends StObject {
    
    var count: Double
    
    def dispose(): Unit
    
    def downgrade(): Unit
    
    def exclude(cb: Callback): Unit
    
    def share(cb: Callback): Unit
    
    def unlock(): Unit
  }
  object Lock {
    
    inline def apply(
      count: Double,
      dispose: japgolly.scalajs.react.Callback,
      downgrade: japgolly.scalajs.react.Callback,
      exclude: Callback => japgolly.scalajs.react.Callback,
      share: Callback => japgolly.scalajs.react.Callback,
      unlock: japgolly.scalajs.react.Callback
    ): Lock = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dispose = dispose.toJsFn, downgrade = downgrade.toJsFn, exclude = js.Any.fromFunction1((t0: Callback) => exclude(t0).runNow()), share = js.Any.fromFunction1((t0: Callback) => share(t0).runNow()), unlock = unlock.toJsFn)
      __obj.asInstanceOf[Lock]
    }
    
    extension [Self <: Lock](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setDowngrade(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "downgrade", value.toJsFn)
      
      inline def setExclude(value: Callback => japgolly.scalajs.react.Callback): Self = StObject.set(x, "exclude", js.Any.fromFunction1((t0: Callback) => value(t0).runNow()))
      
      inline def setShare(value: Callback => japgolly.scalajs.react.Callback): Self = StObject.set(x, "share", js.Any.fromFunction1((t0: Callback) => value(t0).runNow()))
      
      inline def setUnlock(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "unlock", value.toJsFn)
    }
  }
}
