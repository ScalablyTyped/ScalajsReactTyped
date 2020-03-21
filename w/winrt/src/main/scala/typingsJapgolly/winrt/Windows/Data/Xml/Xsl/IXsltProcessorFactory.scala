package typingsJapgolly.winrt.Windows.Data.Xml.Xsl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXsltProcessorFactory extends js.Object {
  def createInstance(document: XmlDocument): XsltProcessor
}

object IXsltProcessorFactory {
  @scala.inline
  def apply(createInstance: XmlDocument => CallbackTo[XsltProcessor]): IXsltProcessorFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createInstance")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Data.Xml.Dom.XmlDocument) => createInstance(t0).runNow()))
    __obj.asInstanceOf[IXsltProcessorFactory]
  }
}

