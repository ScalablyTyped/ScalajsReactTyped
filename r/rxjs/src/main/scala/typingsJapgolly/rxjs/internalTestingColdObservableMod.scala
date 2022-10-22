package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalSchedulerMod.Scheduler
import typingsJapgolly.rxjs.distTypesInternalTestingTestMessageMod.TestMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalTestingColdObservableMod {
  
  @JSImport("rxjs/internal/testing/ColdObservable", "ColdObservable")
  @js.native
  open class ColdObservable[T] protected ()
    extends typingsJapgolly.rxjs.distTypesInternalTestingColdObservableMod.ColdObservable[T] {
    def this(messages: js.Array[TestMessage], scheduler: Scheduler) = this()
  }
}
