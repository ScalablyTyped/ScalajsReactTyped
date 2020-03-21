package typingsJapgolly.firebaseUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subscribeMod {
  type CompleteFn = js.Function0[scala.Unit]
  type ErrorFn = js.Function1[/* error */ js.Error, scala.Unit]
  type Executor[T] = js.Function1[/* observer */ typingsJapgolly.firebaseUtil.subscribeMod.Observer[T], scala.Unit]
  type NextFn[T] = js.Function1[/* value */ T, scala.Unit]
  type Unsubscribe = js.Function0[scala.Unit]
}
