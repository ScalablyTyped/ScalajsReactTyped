package typingsJapgolly.nodeHorseman

import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.A3
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.A4
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.A5
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.Legal
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.Letter
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.Tabloid
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.landscape
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFormat extends js.Object {
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
  var margin: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
}

object AnonFormat {
  @scala.inline
  def apply(
    format: A3 | A4 | A5 | Legal | Letter | Tabloid = null,
    margin: String = null,
    orientation: portrait | landscape = null
  ): AnonFormat = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFormat]
  }
}

