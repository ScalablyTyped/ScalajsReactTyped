package typingsJapgolly.nodeSpriteGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompositorOption extends js.Object {
  var compressionLevel: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[CompositorFilters] = js.undefined
}

object CompositorOption {
  @scala.inline
  def apply(compressionLevel: Int | Double = null, filter: CompositorFilters = null): CompositorOption = {
    val __obj = js.Dynamic.literal()
    if (compressionLevel != null) __obj.updateDynamic("compressionLevel")(compressionLevel.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompositorOption]
  }
}

