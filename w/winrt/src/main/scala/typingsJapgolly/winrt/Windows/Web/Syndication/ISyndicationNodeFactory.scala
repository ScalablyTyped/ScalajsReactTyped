package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationNodeFactory extends js.Object {
  def createSyndicationNode(nodeName: String, nodeNamespace: String, nodeValue: String): SyndicationNode
}

object ISyndicationNodeFactory {
  @scala.inline
  def apply(createSyndicationNode: (String, String, String) => CallbackTo[SyndicationNode]): ISyndicationNodeFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSyndicationNode")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => createSyndicationNode(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISyndicationNodeFactory]
  }
}

