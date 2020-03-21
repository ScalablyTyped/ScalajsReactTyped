package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsStats extends js.Object {
  def getAverageCpc(): Double
  def getAverageCpm(): Double
  def getAverageCpv(): Double
  def getAveragePageviews(): Double
  def getAveragePosition(): Double
  def getAverageTimeOnSite(): Double
  def getBounceRage(): Double
  def getClicks(): Double
  def getConversionRate(): Double
  def getConversions(): Double
  def getCost(): Double
  def getCtr(): Double
  def getImpressions(): Double
  def getViewRate(): Double
  def getViews(): Double
}

object AdWordsStats {
  @scala.inline
  def apply(
    getAverageCpc: CallbackTo[Double],
    getAverageCpm: CallbackTo[Double],
    getAverageCpv: CallbackTo[Double],
    getAveragePageviews: CallbackTo[Double],
    getAveragePosition: CallbackTo[Double],
    getAverageTimeOnSite: CallbackTo[Double],
    getBounceRage: CallbackTo[Double],
    getClicks: CallbackTo[Double],
    getConversionRate: CallbackTo[Double],
    getConversions: CallbackTo[Double],
    getCost: CallbackTo[Double],
    getCtr: CallbackTo[Double],
    getImpressions: CallbackTo[Double],
    getViewRate: CallbackTo[Double],
    getViews: CallbackTo[Double]
  ): AdWordsStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAverageCpc")(getAverageCpc.toJsFn)
    __obj.updateDynamic("getAverageCpm")(getAverageCpm.toJsFn)
    __obj.updateDynamic("getAverageCpv")(getAverageCpv.toJsFn)
    __obj.updateDynamic("getAveragePageviews")(getAveragePageviews.toJsFn)
    __obj.updateDynamic("getAveragePosition")(getAveragePosition.toJsFn)
    __obj.updateDynamic("getAverageTimeOnSite")(getAverageTimeOnSite.toJsFn)
    __obj.updateDynamic("getBounceRage")(getBounceRage.toJsFn)
    __obj.updateDynamic("getClicks")(getClicks.toJsFn)
    __obj.updateDynamic("getConversionRate")(getConversionRate.toJsFn)
    __obj.updateDynamic("getConversions")(getConversions.toJsFn)
    __obj.updateDynamic("getCost")(getCost.toJsFn)
    __obj.updateDynamic("getCtr")(getCtr.toJsFn)
    __obj.updateDynamic("getImpressions")(getImpressions.toJsFn)
    __obj.updateDynamic("getViewRate")(getViewRate.toJsFn)
    __obj.updateDynamic("getViews")(getViews.toJsFn)
    __obj.asInstanceOf[AdWordsStats]
  }
}

