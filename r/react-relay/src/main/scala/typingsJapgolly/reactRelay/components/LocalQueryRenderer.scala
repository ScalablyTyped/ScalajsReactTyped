package typingsJapgolly.reactRelay.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactRelay.anon.Error
import typingsJapgolly.reactRelay.legacyMod.QueryRendererProps
import typingsJapgolly.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typingsJapgolly.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typingsJapgolly.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocalQueryRenderer {
  
  inline def apply[TOperation /* <: OperationType */](
    environment: Environment,
    render: Error[TOperation] => Node,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  ): Builder[TOperation] = {
    val __props = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
    new Builder[TOperation](js.Array(this.component, __props.asInstanceOf[QueryRendererProps[TOperation]]))
  }
  
  @JSImport("react-relay", "LocalQueryRenderer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[TOperation /* <: OperationType */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactRelay.mod.LocalQueryRenderer[TOperation]] {
    
    inline def query(value: GraphQLTaggedNode): this.type = set("query", value.asInstanceOf[js.Any])
    
    inline def queryCallbackTo(value: CallbackTo[ReaderFragment | ConcreteRequest]): this.type = set("query", value.toJsFn)
    
    inline def queryNull: this.type = set("query", null)
  }
  
  def withProps[TOperation /* <: OperationType */](p: QueryRendererProps[TOperation]): Builder[TOperation] = new Builder[TOperation](js.Array(this.component, p.asInstanceOf[js.Any]))
}
