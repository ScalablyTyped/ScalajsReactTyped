package typingsJapgolly.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeNewProps extends js.Object {
  var raws: js.UndefOr[NodeRaws] = js.undefined
  var source: js.UndefOr[NodeSource] = js.undefined
}

object NodeNewProps {
  @scala.inline
  def apply(raws: NodeRaws = null, source: NodeSource = null): NodeNewProps = {
    val __obj = js.Dynamic.literal()
    if (raws != null) __obj.updateDynamic("raws")(raws.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeNewProps]
  }
}

