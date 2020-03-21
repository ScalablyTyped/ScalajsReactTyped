package typingsJapgolly.formSerializer

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /**
    * Serializes the selected form into JSON.
    */
  def serializeJSON(): String
  /**
    * Serializes the selected form into a JavaScript object.
    */
  def serializeObject(): js.Object
}

object JQuery {
  @scala.inline
  def apply(serializeJSON: CallbackTo[String], serializeObject: CallbackTo[js.Object]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("serializeJSON")(serializeJSON.toJsFn)
    __obj.updateDynamic("serializeObject")(serializeObject.toJsFn)
    __obj.asInstanceOf[JQuery]
  }
}

