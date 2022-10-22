package typingsJapgolly.reactRelay

import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.EnvironmentProviderOptions
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.IEnvironmentProvider
import typingsJapgolly.reactRelay.relayHooksEntryPointTypesMod.PreloadedEntryPoint
import typingsJapgolly.reactRelay.relayHooksHelpersMod.GetEntryPointComponentFromEntryPoint
import typingsJapgolly.reactRelay.relayHooksHelpersMod.GetEntryPointParamsFromEntryPoint
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksLoadEntryPointMod {
  
  @JSImport("react-relay/relay-hooks/loadEntryPoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadEntryPoint[TEntryPoint](
    environmentProvider: IEnvironmentProvider[EnvironmentProviderOptions[Record[String, Any]]],
    entryPoint: TEntryPoint,
    entryPointParams: GetEntryPointParamsFromEntryPoint[TEntryPoint]
  ): PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadEntryPoint")(environmentProvider.asInstanceOf[js.Any], entryPoint.asInstanceOf[js.Any], entryPointParams.asInstanceOf[js.Any])).asInstanceOf[PreloadedEntryPoint[GetEntryPointComponentFromEntryPoint[TEntryPoint]]]
}
