package typingsJapgolly.gapiClientStorage.gapi.client.storage

import typingsJapgolly.gapiClientStorage.AnonGeneration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeRequest extends js.Object {
  /** Properties of the resulting object. */
  var destination: js.UndefOr[Object] = js.undefined
  /** The kind of item this is. */
  var kind: js.UndefOr[String] = js.undefined
  /** The list of source objects that will be concatenated into a single object. */
  var sourceObjects: js.UndefOr[js.Array[AnonGeneration]] = js.undefined
}

object ComposeRequest {
  @scala.inline
  def apply(destination: Object = null, kind: String = null, sourceObjects: js.Array[AnonGeneration] = null): ComposeRequest = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (sourceObjects != null) __obj.updateDynamic("sourceObjects")(sourceObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeRequest]
  }
}

