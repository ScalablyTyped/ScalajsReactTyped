package typingsJapgolly.dojo.dojox.drawing.util

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/util/typeset.html
  *
  *
  */
trait typeset extends js.Object {
  /**
    *
    * @param inText
    */
  def convertHTML(inText: js.Any): js.Any
  /**
    *
    * @param inText
    */
  def convertLaTeX(inText: js.Any): js.Any
}

object typeset {
  @scala.inline
  def apply(convertHTML: js.Any => CallbackTo[js.Any], convertLaTeX: js.Any => CallbackTo[js.Any]): typeset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("convertHTML")(js.Any.fromFunction1((t0: js.Any) => convertHTML(t0).runNow()))
    __obj.updateDynamic("convertLaTeX")(js.Any.fromFunction1((t0: js.Any) => convertLaTeX(t0).runNow()))
    __obj.asInstanceOf[typeset]
  }
}

