package typingsJapgolly.gulpPlumber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** an error handler function to be attached to the stream on('error') */
  type ErrorHandlerFunction = js.Function1[/* error */ js.Any, scala.Unit]
}
