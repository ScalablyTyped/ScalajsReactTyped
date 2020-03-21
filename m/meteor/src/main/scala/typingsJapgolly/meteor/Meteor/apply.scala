package typingsJapgolly.meteor.Meteor

import typingsJapgolly.meteor.AnonOnResultReceived
import typingsJapgolly.meteor.EJSONable
import typingsJapgolly.meteor.EJSONableProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.apply")
@js.native
object apply extends js.Object {
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty]): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](name: String, args: js.Array[EJSONable | EJSONableProperty], options: AnonOnResultReceived[Result]): js.Any = js.native
  def apply[Result /* <: EJSONable | (js.Array[EJSONable | EJSONableProperty]) | EJSONableProperty */](
    name: String,
    args: js.Array[EJSONable | EJSONableProperty],
    options: AnonOnResultReceived[Result],
    asyncCallback: js.Function2[/* error */ js.UndefOr[js.Error | Error], /* result */ js.UndefOr[Result], Unit]
  ): js.Any = js.native
}

