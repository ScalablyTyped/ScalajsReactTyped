package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrefixClsSuffixIcon extends js.Object {
  var prefixCls: String
  var suffixIcon: Node
}

object Anon_PrefixClsSuffixIcon {
  @scala.inline
  def apply(prefixCls: String, suffixIcon: VdomNode = null): Anon_PrefixClsSuffixIcon = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PrefixClsSuffixIcon]
  }
}

