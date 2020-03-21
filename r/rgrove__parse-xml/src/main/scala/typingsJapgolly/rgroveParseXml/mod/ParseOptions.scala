package typingsJapgolly.rgroveParseXml.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var ignoreUndefinedEntities: js.UndefOr[Boolean] = js.undefined
  var preserveCdata: js.UndefOr[Boolean] = js.undefined
  var preserveComments: js.UndefOr[Boolean] = js.undefined
  var resolveUndefinedEntity: js.UndefOr[js.Function1[/* ref */ String, String]] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    ignoreUndefinedEntities: js.UndefOr[Boolean] = js.undefined,
    preserveCdata: js.UndefOr[Boolean] = js.undefined,
    preserveComments: js.UndefOr[Boolean] = js.undefined,
    resolveUndefinedEntity: /* ref */ String => CallbackTo[String] = null
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreUndefinedEntities)) __obj.updateDynamic("ignoreUndefinedEntities")(ignoreUndefinedEntities.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveCdata)) __obj.updateDynamic("preserveCdata")(preserveCdata.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveComments)) __obj.updateDynamic("preserveComments")(preserveComments.asInstanceOf[js.Any])
    if (resolveUndefinedEntity != null) __obj.updateDynamic("resolveUndefinedEntity")(js.Any.fromFunction1((t0: /* ref */ java.lang.String) => resolveUndefinedEntity(t0).runNow()))
    __obj.asInstanceOf[ParseOptions]
  }
}

