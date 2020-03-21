package typingsJapgolly.oracleOraclejet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.oracleOraclejet.ojcompositeMod.Metadata
import typingsJapgolly.oracleOraclejet.ojcompositeMod.ViewModelContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetadata extends js.Object {
  var metadata: Metadata
  var view: String
  def parseFunction(
    value: String,
    name: String,
    meta: js.Object,
    defaultParseFunction: js.Function1[/* value */ String, _]
  ): js.Any
  def viewModel(param0: ViewModelContext): Unit | js.Object
}

object AnonMetadata {
  @scala.inline
  def apply(
    metadata: Metadata,
    parseFunction: (String, String, js.Object, js.Function1[/* value */ String, js.Any]) => CallbackTo[js.Any],
    view: String,
    viewModel: ViewModelContext => CallbackTo[Unit | js.Object]
  ): AnonMetadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("parseFunction")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: js.Object, t3: js.Function1[/* value */ java.lang.String, js.Any]) => parseFunction(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("viewModel")(js.Any.fromFunction1((t0: typingsJapgolly.oracleOraclejet.ojcompositeMod.ViewModelContext) => viewModel(t0).runNow()))
    __obj.asInstanceOf[AnonMetadata]
  }
}

