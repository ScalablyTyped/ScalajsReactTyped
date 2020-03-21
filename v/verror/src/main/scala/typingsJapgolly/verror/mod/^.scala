package typingsJapgolly.verror.mod

import typingsJapgolly.verror.TypeofVError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("verror", JSImport.Namespace)
@js.native
class ^ () extends VError {
  def this(message: String, params: js.Any*) = this()
  def this(options: js.Error, message: String, params: js.Any*) = this()
  def this(options: Options, message: String, params: js.Any*) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override def cause(): js.UndefOr[js.Error] = js.native
}

@JSImport("verror", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var VError: TypeofVError = js.native
  def cause(err: js.Error): js.Error | Null = js.native
  def errorForEach(err: js.Error, func: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def errorFromList[T /* <: js.Error */](errors: js.Array[T]): Null | T | MultiError = js.native
  def findCauseByName(err: js.Error, name: String): js.Error | Null = js.native
  def fullStack(err: js.Error): String = js.native
  def hasCauseWithName(err: js.Error, name: String): Boolean = js.native
  def info(err: js.Error): Info = js.native
}

