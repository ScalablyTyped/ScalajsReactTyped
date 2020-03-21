package typingsJapgolly.rcTable.tableContextMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.interfaceMod.CustomizeComponent
import typingsJapgolly.rcTable.interfaceMod.GetComponent
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableContextProps extends js.Object {
  var getComponent: GetComponent
  var prefixCls: String
  var scrollbarSize: Double
}

object TableContextProps {
  @scala.inline
  def apply(
    getComponent: (/* path */ js.Array[String], /* defaultComponent */ js.UndefOr[CustomizeComponent[HTMLAttributes[HTMLElement]]]) => CallbackTo[CustomizeComponent[HTMLAttributes[HTMLElement]]],
    prefixCls: String,
    scrollbarSize: Double
  ): TableContextProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], scrollbarSize = scrollbarSize.asInstanceOf[js.Any])
    __obj.updateDynamic("getComponent")(js.Any.fromFunction2((t0: /* path */ js.Array[java.lang.String], t1: /* defaultComponent */ js.UndefOr[
  typingsJapgolly.rcTable.interfaceMod.CustomizeComponent[typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLElement]]]) => getComponent(t0, t1).runNow()))
    __obj.asInstanceOf[TableContextProps]
  }
}

