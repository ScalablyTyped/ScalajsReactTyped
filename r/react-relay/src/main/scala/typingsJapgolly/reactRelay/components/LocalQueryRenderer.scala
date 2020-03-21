package typingsJapgolly.reactRelay.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRelay.AnonError
import typingsJapgolly.reactRelay.mod.QueryRendererProps
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocalQueryRenderer {
  def apply[TOperation /* <: OperationType */](
    environment: Environment,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any,
    render: AnonError[TOperation] => CallbackTo[Node],
    query: GraphQLTaggedNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    QueryRendererProps[TOperation], 
    typingsJapgolly.reactRelay.mod.LocalQueryRenderer[TOperation], 
    Unit, 
    QueryRendererProps[TOperation]
  ] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
      __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactRelay.AnonError[TOperation]) => render(t0).runNow()))
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRelay.mod.QueryRendererProps[TOperation], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRelay.mod.LocalQueryRenderer[TOperation]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRelay.mod.QueryRendererProps[TOperation]])(children: _*)
  }
  @JSImport("react-relay", "LocalQueryRenderer")
  @js.native
  object componentImport extends js.Object
  
}

