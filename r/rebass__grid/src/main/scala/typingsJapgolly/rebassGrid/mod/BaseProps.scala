package typingsJapgolly.rebassGrid.mod

import japgolly.scalajs.react.raw.React.ElementType
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps
  extends Props[js.Any] {
  var as: js.UndefOr[ElementType] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(as: ElementType = null, children: VdomNode = null, key: Key = null, ref: LegacyRef[js.Any] = null): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}

