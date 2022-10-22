package typingsJapgolly.wonderFrp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsDisposableIdisposableMod {
  
  trait IDisposable extends StObject {
    
    def dispose(): Unit
  }
  object IDisposable {
    
    inline def apply(dispose: Callback): IDisposable = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn)
      __obj.asInstanceOf[IDisposable]
    }
    
    extension [Self <: IDisposable](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    }
  }
}
