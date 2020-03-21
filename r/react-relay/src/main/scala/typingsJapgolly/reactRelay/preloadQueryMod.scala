package typingsJapgolly.reactRelay

import typingsJapgolly.reactRelay.entryPointTypesMod.PreloadOptions
import typingsJapgolly.reactRelay.entryPointTypesMod.PreloadableConcreteRequest
import typingsJapgolly.reactRelay.entryPointTypesMod.PreloadedQuery
import typingsJapgolly.relayRuntime.relayRuntimeTypesMod.OperationType
import typingsJapgolly.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/preloadQuery", JSImport.Namespace)
@js.native
object preloadQueryMod extends js.Object {
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: Null,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: PreloadOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
  @JSName("preloadQuery")
  def preloadQuery_variables[TQuery /* <: OperationType */, TEnvironmentProviderOptions](
    environment: Environment,
    preloadableRequest: PreloadableConcreteRequest[TQuery],
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: PreloadOptions,
    environmentProviderOptions: TEnvironmentProviderOptions
  ): PreloadedQuery[TQuery, TEnvironmentProviderOptions] = js.native
}

