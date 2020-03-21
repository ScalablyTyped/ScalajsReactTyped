package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIRequestBody[T] extends js.Object {
  val data: T
  val dataStream: js.Object
  val dataString: String
  def hasNext(): Boolean
  def nextEntry(): js.Any
}

object RESTAPIRequestBody {
  @scala.inline
  def apply[T](
    data: T,
    dataStream: js.Object,
    dataString: String,
    hasNext: CallbackTo[Boolean],
    nextEntry: CallbackTo[js.Any]
  ): RESTAPIRequestBody[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataStream = dataStream.asInstanceOf[js.Any], dataString = dataString.asInstanceOf[js.Any])
    __obj.updateDynamic("hasNext")(hasNext.toJsFn)
    __obj.updateDynamic("nextEntry")(nextEntry.toJsFn)
    __obj.asInstanceOf[RESTAPIRequestBody[T]]
  }
}

