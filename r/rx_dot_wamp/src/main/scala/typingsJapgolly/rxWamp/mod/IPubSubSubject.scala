package typingsJapgolly.rxWamp.mod

import typingsJapgolly.autobahn.mod.IError
import typingsJapgolly.autobahn.mod.ISubscription
import typingsJapgolly.rxCore.Rx.Observer
import typingsJapgolly.rxLite.Rx.IObservable
import typingsJapgolly.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPubSubSubject
  extends Observable[IWampEvent]
     with Observer[IWampEvent] {
  var errors: IObservable[IError] = js.native
  var observable: Observable[IWampEvent] = js.native
  var observer: Observer[IWampEvent] = js.native
  var opened: IObservable[ISubscription] = js.native
}

