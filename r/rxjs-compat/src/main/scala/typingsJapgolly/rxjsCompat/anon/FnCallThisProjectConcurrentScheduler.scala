package typingsJapgolly.rxjsCompat.anon

import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisProjectConcurrentScheduler extends StObject {
  
  def apply[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]]): Observable_[T] = js.native
  def apply[T](project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]], concurrent: Double): Observable_[T] = js.native
  def apply[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Double,
    scheduler: SchedulerLike
  ): Observable_[T] = js.native
  def apply[T](
    project: js.Function2[/* value */ T, /* index */ Double, ObservableInput[T]],
    concurrent: Unit,
    scheduler: SchedulerLike
  ): Observable_[T] = js.native
}
