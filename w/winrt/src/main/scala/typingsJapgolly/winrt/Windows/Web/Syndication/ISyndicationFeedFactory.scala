package typingsJapgolly.winrt.Windows.Web.Syndication

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationFeedFactory extends js.Object {
  def createSyndicationFeed(title: String, subtitle: String, uri: Uri): SyndicationFeed
}

object ISyndicationFeedFactory {
  @scala.inline
  def apply(createSyndicationFeed: (String, String, Uri) => CallbackTo[SyndicationFeed]): ISyndicationFeedFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createSyndicationFeed")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: typingsJapgolly.winrt.Windows.Foundation.Uri) => createSyndicationFeed(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ISyndicationFeedFactory]
  }
}

