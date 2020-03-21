package typingsJapgolly.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /** The name of the data source. */
  var name: js.UndefOr[String] = js.undefined
  /** Whether this data comes from an official government source. */
  var official: js.UndefOr[Boolean] = js.undefined
}

object Source {
  @scala.inline
  def apply(name: String = null, official: js.UndefOr[Boolean] = js.undefined): Source = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(official)) __obj.updateDynamic("official")(official.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

