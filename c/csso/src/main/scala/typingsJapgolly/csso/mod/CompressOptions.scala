package typingsJapgolly.csso.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
  /**
    * Transform a copy of input AST if true. Useful in case of AST reuse.
    * @default false
    */
  @JSName("clone")
  var clone_FCompressOptions: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify what comments to leave:
    * - 'exclamation' or true – leave all exclamation comments
    * - 'first-exclamation' – remove every comment except first one
    * - false – remove all comments
    * @default true
    */
  var comments: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Enables merging of @media rules with the same media query by splitted by other rules.
    * The optimisation is unsafe in general, but should work fine in most cases. Use it on your own risk.
    * @default false
    */
  var forceMediaMerge: js.UndefOr[Boolean] = js.undefined
  /**
    * Function to track every step of transformation.
    */
  var logger: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Disable or enable a structure optimisations.
    * @default true
    */
  var restructure: js.UndefOr[Boolean] = js.undefined
  /**
    * Usage data for advanced optimisations.
    */
  var usage: js.UndefOr[Usage] = js.undefined
}

object CompressOptions {
  @scala.inline
  def apply(
    clone: js.UndefOr[Boolean] = js.undefined,
    comments: String | Boolean = null,
    forceMediaMerge: js.UndefOr[Boolean] = js.undefined,
    logger: js.UndefOr[Callback] = js.undefined,
    restructure: js.UndefOr[Boolean] = js.undefined,
    usage: Usage = null
  ): CompressOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(forceMediaMerge)) __obj.updateDynamic("forceMediaMerge")(forceMediaMerge.asInstanceOf[js.Any])
    logger.foreach(p => __obj.updateDynamic("logger")(p.toJsFn))
    if (!js.isUndefined(restructure)) __obj.updateDynamic("restructure")(restructure.asInstanceOf[js.Any])
    if (usage != null) __obj.updateDynamic("usage")(usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressOptions]
  }
}

