package typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod

import typingsJapgolly.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.VariablesOf
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Readonly<{  parameters :relay-runtime.relay-runtime.ConcreteRequest | react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadableConcreteRequest<TQuery>,   variables :relay-runtime.relay-runtime.VariablesOf<TQuery>,   options :react-relay.react-relay/relay-hooks/EntryPointTypes.PreloadOptions | null | undefined,   environmentProviderOptions :TEnvironmentProviderOptions | null | undefined}> */
trait ThinQueryParams[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */] extends StObject {
  
  val environmentProviderOptions: js.UndefOr[TEnvironmentProviderOptions | Null] = js.undefined
  
  val options: js.UndefOr[PreloadOptions | Null] = js.undefined
  
  val parameters: ConcreteRequest | PreloadableConcreteRequest[TQuery]
  
  val variables: VariablesOf[TQuery]
}
object ThinQueryParams {
  
  inline def apply[TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](parameters: ConcreteRequest | PreloadableConcreteRequest[TQuery], variables: VariablesOf[TQuery]): ThinQueryParams[TQuery, TEnvironmentProviderOptions] = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThinQueryParams[TQuery, TEnvironmentProviderOptions]]
  }
  
  extension [Self <: ThinQueryParams[?, ?], TQuery /* <: OperationType */, TEnvironmentProviderOptions /* <: EnvironmentProviderOptions[Record[String, Any]] */](x: Self & (ThinQueryParams[TQuery, TEnvironmentProviderOptions])) {
    
    inline def setEnvironmentProviderOptions(value: TEnvironmentProviderOptions): Self = StObject.set(x, "environmentProviderOptions", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentProviderOptionsNull: Self = StObject.set(x, "environmentProviderOptions", null)
    
    inline def setEnvironmentProviderOptionsUndefined: Self = StObject.set(x, "environmentProviderOptions", js.undefined)
    
    inline def setOptions(value: PreloadOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setParameters(value: ConcreteRequest | PreloadableConcreteRequest[TQuery]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setVariables(value: VariablesOf[TQuery]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
