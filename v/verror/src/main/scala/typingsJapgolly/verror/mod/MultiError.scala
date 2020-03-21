package typingsJapgolly.verror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Represents a collection of errors for the purpose of consumers that generally
  * only deal with one error.  Callers can extract the individual errors
  * contained in this object, but may also just treat it as a normal single
  * error, in which case a summary message will be printed.
  */
@JSImport("verror", "MultiError")
@js.native
class MultiError protected () extends VError {
  def this(errors: js.Array[js.Error]) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def cause(): js.UndefOr[js.Error] = js.native
  def errors(): js.Array[js.Error] = js.native
}

