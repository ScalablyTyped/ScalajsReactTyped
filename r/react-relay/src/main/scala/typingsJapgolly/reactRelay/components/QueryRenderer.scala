package typingsJapgolly.reactRelay.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRelay.AnonCacheConfig
import typingsJapgolly.reactRelay.AnonError
import typingsJapgolly.reactRelay.mod.FetchPolicy
import typingsJapgolly.reactRelay.mod.QueryRendererProps
import typingsJapgolly.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object QueryRenderer {
  def apply[TOperation /* <: OperationType */](
    environment: Environment,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any,
    render: AnonError[TOperation] => CallbackTo[Node],
    cacheConfig: CacheConfig = null,
    fetchPolicy: FetchPolicy = null,
    query: GraphQLTaggedNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AnonCacheConfig with QueryRendererProps[TOperation], 
    typingsJapgolly.reactRelay.mod.QueryRenderer[TOperation], 
    Unit, 
    AnonCacheConfig with QueryRendererProps[TOperation]
  ] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
      __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactRelay.AnonError[TOperation]) => render(t0).runNow()))
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRelay.AnonCacheConfig with typingsJapgolly.reactRelay.mod.QueryRendererProps[TOperation], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRelay.mod.QueryRenderer[TOperation]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRelay.AnonCacheConfig with typingsJapgolly.reactRelay.mod.QueryRendererProps[TOperation]])(children: _*)
  }
  @JSImport("react-relay", "QueryRenderer")
  @js.native
  object componentImport extends js.Object
  
}

