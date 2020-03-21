package typingsJapgolly.materialBase.foundationMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCFoundation[A] extends js.Object {
  // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
  def destroy(): Unit
  // Subclasses should override this method to perform initialization routines (registering events, etc.)
  def init(): Unit
}

object MDCFoundation {
  @scala.inline
  def apply[A](destroy: Callback, init: Callback): MDCFoundation[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.asInstanceOf[MDCFoundation[A]]
  }
}

