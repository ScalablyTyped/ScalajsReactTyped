package typingsJapgolly.chrome.global.chrome

import typingsJapgolly.chrome.chrome.events.Event
import typingsJapgolly.chrome.chrome.system.cpu.CpuInfo
import typingsJapgolly.chrome.chrome.system.display.Bounds
import typingsJapgolly.chrome.chrome.system.display.DisplayInfo
import typingsJapgolly.chrome.chrome.system.display.DisplayInfoFlags
import typingsJapgolly.chrome.chrome.system.display.DisplayLayout
import typingsJapgolly.chrome.chrome.system.display.DisplayPropertiesInfo
import typingsJapgolly.chrome.chrome.system.display.Insets
import typingsJapgolly.chrome.chrome.system.display.MirrorModeInfo
import typingsJapgolly.chrome.chrome.system.display.MirrorModeInfoMixed
import typingsJapgolly.chrome.chrome.system.display.TouchCalibrationPairs
import typingsJapgolly.chrome.chrome.system.memory.MemoryInfo
import typingsJapgolly.chrome.chrome.system.storage.StorageCapacityInfo
import typingsJapgolly.chrome.chrome.system.storage.StorageUnitInfo
import typingsJapgolly.chrome.chrome.system.storage.SystemStorageAttachedEvent
import typingsJapgolly.chrome.chrome.system.storage.SystemStorageDetachedEvent
import typingsJapgolly.chrome.chromeStrings.bottom
import typingsJapgolly.chrome.chromeStrings.left
import typingsJapgolly.chrome.chromeStrings.mixed
import typingsJapgolly.chrome.chromeStrings.normal
import typingsJapgolly.chrome.chromeStrings.off
import typingsJapgolly.chrome.chromeStrings.right
import typingsJapgolly.chrome.chromeStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object system {
  
  ////////////////////
  // System CPU
  ////////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: "system.cpu"
    * @since Chrome 32.
    */
  object cpu {
    
    @JSGlobal("chrome.system.cpu")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInfo(): js.Promise[CpuInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")().asInstanceOf[js.Promise[CpuInfo]]
    inline def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  ////////////////////
  // System Display //
  ////////////////////
  /**
    * Use the system.display API to query display metadata.
    * Permissions: 'system.display'
    * @since Chrome 30.
    */
  object display {
    
    @JSGlobal("chrome.system.display")
    @js.native
    val ^ : js.Any = js.native
    
    object DisplayPosition {
      
      @JSGlobal("chrome.system.display.DisplayPosition")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.system.display.DisplayPosition.BOTTOM")
      @js.native
      def BOTTOM: bottom = js.native
      inline def BOTTOM_=(x: bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.DisplayPosition.LEFT")
      @js.native
      def LEFT: left = js.native
      inline def LEFT_=(x: left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.DisplayPosition.RIGHT")
      @js.native
      def RIGHT: right = js.native
      inline def RIGHT_=(x: right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.DisplayPosition.TOP")
      @js.native
      def TOP: top = js.native
      inline def TOP_=(x: top): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOP")(x.asInstanceOf[js.Any])
    }
    
    object MirrorMode {
      
      @JSGlobal("chrome.system.display.MirrorMode")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("chrome.system.display.MirrorMode.MIXED")
      @js.native
      def MIXED: mixed = js.native
      inline def MIXED_=(x: mixed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIXED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.MirrorMode.NORMAL")
      @js.native
      def NORMAL: normal = js.native
      inline def NORMAL_=(x: normal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
      
      @JSGlobal("chrome.system.display.MirrorMode.OFF")
      @js.native
      def OFF: off = js.native
      inline def OFF_=(x: off): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFF")(x.asInstanceOf[js.Any])
    }
    
    inline def clearTouchCalibration(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTouchCalibration")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def completeCustomTouchCalibration(pairs: TouchCalibrationPairs, bounds: Bounds): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("completeCustomTouchCalibration")(pairs.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def enableUnifiedDesktop(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableUnifiedDesktop")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getDisplayLayout(): js.Promise[js.Array[DisplayLayout]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLayout")().asInstanceOf[js.Promise[js.Array[DisplayLayout]]]
    inline def getDisplayLayout(callback: js.Function1[/* layouts */ js.Array[DisplayLayout], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLayout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getInfo(): js.Promise[js.Array[DisplayInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")().asInstanceOf[js.Promise[js.Array[DisplayInfo]]]
    inline def getInfo(callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def getInfo(flags: DisplayInfoFlags): js.Promise[js.Array[DisplayInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(flags.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[DisplayInfo]]]
    inline def getInfo(flags: DisplayInfoFlags, callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("chrome.system.display.onDisplayChanged")
    @js.native
    val onDisplayChanged: Event[js.Function0[Unit]] = js.native
    
    inline def overscanCalibrationAdjust(id: String, delta: Insets): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("overscanCalibrationAdjust")(id.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def overscanCalibrationComplete(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overscanCalibrationComplete")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def overscanCalibrationReset(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overscanCalibrationReset")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def overscanCalibrationStart(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overscanCalibrationStart")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setDisplayLayout(layouts: js.Array[DisplayLayout]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayLayout")(layouts.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setDisplayLayout(layouts: js.Array[DisplayLayout], callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayLayout")(layouts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setDisplayLayout_Promise(layouts: js.Array[DisplayLayout]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayLayout")(layouts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    inline def setDisplayProperties(id: String, info: DisplayPropertiesInfo): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayProperties")(id.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setDisplayProperties(id: String, info: DisplayPropertiesInfo, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayProperties")(id.asInstanceOf[js.Any], info.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setDisplayProperties_Promise(id: String, info: DisplayPropertiesInfo): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setDisplayProperties")(id.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def setMirrorMode(info: MirrorModeInfo): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setMirrorMode")(info.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def setMirrorMode(info: MirrorModeInfoMixed): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setMirrorMode")(info.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def setMirrorMode(info: MirrorModeInfoMixed, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMirrorMode")(info.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setMirrorMode(info: MirrorModeInfo, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setMirrorMode")(info.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def showNativeTouchCalibration(id: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("showNativeTouchCalibration")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    inline def showNativeTouchCalibration(id: String, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showNativeTouchCalibration")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def startCustomTouchCalibration(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startCustomTouchCalibration")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  ////////////////////
  // System Memory
  ////////////////////
  /**
    * The chrome.system.memory API.
    * Permissions:  "system.memory"
    * @since Chrome 32.
    */
  object memory {
    
    @JSGlobal("chrome.system.memory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getInfo(): js.Promise[MemoryInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")().asInstanceOf[js.Promise[MemoryInfo]]
    inline def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  ////////////////////
  // System Storage
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * Permissions:  "system.storage"
    * @since Chrome 30.
    */
  object storage {
    
    @JSGlobal("chrome.system.storage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ejectDevice(id: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ejectDevice")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    inline def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ejectDevice")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getAvailableCapacity(id: String): js.Promise[StorageCapacityInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableCapacity")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StorageCapacityInfo]]
    inline def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getAvailableCapacity")(id.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getInfo(): js.Promise[js.Array[StorageUnitInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")().asInstanceOf[js.Promise[js.Array[StorageUnitInfo]]]
    inline def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("chrome.system.storage.onAttached")
    @js.native
    def onAttached: SystemStorageAttachedEvent = js.native
    inline def onAttached_=(x: SystemStorageAttachedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAttached")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.system.storage.onDetached")
    @js.native
    def onDetached: SystemStorageDetachedEvent = js.native
    inline def onDetached_=(x: SystemStorageDetachedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onDetached")(x.asInstanceOf[js.Any])
  }
}
