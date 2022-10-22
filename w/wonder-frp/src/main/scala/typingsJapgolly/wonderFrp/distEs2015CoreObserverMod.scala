package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distEs2015CoreEntityMod.Entity
import typingsJapgolly.wonderFrp.distEs2015DisposableIdisposableMod.IDisposable
import typingsJapgolly.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015CoreObserverMod {
  
  /* note: abstract class */ @JSImport("wonder-frp/dist/es2015/core/Observer", "Observer")
  @js.native
  open class Observer protected ()
    extends Entity
       with IObserver {
    def this(observer: IObserver) = this()
    def this(onNext: js.Function, onError: js.Function, onCompleted: js.Function) = this()
    
    /* private */ var _disposable: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _isStop: Any = js.native
    
    /* CompleteClass */
    override def completed(): Any = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def error(error: Any): Any = js.native
    
    var isDisposed: Boolean = js.native
    
    /* CompleteClass */
    override def next(value: Any): Any = js.native
    
    /* protected */ def onCompleted(): Any = js.native
    
    /* protected */ def onError(error: Any): Any = js.native
    
    /* protected */ def onNext(value: Any): Any = js.native
    
    /* protected */ var onUserCompleted: js.Function = js.native
    
    /* protected */ var onUserError: js.Function = js.native
    
    /* protected */ var onUserNext: js.Function = js.native
    
    def setDisposable(disposable: IDisposable): Unit = js.native
  }
}
