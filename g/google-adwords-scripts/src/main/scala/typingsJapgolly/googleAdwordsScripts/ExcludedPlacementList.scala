package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Shared Sets
trait ExcludedPlacementList extends AdWordsEntity {
  def addExcludedPlacement(url: String): Unit
  def addExcludedPlacements(urls: js.Array[String]): Unit
  def campaigns(): AdWordsSelector[Campaign]
  def excludedPlacements(): AdWordsSelector[SharedExcludedPlacement]
  def getId(): Double
  def getName(): String
  def setName(name: String): Unit
}

object ExcludedPlacementList {
  @scala.inline
  def apply(
    addExcludedPlacement: String => Callback,
    addExcludedPlacements: js.Array[String] => Callback,
    campaigns: CallbackTo[AdWordsSelector[Campaign]],
    excludedPlacements: CallbackTo[AdWordsSelector[SharedExcludedPlacement]],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    setName: String => Callback,
    getEntityType: js.UndefOr[CallbackTo[String]] = js.undefined
  ): ExcludedPlacementList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addExcludedPlacement")(js.Any.fromFunction1((t0: java.lang.String) => addExcludedPlacement(t0).runNow()))
    __obj.updateDynamic("addExcludedPlacements")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => addExcludedPlacements(t0).runNow()))
    __obj.updateDynamic("campaigns")(campaigns.toJsFn)
    __obj.updateDynamic("excludedPlacements")(excludedPlacements.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    getEntityType.foreach(p => __obj.updateDynamic("getEntityType")(p.toJsFn))
    __obj.asInstanceOf[ExcludedPlacementList]
  }
}

