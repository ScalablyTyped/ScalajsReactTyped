package typingsJapgolly.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interceptUtilsMod {
  type IInterceptor[T] = js.Function1[/* change */ T, T | scala.Null]
}
