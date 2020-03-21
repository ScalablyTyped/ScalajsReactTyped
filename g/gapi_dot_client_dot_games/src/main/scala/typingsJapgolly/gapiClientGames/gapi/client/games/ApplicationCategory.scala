package typingsJapgolly.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationCategory extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#applicationCategory. */
  var kind: js.UndefOr[String] = js.undefined
  /** The primary category. */
  var primary: js.UndefOr[String] = js.undefined
  /** The secondary category. */
  var secondary: js.UndefOr[String] = js.undefined
}

object ApplicationCategory {
  @scala.inline
  def apply(kind: String = null, primary: String = null, secondary: String = null): ApplicationCategory = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (secondary != null) __obj.updateDynamic("secondary")(secondary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationCategory]
  }
}

