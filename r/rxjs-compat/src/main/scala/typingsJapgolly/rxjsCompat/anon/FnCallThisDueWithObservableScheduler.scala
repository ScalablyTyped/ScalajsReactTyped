package typingsJapgolly.rxjsCompat.anon

import typingsJapgolly.rxjs.distTypesInternalTypesMod.ObservableInput
import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisDueWithObservableScheduler extends StObject {
  
  def apply[T](due: js.Date, withObservable: ObservableInput[T]): Observable_[T] = js.native
  def apply[T](due: js.Date, withObservable: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = js.native
  def apply[T](due: Double, withObservable: ObservableInput[T]): Observable_[T] = js.native
  def apply[T](due: Double, withObservable: ObservableInput[T], scheduler: SchedulerLike): Observable_[T] = js.native
}
