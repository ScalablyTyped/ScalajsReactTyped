package typingsJapgolly.trtcJsSdk

import org.scalajs.dom.MediaDeviceInfo
import typingsJapgolly.trtcJsSdk.mod.CheckResult
import typingsJapgolly.trtcJsSdk.mod.Client
import typingsJapgolly.trtcJsSdk.mod.ClientConfig
import typingsJapgolly.trtcJsSdk.mod.LocalStream
import typingsJapgolly.trtcJsSdk.mod.StreamConfig
import typingsJapgolly.trtcJsSdk.trtcJsSdkInts.`0`
import typingsJapgolly.trtcJsSdk.trtcJsSdkInts.`1`
import typingsJapgolly.trtcJsSdk.trtcJsSdkInts.`2`
import typingsJapgolly.trtcJsSdk.trtcJsSdkInts.`3`
import typingsJapgolly.trtcJsSdk.trtcJsSdkInts.`4`
import typingsJapgolly.trtcJsSdk.trtcJsSdkInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object TRTC {
    
    @JSGlobal("TRTC")
    @js.native
    val ^ : js.Any = js.native
    
    object Logger {
      
      @JSGlobal("TRTC.Logger")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("TRTC.Logger.LogLevel")
      @js.native
      val LogLevel: typingsJapgolly.trtcJsSdk.mod.Logger.LogLevel = js.native
      
      /** 关闭日志上传 */
      inline def disableUploadLog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableUploadLog")().asInstanceOf[Unit]
      
      /** 打开日志上传 */
      inline def enableUploadLog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableUploadLog")().asInstanceOf[Unit]
      
      /**
        * 设置日志输出等级
        * @example
        * ```javascript
        * // 输出INFO以上日志等级
        * TRTC.Logger.setLogLevel(TRTC.Logger.LogLevel.INFO);
        * ```
        */
      inline def setLogLevel(level: `0` | `1` | `2` | `3` | `4` | `5`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("TRTC.VERSION")
    @js.native
    val VERSION: String = js.native
    
    inline def checkSystemRequirements(): js.Promise[CheckResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSystemRequirements")().asInstanceOf[js.Promise[CheckResult]]
    
    inline def createClient(config: ClientConfig): Client = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(config.asInstanceOf[js.Any]).asInstanceOf[Client]
    
    inline def createStream(config: StreamConfig): LocalStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(config.asInstanceOf[js.Any]).asInstanceOf[LocalStream]
    
    inline def getCameras(): js.Promise[js.Array[MediaDeviceInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCameras")().asInstanceOf[js.Promise[js.Array[MediaDeviceInfo]]]
    
    inline def getDevices(): js.Promise[js.Array[MediaDeviceInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDevices")().asInstanceOf[js.Promise[js.Array[MediaDeviceInfo]]]
    
    inline def getMicrophones(): js.Promise[js.Array[MediaDeviceInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMicrophones")().asInstanceOf[js.Promise[js.Array[MediaDeviceInfo]]]
    
    inline def getSpeakers(): js.Promise[js.Array[MediaDeviceInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpeakers")().asInstanceOf[js.Promise[js.Array[MediaDeviceInfo]]]
    
    inline def isScreenShareSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScreenShareSupported")().asInstanceOf[Boolean]
  }
}
