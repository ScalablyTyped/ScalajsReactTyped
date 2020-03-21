package typingsJapgolly.antd.expandIconMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultExpandIconProps[RecordType] extends js.Object {
  var expandable: Boolean
  var expanded: Boolean
  var prefixCls: String
  var record: RecordType
  def onExpand(record: RecordType, e: ReactMouseEventFrom[HTMLElement]): Unit
}

object DefaultExpandIconProps {
  @scala.inline
  def apply[RecordType](
    expandable: Boolean,
    expanded: Boolean,
    onExpand: (RecordType, ReactMouseEventFrom[HTMLElement]) => Callback,
    prefixCls: String,
    record: RecordType
  ): DefaultExpandIconProps[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: RecordType, t1: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onExpand(t0, t1).runNow()))
    __obj.asInstanceOf[DefaultExpandIconProps[RecordType]]
  }
}

