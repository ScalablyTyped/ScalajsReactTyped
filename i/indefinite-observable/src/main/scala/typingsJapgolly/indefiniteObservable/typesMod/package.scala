package typingsJapgolly.indefiniteObservable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type Connect[T] = js.Function1[
    /* observer */ typingsJapgolly.indefiniteObservable.typesMod.Observer[T], 
    typingsJapgolly.indefiniteObservable.typesMod.Disconnect
  ]
  type Disconnect = js.Function0[scala.Unit]
  type NextChannel[T] = js.Function1[/* value */ T, scala.Unit]
  type ObserverOrNext[T] = typingsJapgolly.indefiniteObservable.typesMod.Observer[T] | typingsJapgolly.indefiniteObservable.typesMod.NextChannel[T]
  type Unsubscribe = js.Function0[scala.Unit]
}
