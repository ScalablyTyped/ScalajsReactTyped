package typingsJapgolly.reactRelay

import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.EnvironmentProviderOptions
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.IEnvironmentProvider
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.PreloadedEntryPoint
import typingsJapgolly.reactRelay.relayHooksHelpersMod.GetEntryPointComponentFromEntryPoint
import typingsJapgolly.reactRelay.relayHooksHelpersMod.GetEntryPointParamsFromEntryPoint
import typingsJapgolly.relayRuntime.libUtilRelayRuntimeTypesMod.DisposeFn
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseEntryPointLoaderMod {
  
  @JSImport("react-relay/relay-hooks/useEntryPointLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useEntryPointLoader[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, Any]]],
    entryPoint: TEntryPoint
  ): UseEntryPointLoaderHookType[TEntryPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("useEntryPointLoader")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any])).asInstanceOf[UseEntryPointLoaderHookType[TEntryPoint]]
  
  type UseEntryPointLoaderHookType[TEntryPoint] = js.Tuple3[
    js.UndefOr[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] | Null], 
    js.Function1[/* entryPointParams */ GetEntryPointParamsFromEntryPoint[TEntryPoint], Unit], 
    DisposeFn
  ]
}
