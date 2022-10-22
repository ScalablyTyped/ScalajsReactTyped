package typingsJapgolly.rsocketTypes.reactiveSocketTypesMod

import typingsJapgolly.rsocketTypes.rsocketTypesInts.`0x00`
import typingsJapgolly.rsocketTypes.rsocketTypesInts.`0x0c`
import typingsJapgolly.rsocketTypes.rsocketTypesInts.`0x3f`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.CancelFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ErrorFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.LeaseFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.PayloadFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestNFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ResumeFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.SetupFrame
  - typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame
*/
trait Frame extends StObject
object Frame {
  
  inline def CancelFrame(flags: Double, streamId: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.CancelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x09)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.CancelFrame]
  }
  
  inline def ErrorFrame(code: Double, flags: Double, message: String, streamId: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ErrorFrame = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x0b)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ErrorFrame]
  }
  
  inline def KeepAliveFrame(flags: Double, lastReceivedPosition: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], lastReceivedPosition = lastReceivedPosition.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x03)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame]
  }
  
  inline def LeaseFrame(flags: Double, requestCount: Double, ttl: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.LeaseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], streamId = 0, ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x02)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.LeaseFrame]
  }
  
  inline def PayloadFrame(flags: Double, streamId: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.PayloadFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x0a)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.PayloadFrame]
  }
  
  inline def RequestChannelFrame(flags: Double, requestN: Double, streamId: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x07)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame]
  }
  
  inline def RequestFnfFrame(flags: Double, streamId: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x05)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame]
  }
  
  inline def RequestNFrame(flags: Double, requestN: Double, streamId: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestNFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x08)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestNFrame]
  }
  
  inline def RequestResponseFrame(flags: Double, streamId: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x04)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame]
  }
  
  inline def RequestStreamFrame(data: Encodable, flags: Double, metadata: Encodable, requestN: Double, streamId: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(0x06)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame]
  }
  
  inline def ResumeFrame(
    clientPosition: Double,
    flags: Double,
    majorVersion: Double,
    minorVersion: Double,
    resumeToken: Encodable,
    serverPosition: Double
  ): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ResumeFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], serverPosition = serverPosition.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x0d)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ResumeFrame]
  }
  
  inline def ResumeOkFrame(clientPosition: Double, flags: Double): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x0e)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame]
  }
  
  inline def SetupFrame(
    dataMimeType: String,
    flags: Double,
    keepAlive: Double,
    lifetime: Double,
    majorVersion: Double,
    metadataMimeType: String,
    minorVersion: Double
  ): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.SetupFrame = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(0x01)
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.SetupFrame]
  }
  
  inline def UnsupportedFrame(flags: Double, `type`: `0x3f` | `0x0c` | `0x00`): typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = 0)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame]
  }
}
