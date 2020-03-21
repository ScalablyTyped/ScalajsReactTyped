package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESTAPIResponseStream extends js.Object {
  def writeStream(stream: js.Object): Unit
  def writeString(data: String): Unit
}

object RESTAPIResponseStream {
  @scala.inline
  def apply(writeStream: js.Object => Callback, writeString: String => Callback): RESTAPIResponseStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("writeStream")(js.Any.fromFunction1((t0: js.Object) => writeStream(t0).runNow()))
    __obj.updateDynamic("writeString")(js.Any.fromFunction1((t0: java.lang.String) => writeString(t0).runNow()))
    __obj.asInstanceOf[RESTAPIResponseStream]
  }
}

