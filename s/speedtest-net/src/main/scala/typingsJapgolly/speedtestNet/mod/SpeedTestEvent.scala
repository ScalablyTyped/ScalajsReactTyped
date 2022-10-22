package typingsJapgolly.speedtestNet.mod

import typingsJapgolly.speedtestNet.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.speedtestNet.mod.ConfigEvent
  - typingsJapgolly.speedtestNet.mod.DownloadEvent
  - typingsJapgolly.speedtestNet.mod.LogEvent
  - typingsJapgolly.speedtestNet.mod.PingEvent
  - typingsJapgolly.speedtestNet.mod.ResultEvent
  - typingsJapgolly.speedtestNet.mod.TestStartEvent
  - typingsJapgolly.speedtestNet.mod.UploadEvent
*/
trait SpeedTestEvent extends StObject
object SpeedTestEvent {
  
  inline def ConfigEvent(app: AppData, progress: Double, servers: js.Array[ServerData], suite: SuiteData): typingsJapgolly.speedtestNet.mod.ConfigEvent = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], servers = servers.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("config")
    __obj.asInstanceOf[typingsJapgolly.speedtestNet.mod.ConfigEvent]
  }
  
  inline def DownloadEvent(download: DownloadUploadData, progress: Double, timestamp: js.Date): typingsJapgolly.speedtestNet.mod.DownloadEvent = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("download")
    __obj.asInstanceOf[typingsJapgolly.speedtestNet.mod.DownloadEvent]
  }
  
  inline def LogEvent(level: String, message: String, progress: Double, timestamp: js.Date): typingsJapgolly.speedtestNet.mod.LogEvent = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[typingsJapgolly.speedtestNet.mod.LogEvent]
  }
  
  inline def PingEvent(ping: PingData, progress: Double, timestamp: js.Date): typingsJapgolly.speedtestNet.mod.PingEvent = {
    val __obj = js.Dynamic.literal(ping = ping.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ping")
    __obj.asInstanceOf[typingsJapgolly.speedtestNet.mod.PingEvent]
  }
  
  inline def ResultEvent(
    download: DownloadUploadData,
    interface: InterfaceData,
    isp: String,
    packetLoss: Double,
    ping: PingData,
    result: Id,
    server: ServerData,
    timestamp: js.Date,
    upload: DownloadUploadData
  ): typingsJapgolly.speedtestNet.mod.ResultEvent = {
    val __obj = js.Dynamic.literal(download = download.asInstanceOf[js.Any], interface = interface.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], packetLoss = packetLoss.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("result")
    __obj.asInstanceOf[typingsJapgolly.speedtestNet.mod.ResultEvent]
  }
  
  inline def TestStartEvent(interface: InterfaceData, isp: String, progress: Double, server: ServerData, timestamp: js.Date): typingsJapgolly.speedtestNet.mod.TestStartEvent = {
    val __obj = js.Dynamic.literal(interface = interface.asInstanceOf[js.Any], isp = isp.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("testStart")
    __obj.asInstanceOf[typingsJapgolly.speedtestNet.mod.TestStartEvent]
  }
  
  inline def UploadEvent(progress: Double, timestamp: js.Date, upload: DownloadUploadData): typingsJapgolly.speedtestNet.mod.UploadEvent = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("upload")
    __obj.asInstanceOf[typingsJapgolly.speedtestNet.mod.UploadEvent]
  }
}
