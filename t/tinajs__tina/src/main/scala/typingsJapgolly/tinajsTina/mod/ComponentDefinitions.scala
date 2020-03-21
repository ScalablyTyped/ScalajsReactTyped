package typingsJapgolly.tinajsTina.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tinajsTina.PartialComponentDefinitioCompute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDefinitions extends ComponentLifecycles {
  var data: StringDictionary[js.Any]
  var methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]]
  var mixins: js.Array[PartialComponentDefinitioCompute]
  var properties: ComponentProperties
  def compute(data: StringDictionary[js.Any]): StringDictionary[js.Any]
}

object ComponentDefinitions {
  @scala.inline
  def apply(
    attached: Callback,
    compute: StringDictionary[js.Any] => CallbackTo[StringDictionary[js.Any]],
    created: Callback,
    data: StringDictionary[js.Any],
    detached: Callback,
    methods: StringDictionary[js.ThisFunction1[/* this */ Component, /* repeated */ js.Any, _]],
    mixins: js.Array[PartialComponentDefinitioCompute],
    moved: Callback,
    properties: ComponentProperties,
    ready: Callback
  ): ComponentDefinitions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("attached")(attached.toJsFn)
    __obj.updateDynamic("compute")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Any]) => compute(t0).runNow()))
    __obj.updateDynamic("created")(created.toJsFn)
    __obj.updateDynamic("detached")(detached.toJsFn)
    __obj.updateDynamic("moved")(moved.toJsFn)
    __obj.updateDynamic("ready")(ready.toJsFn)
    __obj.asInstanceOf[ComponentDefinitions]
  }
}

