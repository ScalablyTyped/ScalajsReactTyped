package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationItemFactory extends js.Object {
  def createSyndicationItem(title: String, content: SyndicationContent, uri: Uri): SyndicationItem
}

object ISyndicationItemFactory {
  @scala.inline
  def apply(createSyndicationItem: (String, SyndicationContent, Uri) => CallbackTo[SyndicationItem]): ISyndicationItemFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSyndicationItem")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Web.Syndication.SyndicationContent, t2: typingsJapgolly.winrt.Windows.Foundation.Uri) => createSyndicationItem(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISyndicationItemFactory]
  }
}

