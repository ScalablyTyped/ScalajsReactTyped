package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distCommonjsCoreObserverMod.Observer
import typingsJapgolly.wonderFrp.distCommonjsCoreStreamMod.Stream
import typingsJapgolly.wonderFrp.distCommonjsDisposableIdisposableMod.IDisposable
import typingsJapgolly.wonderFrp.distCommonjsObserverIobserverMod.IObserver
import typingsJapgolly.wonderFrp.distCommonjsSubjectSubjectMod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsStreamBaseStreamMod {
  
  /* note: abstract class */ @JSImport("wonder-frp/dist/commonjs/stream/BaseStream", "BaseStream")
  @js.native
  open class BaseStream protected () extends Stream {
    def this(subscribeFunc: Any) = this()
    
    def subscribe(arg1: js.Function, onError: Any): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: Any, onCompleted: Any): IDisposable = js.native
    def subscribe(arg1: js.Function, onError: Unit, onCompleted: Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: Any, onCompleted: Any): IDisposable = js.native
    def subscribe(arg1: Observer, onError: Unit, onCompleted: Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: Any, onCompleted: Any): IDisposable = js.native
    def subscribe(arg1: Subject, onError: Unit, onCompleted: Any): IDisposable = js.native
    
    def subscribeCore(observer: IObserver): IDisposable = js.native
  }
}
