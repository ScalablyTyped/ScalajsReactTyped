package typingsJapgolly.aframe

import japgolly.scalajs.react.Callback
import typingsJapgolly.aframe.mod.Component
import typingsJapgolly.aframe.mod.Entity
import typingsJapgolly.aframe.mod.ObjectMap
import typingsJapgolly.aframe.mod.Schema_
import typingsJapgolly.aframe.mod.System
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<aframe.aframe.Component<any, aframe.aframe.System<any>>> */
trait PartialComponentanySystem extends js.Object {
  var attrName: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dependencies: js.UndefOr[js.Array[String]] = js.undefined
  var el: js.UndefOr[Entity[ObjectMap[Component[_, System[_]]]]] = js.undefined
  var extendSchema: js.UndefOr[js.Function1[/* update */ Schema_[js.Object], Unit]] = js.undefined
  var flushToDOM: js.UndefOr[js.Function0[Unit]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var init: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pause: js.UndefOr[js.Function0[Unit]] = js.undefined
  var play: js.UndefOr[js.Function0[Unit]] = js.undefined
  var remove: js.UndefOr[js.Function0[Unit]] = js.undefined
  var schema: js.UndefOr[Schema_[_]] = js.undefined
  var system: js.UndefOr[System[_]] = js.undefined
  var tick: js.UndefOr[js.Function2[/* time */ Double, /* timeDelta */ Double, Unit]] = js.undefined
  var update: js.UndefOr[js.Function1[/* oldData */ js.Any, Unit]] = js.undefined
  var updateSchema: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object PartialComponentanySystem {
  @scala.inline
  def apply(
    attrName: String = null,
    data: js.Any = null,
    dependencies: js.Array[String] = null,
    el: Entity[ObjectMap[Component[_, System[_]]]] = null,
    extendSchema: /* update */ Schema_[js.Object] => Callback = null,
    flushToDOM: js.UndefOr[Callback] = js.undefined,
    id: String = null,
    init: /* data */ js.UndefOr[js.Any] => Callback = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pause: js.UndefOr[Callback] = js.undefined,
    play: js.UndefOr[Callback] = js.undefined,
    remove: js.UndefOr[Callback] = js.undefined,
    schema: Schema_[_] = null,
    system: System[_] = null,
    tick: (/* time */ Double, /* timeDelta */ Double) => Callback = null,
    update: /* oldData */ js.Any => Callback = null,
    updateSchema: js.UndefOr[Callback] = js.undefined
  ): PartialComponentanySystem = {
    val __obj = js.Dynamic.literal()
    if (attrName != null) __obj.updateDynamic("attrName")(attrName.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (extendSchema != null) __obj.updateDynamic("extendSchema")(js.Any.fromFunction1((t0: /* update */ typingsJapgolly.aframe.mod.Schema_[js.Object]) => extendSchema(t0).runNow()))
    flushToDOM.foreach(p => __obj.updateDynamic("flushToDOM")(p.toJsFn))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* data */ js.UndefOr[js.Any]) => init(t0).runNow()))
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    pause.foreach(p => __obj.updateDynamic("pause")(p.toJsFn))
    play.foreach(p => __obj.updateDynamic("play")(p.toJsFn))
    remove.foreach(p => __obj.updateDynamic("remove")(p.toJsFn))
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (tick != null) __obj.updateDynamic("tick")(js.Any.fromFunction2((t0: /* time */ scala.Double, t1: /* timeDelta */ scala.Double) => tick(t0, t1).runNow()))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1((t0: /* oldData */ js.Any) => update(t0).runNow()))
    updateSchema.foreach(p => __obj.updateDynamic("updateSchema")(p.toJsFn))
    __obj.asInstanceOf[PartialComponentanySystem]
  }
}

