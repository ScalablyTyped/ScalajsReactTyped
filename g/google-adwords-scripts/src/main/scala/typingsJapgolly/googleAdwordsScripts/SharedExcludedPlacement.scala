package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedExcludedPlacement extends AdWordsEntity {
  def getExcludedPlacementList(): ExcludedPlacementList
  def getUrl(): String
  def remove(): Unit
}

object SharedExcludedPlacement {
  @scala.inline
  def apply(
    getExcludedPlacementList: CallbackTo[ExcludedPlacementList],
    getUrl: CallbackTo[String],
    remove: Callback,
    getEntityType: js.UndefOr[CallbackTo[String]] = js.undefined
  ): SharedExcludedPlacement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getExcludedPlacementList")(getExcludedPlacementList.toJsFn)
    __obj.updateDynamic("getUrl")(getUrl.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    getEntityType.foreach(p => __obj.updateDynamic("getEntityType")(p.toJsFn))
    __obj.asInstanceOf[SharedExcludedPlacement]
  }
}

