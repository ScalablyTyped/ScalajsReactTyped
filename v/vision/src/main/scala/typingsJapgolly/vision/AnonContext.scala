package typingsJapgolly.vision

import typingsJapgolly.vision.mod.ViewHandlerOrReplyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  /** optional object used by the template to render context-specific result. Defaults to no context {}. */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * optional object used to override the server's views manager configuration for this response.
    * Cannot override isCached, partialsPath, or helpersPath which are only loaded at initialization.
    * TODO check if it can have `defaultExtension`.
    */
  var options: js.UndefOr[ViewHandlerOrReplyOptions] = js.undefined
  /** the template filename and path, relative to the templates path configured via the server views manager. */
  var template: String
}

object AnonContext {
  @scala.inline
  def apply(template: String, context: js.Object = null, options: ViewHandlerOrReplyOptions = null): AnonContext = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

