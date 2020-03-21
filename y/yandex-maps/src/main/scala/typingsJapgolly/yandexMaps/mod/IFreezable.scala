package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFreezable extends js.Object {
  var events: IEventManager
  def freeze(): IFreezable
  def isFrozen(): Boolean
  def unfreeze(): IFreezable
}

object IFreezable {
  @scala.inline
  def apply(
    events: IEventManager,
    freeze: CallbackTo[IFreezable],
    isFrozen: CallbackTo[Boolean],
    unfreeze: CallbackTo[IFreezable]
  ): IFreezable = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("freeze")(freeze.toJsFn)
    __obj.updateDynamic("isFrozen")(isFrozen.toJsFn)
    __obj.updateDynamic("unfreeze")(unfreeze.toJsFn)
    __obj.asInstanceOf[IFreezable]
  }
}

