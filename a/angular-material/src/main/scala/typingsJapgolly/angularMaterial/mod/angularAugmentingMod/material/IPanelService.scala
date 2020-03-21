package typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.angularMaterial.AnonABOVE
import typingsJapgolly.angularMaterial.AnonALIGNEND
import typingsJapgolly.angularMaterial.AnonBOTTOM
import typingsJapgolly.angularMaterial.AnonCLICKOUTSIDE
import typingsJapgolly.angularMaterial.AnonCLOSE_
import typingsJapgolly.angularMaterial.AnonFADE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelService extends js.Object {
  var absPosition: AnonBOTTOM
  var animation: AnonFADE
  var closeReasons: AnonCLICKOUTSIDE
  var interceptorTypes: AnonCLOSE_
  var xPosition: AnonALIGNEND
  var yPosition: AnonABOVE
  def create(opt_config: IPanelConfig): IPanelRef
  def newPanelAnimation(): IPanelAnimation
  def newPanelPosition(): IPanelPosition
  def open(opt_config: IPanelConfig): IPromise[IPanelRef]
}

object IPanelService {
  @scala.inline
  def apply(
    absPosition: AnonBOTTOM,
    animation: AnonFADE,
    closeReasons: AnonCLICKOUTSIDE,
    create: IPanelConfig => CallbackTo[IPanelRef],
    interceptorTypes: AnonCLOSE_,
    newPanelAnimation: CallbackTo[IPanelAnimation],
    newPanelPosition: CallbackTo[IPanelPosition],
    open: IPanelConfig => CallbackTo[IPromise[IPanelRef]],
    xPosition: AnonALIGNEND,
    yPosition: AnonABOVE
  ): IPanelService = {
    val __obj = js.Dynamic.literal(absPosition = absPosition.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], closeReasons = closeReasons.asInstanceOf[js.Any], interceptorTypes = interceptorTypes.asInstanceOf[js.Any], xPosition = xPosition.asInstanceOf[js.Any], yPosition = yPosition.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material.IPanelConfig) => create(t0).runNow()))
    __obj.updateDynamic("newPanelAnimation")(newPanelAnimation.toJsFn)
    __obj.updateDynamic("newPanelPosition")(newPanelPosition.toJsFn)
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: typingsJapgolly.angularMaterial.mod.angularAugmentingMod.material.IPanelConfig) => open(t0).runNow()))
    __obj.asInstanceOf[IPanelService]
  }
}

