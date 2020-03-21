package typingsJapgolly.winrt.Windows.Data.Xml.Xsl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXsltProcessor extends js.Object {
  def transformToString(inputNode: IXmlNode): String
}

object IXsltProcessor {
  @scala.inline
  def apply(transformToString: IXmlNode => CallbackTo[String]): IXsltProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("transformToString")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.IXmlNode) => transformToString(t0).runNow()))
    __obj.asInstanceOf[IXsltProcessor]
  }
}

