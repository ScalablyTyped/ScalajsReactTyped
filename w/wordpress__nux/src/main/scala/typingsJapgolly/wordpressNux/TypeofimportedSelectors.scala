package typingsJapgolly.wordpressNux

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wordpressNux.selectorsMod.GuideInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofimportedSelectors extends js.Object {
  def areTipsEnabled(): Boolean
  def getAssociatedGuide(tipId: String): js.UndefOr[GuideInfo]
  def isTipVisible(tipId: String): Boolean
}

object TypeofimportedSelectors {
  @scala.inline
  def apply(
    areTipsEnabled: CallbackTo[Boolean],
    getAssociatedGuide: String => CallbackTo[js.UndefOr[GuideInfo]],
    isTipVisible: String => CallbackTo[Boolean]
  ): TypeofimportedSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("areTipsEnabled")(areTipsEnabled.toJsFn)
    __obj.updateDynamic("getAssociatedGuide")(js.Any.fromFunction1((t0: java.lang.String) => getAssociatedGuide(t0).runNow()))
    __obj.updateDynamic("isTipVisible")(js.Any.fromFunction1((t0: java.lang.String) => isTipVisible(t0).runNow()))
    __obj.asInstanceOf[TypeofimportedSelectors]
  }
}

