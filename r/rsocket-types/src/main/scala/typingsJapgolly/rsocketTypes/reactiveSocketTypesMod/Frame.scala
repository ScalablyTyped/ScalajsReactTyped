package typingsJapgolly.rsocketTypes.reactiveSocketTypesMod

import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x00`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x01`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x02`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x03`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x04`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x05`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x06`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x07`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x08`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x09`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x0a`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x0b`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x0c`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x0d`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x0e`
import typingsJapgolly.rsocketTypes.rsocketTypesNumbers.`0x3f`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Frame extends js.Object

object Frame {
  @scala.inline
  def SetupFrame(
    dataMimeType: String,
    flags: Double,
    keepAlive: Double,
    lifetime: Double,
    majorVersion: Double,
    metadataMimeType: String,
    minorVersion: Double,
    streamId: `0`,
    `type`: `0x01`,
    data: Encodable = null,
    length: Int | Double = null,
    metadata: Encodable = null,
    resumeToken: Encodable = null
  ): Frame = {
    val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def PayloadFrame(
    flags: Double,
    streamId: Double,
    `type`: `0x0a`,
    data: Encodable = null,
    length: Int | Double = null,
    metadata: Encodable = null
  ): Frame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def KeepAliveFrame(
    flags: Double,
    lastReceivedPosition: Double,
    streamId: `0`,
    `type`: `0x03`,
    data: Encodable = null,
    length: Int | Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], lastReceivedPosition = lastReceivedPosition.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def ResumeFrame(
    clientPosition: Double,
    flags: Double,
    majorVersion: Double,
    minorVersion: Double,
    resumeToken: Encodable,
    serverPosition: Double,
    streamId: `0`,
    `type`: `0x0d`,
    length: Int | Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], majorVersion = majorVersion.asInstanceOf[js.Any], minorVersion = minorVersion.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any], serverPosition = serverPosition.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def LeaseFrame(
    flags: Double,
    requestCount: Double,
    streamId: `0`,
    ttl: Double,
    `type`: `0x02`,
    length: Int | Double = null,
    metadata: Encodable = null
  ): Frame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestCount = requestCount.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def RequestNFrame(flags: Double, requestN: Double, streamId: Double, `type`: `0x08`, length: Int | Double = null): Frame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def RequestResponseFrame(
    flags: Double,
    streamId: Double,
    `type`: `0x04`,
    data: Encodable = null,
    length: Int | Double = null,
    metadata: Encodable = null
  ): Frame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def CancelFrame(flags: Double, streamId: Double, `type`: `0x09`, length: Int | Double = null): Frame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def RequestChannelFrame(
    flags: Double,
    requestN: Double,
    streamId: Double,
    `type`: `0x07`,
    data: Encodable = null,
    length: Int | Double = null,
    metadata: Encodable = null
  ): Frame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def UnsupportedFrame(flags: Double, streamId: `0`, `type`: `0x3f` | `0x0c` | `0x00`, length: Int | Double = null): Frame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def ResumeOkFrame(clientPosition: Double, flags: Double, streamId: `0`, `type`: `0x0e`, length: Int | Double = null): Frame = {
    val __obj = js.Dynamic.literal(clientPosition = clientPosition.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def RequestStreamFrame(
    data: Encodable,
    flags: Double,
    metadata: Encodable,
    requestN: Double,
    streamId: Double,
    `type`: `0x06`,
    length: Int | Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], requestN = requestN.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def RequestFnfFrame(
    flags: Double,
    streamId: Double,
    `type`: `0x05`,
    data: Encodable = null,
    length: Int | Double = null,
    metadata: Encodable = null
  ): Frame = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  def ErrorFrame(
    code: Double,
    flags: Double,
    message: String,
    streamId: Double,
    `type`: `0x0b`,
    length: Int | Double = null
  ): Frame = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], streamId = streamId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

