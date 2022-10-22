package typingsJapgolly.playable

import typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamDeliveryPriority
import typingsJapgolly.playable.distSrcConstantsMediaStreamMod.MediaStreamType
import typingsJapgolly.playable.distSrcModulesPlaybackEngineOutputNativeAdaptersTypesMod.IPlaybackAdapterClass
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPlaybackEngineOutputNativeAdaptersNativeMod {
  
  @JSImport("playable/dist/src/modules/playback-engine/output/native/adapters/native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(streamType: MediaStreamType, deliveryPriority: MediaStreamDeliveryPriority): IPlaybackAdapterClass = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(streamType.asInstanceOf[js.Any], deliveryPriority.asInstanceOf[js.Any])).asInstanceOf[IPlaybackAdapterClass]
}
