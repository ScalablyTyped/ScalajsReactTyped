package typingsJapgolly.tinajsTina

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tinajsTina.mod.Component
import typingsJapgolly.tinajsTina.mod.ComponentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@tinajs/tina.@tinajs/tina.PageDefinitions> */
trait PartialPageDefinitionsCreated extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var beforeLoad: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
  var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[js.Any], StringDictionary[_]]] = js.undefined
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var methods: js.UndefOr[
    StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
  ] = js.undefined
  var mixins: js.UndefOr[js.Array[PartialPageDefinitionsCompute]] = js.undefined
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* options */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onPageScroll: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.undefined
  var onPullDownRefresh: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.undefined
  var onReachBottom: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.undefined
  var onReady: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
  var onShareAppMessage: js.UndefOr[js.Function1[/* event */ this.type, Unit]] = js.undefined
  var onShow: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
  var onUnload: js.UndefOr[js.ThisFunction0[/* this */ this.type, Unit]] = js.undefined
  var properties: js.UndefOr[ComponentProperties] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialPageDefinitionsCreated {
  @scala.inline
  def apply(
    attached: js.UndefOr[Callback] = js.undefined,
    beforeLoad: js.ThisFunction0[PartialPageDefinitionsCreated, Unit] = null,
    compute: /* data */ StringDictionary[js.Any] => CallbackTo[StringDictionary[js.Any]] = null,
    created: js.UndefOr[Callback] = js.undefined,
    data: StringDictionary[js.Any] = null,
    detached: js.UndefOr[Callback] = js.undefined,
    methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]] = null,
    mixins: js.Array[PartialPageDefinitionsCompute] = null,
    moved: js.UndefOr[Callback] = js.undefined,
    onHide: js.ThisFunction0[PartialPageDefinitionsCreated, Unit] = null,
    onLoad: js.ThisFunction1[PartialPageDefinitionsCreated, /* options */ js.UndefOr[js.Any], Unit] = null,
    onPageScroll: PartialPageDefinitionsCreated => Callback = null,
    onPullDownRefresh: PartialPageDefinitionsCreated => Callback = null,
    onReachBottom: PartialPageDefinitionsCreated => Callback = null,
    onReady: js.ThisFunction0[PartialPageDefinitionsCreated, Unit] = null,
    onShareAppMessage: PartialPageDefinitionsCreated => Callback = null,
    onShow: js.ThisFunction0[PartialPageDefinitionsCreated, Unit] = null,
    onUnload: js.ThisFunction0[PartialPageDefinitionsCreated, Unit] = null,
    properties: ComponentProperties = null,
    ready: js.UndefOr[Callback] = js.undefined
  ): PartialPageDefinitionsCreated = {
    val __obj = js.Dynamic.literal()
    attached.foreach(p => __obj.updateDynamic("attached")(p.toJsFn))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(beforeLoad.asInstanceOf[js.Any])
    if (compute != null) __obj.updateDynamic("compute")(js.Any.fromFunction1((t0: /* data */ org.scalablytyped.runtime.StringDictionary[js.Any]) => compute(t0).runNow()))
    created.foreach(p => __obj.updateDynamic("created")(p.toJsFn))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    detached.foreach(p => __obj.updateDynamic("detached")(p.toJsFn))
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    moved.foreach(p => __obj.updateDynamic("moved")(p.toJsFn))
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    if (onPageScroll != null) __obj.updateDynamic("onPageScroll")(js.Any.fromFunction1((t0: typingsJapgolly.tinajsTina.PartialPageDefinitionsCreated) => onPageScroll(t0).runNow()))
    if (onPullDownRefresh != null) __obj.updateDynamic("onPullDownRefresh")(js.Any.fromFunction1((t0: typingsJapgolly.tinajsTina.PartialPageDefinitionsCreated) => onPullDownRefresh(t0).runNow()))
    if (onReachBottom != null) __obj.updateDynamic("onReachBottom")(js.Any.fromFunction1((t0: typingsJapgolly.tinajsTina.PartialPageDefinitionsCreated) => onReachBottom(t0).runNow()))
    if (onReady != null) __obj.updateDynamic("onReady")(onReady.asInstanceOf[js.Any])
    if (onShareAppMessage != null) __obj.updateDynamic("onShareAppMessage")(js.Any.fromFunction1((t0: typingsJapgolly.tinajsTina.PartialPageDefinitionsCreated) => onShareAppMessage(t0).runNow()))
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (onUnload != null) __obj.updateDynamic("onUnload")(onUnload.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    ready.foreach(p => __obj.updateDynamic("ready")(p.toJsFn))
    __obj.asInstanceOf[PartialPageDefinitionsCreated]
  }
}

