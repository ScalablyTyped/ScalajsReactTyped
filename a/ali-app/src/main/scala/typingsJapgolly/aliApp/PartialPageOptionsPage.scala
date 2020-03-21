package typingsJapgolly.aliApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.aliApp.my.ComponentRelation
import typingsJapgolly.aliApp.my.CreateIntersectionObserverOption
import typingsJapgolly.aliApp.my.IntersectionObserver
import typingsJapgolly.aliApp.my.Options
import typingsJapgolly.aliApp.my.PageScrollToOptions
import typingsJapgolly.aliApp.my.SelectorQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.PageOptions & ali-app.my.Page> */
trait PartialPageOptionsPage extends js.Object {
  var createIntersectionObserver: js.UndefOr[
    js.Function1[/* options */ js.UndefOr[CreateIntersectionObserverOption], IntersectionObserver]
  ] = js.undefined
  var createSelectorQuery: js.UndefOr[js.Function0[SelectorQuery]] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataset: js.UndefOr[String] = js.undefined
  var forceUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getRelationNodes: js.UndefOr[js.Function1[/* relationKey */ String, js.Array[ComponentRelation]]] = js.undefined
  var hasBehavior: js.UndefOr[js.Function1[/* behavior */ js.Any, Boolean]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var is: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.ThisFunction0[/* this */ typingsJapgolly.aliApp.my.Page, Unit]] = js.undefined
  var onHide: js.UndefOr[js.ThisFunction0[/* this */ typingsJapgolly.aliApp.my.Page, Unit]] = js.undefined
  var onLaunch: js.UndefOr[
    js.ThisFunction1[/* this */ typingsJapgolly.aliApp.my.Page, /* options */ Options, Unit]
  ] = js.undefined
  var onPullDownRefresh: js.UndefOr[js.ThisFunction0[/* this */ typingsJapgolly.aliApp.my.Page, Unit]] = js.undefined
  var onShow: js.UndefOr[
    js.ThisFunction1[/* this */ typingsJapgolly.aliApp.my.Page, /* options */ Options, Unit]
  ] = js.undefined
  var pageScrollTo: js.UndefOr[js.Function1[/* option */ js.UndefOr[PageScrollToOptions], Unit]] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
  var route: js.UndefOr[js.Function0[Unit]] = js.undefined
  var selectAllComponents: js.UndefOr[
    js.Function1[/* selector */ String, js.Array[typingsJapgolly.aliApp.my.Component]]
  ] = js.undefined
  var selectComponent: js.UndefOr[js.Function1[/* selector */ String, typingsJapgolly.aliApp.my.Component]] = js.undefined
  var setData: js.UndefOr[
    js.Function2[/* data */ js.Any, /* callback */ js.UndefOr[js.Function0[Unit]], Unit]
  ] = js.undefined
  var triggerEvent: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* details */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[Partialbubblesbooleancomp], 
      Unit
    ]
  ] = js.undefined
  var update: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialPageOptionsPage {
  @scala.inline
  def apply(
    createIntersectionObserver: /* options */ js.UndefOr[CreateIntersectionObserverOption] => CallbackTo[IntersectionObserver] = null,
    createSelectorQuery: js.UndefOr[CallbackTo[SelectorQuery]] = js.undefined,
    data: js.Any = null,
    dataset: String = null,
    forceUpdate: js.UndefOr[Callback] = js.undefined,
    getRelationNodes: /* relationKey */ String => CallbackTo[js.Array[ComponentRelation]] = null,
    hasBehavior: /* behavior */ js.Any => CallbackTo[Boolean] = null,
    id: String = null,
    is: String = null,
    onError: js.ThisFunction0[/* this */ typingsJapgolly.aliApp.my.Page, Unit] = null,
    onHide: js.ThisFunction0[/* this */ typingsJapgolly.aliApp.my.Page, Unit] = null,
    onLaunch: js.ThisFunction1[/* this */ typingsJapgolly.aliApp.my.Page, /* options */ Options, Unit] = null,
    onPullDownRefresh: js.ThisFunction0[/* this */ typingsJapgolly.aliApp.my.Page, Unit] = null,
    onShow: js.ThisFunction1[/* this */ typingsJapgolly.aliApp.my.Page, /* options */ Options, Unit] = null,
    pageScrollTo: /* option */ js.UndefOr[PageScrollToOptions] => Callback = null,
    properties: js.Any = null,
    route: js.UndefOr[Callback] = js.undefined,
    selectAllComponents: /* selector */ String => CallbackTo[js.Array[typingsJapgolly.aliApp.my.Component]] = null,
    selectComponent: /* selector */ String => CallbackTo[typingsJapgolly.aliApp.my.Component] = null,
    setData: (/* data */ js.Any, /* callback */ js.UndefOr[js.Function0[Unit]]) => Callback = null,
    triggerEvent: (/* name */ String, /* details */ js.UndefOr[js.Any], /* options */ js.UndefOr[Partialbubblesbooleancomp]) => Callback = null,
    update: js.UndefOr[Callback] = js.undefined
  ): PartialPageOptionsPage = {
    val __obj = js.Dynamic.literal()
    if (createIntersectionObserver != null) __obj.updateDynamic("createIntersectionObserver")(js.Any.fromFunction1((t0: /* options */ js.UndefOr[typingsJapgolly.aliApp.my.CreateIntersectionObserverOption]) => createIntersectionObserver(t0).runNow()))
    createSelectorQuery.foreach(p => __obj.updateDynamic("createSelectorQuery")(p.toJsFn))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    forceUpdate.foreach(p => __obj.updateDynamic("forceUpdate")(p.toJsFn))
    if (getRelationNodes != null) __obj.updateDynamic("getRelationNodes")(js.Any.fromFunction1((t0: /* relationKey */ java.lang.String) => getRelationNodes(t0).runNow()))
    if (hasBehavior != null) __obj.updateDynamic("hasBehavior")(js.Any.fromFunction1((t0: /* behavior */ js.Any) => hasBehavior(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    if (onLaunch != null) __obj.updateDynamic("onLaunch")(onLaunch.asInstanceOf[js.Any])
    if (onPullDownRefresh != null) __obj.updateDynamic("onPullDownRefresh")(onPullDownRefresh.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(onShow.asInstanceOf[js.Any])
    if (pageScrollTo != null) __obj.updateDynamic("pageScrollTo")(js.Any.fromFunction1((t0: /* option */ js.UndefOr[typingsJapgolly.aliApp.my.PageScrollToOptions]) => pageScrollTo(t0).runNow()))
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    route.foreach(p => __obj.updateDynamic("route")(p.toJsFn))
    if (selectAllComponents != null) __obj.updateDynamic("selectAllComponents")(js.Any.fromFunction1((t0: /* selector */ java.lang.String) => selectAllComponents(t0).runNow()))
    if (selectComponent != null) __obj.updateDynamic("selectComponent")(js.Any.fromFunction1((t0: /* selector */ java.lang.String) => selectComponent(t0).runNow()))
    if (setData != null) __obj.updateDynamic("setData")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* callback */ js.UndefOr[js.Function0[scala.Unit]]) => setData(t0, t1).runNow()))
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(js.Any.fromFunction3((t0: /* name */ java.lang.String, t1: /* details */ js.UndefOr[js.Any], t2: /* options */ js.UndefOr[typingsJapgolly.aliApp.Partialbubblesbooleancomp]) => triggerEvent(t0, t1, t2).runNow()))
    update.foreach(p => __obj.updateDynamic("update")(p.toJsFn))
    __obj.asInstanceOf[PartialPageOptionsPage]
  }
}

