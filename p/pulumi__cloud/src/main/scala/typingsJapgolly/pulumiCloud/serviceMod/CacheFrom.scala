package typingsJapgolly.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheFrom extends js.Object {
  /**
    * An optional list of build stages to use for caching. Each build stage in this list will be built explicitly and
    * pushed to the target repository. A given stage's image will be tagged as "[stage-name]".
    */
  var stages: js.UndefOr[js.Array[String]] = js.undefined
}

object CacheFrom {
  @scala.inline
  def apply(stages: js.Array[String] = null): CacheFrom = {
    val __obj = js.Dynamic.literal()
    if (stages != null) __obj.updateDynamic("stages")(stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheFrom]
  }
}

