package typingsJapgolly.rss.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.rss.mod.NodeRSS.FeedOptions
import typingsJapgolly.rss.mod.NodeRSS.RSS
import typingsJapgolly.rss.mod.NodeRSS.RSSFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rss", JSImport.Namespace)
@js.native
class ^ protected () extends RSS {
  /**
    * Create an RSS feed with options.
    * @param {FeedOptions} feedOptions - Options for the RSS feed.
    * @returns {RSS}
    */
  def this(feedOptions: FeedOptions) = this()
}

@JSImport("rss", JSImport.Namespace)
@js.native
object ^ extends TopLevel[RSSFactory]

