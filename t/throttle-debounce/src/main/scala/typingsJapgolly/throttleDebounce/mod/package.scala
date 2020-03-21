package typingsJapgolly.throttleDebounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type debounce[T] = typingsJapgolly.throttleDebounce.mod.throttle[T]
  type throttle[T] = T with typingsJapgolly.throttleDebounce.mod.Cancel
}
