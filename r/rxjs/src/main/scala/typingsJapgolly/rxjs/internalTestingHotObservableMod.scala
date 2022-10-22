package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalSchedulerMod.Scheduler
import typingsJapgolly.rxjs.distTypesInternalTestingTestMessageMod.TestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalTestingHotObservableMod {
  
  @JSImport("rxjs/internal/testing/HotObservable", "HotObservable")
  @js.native
  open class HotObservable[T] protected ()
    extends typingsJapgolly.rxjs.distTypesInternalTestingHotObservableMod.HotObservable[T] {
    def this(messages: js.Array[TestMessage], scheduler: Scheduler) = this()
  }
}
