package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disposableMod {
  
  @JSImport("ol/Disposable", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Disposable {
    
    /**
      * Clean up.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Extension point for disposable objects.
      */
    /* protected */ /* CompleteClass */
    override def disposeInternal(): Unit = js.native
    
    /**
      * The object has already been disposed.
      */
    /* protected */ /* CompleteClass */
    var disposed: Boolean = js.native
  }
  
  trait Disposable extends StObject {
    
    /**
      * Clean up.
      */
    def dispose(): Unit
    
    /**
      * Extension point for disposable objects.
      */
    /* protected */ def disposeInternal(): Unit
    
    /**
      * The object has already been disposed.
      */
    /* protected */ var disposed: Boolean
  }
  object Disposable {
    
    inline def apply(dispose: Callback, disposeInternal: Callback, disposed: Boolean): Disposable = {
      val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, disposeInternal = disposeInternal.toJsFn, disposed = disposed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disposable]
    }
    
    extension [Self <: Disposable](x: Self) {
      
      inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
      
      inline def setDisposeInternal(value: Callback): Self = StObject.set(x, "disposeInternal", value.toJsFn)
      
      inline def setDisposed(value: Boolean): Self = StObject.set(x, "disposed", value.asInstanceOf[js.Any])
    }
  }
}
