package typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerritoryCondition extends js.Object {
  var territories: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object TerritoryCondition {
  @scala.inline
  def apply(territories: js.Array[String] = null, `type`: String = null): TerritoryCondition = {
    val __obj = js.Dynamic.literal()
    if (territories != null) __obj.updateDynamic("territories")(territories.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerritoryCondition]
  }
}

