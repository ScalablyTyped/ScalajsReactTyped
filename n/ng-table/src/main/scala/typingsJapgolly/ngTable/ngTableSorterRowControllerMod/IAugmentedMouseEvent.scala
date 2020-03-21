package typingsJapgolly.ngTable.ngTableSorterRowControllerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IAngularEvent
import typingsJapgolly.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAugmentedMouseEvent extends IAngularEvent {
  var ctrlKey: Boolean
  var metaKey: Boolean
}

object IAugmentedMouseEvent {
  @scala.inline
  def apply(
    ctrlKey: Boolean,
    currentScope: IScope,
    defaultPrevented: Boolean,
    metaKey: Boolean,
    name: String,
    preventDefault: Callback,
    targetScope: IScope,
    stopPropagation: js.UndefOr[Callback] = js.undefined
  ): IAugmentedMouseEvent = {
    val __obj = js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any], currentScope = currentScope.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetScope = targetScope.asInstanceOf[js.Any])
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    stopPropagation.foreach(p => __obj.updateDynamic("stopPropagation")(p.toJsFn))
    __obj.asInstanceOf[IAugmentedMouseEvent]
  }
}

