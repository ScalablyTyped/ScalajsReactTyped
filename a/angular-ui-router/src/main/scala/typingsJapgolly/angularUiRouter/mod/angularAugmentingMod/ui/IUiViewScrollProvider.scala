package typingsJapgolly.angularUiRouter.mod.angularAugmentingMod.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUiViewScrollProvider extends js.Object {
  /*
    * Reverts back to using the core $anchorScroll service for scrolling
    * based on the url anchor.
    */
  def useAnchorScroll(): Unit
}

object IUiViewScrollProvider {
  @scala.inline
  def apply(useAnchorScroll: Callback): IUiViewScrollProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("useAnchorScroll")(useAnchorScroll.toJsFn)
    __obj.asInstanceOf[IUiViewScrollProvider]
  }
}

