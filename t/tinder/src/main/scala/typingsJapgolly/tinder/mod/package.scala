package typingsJapgolly.tinder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* error */ js.Any, /* data */ T, js.Any]
}
