package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Ad Param
trait AdParam extends AdWordsEntity {
  def getAdGroup(): AdGroup
  def getInde(): Double
  def getInsertionText(): String
  def getKeyword(): Keyword
  def remove(): Unit
  def setInsertionText(insertionText: String): Unit
}

object AdParam {
  @scala.inline
  def apply(
    getAdGroup: CallbackTo[AdGroup],
    getInde: CallbackTo[Double],
    getInsertionText: CallbackTo[String],
    getKeyword: CallbackTo[Keyword],
    remove: Callback,
    setInsertionText: String => Callback,
    getEntityType: js.UndefOr[CallbackTo[String]] = js.undefined
  ): AdParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup.toJsFn)
    __obj.updateDynamic("getInde")(getInde.toJsFn)
    __obj.updateDynamic("getInsertionText")(getInsertionText.toJsFn)
    __obj.updateDynamic("getKeyword")(getKeyword.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setInsertionText")(js.Any.fromFunction1((t0: java.lang.String) => setInsertionText(t0).runNow()))
    getEntityType.foreach(p => __obj.updateDynamic("getEntityType")(p.toJsFn))
    __obj.asInstanceOf[AdParam]
  }
}

