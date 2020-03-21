package typingsJapgolly.rxCoreBinding.Rx

import typingsJapgolly.rxCore.Rx.IDisposable
import typingsJapgolly.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISubject[T]
  extends Observable[T]
     with Observer[T]
     with IDisposable {
  def hasObservers(): Boolean = js.native
}

