package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Labels
trait Label extends AdWordsEntity {
  def adGroups(): AdWordsSelector[AdGroup]
  def ads(): AdWordsSelector[Ad]
  def campaigns(): AdWordsSelector[Campaign]
  def getColor(): String
  def getDescription(): String
  def getId(): String
  def getName(): String
  def keywords(): AdWordsSelector[Keyword]
  def remove(): Unit
  def setColor(color: String): Unit
  def setDescription(description: String): Unit
  def setName(name: String): Unit
}

object Label {
  @scala.inline
  def apply(
    adGroups: CallbackTo[AdWordsSelector[AdGroup]],
    ads: CallbackTo[AdWordsSelector[Ad]],
    campaigns: CallbackTo[AdWordsSelector[Campaign]],
    getColor: CallbackTo[String],
    getDescription: CallbackTo[String],
    getId: CallbackTo[String],
    getName: CallbackTo[String],
    keywords: CallbackTo[AdWordsSelector[Keyword]],
    remove: Callback,
    setColor: String => Callback,
    setDescription: String => Callback,
    setName: String => Callback,
    getEntityType: js.UndefOr[CallbackTo[String]] = js.undefined
  ): Label = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adGroups")(adGroups.toJsFn)
    __obj.updateDynamic("ads")(ads.toJsFn)
    __obj.updateDynamic("campaigns")(campaigns.toJsFn)
    __obj.updateDynamic("getColor")(getColor.toJsFn)
    __obj.updateDynamic("getDescription")(getDescription.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("keywords")(keywords.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setColor")(js.Any.fromFunction1((t0: java.lang.String) => setColor(t0).runNow()))
    __obj.updateDynamic("setDescription")(js.Any.fromFunction1((t0: java.lang.String) => setDescription(t0).runNow()))
    __obj.updateDynamic("setName")(js.Any.fromFunction1((t0: java.lang.String) => setName(t0).runNow()))
    getEntityType.foreach(p => __obj.updateDynamic("getEntityType")(p.toJsFn))
    __obj.asInstanceOf[Label]
  }
}

