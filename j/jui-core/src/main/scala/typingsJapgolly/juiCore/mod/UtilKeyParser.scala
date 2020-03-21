package typingsJapgolly.juiCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilKeyParser extends js.Object {
  def changeIndex(index: String, targetIndex: String, rootIndex: String): String
  def getIndexList(index: String): Boolean
  def getNextIndex(index: String): String
  def getParentIndex(index: String): String
  def isIndexDepth(index: String): Boolean
}

object UtilKeyParser {
  @scala.inline
  def apply(
    changeIndex: (String, String, String) => CallbackTo[String],
    getIndexList: String => CallbackTo[Boolean],
    getNextIndex: String => CallbackTo[String],
    getParentIndex: String => CallbackTo[String],
    isIndexDepth: String => CallbackTo[Boolean]
  ): UtilKeyParser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changeIndex")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => changeIndex(t0, t1, t2).runNow()))
    __obj.updateDynamic("getIndexList")(js.Any.fromFunction1((t0: java.lang.String) => getIndexList(t0).runNow()))
    __obj.updateDynamic("getNextIndex")(js.Any.fromFunction1((t0: java.lang.String) => getNextIndex(t0).runNow()))
    __obj.updateDynamic("getParentIndex")(js.Any.fromFunction1((t0: java.lang.String) => getParentIndex(t0).runNow()))
    __obj.updateDynamic("isIndexDepth")(js.Any.fromFunction1((t0: java.lang.String) => isIndexDepth(t0).runNow()))
    __obj.asInstanceOf[UtilKeyParser]
  }
}

