package typingsJapgolly.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Links extends js.Object {
  /**
    * The number of dropped links after the maximum size was enforced. If
    * this value is 0, then no links were dropped.
    */
  var droppedLinksCount: js.UndefOr[Double] = js.undefined
  /** A collection of links. */
  var link: js.UndefOr[js.Array[Link]] = js.undefined
}

object Links {
  @scala.inline
  def apply(droppedLinksCount: Int | Double = null, link: js.Array[Link] = null): Links = {
    val __obj = js.Dynamic.literal()
    if (droppedLinksCount != null) __obj.updateDynamic("droppedLinksCount")(droppedLinksCount.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    __obj.asInstanceOf[Links]
  }
}

