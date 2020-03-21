package typingsJapgolly.when.mod

import typingsJapgolly.when.When.Promise_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("when", "promise")
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

