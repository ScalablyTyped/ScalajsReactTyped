package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedNegativeKeyword extends AdWordsEntity {
  def getMatchType(): MatchType
  def getNegativeKeywordList(): NegativeKeywordList
  def getText(): String
  def remove(): Unit
}

object SharedNegativeKeyword {
  @scala.inline
  def apply(
    getMatchType: CallbackTo[MatchType],
    getNegativeKeywordList: CallbackTo[NegativeKeywordList],
    getText: CallbackTo[String],
    remove: Callback,
    getEntityType: js.UndefOr[CallbackTo[String]] = js.undefined
  ): SharedNegativeKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMatchType")(getMatchType.toJsFn)
    __obj.updateDynamic("getNegativeKeywordList")(getNegativeKeywordList.toJsFn)
    __obj.updateDynamic("getText")(getText.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    getEntityType.foreach(p => __obj.updateDynamic("getEntityType")(p.toJsFn))
    __obj.asInstanceOf[SharedNegativeKeyword]
  }
}

