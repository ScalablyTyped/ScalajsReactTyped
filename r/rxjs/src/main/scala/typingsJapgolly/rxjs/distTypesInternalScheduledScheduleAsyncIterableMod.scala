package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalScheduledScheduleAsyncIterableMod {
  
  @JSImport("rxjs/dist/types/internal/scheduled/scheduleAsyncIterable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scheduleAsyncIterable[T](input: AsyncIterable[T], scheduler: SchedulerLike): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleAsyncIterable")(input.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
