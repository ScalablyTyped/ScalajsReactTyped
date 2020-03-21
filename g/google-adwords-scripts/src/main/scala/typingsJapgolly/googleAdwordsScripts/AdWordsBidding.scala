package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdWordsBidding extends js.Object {
  def getStrategy(): BiddingStrategy
  def getStrategySource(): BiddingStrategySource
  def getStrategyType(): String
}

object AdWordsBidding {
  @scala.inline
  def apply(
    getStrategy: CallbackTo[BiddingStrategy],
    getStrategySource: CallbackTo[BiddingStrategySource],
    getStrategyType: CallbackTo[String]
  ): AdWordsBidding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStrategy")(getStrategy.toJsFn)
    __obj.updateDynamic("getStrategySource")(getStrategySource.toJsFn)
    __obj.updateDynamic("getStrategyType")(getStrategyType.toJsFn)
    __obj.asInstanceOf[AdWordsBidding]
  }
}

