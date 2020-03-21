package typingsJapgolly.rcTable.interfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderExpandIconProps[RecordType] extends js.Object {
  var expandable: Boolean
  var expanded: Boolean
  var onExpand: TriggerEventHandler[RecordType]
  var prefixCls: String
  var record: RecordType
}

object RenderExpandIconProps {
  @scala.inline
  def apply[RecordType](
    expandable: Boolean,
    expanded: Boolean,
    onExpand: (RecordType, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback,
    prefixCls: String,
    record: RecordType
  ): RenderExpandIconProps[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any])
    __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: RecordType, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onExpand(t0, t1).runNow()))
    __obj.asInstanceOf[RenderExpandIconProps[RecordType]]
  }
}

