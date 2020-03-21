package typingsJapgolly.ractive.mod

import typingsJapgolly.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimatePromise extends Promise[Unit] {
  /** Stops the associated animation. */
  def stop(): Unit = js.native
}

