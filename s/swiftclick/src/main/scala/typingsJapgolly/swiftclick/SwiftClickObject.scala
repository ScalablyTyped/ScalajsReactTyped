package typingsJapgolly.swiftclick

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiftClickObject extends js.Object {
  def addNodeNamesToTrack(nodeNamesArray: js.Array[String]): Unit
  def replaceNodeNamesToTrack(nodeNamesArray: js.Array[String]): Unit
  def useCssParser(useParser: Boolean): Unit
}

object SwiftClickObject {
  @scala.inline
  def apply(
    addNodeNamesToTrack: js.Array[String] => Callback,
    replaceNodeNamesToTrack: js.Array[String] => Callback,
    useCssParser: Boolean => Callback
  ): SwiftClickObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNodeNamesToTrack")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => addNodeNamesToTrack(t0).runNow()))
    __obj.updateDynamic("replaceNodeNamesToTrack")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => replaceNodeNamesToTrack(t0).runNow()))
    __obj.updateDynamic("useCssParser")(js.Any.fromFunction1((t0: scala.Boolean) => useCssParser(t0).runNow()))
    __obj.asInstanceOf[SwiftClickObject]
  }
}

