package typingsJapgolly.rxjsCompat.anon

import typingsJapgolly.rxjs.distTypesInternalTypesMod.FactoryOrValue
import typingsJapgolly.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typingsJapgolly.rxjs.mod.ConnectableObservable
import typingsJapgolly.rxjs.mod.Observable_
import typingsJapgolly.rxjs.mod.Subject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallSubjectFactorySelector extends StObject {
  
  def apply[T](SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]]): ConnectableObservable[T] = js.native
  def apply[T](
    SubjectFactory: js.ThisFunction0[/* this */ Observable_[T], Subject[T]],
    selector: MonoTypeOperatorFunction[T]
  ): Observable_[T] = js.native
  def apply[T](subjectOrSubjectFactory: FactoryOrValue[Subject[T]]): ConnectableObservable[T] = js.native
}
