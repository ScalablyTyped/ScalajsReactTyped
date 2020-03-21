package typingsJapgolly.swaggerParser

import typingsJapgolly.swaggerParser.swaggerParserStrings.ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCircular extends js.Object {
  /**
    * Determines whether circular `$ref` pointers are handled.
    *
    * If set to `false`, then a `ReferenceError` will be thrown if the schema contains any circular references.
    *
    * If set to `"ignore"`, then circular references will simply be ignored. No error will be thrown, but the `$Refs.circular` property will still be set to `true`.
    */
  var circular: js.UndefOr[Boolean | ignore] = js.undefined
}

object AnonCircular {
  @scala.inline
  def apply(circular: Boolean | ignore = null): AnonCircular = {
    val __obj = js.Dynamic.literal()
    if (circular != null) __obj.updateDynamic("circular")(circular.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCircular]
  }
}

