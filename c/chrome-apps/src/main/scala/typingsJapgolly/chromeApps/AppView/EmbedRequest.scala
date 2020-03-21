package typingsJapgolly.chromeApps.AppView

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbedRequest extends js.Object {
  /** Optional developer specified data that the app to be embedded can use when making an embedding decision. */
  var data: js.UndefOr[js.Any] = js.undefined
  /** The ID of the app that sent the embedding request. */
  var embedderId: String
  /**
    * Allows the embedding request
    * @param url Specifies the content to be embedded.
    */
  def allow(url: String): Unit
  /** Prevents the embedding request */
  def deny(): Unit
}

object EmbedRequest {
  @scala.inline
  def apply(allow: String => Callback, deny: Callback, embedderId: String, data: js.Any = null): EmbedRequest = {
    val __obj = js.Dynamic.literal(embedderId = embedderId.asInstanceOf[js.Any])
    __obj.updateDynamic("allow")(js.Any.fromFunction1((t0: java.lang.String) => allow(t0).runNow()))
    __obj.updateDynamic("deny")(deny.toJsFn)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbedRequest]
  }
}

