package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.`space-around`
import typingsJapgolly.antd.antdStrings.`space-between`
import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.center
import typingsJapgolly.antd.antdStrings.end
import typingsJapgolly.antd.antdStrings.flex
import typingsJapgolly.antd.antdStrings.middle
import typingsJapgolly.antd.antdStrings.start
import typingsJapgolly.antd.antdStrings.stretch
import typingsJapgolly.antd.antdStrings.top
import typingsJapgolly.propDashTypes.propDashTypesMod.ReactNodeLike
import typingsJapgolly.propDashTypes.propDashTypesMod.Requireable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Align extends js.Object {
  var align: Requireable[top | middle | bottom | stretch]
  var children: Requireable[ReactNodeLike]
  var className: Requireable[String]
  var gutter: Requireable[Double | js.Object]
  var justify: Requireable[start | center | end | `space-around` | `space-between`]
  var prefixCls: Requireable[String]
  var `type`: Requireable[flex]
}

object Anon_Align {
  @scala.inline
  def apply(
    align: Requireable[top | middle | bottom | stretch],
    children: Requireable[ReactNodeLike],
    className: Requireable[String],
    gutter: Requireable[Double | js.Object],
    justify: Requireable[start | center | end | `space-around` | `space-between`],
    prefixCls: Requireable[String],
    `type`: Requireable[flex]
  ): Anon_Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any], justify = justify.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Align]
  }
}

