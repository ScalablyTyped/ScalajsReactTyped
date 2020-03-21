package typingsJapgolly.pendoIoBrowser.pendo

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pendoIoBrowser.AnonAuto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debugging extends js.Object {
   // TODO
  def getAllGuides(): js.Array[Guide]
  def getAutoGuides(): AnonAuto
  def getBadgeGuides(): js.Array[Guide]
  def getEventCache(): js.Array[_]
  def getLauncherGuides(): js.Array[Guide]
}

object Debugging {
  @scala.inline
  def apply(
    getAllGuides: CallbackTo[js.Array[Guide]],
    getAutoGuides: CallbackTo[AnonAuto],
    getBadgeGuides: CallbackTo[js.Array[Guide]],
    getEventCache: CallbackTo[js.Array[js.Any]],
    getLauncherGuides: CallbackTo[js.Array[Guide]]
  ): Debugging = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllGuides")(getAllGuides.toJsFn)
    __obj.updateDynamic("getAutoGuides")(getAutoGuides.toJsFn)
    __obj.updateDynamic("getBadgeGuides")(getBadgeGuides.toJsFn)
    __obj.updateDynamic("getEventCache")(getEventCache.toJsFn)
    __obj.updateDynamic("getLauncherGuides")(getLauncherGuides.toJsFn)
    __obj.asInstanceOf[Debugging]
  }
}

