package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestidlecallback {
  type IdleCallbackHandle = scala.Double
  type IdleRequestCallback = js.Function1[/* deadline */ typingsJapgolly.requestidlecallback.IdleDeadline, scala.Unit]
}
