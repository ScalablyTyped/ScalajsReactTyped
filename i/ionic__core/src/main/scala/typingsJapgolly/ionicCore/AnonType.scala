package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.ionicCoreStrings.error
import typingsJapgolly.ionicCore.ionicCoreStrings.success
import typingsJapgolly.ionicCore.ionicCoreStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: error | success | warning
}

object AnonType {
  @scala.inline
  def apply(`type`: error | success | warning): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

