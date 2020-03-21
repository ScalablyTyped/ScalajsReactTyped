package typingsJapgolly.vueTemplateCompiler.mod

import typingsJapgolly.vueTemplateCompiler.vueTemplateCompilerNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTText extends ASTNode {
  var isComment: js.UndefOr[Boolean] = js.undefined
  // 2.4 ssr optimization
  var ssrOptimizability: js.UndefOr[SSROptimizability] = js.undefined
  var static: js.UndefOr[Boolean] = js.undefined
  var text: String
  var `type`: `3`
}

object ASTText {
  @scala.inline
  def apply(
    text: String,
    `type`: `3`,
    isComment: js.UndefOr[Boolean] = js.undefined,
    ssrOptimizability: SSROptimizability = null,
    static: js.UndefOr[Boolean] = js.undefined
  ): ASTText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(isComment)) __obj.updateDynamic("isComment")(isComment.asInstanceOf[js.Any])
    if (ssrOptimizability != null) __obj.updateDynamic("ssrOptimizability")(ssrOptimizability.asInstanceOf[js.Any])
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTText]
  }
}

