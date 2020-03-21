package typingsJapgolly.ionicCore.elementInterfaceMod

import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonInterface extends js.Object {
  var disabled: Boolean
  var `type`: submit | reset | button
}

object ButtonInterface {
  @scala.inline
  def apply(disabled: Boolean, `type`: submit | reset | button): ButtonInterface = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonInterface]
  }
}

