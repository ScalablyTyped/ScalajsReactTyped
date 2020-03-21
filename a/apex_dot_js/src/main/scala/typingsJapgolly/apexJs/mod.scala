package typingsJapgolly.apexJs

import typingsJapgolly.awsLambda.handlerMod.Callback
import typingsJapgolly.awsLambda.handlerMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apex.js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(fn: js.Function2[/* event */ js.Any, /* context */ Context, _]): js.Function3[/* event */ js.Any, /* context */ Context, /* callback */ Callback[_], Unit] = js.native
}

