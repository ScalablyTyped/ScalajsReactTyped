package typingsJapgolly.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBluetoothAdapterStateSuccess extends js.Object {
  /**
    * 蓝牙适配器是否可用
    */
  var available: js.UndefOr[Boolean] = js.undefined
  /**
    * 是否正在搜索设备
    */
  var discovering: js.UndefOr[Boolean] = js.undefined
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
}

object GetBluetoothAdapterStateSuccess {
  @scala.inline
  def apply(
    available: js.UndefOr[Boolean] = js.undefined,
    discovering: js.UndefOr[Boolean] = js.undefined,
    errMsg: String = null
  ): GetBluetoothAdapterStateSuccess = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(available)) __obj.updateDynamic("available")(available.asInstanceOf[js.Any])
    if (!js.isUndefined(discovering)) __obj.updateDynamic("discovering")(discovering.asInstanceOf[js.Any])
    if (errMsg != null) __obj.updateDynamic("errMsg")(errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBluetoothAdapterStateSuccess]
  }
}

