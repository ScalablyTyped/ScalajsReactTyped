package typingsJapgolly.pThrottle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AbortError = typingsJapgolly.pThrottle.mod.AbortErrorClass
  type ThrottledFunction[Arguments /* <: js.Array[_] */, Return] = (js.Function1[/* arguments */ Arguments, js.Promise[Return]]) with typingsJapgolly.pThrottle.AnonAbort
}
