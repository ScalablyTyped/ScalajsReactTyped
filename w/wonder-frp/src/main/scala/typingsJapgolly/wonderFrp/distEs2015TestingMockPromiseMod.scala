package typingsJapgolly.wonderFrp

import typingsJapgolly.wonderFrp.distEs2015ObserverIobserverMod.IObserver
import typingsJapgolly.wonderFrp.distEs2015TestingRecordMod.Record
import typingsJapgolly.wonderFrp.distEs2015TestingTestSchedulerMod.TestScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015TestingMockPromiseMod {
  
  @JSImport("wonder-frp/dist/es2015/testing/MockPromise", "MockPromise")
  @js.native
  open class MockPromise protected () extends StObject {
    def this(scheduler: TestScheduler, messages: js.Array[Record]) = this()
    
    /* private */ var _messages: Any = js.native
    
    /* private */ var _scheduler: Any = js.native
    
    def `then`(successCb: js.Function, errorCb: js.Function, observer: IObserver): Unit = js.native
  }
  /* static members */
  object MockPromise {
    
    @JSImport("wonder-frp/dist/es2015/testing/MockPromise", "MockPromise")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(scheduler: TestScheduler, messages: js.Array[Record]): MockPromise = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(scheduler.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[MockPromise]
  }
}
