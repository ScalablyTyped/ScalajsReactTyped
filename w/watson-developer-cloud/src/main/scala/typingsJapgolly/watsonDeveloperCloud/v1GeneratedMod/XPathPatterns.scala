package typingsJapgolly.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** XPathPatterns. */
trait XPathPatterns extends js.Object {
  /** An array to XPaths. */
  var xpaths: js.UndefOr[js.Array[String]] = js.undefined
}

object XPathPatterns {
  @scala.inline
  def apply(xpaths: js.Array[String] = null): XPathPatterns = {
    val __obj = js.Dynamic.literal()
    if (xpaths != null) __obj.updateDynamic("xpaths")(xpaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[XPathPatterns]
  }
}

