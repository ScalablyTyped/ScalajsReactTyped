package typingsJapgolly.polymerTs.polymer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var attributeChanged: js.UndefOr[
    js.Function3[/* attrName */ String, /* oldVal */ js.Any, /* newVal */ js.Any, Unit]
  ] = js.undefined
  var behaviors: js.UndefOr[js.Array[js.Object]] = js.undefined
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var factoryImpl: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var listeners: js.UndefOr[js.Object] = js.undefined
  var observers: js.UndefOr[js.Array[String]] = js.undefined
  var properties: js.UndefOr[js.Object] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Element {
  @scala.inline
  def apply(
    attached: js.UndefOr[Callback] = js.undefined,
    attributeChanged: (/* attrName */ String, /* oldVal */ js.Any, /* newVal */ js.Any) => Callback = null,
    behaviors: js.Array[js.Object] = null,
    created: js.UndefOr[Callback] = js.undefined,
    detached: js.UndefOr[Callback] = js.undefined,
    factoryImpl: /* repeated */ js.Any => Callback = null,
    listeners: js.Object = null,
    observers: js.Array[String] = null,
    properties: js.Object = null,
    ready: js.UndefOr[Callback] = js.undefined
  ): Element = {
    val __obj = js.Dynamic.literal()
    attached.foreach(p => __obj.updateDynamic("attached")(p.toJsFn))
    if (attributeChanged != null) __obj.updateDynamic("attributeChanged")(js.Any.fromFunction3((t0: /* attrName */ java.lang.String, t1: /* oldVal */ js.Any, t2: /* newVal */ js.Any) => attributeChanged(t0, t1, t2).runNow()))
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors.asInstanceOf[js.Any])
    created.foreach(p => __obj.updateDynamic("created")(p.toJsFn))
    detached.foreach(p => __obj.updateDynamic("detached")(p.toJsFn))
    if (factoryImpl != null) __obj.updateDynamic("factoryImpl")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => factoryImpl(t0).runNow()))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (observers != null) __obj.updateDynamic("observers")(observers.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    ready.foreach(p => __obj.updateDynamic("ready")(p.toJsFn))
    __obj.asInstanceOf[Element]
  }
}

