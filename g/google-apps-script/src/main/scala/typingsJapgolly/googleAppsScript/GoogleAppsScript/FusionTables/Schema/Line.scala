package typingsJapgolly.googleAppsScript.GoogleAppsScript.FusionTables.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  var coordinates: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Line {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[Double]] = null, `type`: String = null): Line = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

