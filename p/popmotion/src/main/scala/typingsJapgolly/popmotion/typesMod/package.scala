package typingsJapgolly.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ActionInit = js.Function1[
    /* observer */ typingsJapgolly.popmotion.observerTypesMod.IObserver, 
    typingsJapgolly.popmotion.PartialColdSubscription | scala.Unit
  ]
}
