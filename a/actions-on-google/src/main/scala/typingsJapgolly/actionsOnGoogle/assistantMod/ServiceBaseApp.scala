package typingsJapgolly.actionsOnGoogle.assistantMod

import typingsJapgolly.actionsOnGoogle.commonMod.JsonObject
import typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.BuiltinFrameworkMetadata
import typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.Headers
import typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.StandardHandler
import typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.StandardResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceBaseApp extends js.Object {
  /** @public */
  @JSName("handler")
  var handler_Original: StandardHandler = js.native
  /** @public */
  def handler(/** @public */
  body: JsonObject, /** @public */
  headers: Headers): js.Promise[StandardResponse] = js.native
  def handler(
    /** @public */
  body: JsonObject,
    /** @public */
  headers: Headers,
    /** @public */
  metadata: BuiltinFrameworkMetadata
  ): js.Promise[StandardResponse] = js.native
}

