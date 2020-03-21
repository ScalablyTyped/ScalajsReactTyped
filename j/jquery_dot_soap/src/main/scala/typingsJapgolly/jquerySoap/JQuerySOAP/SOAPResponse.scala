package typingsJapgolly.jquerySoap.JQuerySOAP

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.XMLDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SOAPResponse extends js.Object {
  def toJSON(): js.Any
  def toXML(): XMLDocument
}

object SOAPResponse {
  @scala.inline
  def apply(toJSON: CallbackTo[js.Any], toXML: CallbackTo[XMLDocument]): SOAPResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toXML")(toXML.toJsFn)
    __obj.asInstanceOf[SOAPResponse]
  }
}

