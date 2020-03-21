package typingsJapgolly.postcss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtRuleNewProps extends ContainerNewProps {
  /**
    * The identifier that immediately follows the @.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * These are the values that follow the at-rule's name, but precede any {}
    * block. The spec refers to this area as the at-rule's "prelude".
    */
  var params: js.UndefOr[String | Double] = js.undefined
  @JSName("raws")
  var raws_AtRuleNewProps: js.UndefOr[AtRuleRaws] = js.undefined
}

object AtRuleNewProps {
  @scala.inline
  def apply(
    name: String = null,
    nodes: js.Array[ChildNode] = null,
    params: String | Double = null,
    raws: AtRuleRaws = null,
    source: NodeSource = null
  ): AtRuleNewProps = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (raws != null) __obj.updateDynamic("raws")(raws.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AtRuleNewProps]
  }
}

