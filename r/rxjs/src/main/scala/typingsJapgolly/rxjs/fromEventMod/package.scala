package typingsJapgolly.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fromEventMod {
  type FromEventTarget[T] = typingsJapgolly.rxjs.fromEventMod.EventTargetLike[T] | typingsJapgolly.std.ArrayLike[typingsJapgolly.rxjs.fromEventMod.EventTargetLike[T]]
  type NodeEventHandler = js.Function1[/* repeated */ js.Any, scala.Unit]
}
