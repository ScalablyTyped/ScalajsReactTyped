package typingsJapgolly.jsonSchemaRefParser

import typingsJapgolly.jsonSchemaRefParser.mod.HTTPResolverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExternal extends js.Object {
  /**
    * Determines whether external $ref pointers will be resolved. If this option is disabled, then external `$ref` pointers will simply be ignored.
    */
  var external: js.UndefOr[Boolean] = js.undefined
  var file: js.UndefOr[PartialResolverOptions | Boolean] = js.undefined
  var http: js.UndefOr[HTTPResolverOptions | Boolean] = js.undefined
}

object AnonExternal {
  @scala.inline
  def apply(
    external: js.UndefOr[Boolean] = js.undefined,
    file: PartialResolverOptions | Boolean = null,
    http: HTTPResolverOptions | Boolean = null
  ): AnonExternal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExternal]
  }
}

