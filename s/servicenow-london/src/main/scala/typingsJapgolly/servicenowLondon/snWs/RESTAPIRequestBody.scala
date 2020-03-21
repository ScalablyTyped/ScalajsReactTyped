package typingsJapgolly.servicenowLondon.snWs

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIRequestBody extends js.Object {
  val data: js.Any
  val dataStream: js.Object
  val dataString: String
  def hasNext(): Boolean
  def nextEntry(): js.Any
}

object RESTAPIRequestBody {
  @scala.inline
  def apply(
    data: js.Any,
    dataStream: js.Object,
    dataString: String,
    hasNext: CallbackTo[Boolean],
    nextEntry: CallbackTo[js.Any]
  ): RESTAPIRequestBody = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataStream = dataStream.asInstanceOf[js.Any], dataString = dataString.asInstanceOf[js.Any])
    __obj.updateDynamic("hasNext")(hasNext.toJsFn)
    __obj.updateDynamic("nextEntry")(nextEntry.toJsFn)
    __obj.asInstanceOf[RESTAPIRequestBody]
  }
}

