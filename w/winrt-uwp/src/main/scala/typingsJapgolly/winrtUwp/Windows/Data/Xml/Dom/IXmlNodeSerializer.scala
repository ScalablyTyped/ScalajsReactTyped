package typingsJapgolly.winrtUwp.Windows.Data.Xml.Dom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the methods needed to serialize a DOM tree or subtree to a string representation. */
trait IXmlNodeSerializer extends js.Object {
  /** Gets and sets the text from inside the XML. */
  var innerText: String
  /**
    * Returns the XML representation of the node and all its descendants.
    * @return The XML representation of the node and all its descendants.
    */
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

