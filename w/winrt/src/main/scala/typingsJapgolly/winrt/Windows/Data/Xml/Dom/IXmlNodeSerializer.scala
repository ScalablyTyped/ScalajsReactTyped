package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlNodeSerializer extends js.Object {
  var innerText: String
  def getXml(): String
}

object IXmlNodeSerializer {
  @scala.inline
  def apply(getXml: CallbackTo[String], innerText: String): IXmlNodeSerializer = {
    val __obj = js.Dynamic.literal(innerText = innerText.asInstanceOf[js.Any])
    __obj.updateDynamic("getXml")(getXml.toJsFn)
    __obj.asInstanceOf[IXmlNodeSerializer]
  }
}

