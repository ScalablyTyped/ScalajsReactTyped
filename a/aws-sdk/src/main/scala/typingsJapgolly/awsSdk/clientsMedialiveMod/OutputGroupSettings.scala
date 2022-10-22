package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputGroupSettings extends StObject {
  
  var ArchiveGroupSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.ArchiveGroupSettings] = js.undefined
  
  var FrameCaptureGroupSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.FrameCaptureGroupSettings] = js.undefined
  
  var HlsGroupSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.HlsGroupSettings] = js.undefined
  
  var MediaPackageGroupSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.MediaPackageGroupSettings] = js.undefined
  
  var MsSmoothGroupSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.MsSmoothGroupSettings] = js.undefined
  
  var MultiplexGroupSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.MultiplexGroupSettings] = js.undefined
  
  var RtmpGroupSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.RtmpGroupSettings] = js.undefined
  
  var UdpGroupSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsMedialiveMod.UdpGroupSettings] = js.undefined
}
object OutputGroupSettings {
  
  inline def apply(): OutputGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroupSettings]
  }
  
  extension [Self <: OutputGroupSettings](x: Self) {
    
    inline def setArchiveGroupSettings(value: ArchiveGroupSettings): Self = StObject.set(x, "ArchiveGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setArchiveGroupSettingsUndefined: Self = StObject.set(x, "ArchiveGroupSettings", js.undefined)
    
    inline def setFrameCaptureGroupSettings(value: FrameCaptureGroupSettings): Self = StObject.set(x, "FrameCaptureGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setFrameCaptureGroupSettingsUndefined: Self = StObject.set(x, "FrameCaptureGroupSettings", js.undefined)
    
    inline def setHlsGroupSettings(value: HlsGroupSettings): Self = StObject.set(x, "HlsGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsGroupSettingsUndefined: Self = StObject.set(x, "HlsGroupSettings", js.undefined)
    
    inline def setMediaPackageGroupSettings(value: MediaPackageGroupSettings): Self = StObject.set(x, "MediaPackageGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setMediaPackageGroupSettingsUndefined: Self = StObject.set(x, "MediaPackageGroupSettings", js.undefined)
    
    inline def setMsSmoothGroupSettings(value: MsSmoothGroupSettings): Self = StObject.set(x, "MsSmoothGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setMsSmoothGroupSettingsUndefined: Self = StObject.set(x, "MsSmoothGroupSettings", js.undefined)
    
    inline def setMultiplexGroupSettings(value: MultiplexGroupSettings): Self = StObject.set(x, "MultiplexGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setMultiplexGroupSettingsUndefined: Self = StObject.set(x, "MultiplexGroupSettings", js.undefined)
    
    inline def setRtmpGroupSettings(value: RtmpGroupSettings): Self = StObject.set(x, "RtmpGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setRtmpGroupSettingsUndefined: Self = StObject.set(x, "RtmpGroupSettings", js.undefined)
    
    inline def setUdpGroupSettings(value: UdpGroupSettings): Self = StObject.set(x, "UdpGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setUdpGroupSettingsUndefined: Self = StObject.set(x, "UdpGroupSettings", js.undefined)
  }
}
