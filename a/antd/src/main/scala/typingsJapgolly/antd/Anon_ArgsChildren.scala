package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.`inline`
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsChildren extends js.Object {
  var children: Requireable[_]
  var colon: Requireable[Boolean]
  var hideRequiredMark: Requireable[Boolean]
  var layout: Requireable[`inline` | horizontal | vertical]
  var onSubmit: Requireable[js.Function1[/* repeated */ _, _]]
  var prefixCls: Requireable[String]
}

object Anon_ArgsChildren {
  @scala.inline
  def apply(
    children: Requireable[_],
    colon: Requireable[Boolean],
    hideRequiredMark: Requireable[Boolean],
    layout: Requireable[`inline` | horizontal | vertical],
    onSubmit: Requireable[js.Function1[/* repeated */ _, _]],
    prefixCls: Requireable[String]
  ): Anon_ArgsChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], colon = colon.asInstanceOf[js.Any], hideRequiredMark = hideRequiredMark.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], onSubmit = onSubmit.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ArgsChildren]
  }
}

