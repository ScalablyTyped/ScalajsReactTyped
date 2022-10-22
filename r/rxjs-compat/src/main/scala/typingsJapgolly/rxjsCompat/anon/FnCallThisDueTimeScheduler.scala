package typingsJapgolly.rxjsCompat.anon

import typingsJapgolly.rxjs.distTypesInternalTypesMod.SchedulerLike
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisDueTimeScheduler extends StObject {
  
  def apply[T](dueTime: Double): Observable_[T] = js.native
  def apply[T](dueTime: Double, scheduler: SchedulerLike): Observable_[T] = js.native
}
