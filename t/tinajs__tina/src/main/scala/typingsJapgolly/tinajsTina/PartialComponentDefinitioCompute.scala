package typingsJapgolly.tinajsTina

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tinajsTina.mod.Component
import typingsJapgolly.tinajsTina.mod.ComponentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@tinajs/tina.@tinajs/tina.ComponentDefinitions> */
trait PartialComponentDefinitioCompute extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var compute: js.UndefOr[js.Function1[/* data */ StringDictionary[js.Any], StringDictionary[_]]] = js.undefined
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  var data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var methods: js.UndefOr[
    StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
  ] = js.undefined
  var mixins: js.UndefOr[js.Array[PartialComponentDefinitioAttached]] = js.undefined
  var moved: js.UndefOr[js.Function0[Unit]] = js.undefined
  var properties: js.UndefOr[ComponentProperties] = js.undefined
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialComponentDefinitioCompute {
  @scala.inline
  def apply(
    attached: js.UndefOr[Callback] = js.undefined,
    compute: /* data */ StringDictionary[js.Any] => CallbackTo[StringDictionary[js.Any]] = null,
    created: js.UndefOr[Callback] = js.undefined,
    data: StringDictionary[js.Any] = null,
    detached: js.UndefOr[Callback] = js.undefined,
    methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]] = null,
    mixins: js.Array[PartialComponentDefinitioAttached] = null,
    moved: js.UndefOr[Callback] = js.undefined,
    properties: ComponentProperties = null,
    ready: js.UndefOr[Callback] = js.undefined
  ): PartialComponentDefinitioCompute = {
    val __obj = js.Dynamic.literal()
    attached.foreach(p => __obj.updateDynamic("attached")(p.toJsFn))
    if (compute != null) __obj.updateDynamic("compute")(js.Any.fromFunction1((t0: /* data */ org.scalablytyped.runtime.StringDictionary[js.Any]) => compute(t0).runNow()))
    created.foreach(p => __obj.updateDynamic("created")(p.toJsFn))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    detached.foreach(p => __obj.updateDynamic("detached")(p.toJsFn))
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    moved.foreach(p => __obj.updateDynamic("moved")(p.toJsFn))
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    ready.foreach(p => __obj.updateDynamic("ready")(p.toJsFn))
    __obj.asInstanceOf[PartialComponentDefinitioCompute]
  }
}

