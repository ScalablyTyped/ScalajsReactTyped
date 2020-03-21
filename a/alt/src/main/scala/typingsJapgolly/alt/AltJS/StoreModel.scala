package typingsJapgolly.alt.AltJS

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreModel[S] extends js.Object {
  var afterEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, Unit]] = js.undefined
  var alt: js.UndefOr[Alt] = js.undefined
  var beforeEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, Unit]] = js.undefined
  //Actions
  var bindAction: js.UndefOr[js.Function2[/* action */ Action[_], /* handler */ ActionHandler, Unit]] = js.undefined
  var bindActions: js.UndefOr[js.Function1[/* actions */ ActionsClass, Unit]] = js.undefined
  var bindListeners: js.UndefOr[js.Function1[/* config */ StringDictionary[Action[_] | Actions], Unit]] = js.undefined
  // TODO: Embed dispatcher interface in def
  var dispatcher: js.UndefOr[js.Any] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var emitChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var exportAsync: js.UndefOr[js.Function1[/* source */ Source, Unit]] = js.undefined
  //Methods/Listeners
  var exportPublicMethods: js.UndefOr[js.Function1[/* exportConfig */ js.Any, Unit]] = js.undefined
  //instance
  var getInstance: js.UndefOr[js.Function0[AltStore[S]]] = js.undefined
  var getState: js.UndefOr[js.Function0[S]] = js.undefined
  var observe: js.UndefOr[js.Function1[/* alt */ Alt, _]] = js.undefined
  var on: js.UndefOr[js.Function2[/* event */ lifeCycleEvents, /* callback */ js.Function0[_], Unit]] = js.undefined
  var onDeserialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], Unit]] = js.undefined
  //events
  var onSerialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ js.Any, _], Unit]] = js.undefined
  var otherwise: js.UndefOr[js.Function2[/* data */ js.Any, /* action */ Action[_], Unit]] = js.undefined
  var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
  var reduce: js.UndefOr[js.Function2[/* state */ js.Any, /* config */ StoreReduce, js.Object]] = js.undefined
  var registerAsync: js.UndefOr[js.Function1[/* datasource */ Source, Unit]] = js.undefined
  //state
  var setState: js.UndefOr[
    (js.Function1[/* state */ S, Unit]) with (js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit])
  ] = js.undefined
  var waitFor: js.UndefOr[
    (js.Function1[/* store */ AltStore[_], Unit]) with (js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], Unit])
  ] = js.undefined
}

object StoreModel {
  @scala.inline
  def apply[S](
    afterEach: (/* payload */ js.Object, /* state */ js.Object) => Callback = null,
    alt: Alt = null,
    beforeEach: (/* payload */ js.Object, /* state */ js.Object) => Callback = null,
    bindAction: (/* action */ Action[js.Any], /* handler */ ActionHandler) => Callback = null,
    bindActions: /* actions */ ActionsClass => Callback = null,
    bindListeners: /* config */ StringDictionary[Action[js.Any] | Actions] => Callback = null,
    dispatcher: js.Any = null,
    displayName: String = null,
    emitChange: js.UndefOr[Callback] = js.undefined,
    exportAsync: /* source */ Source => Callback = null,
    exportPublicMethods: /* exportConfig */ js.Any => Callback = null,
    getInstance: js.UndefOr[CallbackTo[AltStore[S]]] = js.undefined,
    getState: js.UndefOr[CallbackTo[S]] = js.undefined,
    observe: /* alt */ Alt => CallbackTo[js.Any] = null,
    on: (/* event */ lifeCycleEvents, /* callback */ js.Function0[js.Any]) => Callback = null,
    onDeserialize: /* fn */ js.Function1[/* data */ js.Any, js.Any] => Callback = null,
    onSerialize: /* fn */ js.Function1[/* data */ js.Any, js.Any] => Callback = null,
    otherwise: (/* data */ js.Any, /* action */ Action[js.Any]) => Callback = null,
    preventDefault: js.UndefOr[Callback] = js.undefined,
    reduce: (/* state */ js.Any, /* config */ StoreReduce) => CallbackTo[js.Object] = null,
    registerAsync: /* datasource */ Source => Callback = null,
    setState: (js.Function1[/* state */ S, Unit]) with (js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit]) = null,
    waitFor: (js.Function1[/* store */ AltStore[_], Unit]) with (js.Function1[/* storeOrStores */ AltStore[_] | js.Array[AltStore[_]], Unit]) = null
  ): StoreModel[S] = {
    val __obj = js.Dynamic.literal()
    if (afterEach != null) __obj.updateDynamic("afterEach")(js.Any.fromFunction2((t0: /* payload */ js.Object, t1: /* state */ js.Object) => afterEach(t0, t1).runNow()))
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (beforeEach != null) __obj.updateDynamic("beforeEach")(js.Any.fromFunction2((t0: /* payload */ js.Object, t1: /* state */ js.Object) => beforeEach(t0, t1).runNow()))
    if (bindAction != null) __obj.updateDynamic("bindAction")(js.Any.fromFunction2((t0: /* action */ typingsJapgolly.alt.AltJS.Action[js.Any], t1: /* handler */ typingsJapgolly.alt.AltJS.ActionHandler) => bindAction(t0, t1).runNow()))
    if (bindActions != null) __obj.updateDynamic("bindActions")(js.Any.fromFunction1((t0: /* actions */ typingsJapgolly.alt.AltJS.ActionsClass) => bindActions(t0).runNow()))
    if (bindListeners != null) __obj.updateDynamic("bindListeners")(js.Any.fromFunction1((t0: /* config */ org.scalablytyped.runtime.StringDictionary[typingsJapgolly.alt.AltJS.Action[js.Any] | typingsJapgolly.alt.AltJS.Actions]) => bindListeners(t0).runNow()))
    if (dispatcher != null) __obj.updateDynamic("dispatcher")(dispatcher.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    emitChange.foreach(p => __obj.updateDynamic("emitChange")(p.toJsFn))
    if (exportAsync != null) __obj.updateDynamic("exportAsync")(js.Any.fromFunction1((t0: /* source */ typingsJapgolly.alt.AltJS.Source) => exportAsync(t0).runNow()))
    if (exportPublicMethods != null) __obj.updateDynamic("exportPublicMethods")(js.Any.fromFunction1((t0: /* exportConfig */ js.Any) => exportPublicMethods(t0).runNow()))
    getInstance.foreach(p => __obj.updateDynamic("getInstance")(p.toJsFn))
    getState.foreach(p => __obj.updateDynamic("getState")(p.toJsFn))
    if (observe != null) __obj.updateDynamic("observe")(js.Any.fromFunction1((t0: /* alt */ typingsJapgolly.alt.AltJS.Alt) => observe(t0).runNow()))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.alt.AltJS.lifeCycleEvents, t1: /* callback */ js.Function0[js.Any]) => on(t0, t1).runNow()))
    if (onDeserialize != null) __obj.updateDynamic("onDeserialize")(js.Any.fromFunction1((t0: /* fn */ js.Function1[/* data */ js.Any, js.Any]) => onDeserialize(t0).runNow()))
    if (onSerialize != null) __obj.updateDynamic("onSerialize")(js.Any.fromFunction1((t0: /* fn */ js.Function1[/* data */ js.Any, js.Any]) => onSerialize(t0).runNow()))
    if (otherwise != null) __obj.updateDynamic("otherwise")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* action */ typingsJapgolly.alt.AltJS.Action[js.Any]) => otherwise(t0, t1).runNow()))
    preventDefault.foreach(p => __obj.updateDynamic("preventDefault")(p.toJsFn))
    if (reduce != null) __obj.updateDynamic("reduce")(js.Any.fromFunction2((t0: /* state */ js.Any, t1: /* config */ typingsJapgolly.alt.AltJS.StoreReduce) => reduce(t0, t1).runNow()))
    if (registerAsync != null) __obj.updateDynamic("registerAsync")(js.Any.fromFunction1((t0: /* datasource */ typingsJapgolly.alt.AltJS.Source) => registerAsync(t0).runNow()))
    if (setState != null) __obj.updateDynamic("setState")(setState.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreModel[S]]
  }
}

