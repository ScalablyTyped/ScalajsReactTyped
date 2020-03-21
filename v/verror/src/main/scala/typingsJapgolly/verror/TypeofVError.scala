package typingsJapgolly.verror

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.std.Error
import typingsJapgolly.verror.mod.Info
import typingsJapgolly.verror.mod.MultiError
import typingsJapgolly.verror.mod.Options
import typingsJapgolly.verror.mod.VError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofVError
  extends Instantiable3[
      (/* options */ Error) | (/* options */ Options), 
      /* message */ String, 
      /* params (repeated) */ js.Any, 
      VError
    ] {
  def cause(err: js.Error): js.Error | Null = js.native
  def errorForEach(err: js.Error, func: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  def errorFromList[T /* <: js.Error */](errors: js.Array[T]): Null | T | MultiError = js.native
  def findCauseByName(err: js.Error, name: String): js.Error | Null = js.native
  def fullStack(err: js.Error): String = js.native
  def hasCauseWithName(err: js.Error, name: String): Boolean = js.native
  def info(err: js.Error): Info = js.native
}

