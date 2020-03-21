package typingsJapgolly.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("When.promise")
@js.native
object promise extends js.Object {
  def apply[T](
    resolver: js.Function2[
      /* resolve */ js.Function1[/* value */ T, Unit], 
      /* reject */ js.Function1[/* reason */ js.Any, Unit], 
      Unit
    ]
  ): Promise_[T] = js.native
}

