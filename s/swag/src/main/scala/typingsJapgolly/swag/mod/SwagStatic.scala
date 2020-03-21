package typingsJapgolly.swag.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.swag.TypeofHandlebars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwagStatic extends js.Object {
  def registerHelpers(handlebars: TypeofHandlebars): Unit
}

object SwagStatic {
  @scala.inline
  def apply(registerHelpers: TypeofHandlebars => Callback): SwagStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("registerHelpers")(js.Any.fromFunction1((t0: typingsJapgolly.swag.TypeofHandlebars) => registerHelpers(t0).runNow()))
    __obj.asInstanceOf[SwagStatic]
  }
}

