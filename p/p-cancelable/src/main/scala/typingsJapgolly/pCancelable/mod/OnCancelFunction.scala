package typingsJapgolly.pCancelable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	Accepts a function that is called when the promise is canceled.
	You're not required to call this function. You can call this function multiple times to add multiple cancel handlers.
	*/
@js.native
trait OnCancelFunction extends js.Object {
  var shouldReject: Boolean = js.native
  def apply(cancelHandler: js.Function0[Unit]): Unit = js.native
}

