package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var MenuSelectContanerPrefixCls: String
  var data: js.Array[scala.Nothing]
  var level: Double
  var multiSelect: Boolean
  var multiSelectMenuBtnsCls: String
  var prefixCls: String
  var radioPrefixCls: String
  var subMenuPrefixCls: String
  def onCancel(): Unit
  def onChange(): Unit
  def onOk(): Unit
}

object AnonData {
  @scala.inline
  def apply(
    MenuSelectContanerPrefixCls: String,
    data: js.Array[scala.Nothing],
    level: Double,
    multiSelect: Boolean,
    multiSelectMenuBtnsCls: String,
    onCancel: Callback,
    onChange: Callback,
    onOk: Callback,
    prefixCls: String,
    radioPrefixCls: String,
    subMenuPrefixCls: String
  ): AnonData = {
    val __obj = js.Dynamic.literal(MenuSelectContanerPrefixCls = MenuSelectContanerPrefixCls.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], multiSelect = multiSelect.asInstanceOf[js.Any], multiSelectMenuBtnsCls = multiSelectMenuBtnsCls.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], radioPrefixCls = radioPrefixCls.asInstanceOf[js.Any], subMenuPrefixCls = subMenuPrefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.updateDynamic("onOk")(onOk.toJsFn)
    __obj.asInstanceOf[AnonData]
  }
}

