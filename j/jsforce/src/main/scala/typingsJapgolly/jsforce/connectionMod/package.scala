package typingsJapgolly.jsforce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object connectionMod {
  type Callback[T] = js.Function2[/* err */ js.Error | scala.Null, /* result */ T, scala.Unit]
  type ConnectionEvent = typingsJapgolly.jsforce.jsforceStrings.refresh
}
