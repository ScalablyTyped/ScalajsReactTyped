package typingsJapgolly.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var zui: ZuiStatic
}

object JQueryStatic {
  @scala.inline
  def apply(zui: ZuiStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(zui = zui.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

