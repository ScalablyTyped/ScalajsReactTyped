package typingsJapgolly.purl

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.purl.mod.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  /** 
    * extract the URL from the selected element and parse that - will work on any element with a `src`, `href` or `action` attribute.
    */
  def url(): Url
}

object JQuery {
  @scala.inline
  def apply(url: CallbackTo[Url]): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url.toJsFn)
    __obj.asInstanceOf[JQuery]
  }
}

