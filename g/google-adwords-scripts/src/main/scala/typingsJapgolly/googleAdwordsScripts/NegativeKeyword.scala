package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Negative Keywords
trait NegativeKeyword
  extends isAdGroupChild
     with AdWordsEntity {
  def getMatchType(): MatchType
  def getText(): String
  def remove(): Unit
}

object NegativeKeyword {
  @scala.inline
  def apply(
    getAdGroup: CallbackTo[AdGroup],
    getCampaign: CallbackTo[Campaign],
    getMatchType: CallbackTo[MatchType],
    getText: CallbackTo[String],
    remove: Callback,
    getEntityType: js.UndefOr[CallbackTo[String]] = js.undefined
  ): NegativeKeyword = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup.toJsFn)
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.updateDynamic("getMatchType")(getMatchType.toJsFn)
    __obj.updateDynamic("getText")(getText.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    getEntityType.foreach(p => __obj.updateDynamic("getEntityType")(p.toJsFn))
    __obj.asInstanceOf[NegativeKeyword]
  }
}

