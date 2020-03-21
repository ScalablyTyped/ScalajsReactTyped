package typingsJapgolly.simpleStatistics.bayesianClassifierMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://simplestatistics.org/docs/#bayesianclassifier
  */
trait BayesianClassifier extends js.Object {
  var data: Data
  var totalCount: Double
  def score(item: Item): OddsSums
  def train(item: Item, category: String): Unit
}

object BayesianClassifier {
  @scala.inline
  def apply(
    data: Data,
    score: Item => CallbackTo[OddsSums],
    totalCount: Double,
    train: (Item, String) => Callback
  ): BayesianClassifier = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.updateDynamic("score")(js.Any.fromFunction1((t0: typingsJapgolly.simpleStatistics.bayesianClassifierMod.Item) => score(t0).runNow()))
    __obj.updateDynamic("train")(js.Any.fromFunction2((t0: typingsJapgolly.simpleStatistics.bayesianClassifierMod.Item, t1: java.lang.String) => train(t0, t1).runNow()))
    __obj.asInstanceOf[BayesianClassifier]
  }
}

