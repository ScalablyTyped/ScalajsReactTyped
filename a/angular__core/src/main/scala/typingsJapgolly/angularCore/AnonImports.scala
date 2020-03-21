package typingsJapgolly.angularCore

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImports extends js.Object {
  var imports: js.UndefOr[js.Array[_]] = js.undefined
  var providers: js.UndefOr[js.Array[_]] = js.undefined
  def factory(): js.Any
}

object AnonImports {
  @scala.inline
  def apply(factory: CallbackTo[js.Any], imports: js.Array[_] = null, providers: js.Array[_] = null): AnonImports = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("factory")(factory.toJsFn)
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImports]
  }
}

