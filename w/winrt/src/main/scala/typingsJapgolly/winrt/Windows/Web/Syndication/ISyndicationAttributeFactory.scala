package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationAttributeFactory extends js.Object {
  def createSyndicationAttribute(attributeName: String, attributeNamespace: String, attributeValue: String): SyndicationAttribute
}

object ISyndicationAttributeFactory {
  @scala.inline
  def apply(createSyndicationAttribute: (String, String, String) => CallbackTo[SyndicationAttribute]): ISyndicationAttributeFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSyndicationAttribute")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => createSyndicationAttribute(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISyndicationAttributeFactory]
  }
}

