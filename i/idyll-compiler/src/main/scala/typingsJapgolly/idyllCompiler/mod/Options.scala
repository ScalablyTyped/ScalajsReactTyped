package typingsJapgolly.idyllCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * If false and there is no postprocessors, compiler returns the AST synchronously
    * Otherwise, a promise is returned
    *
    */
  var async: js.UndefOr[Boolean] = js.undefined
  /**
    * compiler plugins
    * If provided, compiler always compiles asynchronously
    */
  var postProcessors: js.UndefOr[js.Array[PostProcessor]] = js.undefined
  var smartquotes: js.UndefOr[Boolean] = js.undefined
  var spellcheck: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    postProcessors: js.Array[PostProcessor] = null,
    smartquotes: js.UndefOr[Boolean] = js.undefined,
    spellcheck: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (postProcessors != null) __obj.updateDynamic("postProcessors")(postProcessors.asInstanceOf[js.Any])
    if (!js.isUndefined(smartquotes)) __obj.updateDynamic("smartquotes")(smartquotes.asInstanceOf[js.Any])
    if (!js.isUndefined(spellcheck)) __obj.updateDynamic("spellcheck")(spellcheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

