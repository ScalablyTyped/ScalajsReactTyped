package typingsJapgolly.reactAdaptiveHooks

import typingsJapgolly.reactAdaptiveHooks.anon.EffectiveConnectionType
import typingsJapgolly.reactAdaptiveHooks.anon.MediaCapabilities
import typingsJapgolly.reactAdaptiveHooks.anon.NumberOfLogicalProcessors
import typingsJapgolly.reactAdaptiveHooks.anon.SaveData
import typingsJapgolly.reactAdaptiveHooks.anon.Unsupported
import typingsJapgolly.reactAdaptiveHooks.anon.unsupportedfalseMemorySta
import typingsJapgolly.reactAdaptiveHooks.mediaCapabilitiesMod.MediaConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-adaptive-hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useHardwareConcurrency(): NumberOfLogicalProcessors = ^.asInstanceOf[js.Dynamic].applyDynamic("useHardwareConcurrency")().asInstanceOf[NumberOfLogicalProcessors]
  
  inline def useMediaCapabilities[T](mediaConfig: MediaConfiguration, initialMediaCapabilities: T): MediaCapabilities[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaCapabilities")(mediaConfig.asInstanceOf[js.Any], initialMediaCapabilities.asInstanceOf[js.Any])).asInstanceOf[MediaCapabilities[T]]
  
  inline def useMemoryStatus[T](): (Unsupported & T) | unsupportedfalseMemorySta = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoryStatus")().asInstanceOf[(Unsupported & T) | unsupportedfalseMemorySta]
  inline def useMemoryStatus[T](initialMemoryStatus: T): (Unsupported & T) | unsupportedfalseMemorySta = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoryStatus")(initialMemoryStatus.asInstanceOf[js.Any]).asInstanceOf[(Unsupported & T) | unsupportedfalseMemorySta]
  
  inline def useNetworkStatus(): EffectiveConnectionType = ^.asInstanceOf[js.Dynamic].applyDynamic("useNetworkStatus")().asInstanceOf[EffectiveConnectionType]
  inline def useNetworkStatus(
    initialEffectiveConnectionType: typingsJapgolly.reactAdaptiveHooks.networkMod.EffectiveConnectionType
  ): EffectiveConnectionType = ^.asInstanceOf[js.Dynamic].applyDynamic("useNetworkStatus")(initialEffectiveConnectionType.asInstanceOf[js.Any]).asInstanceOf[EffectiveConnectionType]
  
  inline def useSaveData(): SaveData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSaveData")().asInstanceOf[SaveData]
  inline def useSaveData(initialSaveDataStatus: Boolean): SaveData = ^.asInstanceOf[js.Dynamic].applyDynamic("useSaveData")(initialSaveDataStatus.asInstanceOf[js.Any]).asInstanceOf[SaveData]
}
