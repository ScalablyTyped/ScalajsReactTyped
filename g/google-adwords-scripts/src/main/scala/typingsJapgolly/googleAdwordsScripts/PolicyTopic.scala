package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyTopic extends js.Object {
  def getId(): String
  def getName(): String
  def getType(): String
}

object PolicyTopic {
  @scala.inline
  def apply(getId: CallbackTo[String], getName: CallbackTo[String], getType: CallbackTo[String]): PolicyTopic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getType")(getType.toJsFn)
    __obj.asInstanceOf[PolicyTopic]
  }
}

