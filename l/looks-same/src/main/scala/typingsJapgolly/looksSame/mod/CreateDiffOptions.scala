package typingsJapgolly.looksSame.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options passed to looksSame.createDiff function
  */
trait CreateDiffOptions extends CreateDiffAsBufferOptions {
  /**
    * The diff image path to store
    */
  var diff: String
}

object CreateDiffOptions {
  @scala.inline
  def apply(
    current: String | Buffer | BoundedImage,
    diff: String,
    highlightColor: String,
    reference: String | Buffer | BoundedImage,
    antialiasingTolerance: Int | Double = null,
    ignoreAntialiasing: js.UndefOr[Boolean] = js.undefined,
    ignoreCaret: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    tolerance: Int | Double = null
  ): CreateDiffOptions = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], diff = diff.asInstanceOf[js.Any], highlightColor = highlightColor.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    if (antialiasingTolerance != null) __obj.updateDynamic("antialiasingTolerance")(antialiasingTolerance.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreAntialiasing)) __obj.updateDynamic("ignoreAntialiasing")(ignoreAntialiasing.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCaret)) __obj.updateDynamic("ignoreCaret")(ignoreCaret.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDiffOptions]
  }
}

