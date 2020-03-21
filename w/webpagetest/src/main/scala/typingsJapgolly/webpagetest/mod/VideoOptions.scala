package typingsJapgolly.webpagetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoOptions extends js.Object {
  /** frame comparison end point: [visual]=visually complete | all=last change | doc=document complete | full=fully loaded */
  var comparisonEndPoint: js.UndefOr[String] = js.undefined
}

object VideoOptions {
  @scala.inline
  def apply(comparisonEndPoint: String = null): VideoOptions = {
    val __obj = js.Dynamic.literal()
    if (comparisonEndPoint != null) __obj.updateDynamic("comparisonEndPoint")(comparisonEndPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOptions]
  }
}

