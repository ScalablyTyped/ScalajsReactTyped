package typingsJapgolly.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AbortController")
@js.native
/**
  * Initialize this controller.
  */
class AbortController () extends js.Object {
  /**
    * Returns the `AbortSignal` object associated with this object.
    */
  val signal: AbortSignal = js.native
  /**
    * Abort and signal to any observers that the associated activity is to be aborted.
    */
  def abort(): Unit = js.native
}

