package typingsJapgolly.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MathMLInputProcessor extends js.Object {
  /*Specifies whether to use TeX spacing or MathML spacing when the HTML-CSS output jax is used.*/
  var useMathMLspacing: js.UndefOr[Boolean] = js.undefined
}

object MathMLInputProcessor {
  @scala.inline
  def apply(useMathMLspacing: js.UndefOr[Boolean] = js.undefined): MathMLInputProcessor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useMathMLspacing)) __obj.updateDynamic("useMathMLspacing")(useMathMLspacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[MathMLInputProcessor]
  }
}

