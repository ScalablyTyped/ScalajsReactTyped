package typingsJapgolly.inboxsdk.mod.Router

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRouteView extends RouteView {
  def addCollapsibleSection(options: SectionDescriptor): CollapsibleSectionView
  // addCollapsibleSection(options: Stream<SectionDescriptor>): CollapsibleSectionView;
  def addSection(options: SectionDescriptor): SectionView
  // addSection(options: Stream<SectionDescriptor>): SectionView;
  def refresh(): Unit
}

object ListRouteView {
  @scala.inline
  def apply(
    addCollapsibleSection: SectionDescriptor => CallbackTo[CollapsibleSectionView],
    addSection: SectionDescriptor => CallbackTo[SectionView],
    destroyed: Boolean,
    getParams: CallbackTo[RouteParams],
    getRouteID: CallbackTo[String],
    getRouteType: CallbackTo[RouteTypes],
    on: (destroy, js.Function0[Unit]) => Callback,
    refresh: Callback
  ): ListRouteView = {
    val __obj = js.Dynamic.literal(destroyed = destroyed.asInstanceOf[js.Any])
    __obj.updateDynamic("addCollapsibleSection")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Router.SectionDescriptor) => addCollapsibleSection(t0).runNow()))
    __obj.updateDynamic("addSection")(js.Any.fromFunction1((t0: typingsJapgolly.inboxsdk.mod.Router.SectionDescriptor) => addSection(t0).runNow()))
    __obj.updateDynamic("getParams")(getParams.toJsFn)
    __obj.updateDynamic("getRouteID")(getRouteID.toJsFn)
    __obj.updateDynamic("getRouteType")(getRouteType.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.inboxsdk.inboxsdkStrings.destroy, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.asInstanceOf[ListRouteView]
  }
}

