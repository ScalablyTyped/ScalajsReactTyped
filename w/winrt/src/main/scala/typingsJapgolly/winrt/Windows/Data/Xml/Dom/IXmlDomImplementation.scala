package typingsJapgolly.winrt.Windows.Data.Xml.Dom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IXmlDomImplementation extends js.Object {
  def hasFeature(feature: String, version: js.Any): Boolean
}

object IXmlDomImplementation {
  @scala.inline
  def apply(hasFeature: (String, js.Any) => CallbackTo[Boolean]): IXmlDomImplementation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasFeature")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => hasFeature(t0, t1).runNow()))
    __obj.asInstanceOf[IXmlDomImplementation]
  }
}

