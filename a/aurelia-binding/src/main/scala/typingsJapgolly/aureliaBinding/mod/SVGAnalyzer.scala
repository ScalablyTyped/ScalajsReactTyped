package typingsJapgolly.aureliaBinding.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGAnalyzer extends js.Object {
  def isStandardSvgAttribute(nodeName: String, attributeName: String): Boolean
}

object SVGAnalyzer {
  @scala.inline
  def apply(isStandardSvgAttribute: (String, String) => CallbackTo[Boolean]): SVGAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isStandardSvgAttribute")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => isStandardSvgAttribute(t0, t1).runNow()))
    __obj.asInstanceOf[SVGAnalyzer]
  }
}

