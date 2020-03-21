package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NegativeKeywordList extends AdWordsEntity {
  def addNegativeKeyword(keywordText: String): Unit
  def addNegativeKeywords(keywordTexts: js.Array[String]): Unit
  def campaigns(): AdWordsSelector[Campaign]
  def getId(): Double
  def getName(): String
  def negativeKeywords(): AdWordsSelector[SharedNegativeKeyword]
  def setName(): String
}

object NegativeKeywordList {
  @scala.inline
  def apply(
    addNegativeKeyword: String => Callback,
    addNegativeKeywords: js.Array[String] => Callback,
    campaigns: CallbackTo[AdWordsSelector[Campaign]],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    negativeKeywords: CallbackTo[AdWordsSelector[SharedNegativeKeyword]],
    setName: CallbackTo[String],
    getEntityType: js.UndefOr[CallbackTo[String]] = js.undefined
  ): NegativeKeywordList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNegativeKeyword")(js.Any.fromFunction1((t0: java.lang.String) => addNegativeKeyword(t0).runNow()))
    __obj.updateDynamic("addNegativeKeywords")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => addNegativeKeywords(t0).runNow()))
    __obj.updateDynamic("campaigns")(campaigns.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("negativeKeywords")(negativeKeywords.toJsFn)
    __obj.updateDynamic("setName")(setName.toJsFn)
    getEntityType.foreach(p => __obj.updateDynamic("getEntityType")(p.toJsFn))
    __obj.asInstanceOf[NegativeKeywordList]
  }
}

