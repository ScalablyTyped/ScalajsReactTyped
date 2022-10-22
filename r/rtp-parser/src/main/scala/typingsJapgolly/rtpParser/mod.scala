package typingsJapgolly.rtpParser

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.rtpParser.anon.Channels
import typingsJapgolly.rtpParser.anon.ChannelsClockRate
import typingsJapgolly.rtpParser.anon.ChannelsClockRateMediaType
import typingsJapgolly.rtpParser.anon.ChannelsClockRateMediaTypeName
import typingsJapgolly.rtpParser.anon.ClockRate
import typingsJapgolly.rtpParser.anon.ClockRateMediaType
import typingsJapgolly.rtpParser.anon.ClockRateMediaTypeName
import typingsJapgolly.rtpParser.anon.MediaType
import typingsJapgolly.rtpParser.anon.MediaTypeName
import typingsJapgolly.rtpParser.anon.Name
import typingsJapgolly.rtpParser.anon.`17`
import typingsJapgolly.rtpParser.anon.`18`
import typingsJapgolly.rtpParser.anon.`19`
import typingsJapgolly.rtpParser.anon.`1`
import typingsJapgolly.rtpParser.anon.`2`
import typingsJapgolly.rtpParser.anon.`3`
import typingsJapgolly.rtpParser.anon.`4`
import typingsJapgolly.rtpParser.anon.`5`
import typingsJapgolly.rtpParser.anon.`6`
import typingsJapgolly.rtpParser.anon.`7`
import typingsJapgolly.rtpParser.anon.`8`
import typingsJapgolly.rtpParser.anon.`9`
import typingsJapgolly.rtpParser.rtpParserInts.`0`
import typingsJapgolly.rtpParser.rtpParserInts.`100`
import typingsJapgolly.rtpParser.rtpParserInts.`101`
import typingsJapgolly.rtpParser.rtpParserInts.`102`
import typingsJapgolly.rtpParser.rtpParserInts.`103`
import typingsJapgolly.rtpParser.rtpParserInts.`104`
import typingsJapgolly.rtpParser.rtpParserInts.`105`
import typingsJapgolly.rtpParser.rtpParserInts.`106`
import typingsJapgolly.rtpParser.rtpParserInts.`107`
import typingsJapgolly.rtpParser.rtpParserInts.`108`
import typingsJapgolly.rtpParser.rtpParserInts.`109`
import typingsJapgolly.rtpParser.rtpParserInts.`10`
import typingsJapgolly.rtpParser.rtpParserInts.`11025`
import typingsJapgolly.rtpParser.rtpParserInts.`110`
import typingsJapgolly.rtpParser.rtpParserInts.`111`
import typingsJapgolly.rtpParser.rtpParserInts.`112`
import typingsJapgolly.rtpParser.rtpParserInts.`113`
import typingsJapgolly.rtpParser.rtpParserInts.`114`
import typingsJapgolly.rtpParser.rtpParserInts.`115`
import typingsJapgolly.rtpParser.rtpParserInts.`116`
import typingsJapgolly.rtpParser.rtpParserInts.`117`
import typingsJapgolly.rtpParser.rtpParserInts.`118`
import typingsJapgolly.rtpParser.rtpParserInts.`119`
import typingsJapgolly.rtpParser.rtpParserInts.`11`
import typingsJapgolly.rtpParser.rtpParserInts.`120`
import typingsJapgolly.rtpParser.rtpParserInts.`121`
import typingsJapgolly.rtpParser.rtpParserInts.`122`
import typingsJapgolly.rtpParser.rtpParserInts.`123`
import typingsJapgolly.rtpParser.rtpParserInts.`124`
import typingsJapgolly.rtpParser.rtpParserInts.`125`
import typingsJapgolly.rtpParser.rtpParserInts.`126`
import typingsJapgolly.rtpParser.rtpParserInts.`127`
import typingsJapgolly.rtpParser.rtpParserInts.`12`
import typingsJapgolly.rtpParser.rtpParserInts.`13`
import typingsJapgolly.rtpParser.rtpParserInts.`14`
import typingsJapgolly.rtpParser.rtpParserInts.`15`
import typingsJapgolly.rtpParser.rtpParserInts.`16000`
import typingsJapgolly.rtpParser.rtpParserInts.`16`
import typingsJapgolly.rtpParser.rtpParserInts.`20`
import typingsJapgolly.rtpParser.rtpParserInts.`21`
import typingsJapgolly.rtpParser.rtpParserInts.`22050`
import typingsJapgolly.rtpParser.rtpParserInts.`22`
import typingsJapgolly.rtpParser.rtpParserInts.`23`
import typingsJapgolly.rtpParser.rtpParserInts.`24`
import typingsJapgolly.rtpParser.rtpParserInts.`25`
import typingsJapgolly.rtpParser.rtpParserInts.`26`
import typingsJapgolly.rtpParser.rtpParserInts.`27`
import typingsJapgolly.rtpParser.rtpParserInts.`28`
import typingsJapgolly.rtpParser.rtpParserInts.`29`
import typingsJapgolly.rtpParser.rtpParserInts.`30`
import typingsJapgolly.rtpParser.rtpParserInts.`31`
import typingsJapgolly.rtpParser.rtpParserInts.`32`
import typingsJapgolly.rtpParser.rtpParserInts.`33`
import typingsJapgolly.rtpParser.rtpParserInts.`34`
import typingsJapgolly.rtpParser.rtpParserInts.`44100`
import typingsJapgolly.rtpParser.rtpParserInts.`72`
import typingsJapgolly.rtpParser.rtpParserInts.`73`
import typingsJapgolly.rtpParser.rtpParserInts.`74`
import typingsJapgolly.rtpParser.rtpParserInts.`75`
import typingsJapgolly.rtpParser.rtpParserInts.`76`
import typingsJapgolly.rtpParser.rtpParserInts.`8000`
import typingsJapgolly.rtpParser.rtpParserInts.`90000`
import typingsJapgolly.rtpParser.rtpParserInts.`96`
import typingsJapgolly.rtpParser.rtpParserInts.`97`
import typingsJapgolly.rtpParser.rtpParserInts.`98`
import typingsJapgolly.rtpParser.rtpParserInts.`99`
import typingsJapgolly.rtpParser.rtpParserStrings.A
import typingsJapgolly.rtpParser.rtpParserStrings.AV
import typingsJapgolly.rtpParser.rtpParserStrings.CN
import typingsJapgolly.rtpParser.rtpParserStrings.CelB
import typingsJapgolly.rtpParser.rtpParserStrings.DVI4
import typingsJapgolly.rtpParser.rtpParserStrings.G722
import typingsJapgolly.rtpParser.rtpParserStrings.G723
import typingsJapgolly.rtpParser.rtpParserStrings.G728
import typingsJapgolly.rtpParser.rtpParserStrings.G729
import typingsJapgolly.rtpParser.rtpParserStrings.GSM
import typingsJapgolly.rtpParser.rtpParserStrings.H261
import typingsJapgolly.rtpParser.rtpParserStrings.H263
import typingsJapgolly.rtpParser.rtpParserStrings.JPEG
import typingsJapgolly.rtpParser.rtpParserStrings.L16
import typingsJapgolly.rtpParser.rtpParserStrings.LPC
import typingsJapgolly.rtpParser.rtpParserStrings.MP2T
import typingsJapgolly.rtpParser.rtpParserStrings.MPA
import typingsJapgolly.rtpParser.rtpParserStrings.MPV
import typingsJapgolly.rtpParser.rtpParserStrings.PCMA
import typingsJapgolly.rtpParser.rtpParserStrings.PCMU
import typingsJapgolly.rtpParser.rtpParserStrings.QCELP
import typingsJapgolly.rtpParser.rtpParserStrings.V
import typingsJapgolly.rtpParser.rtpParserStrings.dynamic
import typingsJapgolly.rtpParser.rtpParserStrings.nv
import typingsJapgolly.rtpParser.rtpParserStrings.reserved
import typingsJapgolly.rtpParser.rtpParserStrings.unassigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rtp-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rtp-parser", "FIXED_HEADER_LENGTH")
  @js.native
  val FIXED_HEADER_LENGTH: `12` = js.native
  
  inline def parseRtpPacket(buf: Buffer): ParsedRTPPacket = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPacket")(buf.asInstanceOf[js.Any]).asInstanceOf[ParsedRTPPacket]
  
  inline def parseRtpPayloadType(payloadType: `24` | `27` | `29` | `30`): `9` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`9`]
  inline def parseRtpPayloadType(
    payloadType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 56, starting with typingsJapgolly.rtpParser.rtpParserInts.`35`, typingsJapgolly.rtpParser.rtpParserInts.`36`, typingsJapgolly.rtpParser.rtpParserInts.`37` */ Any
  ): `17` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`17`]
  inline def parseRtpPayloadType(payloadType: Double): ParsedRTPType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[ParsedRTPType]
  
  inline def parseRtpPayloadType_0(payloadType: `0`): Channels = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[Channels]
  
  inline def parseRtpPayloadType_10(payloadType: `10`): ChannelsClockRateMediaTypeName = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[ChannelsClockRateMediaTypeName]
  
  inline def parseRtpPayloadType_11(payloadType: `11`): typingsJapgolly.rtpParser.anon.`0` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rtpParser.anon.`0`]
  
  inline def parseRtpPayloadType_12(payloadType: `12`): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`1`]
  
  inline def parseRtpPayloadType_13(payloadType: `13`): `2` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`2`]
  
  inline def parseRtpPayloadType_14(payloadType: `14`): `3` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`3`]
  
  inline def parseRtpPayloadType_15(payloadType: `15`): `4` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`4`]
  
  inline def parseRtpPayloadType_16(payloadType: `16`): `5` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`5`]
  
  inline def parseRtpPayloadType_17(payloadType: typingsJapgolly.rtpParser.rtpParserInts.`17`): `6` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`6`]
  
  inline def parseRtpPayloadType_18(payloadType: `72` | `73` | `74` | `75` | `76`): `18` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`18`]
  inline def parseRtpPayloadType_18(payloadType: typingsJapgolly.rtpParser.rtpParserInts.`18`): `7` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`7`]
  
  inline def parseRtpPayloadType_19(
    payloadType: `96` | `97` | `98` | `99` | `100` | `101` | `102` | `103` | `104` | `105` | `106` | `107` | `108` | `109` | `110` | `111` | `112` | `113` | `114` | `115` | `116` | `117` | `118` | `119` | `120` | `121` | `122` | `123` | `124` | `125` | `126` | `127`
  ): `19` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`19`]
  
  inline def parseRtpPayloadType_25(payloadType: `25`): typingsJapgolly.rtpParser.anon.`10` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rtpParser.anon.`10`]
  
  inline def parseRtpPayloadType_26(payloadType: `26`): typingsJapgolly.rtpParser.anon.`11` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rtpParser.anon.`11`]
  
  inline def parseRtpPayloadType_28(payloadType: `28`): typingsJapgolly.rtpParser.anon.`12` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rtpParser.anon.`12`]
  
  inline def parseRtpPayloadType_3(payloadType: typingsJapgolly.rtpParser.rtpParserInts.`3`): ClockRate = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[ClockRate]
  
  inline def parseRtpPayloadType_31(payloadType: `31`): typingsJapgolly.rtpParser.anon.`13` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rtpParser.anon.`13`]
  
  inline def parseRtpPayloadType_32(payloadType: `32`): typingsJapgolly.rtpParser.anon.`14` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rtpParser.anon.`14`]
  
  inline def parseRtpPayloadType_33(payloadType: `33`): typingsJapgolly.rtpParser.anon.`15` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rtpParser.anon.`15`]
  
  inline def parseRtpPayloadType_34(payloadType: `34`): typingsJapgolly.rtpParser.anon.`16` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.rtpParser.anon.`16`]
  
  inline def parseRtpPayloadType_4(payloadType: typingsJapgolly.rtpParser.rtpParserInts.`4`): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[Name]
  
  inline def parseRtpPayloadType_5(payloadType: typingsJapgolly.rtpParser.rtpParserInts.`5`): ChannelsClockRate = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[ChannelsClockRate]
  
  inline def parseRtpPayloadType_6(payloadType: typingsJapgolly.rtpParser.rtpParserInts.`6`): ClockRateMediaType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[ClockRateMediaType]
  
  inline def parseRtpPayloadType_7(payloadType: typingsJapgolly.rtpParser.rtpParserInts.`7`): MediaTypeName = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[MediaTypeName]
  
  inline def parseRtpPayloadType_8(payloadType: `20` | `21` | `22` | `23`): `8` = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[`8`]
  inline def parseRtpPayloadType_8(payloadType: typingsJapgolly.rtpParser.rtpParserInts.`8`): ChannelsClockRateMediaType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[ChannelsClockRateMediaType]
  
  inline def parseRtpPayloadType_9(payloadType: typingsJapgolly.rtpParser.rtpParserInts.`9`): ClockRateMediaTypeName = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[ClockRateMediaTypeName]
  
  inline def parseRtpPayloadType_MediaType(
    payloadType: typingsJapgolly.rtpParser.rtpParserInts.`1` | typingsJapgolly.rtpParser.rtpParserInts.`2` | typingsJapgolly.rtpParser.rtpParserInts.`19`
  ): MediaType = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRtpPayloadType")(payloadType.asInstanceOf[js.Any]).asInstanceOf[MediaType]
  
  @JSImport("rtp-parser", "payloadTypesHash")
  @js.native
  val payloadTypesHash: PayloadTypesHash_ = js.native
  
  trait ParsedRTPPacket extends StObject {
    
    var csrc: js.Array[Double]
    
    var csrcCount: Double
    
    var `extension`: Double
    
    var marker: Double
    
    var padding: Double
    
    var payload: Buffer
    
    var payloadType: Double
    
    var sequenceNumber: Double
    
    var ssrc: Double
    
    var timestamp: Double
    
    var version: Double
  }
  object ParsedRTPPacket {
    
    inline def apply(
      csrc: js.Array[Double],
      csrcCount: Double,
      `extension`: Double,
      marker: Double,
      padding: Double,
      payload: Buffer,
      payloadType: Double,
      sequenceNumber: Double,
      ssrc: Double,
      timestamp: Double,
      version: Double
    ): ParsedRTPPacket = {
      val __obj = js.Dynamic.literal(csrc = csrc.asInstanceOf[js.Any], csrcCount = csrcCount.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], ssrc = ssrc.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedRTPPacket]
    }
    
    extension [Self <: ParsedRTPPacket](x: Self) {
      
      inline def setCsrc(value: js.Array[Double]): Self = StObject.set(x, "csrc", value.asInstanceOf[js.Any])
      
      inline def setCsrcCount(value: Double): Self = StObject.set(x, "csrcCount", value.asInstanceOf[js.Any])
      
      inline def setCsrcVarargs(value: Double*): Self = StObject.set(x, "csrc", js.Array(value*))
      
      inline def setExtension(value: Double): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setMarker(value: Double): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadType(value: Double): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setSsrc(value: Double): Self = StObject.set(x, "ssrc", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParsedRTPType extends StObject {
    
    var channels: js.UndefOr[
        typingsJapgolly.rtpParser.rtpParserInts.`1` | typingsJapgolly.rtpParser.rtpParserInts.`2`
      ] = js.undefined
    
    var clockRate: js.UndefOr[`8000` | `16000` | `44100` | `90000` | `11025` | `22050`] = js.undefined
    
    var mediaType: js.UndefOr[A | AV | V] = js.undefined
    
    var name: PCMU | GSM | G723 | DVI4 | LPC | PCMA | G722 | L16 | QCELP | CN | MPA | G728 | G729 | CelB | JPEG | nv | H261 | MPV | MP2T | H263 | reserved | unassigned | dynamic
  }
  object ParsedRTPType {
    
    inline def apply(
      name: PCMU | GSM | G723 | DVI4 | LPC | PCMA | G722 | L16 | QCELP | CN | MPA | G728 | G729 | CelB | JPEG | nv | H261 | MPV | MP2T | H263 | reserved | unassigned | dynamic
    ): ParsedRTPType = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedRTPType]
    }
    
    extension [Self <: ParsedRTPType](x: Self) {
      
      inline def setChannels(value: typingsJapgolly.rtpParser.rtpParserInts.`1` | typingsJapgolly.rtpParser.rtpParserInts.`2`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
      
      inline def setClockRate(value: `8000` | `16000` | `44100` | `90000` | `11025` | `22050`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
      
      inline def setClockRateUndefined: Self = StObject.set(x, "clockRate", js.undefined)
      
      inline def setMediaType(value: A | AV | V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setName(
        value: PCMU | GSM | G723 | DVI4 | LPC | PCMA | G722 | L16 | QCELP | CN | MPA | G728 | G729 | CelB | JPEG | nv | H261 | MPV | MP2T | H263 | reserved | unassigned | dynamic
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.rtpParser.rtpParserStrings.`0`
    - typingsJapgolly.rtpParser.rtpParserStrings.`1`
    - typingsJapgolly.rtpParser.rtpParserStrings.`2`
    - typingsJapgolly.rtpParser.rtpParserStrings.`3`
    - typingsJapgolly.rtpParser.rtpParserStrings.`4`
    - typingsJapgolly.rtpParser.rtpParserStrings.`5`
    - typingsJapgolly.rtpParser.rtpParserStrings.`6`
    - typingsJapgolly.rtpParser.rtpParserStrings.`7`
    - typingsJapgolly.rtpParser.rtpParserStrings.`8`
    - typingsJapgolly.rtpParser.rtpParserStrings.`9`
    - typingsJapgolly.rtpParser.rtpParserStrings.`10`
    - typingsJapgolly.rtpParser.rtpParserStrings.`11`
    - typingsJapgolly.rtpParser.rtpParserStrings.`12`
    - typingsJapgolly.rtpParser.rtpParserStrings.`13`
    - typingsJapgolly.rtpParser.rtpParserStrings.`14`
    - typingsJapgolly.rtpParser.rtpParserStrings.`15`
    - typingsJapgolly.rtpParser.rtpParserStrings.`16`
    - typingsJapgolly.rtpParser.rtpParserStrings.`17`
    - typingsJapgolly.rtpParser.rtpParserStrings.`18`
    - typingsJapgolly.rtpParser.rtpParserStrings.`19`
    - typingsJapgolly.rtpParser.rtpParserStrings.`20`
    - typingsJapgolly.rtpParser.rtpParserStrings.`21`
    - typingsJapgolly.rtpParser.rtpParserStrings.`22`
    - typingsJapgolly.rtpParser.rtpParserStrings.`23`
    - typingsJapgolly.rtpParser.rtpParserStrings.`24`
    - typingsJapgolly.rtpParser.rtpParserStrings.`25`
    - typingsJapgolly.rtpParser.rtpParserStrings.`26`
    - typingsJapgolly.rtpParser.rtpParserStrings.`27`
    - typingsJapgolly.rtpParser.rtpParserStrings.`28`
    - typingsJapgolly.rtpParser.rtpParserStrings.`29`
    - typingsJapgolly.rtpParser.rtpParserStrings.`30`
    - typingsJapgolly.rtpParser.rtpParserStrings.`31`
    - typingsJapgolly.rtpParser.rtpParserStrings.`32`
    - typingsJapgolly.rtpParser.rtpParserStrings.`33`
    - typingsJapgolly.rtpParser.rtpParserStrings.`34`
    - typingsJapgolly.rtpParser.rtpParserStrings.`35`
    - typingsJapgolly.rtpParser.rtpParserStrings.`36`
    - typingsJapgolly.rtpParser.rtpParserStrings.`37`
    - typingsJapgolly.rtpParser.rtpParserStrings.`38`
    - typingsJapgolly.rtpParser.rtpParserStrings.`39`
    - typingsJapgolly.rtpParser.rtpParserStrings.`40`
    - typingsJapgolly.rtpParser.rtpParserStrings.`41`
    - typingsJapgolly.rtpParser.rtpParserStrings.`42`
    - typingsJapgolly.rtpParser.rtpParserStrings.`43`
    - typingsJapgolly.rtpParser.rtpParserStrings.`44`
    - typingsJapgolly.rtpParser.rtpParserStrings.`45`
    - typingsJapgolly.rtpParser.rtpParserStrings.`46`
    - typingsJapgolly.rtpParser.rtpParserStrings.`47`
    - typingsJapgolly.rtpParser.rtpParserStrings.`48`
    - typingsJapgolly.rtpParser.rtpParserStrings.`49`
    - typingsJapgolly.rtpParser.rtpParserStrings.`50`
    - typingsJapgolly.rtpParser.rtpParserStrings.`51`
    - typingsJapgolly.rtpParser.rtpParserStrings.`52`
    - typingsJapgolly.rtpParser.rtpParserStrings.`53`
    - typingsJapgolly.rtpParser.rtpParserStrings.`54`
    - typingsJapgolly.rtpParser.rtpParserStrings.`55`
    - typingsJapgolly.rtpParser.rtpParserStrings.`56`
    - typingsJapgolly.rtpParser.rtpParserStrings.`57`
    - typingsJapgolly.rtpParser.rtpParserStrings.`58`
    - typingsJapgolly.rtpParser.rtpParserStrings.`59`
    - typingsJapgolly.rtpParser.rtpParserStrings.`60`
    - typingsJapgolly.rtpParser.rtpParserStrings.`61`
    - typingsJapgolly.rtpParser.rtpParserStrings.`62`
    - typingsJapgolly.rtpParser.rtpParserStrings.`63`
    - typingsJapgolly.rtpParser.rtpParserStrings.`64`
    - typingsJapgolly.rtpParser.rtpParserStrings.`65`
    - typingsJapgolly.rtpParser.rtpParserStrings.`66`
    - typingsJapgolly.rtpParser.rtpParserStrings.`67`
    - typingsJapgolly.rtpParser.rtpParserStrings.`68`
    - typingsJapgolly.rtpParser.rtpParserStrings.`69`
    - typingsJapgolly.rtpParser.rtpParserStrings.`70`
    - typingsJapgolly.rtpParser.rtpParserStrings.`71`
    - typingsJapgolly.rtpParser.rtpParserStrings.`72`
    - typingsJapgolly.rtpParser.rtpParserStrings.`73`
    - typingsJapgolly.rtpParser.rtpParserStrings.`74`
    - typingsJapgolly.rtpParser.rtpParserStrings.`75`
    - typingsJapgolly.rtpParser.rtpParserStrings.`76`
    - typingsJapgolly.rtpParser.rtpParserStrings.`77`
    - typingsJapgolly.rtpParser.rtpParserStrings.`78`
    - typingsJapgolly.rtpParser.rtpParserStrings.`79`
    - typingsJapgolly.rtpParser.rtpParserStrings.`80`
    - typingsJapgolly.rtpParser.rtpParserStrings.`81`
    - typingsJapgolly.rtpParser.rtpParserStrings.`82`
    - typingsJapgolly.rtpParser.rtpParserStrings.`83`
    - typingsJapgolly.rtpParser.rtpParserStrings.`84`
    - typingsJapgolly.rtpParser.rtpParserStrings.`85`
    - typingsJapgolly.rtpParser.rtpParserStrings.`86`
    - typingsJapgolly.rtpParser.rtpParserStrings.`87`
    - typingsJapgolly.rtpParser.rtpParserStrings.`88`
    - typingsJapgolly.rtpParser.rtpParserStrings.`89`
    - typingsJapgolly.rtpParser.rtpParserStrings.`90`
    - typingsJapgolly.rtpParser.rtpParserStrings.`91`
    - typingsJapgolly.rtpParser.rtpParserStrings.`92`
    - typingsJapgolly.rtpParser.rtpParserStrings.`93`
    - typingsJapgolly.rtpParser.rtpParserStrings.`94`
    - typingsJapgolly.rtpParser.rtpParserStrings.`95`
    - typingsJapgolly.rtpParser.rtpParserStrings.`96`
    - typingsJapgolly.rtpParser.rtpParserStrings.`97`
    - typingsJapgolly.rtpParser.rtpParserStrings.`98`
    - typingsJapgolly.rtpParser.rtpParserStrings.`99`
    - typingsJapgolly.rtpParser.rtpParserStrings.`100`
    - typingsJapgolly.rtpParser.rtpParserStrings.`101`
    - typingsJapgolly.rtpParser.rtpParserStrings.`102`
    - typingsJapgolly.rtpParser.rtpParserStrings.`103`
    - typingsJapgolly.rtpParser.rtpParserStrings.`104`
    - typingsJapgolly.rtpParser.rtpParserStrings.`105`
    - typingsJapgolly.rtpParser.rtpParserStrings.`106`
    - typingsJapgolly.rtpParser.rtpParserStrings.`107`
    - typingsJapgolly.rtpParser.rtpParserStrings.`108`
    - typingsJapgolly.rtpParser.rtpParserStrings.`109`
    - typingsJapgolly.rtpParser.rtpParserStrings.`110`
    - typingsJapgolly.rtpParser.rtpParserStrings.`111`
    - typingsJapgolly.rtpParser.rtpParserStrings.`112`
    - typingsJapgolly.rtpParser.rtpParserStrings.`113`
    - typingsJapgolly.rtpParser.rtpParserStrings.`114`
    - typingsJapgolly.rtpParser.rtpParserStrings.`115`
    - typingsJapgolly.rtpParser.rtpParserStrings.`116`
    - typingsJapgolly.rtpParser.rtpParserStrings.`117`
    - typingsJapgolly.rtpParser.rtpParserStrings.`118`
    - typingsJapgolly.rtpParser.rtpParserStrings.`119`
    - typingsJapgolly.rtpParser.rtpParserStrings.`120`
    - typingsJapgolly.rtpParser.rtpParserStrings.`121`
    - typingsJapgolly.rtpParser.rtpParserStrings.`122`
    - typingsJapgolly.rtpParser.rtpParserStrings.`123`
    - typingsJapgolly.rtpParser.rtpParserStrings.`124`
    - typingsJapgolly.rtpParser.rtpParserStrings.`125`
    - typingsJapgolly.rtpParser.rtpParserStrings.`126`
    - typingsJapgolly.rtpParser.rtpParserStrings.`127`
  */
  trait PayloadType extends StObject
  
  trait PayloadTypesHash_ extends StObject {
    
    var `0`: Channels
    
    var `1`: MediaType
    
    var `10`: ChannelsClockRateMediaTypeName
    
    var `100`: `19`
    
    var `101`: `19`
    
    var `102`: `19`
    
    var `103`: `19`
    
    var `104`: `19`
    
    var `105`: `19`
    
    var `106`: `19`
    
    var `107`: `19`
    
    var `108`: `19`
    
    var `109`: `19`
    
    var `11`: typingsJapgolly.rtpParser.anon.`0`
    
    var `110`: `19`
    
    var `111`: `19`
    
    var `112`: `19`
    
    var `113`: `19`
    
    var `114`: `19`
    
    var `115`: `19`
    
    var `116`: `19`
    
    var `117`: `19`
    
    var `118`: `19`
    
    var `119`: `19`
    
    var `12`: `1`
    
    var `120`: `19`
    
    var `121`: `19`
    
    var `122`: `19`
    
    var `123`: `19`
    
    var `124`: `19`
    
    var `125`: `19`
    
    var `126`: `19`
    
    var `127`: `19`
    
    var `13`: `2`
    
    var `14`: `3`
    
    var `15`: `4`
    
    var `16`: `5`
    
    var `17`: `6`
    
    var `18`: `7`
    
    var `19`: MediaType
    
    var `2`: MediaType
    
    var `20`: `8`
    
    var `21`: `8`
    
    var `22`: `8`
    
    var `23`: `8`
    
    var `24`: `9`
    
    var `25`: typingsJapgolly.rtpParser.anon.`10`
    
    var `26`: typingsJapgolly.rtpParser.anon.`11`
    
    var `27`: `9`
    
    var `28`: typingsJapgolly.rtpParser.anon.`12`
    
    var `29`: `9`
    
    var `3`: ClockRate
    
    var `30`: `9`
    
    var `31`: typingsJapgolly.rtpParser.anon.`13`
    
    var `32`: typingsJapgolly.rtpParser.anon.`14`
    
    var `33`: typingsJapgolly.rtpParser.anon.`15`
    
    var `34`: typingsJapgolly.rtpParser.anon.`16`
    
    var `35`: `17`
    
    var `36`: `17`
    
    var `37`: `17`
    
    var `38`: `17`
    
    var `39`: `17`
    
    var `4`: Name
    
    var `40`: `17`
    
    var `41`: `17`
    
    var `42`: `17`
    
    var `43`: `17`
    
    var `44`: `17`
    
    var `45`: `17`
    
    var `46`: `17`
    
    var `47`: `17`
    
    var `48`: `17`
    
    var `49`: `17`
    
    var `5`: ChannelsClockRate
    
    var `50`: `17`
    
    var `51`: `17`
    
    var `52`: `17`
    
    var `53`: `17`
    
    var `54`: `17`
    
    var `55`: `17`
    
    var `56`: `17`
    
    var `57`: `17`
    
    var `58`: `17`
    
    var `59`: `17`
    
    var `6`: ClockRateMediaType
    
    var `60`: `17`
    
    var `61`: `17`
    
    var `62`: `17`
    
    var `63`: `17`
    
    var `64`: `17`
    
    var `65`: `17`
    
    var `66`: `17`
    
    var `67`: `17`
    
    var `68`: `17`
    
    var `69`: `17`
    
    var `7`: MediaTypeName
    
    var `70`: `17`
    
    var `71`: `17`
    
    var `72`: `18`
    
    var `73`: `18`
    
    var `74`: `18`
    
    var `75`: `18`
    
    var `76`: `18`
    
    var `77`: `17`
    
    var `78`: `17`
    
    var `79`: `17`
    
    var `8`: ChannelsClockRateMediaType
    
    var `80`: `17`
    
    var `81`: `17`
    
    var `82`: `17`
    
    var `83`: `17`
    
    var `84`: `17`
    
    var `85`: `17`
    
    var `86`: `17`
    
    var `87`: `17`
    
    var `88`: `17`
    
    var `89`: `17`
    
    var `9`: ClockRateMediaTypeName
    
    var `90`: `17`
    
    var `91`: `17`
    
    var `92`: `17`
    
    var `93`: `17`
    
    var `94`: `17`
    
    var `95`: `17`
    
    var `96`: `19`
    
    var `97`: `19`
    
    var `98`: `19`
    
    var `99`: `19`
  }
  object PayloadTypesHash_ {
    
    inline def apply(
      `0`: Channels,
      `1`: MediaType,
      `10`: ChannelsClockRateMediaTypeName,
      `100`: `19`,
      `101`: `19`,
      `102`: `19`,
      `103`: `19`,
      `104`: `19`,
      `105`: `19`,
      `106`: `19`,
      `107`: `19`,
      `108`: `19`,
      `109`: `19`,
      `11`: typingsJapgolly.rtpParser.anon.`0`,
      `110`: `19`,
      `111`: `19`,
      `112`: `19`,
      `113`: `19`,
      `114`: `19`,
      `115`: `19`,
      `116`: `19`,
      `117`: `19`,
      `118`: `19`,
      `119`: `19`,
      `12`: `1`,
      `120`: `19`,
      `121`: `19`,
      `122`: `19`,
      `123`: `19`,
      `124`: `19`,
      `125`: `19`,
      `126`: `19`,
      `127`: `19`,
      `13`: `2`,
      `14`: `3`,
      `15`: `4`,
      `16`: `5`,
      `17`: `6`,
      `18`: `7`,
      `19`: MediaType,
      `2`: MediaType,
      `20`: `8`,
      `21`: `8`,
      `22`: `8`,
      `23`: `8`,
      `24`: `9`,
      `25`: typingsJapgolly.rtpParser.anon.`10`,
      `26`: typingsJapgolly.rtpParser.anon.`11`,
      `27`: `9`,
      `28`: typingsJapgolly.rtpParser.anon.`12`,
      `29`: `9`,
      `3`: ClockRate,
      `30`: `9`,
      `31`: typingsJapgolly.rtpParser.anon.`13`,
      `32`: typingsJapgolly.rtpParser.anon.`14`,
      `33`: typingsJapgolly.rtpParser.anon.`15`,
      `34`: typingsJapgolly.rtpParser.anon.`16`,
      `35`: `17`,
      `36`: `17`,
      `37`: `17`,
      `38`: `17`,
      `39`: `17`,
      `4`: Name,
      `40`: `17`,
      `41`: `17`,
      `42`: `17`,
      `43`: `17`,
      `44`: `17`,
      `45`: `17`,
      `46`: `17`,
      `47`: `17`,
      `48`: `17`,
      `49`: `17`,
      `5`: ChannelsClockRate,
      `50`: `17`,
      `51`: `17`,
      `52`: `17`,
      `53`: `17`,
      `54`: `17`,
      `55`: `17`,
      `56`: `17`,
      `57`: `17`,
      `58`: `17`,
      `59`: `17`,
      `6`: ClockRateMediaType,
      `60`: `17`,
      `61`: `17`,
      `62`: `17`,
      `63`: `17`,
      `64`: `17`,
      `65`: `17`,
      `66`: `17`,
      `67`: `17`,
      `68`: `17`,
      `69`: `17`,
      `7`: MediaTypeName,
      `70`: `17`,
      `71`: `17`,
      `72`: `18`,
      `73`: `18`,
      `74`: `18`,
      `75`: `18`,
      `76`: `18`,
      `77`: `17`,
      `78`: `17`,
      `79`: `17`,
      `8`: ChannelsClockRateMediaType,
      `80`: `17`,
      `81`: `17`,
      `82`: `17`,
      `83`: `17`,
      `84`: `17`,
      `85`: `17`,
      `86`: `17`,
      `87`: `17`,
      `88`: `17`,
      `89`: `17`,
      `9`: ClockRateMediaTypeName,
      `90`: `17`,
      `91`: `17`,
      `92`: `17`,
      `93`: `17`,
      `94`: `17`,
      `95`: `17`,
      `96`: `19`,
      `97`: `19`,
      `98`: `19`,
      `99`: `19`
    ): PayloadTypesHash_ = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("10")(`10`.asInstanceOf[js.Any])
      __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
      __obj.updateDynamic("101")(`101`.asInstanceOf[js.Any])
      __obj.updateDynamic("102")(`102`.asInstanceOf[js.Any])
      __obj.updateDynamic("103")(`103`.asInstanceOf[js.Any])
      __obj.updateDynamic("104")(`104`.asInstanceOf[js.Any])
      __obj.updateDynamic("105")(`105`.asInstanceOf[js.Any])
      __obj.updateDynamic("106")(`106`.asInstanceOf[js.Any])
      __obj.updateDynamic("107")(`107`.asInstanceOf[js.Any])
      __obj.updateDynamic("108")(`108`.asInstanceOf[js.Any])
      __obj.updateDynamic("109")(`109`.asInstanceOf[js.Any])
      __obj.updateDynamic("11")(`11`.asInstanceOf[js.Any])
      __obj.updateDynamic("110")(`110`.asInstanceOf[js.Any])
      __obj.updateDynamic("111")(`111`.asInstanceOf[js.Any])
      __obj.updateDynamic("112")(`112`.asInstanceOf[js.Any])
      __obj.updateDynamic("113")(`113`.asInstanceOf[js.Any])
      __obj.updateDynamic("114")(`114`.asInstanceOf[js.Any])
      __obj.updateDynamic("115")(`115`.asInstanceOf[js.Any])
      __obj.updateDynamic("116")(`116`.asInstanceOf[js.Any])
      __obj.updateDynamic("117")(`117`.asInstanceOf[js.Any])
      __obj.updateDynamic("118")(`118`.asInstanceOf[js.Any])
      __obj.updateDynamic("119")(`119`.asInstanceOf[js.Any])
      __obj.updateDynamic("12")(`12`.asInstanceOf[js.Any])
      __obj.updateDynamic("120")(`120`.asInstanceOf[js.Any])
      __obj.updateDynamic("121")(`121`.asInstanceOf[js.Any])
      __obj.updateDynamic("122")(`122`.asInstanceOf[js.Any])
      __obj.updateDynamic("123")(`123`.asInstanceOf[js.Any])
      __obj.updateDynamic("124")(`124`.asInstanceOf[js.Any])
      __obj.updateDynamic("125")(`125`.asInstanceOf[js.Any])
      __obj.updateDynamic("126")(`126`.asInstanceOf[js.Any])
      __obj.updateDynamic("127")(`127`.asInstanceOf[js.Any])
      __obj.updateDynamic("13")(`13`.asInstanceOf[js.Any])
      __obj.updateDynamic("14")(`14`.asInstanceOf[js.Any])
      __obj.updateDynamic("15")(`15`.asInstanceOf[js.Any])
      __obj.updateDynamic("16")(`16`.asInstanceOf[js.Any])
      __obj.updateDynamic("17")(`17`.asInstanceOf[js.Any])
      __obj.updateDynamic("18")(`18`.asInstanceOf[js.Any])
      __obj.updateDynamic("19")(`19`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("20")(`20`.asInstanceOf[js.Any])
      __obj.updateDynamic("21")(`21`.asInstanceOf[js.Any])
      __obj.updateDynamic("22")(`22`.asInstanceOf[js.Any])
      __obj.updateDynamic("23")(`23`.asInstanceOf[js.Any])
      __obj.updateDynamic("24")(`24`.asInstanceOf[js.Any])
      __obj.updateDynamic("25")(`25`.asInstanceOf[js.Any])
      __obj.updateDynamic("26")(`26`.asInstanceOf[js.Any])
      __obj.updateDynamic("27")(`27`.asInstanceOf[js.Any])
      __obj.updateDynamic("28")(`28`.asInstanceOf[js.Any])
      __obj.updateDynamic("29")(`29`.asInstanceOf[js.Any])
      __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
      __obj.updateDynamic("30")(`30`.asInstanceOf[js.Any])
      __obj.updateDynamic("31")(`31`.asInstanceOf[js.Any])
      __obj.updateDynamic("32")(`32`.asInstanceOf[js.Any])
      __obj.updateDynamic("33")(`33`.asInstanceOf[js.Any])
      __obj.updateDynamic("34")(`34`.asInstanceOf[js.Any])
      __obj.updateDynamic("35")(`35`.asInstanceOf[js.Any])
      __obj.updateDynamic("36")(`36`.asInstanceOf[js.Any])
      __obj.updateDynamic("37")(`37`.asInstanceOf[js.Any])
      __obj.updateDynamic("38")(`38`.asInstanceOf[js.Any])
      __obj.updateDynamic("39")(`39`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.updateDynamic("40")(`40`.asInstanceOf[js.Any])
      __obj.updateDynamic("41")(`41`.asInstanceOf[js.Any])
      __obj.updateDynamic("42")(`42`.asInstanceOf[js.Any])
      __obj.updateDynamic("43")(`43`.asInstanceOf[js.Any])
      __obj.updateDynamic("44")(`44`.asInstanceOf[js.Any])
      __obj.updateDynamic("45")(`45`.asInstanceOf[js.Any])
      __obj.updateDynamic("46")(`46`.asInstanceOf[js.Any])
      __obj.updateDynamic("47")(`47`.asInstanceOf[js.Any])
      __obj.updateDynamic("48")(`48`.asInstanceOf[js.Any])
      __obj.updateDynamic("49")(`49`.asInstanceOf[js.Any])
      __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
      __obj.updateDynamic("50")(`50`.asInstanceOf[js.Any])
      __obj.updateDynamic("51")(`51`.asInstanceOf[js.Any])
      __obj.updateDynamic("52")(`52`.asInstanceOf[js.Any])
      __obj.updateDynamic("53")(`53`.asInstanceOf[js.Any])
      __obj.updateDynamic("54")(`54`.asInstanceOf[js.Any])
      __obj.updateDynamic("55")(`55`.asInstanceOf[js.Any])
      __obj.updateDynamic("56")(`56`.asInstanceOf[js.Any])
      __obj.updateDynamic("57")(`57`.asInstanceOf[js.Any])
      __obj.updateDynamic("58")(`58`.asInstanceOf[js.Any])
      __obj.updateDynamic("59")(`59`.asInstanceOf[js.Any])
      __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
      __obj.updateDynamic("60")(`60`.asInstanceOf[js.Any])
      __obj.updateDynamic("61")(`61`.asInstanceOf[js.Any])
      __obj.updateDynamic("62")(`62`.asInstanceOf[js.Any])
      __obj.updateDynamic("63")(`63`.asInstanceOf[js.Any])
      __obj.updateDynamic("64")(`64`.asInstanceOf[js.Any])
      __obj.updateDynamic("65")(`65`.asInstanceOf[js.Any])
      __obj.updateDynamic("66")(`66`.asInstanceOf[js.Any])
      __obj.updateDynamic("67")(`67`.asInstanceOf[js.Any])
      __obj.updateDynamic("68")(`68`.asInstanceOf[js.Any])
      __obj.updateDynamic("69")(`69`.asInstanceOf[js.Any])
      __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
      __obj.updateDynamic("70")(`70`.asInstanceOf[js.Any])
      __obj.updateDynamic("71")(`71`.asInstanceOf[js.Any])
      __obj.updateDynamic("72")(`72`.asInstanceOf[js.Any])
      __obj.updateDynamic("73")(`73`.asInstanceOf[js.Any])
      __obj.updateDynamic("74")(`74`.asInstanceOf[js.Any])
      __obj.updateDynamic("75")(`75`.asInstanceOf[js.Any])
      __obj.updateDynamic("76")(`76`.asInstanceOf[js.Any])
      __obj.updateDynamic("77")(`77`.asInstanceOf[js.Any])
      __obj.updateDynamic("78")(`78`.asInstanceOf[js.Any])
      __obj.updateDynamic("79")(`79`.asInstanceOf[js.Any])
      __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
      __obj.updateDynamic("80")(`80`.asInstanceOf[js.Any])
      __obj.updateDynamic("81")(`81`.asInstanceOf[js.Any])
      __obj.updateDynamic("82")(`82`.asInstanceOf[js.Any])
      __obj.updateDynamic("83")(`83`.asInstanceOf[js.Any])
      __obj.updateDynamic("84")(`84`.asInstanceOf[js.Any])
      __obj.updateDynamic("85")(`85`.asInstanceOf[js.Any])
      __obj.updateDynamic("86")(`86`.asInstanceOf[js.Any])
      __obj.updateDynamic("87")(`87`.asInstanceOf[js.Any])
      __obj.updateDynamic("88")(`88`.asInstanceOf[js.Any])
      __obj.updateDynamic("89")(`89`.asInstanceOf[js.Any])
      __obj.updateDynamic("9")(`9`.asInstanceOf[js.Any])
      __obj.updateDynamic("90")(`90`.asInstanceOf[js.Any])
      __obj.updateDynamic("91")(`91`.asInstanceOf[js.Any])
      __obj.updateDynamic("92")(`92`.asInstanceOf[js.Any])
      __obj.updateDynamic("93")(`93`.asInstanceOf[js.Any])
      __obj.updateDynamic("94")(`94`.asInstanceOf[js.Any])
      __obj.updateDynamic("95")(`95`.asInstanceOf[js.Any])
      __obj.updateDynamic("96")(`96`.asInstanceOf[js.Any])
      __obj.updateDynamic("97")(`97`.asInstanceOf[js.Any])
      __obj.updateDynamic("98")(`98`.asInstanceOf[js.Any])
      __obj.updateDynamic("99")(`99`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayloadTypesHash_]
    }
    
    extension [Self <: PayloadTypesHash_](x: Self) {
      
      inline def set0(value: Channels): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      inline def set1(value: MediaType): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set10(value: ChannelsClockRateMediaTypeName): Self = StObject.set(x, "10", value.asInstanceOf[js.Any])
      
      inline def set100(value: `19`): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
      
      inline def set101(value: `19`): Self = StObject.set(x, "101", value.asInstanceOf[js.Any])
      
      inline def set102(value: `19`): Self = StObject.set(x, "102", value.asInstanceOf[js.Any])
      
      inline def set103(value: `19`): Self = StObject.set(x, "103", value.asInstanceOf[js.Any])
      
      inline def set104(value: `19`): Self = StObject.set(x, "104", value.asInstanceOf[js.Any])
      
      inline def set105(value: `19`): Self = StObject.set(x, "105", value.asInstanceOf[js.Any])
      
      inline def set106(value: `19`): Self = StObject.set(x, "106", value.asInstanceOf[js.Any])
      
      inline def set107(value: `19`): Self = StObject.set(x, "107", value.asInstanceOf[js.Any])
      
      inline def set108(value: `19`): Self = StObject.set(x, "108", value.asInstanceOf[js.Any])
      
      inline def set109(value: `19`): Self = StObject.set(x, "109", value.asInstanceOf[js.Any])
      
      inline def set11(value: typingsJapgolly.rtpParser.anon.`0`): Self = StObject.set(x, "11", value.asInstanceOf[js.Any])
      
      inline def set110(value: `19`): Self = StObject.set(x, "110", value.asInstanceOf[js.Any])
      
      inline def set111(value: `19`): Self = StObject.set(x, "111", value.asInstanceOf[js.Any])
      
      inline def set112(value: `19`): Self = StObject.set(x, "112", value.asInstanceOf[js.Any])
      
      inline def set113(value: `19`): Self = StObject.set(x, "113", value.asInstanceOf[js.Any])
      
      inline def set114(value: `19`): Self = StObject.set(x, "114", value.asInstanceOf[js.Any])
      
      inline def set115(value: `19`): Self = StObject.set(x, "115", value.asInstanceOf[js.Any])
      
      inline def set116(value: `19`): Self = StObject.set(x, "116", value.asInstanceOf[js.Any])
      
      inline def set117(value: `19`): Self = StObject.set(x, "117", value.asInstanceOf[js.Any])
      
      inline def set118(value: `19`): Self = StObject.set(x, "118", value.asInstanceOf[js.Any])
      
      inline def set119(value: `19`): Self = StObject.set(x, "119", value.asInstanceOf[js.Any])
      
      inline def set12(value: `1`): Self = StObject.set(x, "12", value.asInstanceOf[js.Any])
      
      inline def set120(value: `19`): Self = StObject.set(x, "120", value.asInstanceOf[js.Any])
      
      inline def set121(value: `19`): Self = StObject.set(x, "121", value.asInstanceOf[js.Any])
      
      inline def set122(value: `19`): Self = StObject.set(x, "122", value.asInstanceOf[js.Any])
      
      inline def set123(value: `19`): Self = StObject.set(x, "123", value.asInstanceOf[js.Any])
      
      inline def set124(value: `19`): Self = StObject.set(x, "124", value.asInstanceOf[js.Any])
      
      inline def set125(value: `19`): Self = StObject.set(x, "125", value.asInstanceOf[js.Any])
      
      inline def set126(value: `19`): Self = StObject.set(x, "126", value.asInstanceOf[js.Any])
      
      inline def set127(value: `19`): Self = StObject.set(x, "127", value.asInstanceOf[js.Any])
      
      inline def set13(value: `2`): Self = StObject.set(x, "13", value.asInstanceOf[js.Any])
      
      inline def set14(value: `3`): Self = StObject.set(x, "14", value.asInstanceOf[js.Any])
      
      inline def set15(value: `4`): Self = StObject.set(x, "15", value.asInstanceOf[js.Any])
      
      inline def set16(value: `5`): Self = StObject.set(x, "16", value.asInstanceOf[js.Any])
      
      inline def set17(value: `6`): Self = StObject.set(x, "17", value.asInstanceOf[js.Any])
      
      inline def set18(value: `7`): Self = StObject.set(x, "18", value.asInstanceOf[js.Any])
      
      inline def set19(value: MediaType): Self = StObject.set(x, "19", value.asInstanceOf[js.Any])
      
      inline def set2(value: MediaType): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set20(value: `8`): Self = StObject.set(x, "20", value.asInstanceOf[js.Any])
      
      inline def set21(value: `8`): Self = StObject.set(x, "21", value.asInstanceOf[js.Any])
      
      inline def set22(value: `8`): Self = StObject.set(x, "22", value.asInstanceOf[js.Any])
      
      inline def set23(value: `8`): Self = StObject.set(x, "23", value.asInstanceOf[js.Any])
      
      inline def set24(value: `9`): Self = StObject.set(x, "24", value.asInstanceOf[js.Any])
      
      inline def set25(value: typingsJapgolly.rtpParser.anon.`10`): Self = StObject.set(x, "25", value.asInstanceOf[js.Any])
      
      inline def set26(value: typingsJapgolly.rtpParser.anon.`11`): Self = StObject.set(x, "26", value.asInstanceOf[js.Any])
      
      inline def set27(value: `9`): Self = StObject.set(x, "27", value.asInstanceOf[js.Any])
      
      inline def set28(value: typingsJapgolly.rtpParser.anon.`12`): Self = StObject.set(x, "28", value.asInstanceOf[js.Any])
      
      inline def set29(value: `9`): Self = StObject.set(x, "29", value.asInstanceOf[js.Any])
      
      inline def set3(value: ClockRate): Self = StObject.set(x, "3", value.asInstanceOf[js.Any])
      
      inline def set30(value: `9`): Self = StObject.set(x, "30", value.asInstanceOf[js.Any])
      
      inline def set31(value: typingsJapgolly.rtpParser.anon.`13`): Self = StObject.set(x, "31", value.asInstanceOf[js.Any])
      
      inline def set32(value: typingsJapgolly.rtpParser.anon.`14`): Self = StObject.set(x, "32", value.asInstanceOf[js.Any])
      
      inline def set33(value: typingsJapgolly.rtpParser.anon.`15`): Self = StObject.set(x, "33", value.asInstanceOf[js.Any])
      
      inline def set34(value: typingsJapgolly.rtpParser.anon.`16`): Self = StObject.set(x, "34", value.asInstanceOf[js.Any])
      
      inline def set35(value: `17`): Self = StObject.set(x, "35", value.asInstanceOf[js.Any])
      
      inline def set36(value: `17`): Self = StObject.set(x, "36", value.asInstanceOf[js.Any])
      
      inline def set37(value: `17`): Self = StObject.set(x, "37", value.asInstanceOf[js.Any])
      
      inline def set38(value: `17`): Self = StObject.set(x, "38", value.asInstanceOf[js.Any])
      
      inline def set39(value: `17`): Self = StObject.set(x, "39", value.asInstanceOf[js.Any])
      
      inline def set4(value: Name): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
      
      inline def set40(value: `17`): Self = StObject.set(x, "40", value.asInstanceOf[js.Any])
      
      inline def set41(value: `17`): Self = StObject.set(x, "41", value.asInstanceOf[js.Any])
      
      inline def set42(value: `17`): Self = StObject.set(x, "42", value.asInstanceOf[js.Any])
      
      inline def set43(value: `17`): Self = StObject.set(x, "43", value.asInstanceOf[js.Any])
      
      inline def set44(value: `17`): Self = StObject.set(x, "44", value.asInstanceOf[js.Any])
      
      inline def set45(value: `17`): Self = StObject.set(x, "45", value.asInstanceOf[js.Any])
      
      inline def set46(value: `17`): Self = StObject.set(x, "46", value.asInstanceOf[js.Any])
      
      inline def set47(value: `17`): Self = StObject.set(x, "47", value.asInstanceOf[js.Any])
      
      inline def set48(value: `17`): Self = StObject.set(x, "48", value.asInstanceOf[js.Any])
      
      inline def set49(value: `17`): Self = StObject.set(x, "49", value.asInstanceOf[js.Any])
      
      inline def set5(value: ChannelsClockRate): Self = StObject.set(x, "5", value.asInstanceOf[js.Any])
      
      inline def set50(value: `17`): Self = StObject.set(x, "50", value.asInstanceOf[js.Any])
      
      inline def set51(value: `17`): Self = StObject.set(x, "51", value.asInstanceOf[js.Any])
      
      inline def set52(value: `17`): Self = StObject.set(x, "52", value.asInstanceOf[js.Any])
      
      inline def set53(value: `17`): Self = StObject.set(x, "53", value.asInstanceOf[js.Any])
      
      inline def set54(value: `17`): Self = StObject.set(x, "54", value.asInstanceOf[js.Any])
      
      inline def set55(value: `17`): Self = StObject.set(x, "55", value.asInstanceOf[js.Any])
      
      inline def set56(value: `17`): Self = StObject.set(x, "56", value.asInstanceOf[js.Any])
      
      inline def set57(value: `17`): Self = StObject.set(x, "57", value.asInstanceOf[js.Any])
      
      inline def set58(value: `17`): Self = StObject.set(x, "58", value.asInstanceOf[js.Any])
      
      inline def set59(value: `17`): Self = StObject.set(x, "59", value.asInstanceOf[js.Any])
      
      inline def set6(value: ClockRateMediaType): Self = StObject.set(x, "6", value.asInstanceOf[js.Any])
      
      inline def set60(value: `17`): Self = StObject.set(x, "60", value.asInstanceOf[js.Any])
      
      inline def set61(value: `17`): Self = StObject.set(x, "61", value.asInstanceOf[js.Any])
      
      inline def set62(value: `17`): Self = StObject.set(x, "62", value.asInstanceOf[js.Any])
      
      inline def set63(value: `17`): Self = StObject.set(x, "63", value.asInstanceOf[js.Any])
      
      inline def set64(value: `17`): Self = StObject.set(x, "64", value.asInstanceOf[js.Any])
      
      inline def set65(value: `17`): Self = StObject.set(x, "65", value.asInstanceOf[js.Any])
      
      inline def set66(value: `17`): Self = StObject.set(x, "66", value.asInstanceOf[js.Any])
      
      inline def set67(value: `17`): Self = StObject.set(x, "67", value.asInstanceOf[js.Any])
      
      inline def set68(value: `17`): Self = StObject.set(x, "68", value.asInstanceOf[js.Any])
      
      inline def set69(value: `17`): Self = StObject.set(x, "69", value.asInstanceOf[js.Any])
      
      inline def set7(value: MediaTypeName): Self = StObject.set(x, "7", value.asInstanceOf[js.Any])
      
      inline def set70(value: `17`): Self = StObject.set(x, "70", value.asInstanceOf[js.Any])
      
      inline def set71(value: `17`): Self = StObject.set(x, "71", value.asInstanceOf[js.Any])
      
      inline def set72(value: `18`): Self = StObject.set(x, "72", value.asInstanceOf[js.Any])
      
      inline def set73(value: `18`): Self = StObject.set(x, "73", value.asInstanceOf[js.Any])
      
      inline def set74(value: `18`): Self = StObject.set(x, "74", value.asInstanceOf[js.Any])
      
      inline def set75(value: `18`): Self = StObject.set(x, "75", value.asInstanceOf[js.Any])
      
      inline def set76(value: `18`): Self = StObject.set(x, "76", value.asInstanceOf[js.Any])
      
      inline def set77(value: `17`): Self = StObject.set(x, "77", value.asInstanceOf[js.Any])
      
      inline def set78(value: `17`): Self = StObject.set(x, "78", value.asInstanceOf[js.Any])
      
      inline def set79(value: `17`): Self = StObject.set(x, "79", value.asInstanceOf[js.Any])
      
      inline def set8(value: ChannelsClockRateMediaType): Self = StObject.set(x, "8", value.asInstanceOf[js.Any])
      
      inline def set80(value: `17`): Self = StObject.set(x, "80", value.asInstanceOf[js.Any])
      
      inline def set81(value: `17`): Self = StObject.set(x, "81", value.asInstanceOf[js.Any])
      
      inline def set82(value: `17`): Self = StObject.set(x, "82", value.asInstanceOf[js.Any])
      
      inline def set83(value: `17`): Self = StObject.set(x, "83", value.asInstanceOf[js.Any])
      
      inline def set84(value: `17`): Self = StObject.set(x, "84", value.asInstanceOf[js.Any])
      
      inline def set85(value: `17`): Self = StObject.set(x, "85", value.asInstanceOf[js.Any])
      
      inline def set86(value: `17`): Self = StObject.set(x, "86", value.asInstanceOf[js.Any])
      
      inline def set87(value: `17`): Self = StObject.set(x, "87", value.asInstanceOf[js.Any])
      
      inline def set88(value: `17`): Self = StObject.set(x, "88", value.asInstanceOf[js.Any])
      
      inline def set89(value: `17`): Self = StObject.set(x, "89", value.asInstanceOf[js.Any])
      
      inline def set9(value: ClockRateMediaTypeName): Self = StObject.set(x, "9", value.asInstanceOf[js.Any])
      
      inline def set90(value: `17`): Self = StObject.set(x, "90", value.asInstanceOf[js.Any])
      
      inline def set91(value: `17`): Self = StObject.set(x, "91", value.asInstanceOf[js.Any])
      
      inline def set92(value: `17`): Self = StObject.set(x, "92", value.asInstanceOf[js.Any])
      
      inline def set93(value: `17`): Self = StObject.set(x, "93", value.asInstanceOf[js.Any])
      
      inline def set94(value: `17`): Self = StObject.set(x, "94", value.asInstanceOf[js.Any])
      
      inline def set95(value: `17`): Self = StObject.set(x, "95", value.asInstanceOf[js.Any])
      
      inline def set96(value: `19`): Self = StObject.set(x, "96", value.asInstanceOf[js.Any])
      
      inline def set97(value: `19`): Self = StObject.set(x, "97", value.asInstanceOf[js.Any])
      
      inline def set98(value: `19`): Self = StObject.set(x, "98", value.asInstanceOf[js.Any])
      
      inline def set99(value: `19`): Self = StObject.set(x, "99", value.asInstanceOf[js.Any])
    }
  }
}
