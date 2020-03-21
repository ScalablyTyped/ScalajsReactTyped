package typingsJapgolly.cassanknex.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateableIndexBuilder extends js.Object {
  def withOptions(opts: MappedDict[String]): this.type
}

object CreateableIndexBuilder {
  @scala.inline
  def apply(withOptions: MappedDict[String] => CallbackTo[CreateableIndexBuilder]): CreateableIndexBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("withOptions")(js.Any.fromFunction1((t0: typingsJapgolly.cassanknex.mod.MappedDict[java.lang.String]) => withOptions(t0).runNow()))
    __obj.asInstanceOf[CreateableIndexBuilder]
  }
}

