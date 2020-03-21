package typingsJapgolly.rxCoreBinding.mod

import typingsJapgolly.rxCore.Rx.Observer
import typingsJapgolly.rxCoreBinding.Rx.ISubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-core-binding", "Subject")
@js.native
class SubjectCls[T] () extends ISubject[T] {
  /* CompleteClass */
  override def checked(): Observer[_] = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
}

