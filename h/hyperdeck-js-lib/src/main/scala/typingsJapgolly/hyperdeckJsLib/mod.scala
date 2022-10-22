package typingsJapgolly.hyperdeckJsLib

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hyperdeckJsLib.anon.Connected
import typingsJapgolly.hyperdeckJsLib.anon.Ip
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`false`
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`true`
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.asynchronousEvent
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.connectionLost
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.connectionStateChange
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.empty
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.error
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.forward
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.jog
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.mounted
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.mounting
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.play
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.preview
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.record
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.rewind
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.shuttle
import typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.stopped
import typingsJapgolly.hyperdeckJsLib.mod.Hyperdeck.ClipList
import typingsJapgolly.hyperdeckJsLib.mod.Hyperdeck.Config
import typingsJapgolly.hyperdeckJsLib.mod.Hyperdeck.Notifier
import typingsJapgolly.hyperdeckJsLib.mod.Hyperdeck.Response
import typingsJapgolly.hyperdeckJsLib.mod.Hyperdeck.SlotInfo
import typingsJapgolly.hyperdeckJsLib.mod.Hyperdeck.Timecode
import typingsJapgolly.hyperdeckJsLib.mod.Hyperdeck.TransportInfo
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hyperdeck-js-lib", "Hyperdeck")
  @js.native
  open class Hyperdeck protected () extends HyperdeckCore {
    def this(config: Config) = this()
    
    def clipsGet(): js.Promise[Response[ClipList]] = js.native
    
    def format(format: String): js.Promise[Response[Any]] = js.native
    
    def goTo(timecode: Timecode): js.Promise[Response[Any]] = js.native
    
    def jogBackwards(timecode: Timecode): js.Promise[Response[Any]] = js.native
    
    def jogForward(timecode: Timecode): js.Promise[Response[Any]] = js.native
    
    def jogTo(timecode: Timecode): js.Promise[Response[Any]] = js.native
    
    def nextClip(): js.Promise[Response[Any]] = js.native
    
    def play(): js.Promise[Response[Any]] = js.native
    def play(speed: Double): js.Promise[Response[Any]] = js.native
    
    def prevClip(): js.Promise[Response[Any]] = js.native
    
    def record(): js.Promise[Response[Any]] = js.native
    
    def slotInfo(): js.Promise[Response[SlotInfo]] = js.native
    def slotInfo(id: Double): js.Promise[Response[SlotInfo]] = js.native
    
    def slotSelect(): js.Promise[Response[Any]] = js.native
    def slotSelect(id: Double): js.Promise[Response[Any]] = js.native
    
    def stop(): js.Promise[Response[Any]] = js.native
    
    def transportInfo(): js.Promise[Response[TransportInfo]] = js.native
  }
  object Hyperdeck {
    
    @JSImport("hyperdeck-js-lib", "Hyperdeck.Notifier")
    @js.native
    open class Notifier () extends EventEmitter {
      def this(options: EventEmitterOptions) = this()
      
      @JSName("on")
      def on_asynchronousEvent(event: asynchronousEvent, callback: js.Function1[/* response */ Response[Any], Unit]): this.type = js.native
      @JSName("on")
      def on_connectionLost(event: connectionLost, callback: js.Function0[Unit]): this.type = js.native
      @JSName("on")
      def on_connectionStateChange(event: connectionStateChange, callback: js.Function1[/* response */ Connected, Unit]): this.type = js.native
      
      @JSName("once")
      def once_asynchronousEvent(event: asynchronousEvent, callback: js.Function1[/* response */ Response[Any], Unit]): this.type = js.native
      @JSName("once")
      def once_connectionLost(event: connectionLost, callback: js.Function0[Unit]): this.type = js.native
      @JSName("once")
      def once_connectionStateChange(event: connectionStateChange, callback: js.Function1[/* response */ Connected, Unit]): this.type = js.native
    }
    
    type ClipList = StringDictionary[/* template literal string: ${string} ${Timecode} ${Timecode} */ String]
    
    type Config = String | Ip
    
    trait DeviceInfo extends StObject {
      
      var model: String
      
      var `protocol version`: String
      
      var `unique id`: String
    }
    object DeviceInfo {
      
      inline def apply(model: String, `protocol version`: String, `unique id`: String): DeviceInfo = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.updateDynamic("protocol version")((`protocol version`).asInstanceOf[js.Any])
        __obj.updateDynamic("unique id")((`unique id`).asInstanceOf[js.Any])
        __obj.asInstanceOf[DeviceInfo]
      }
      
      extension [Self <: DeviceInfo](x: Self) {
        
        inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        inline def `setProtocol version`(value: String): Self = StObject.set(x, "protocol version", value.asInstanceOf[js.Any])
        
        inline def `setUnique id`(value: String): Self = StObject.set(x, "unique id", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeUncompressed
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResHQ
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProRes
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResLT
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResProxy
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD220
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD220
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHR_HQX
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_HQX
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Low
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Medium
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`HDot264High `
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHD45 `
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD45
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD145
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD145
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHR_SQ `
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_SQ
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuicktimeDNxHR_LB
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_LB
    */
    trait FileFormat extends StObject
    object FileFormat {
      
      inline def DNxHD145: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD145 = "DNxHD145".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD145]
      
      inline def DNxHD220: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD220 = "DNxHD220".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD220]
      
      inline def DNxHD45: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD45 = "DNxHD45".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHD45]
      
      inline def DNxHR_HQX: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_HQX = "DNxHR_HQX".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_HQX]
      
      inline def DNxHR_LB: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_LB = "DNxHR_LB".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_LB]
      
      inline def DNxHR_SQ: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_SQ = "DNxHR_SQ".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.DNxHR_SQ]
      
      inline def `HDot264High `: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`HDot264High ` = ("H.264High ").asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`HDot264High `]
      
      inline def HDot264Low: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Low = "H.264Low".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Low]
      
      inline def HDot264Medium: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Medium = "H.264Medium".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.HDot264Medium]
      
      inline def QuickTimeDNxHD145: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD145 = "QuickTimeDNxHD145".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD145]
      
      inline def QuickTimeDNxHD220: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD220 = "QuickTimeDNxHD220".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHD220]
      
      inline def `QuickTimeDNxHD45 `: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHD45 ` = ("QuickTimeDNxHD45 ").asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHD45 `]
      
      inline def QuickTimeDNxHR_HQX: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHR_HQX = "QuickTimeDNxHR_HQX".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeDNxHR_HQX]
      
      inline def `QuickTimeDNxHR_SQ `: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHR_SQ ` = ("QuickTimeDNxHR_SQ ").asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`QuickTimeDNxHR_SQ `]
      
      inline def QuickTimeProRes: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProRes = "QuickTimeProRes".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProRes]
      
      inline def QuickTimeProResHQ: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResHQ = "QuickTimeProResHQ".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResHQ]
      
      inline def QuickTimeProResLT: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResLT = "QuickTimeProResLT".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResLT]
      
      inline def QuickTimeProResProxy: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResProxy = "QuickTimeProResProxy".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeProResProxy]
      
      inline def QuickTimeUncompressed: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeUncompressed = "QuickTimeUncompressed".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuickTimeUncompressed]
      
      inline def QuicktimeDNxHR_LB: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuicktimeDNxHR_LB = "QuicktimeDNxHR_LB".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.QuicktimeDNxHR_LB]
    }
    
    trait Response[T] extends StObject {
      
      var code: Double
      
      var params: T
      
      var text: String
    }
    object Response {
      
      inline def apply[T](code: Double, params: T, text: String): Response[T] = {
        val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[Response[T]]
      }
      
      extension [Self <: Response[?], T](x: Self & Response[T]) {
        
        inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
    
    trait SlotInfo extends StObject {
      
      var `recording time`: String
      
      var `slot id`: String
      
      var status: empty | mounting | mounted | error
      
      var `video format`: VideoFormat
      
      var `volume name`: String
    }
    object SlotInfo {
      
      inline def apply(
        `recording time`: String,
        `slot id`: String,
        status: empty | mounting | mounted | error,
        `video format`: VideoFormat,
        `volume name`: String
      ): SlotInfo = {
        val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
        __obj.updateDynamic("recording time")((`recording time`).asInstanceOf[js.Any])
        __obj.updateDynamic("slot id")((`slot id`).asInstanceOf[js.Any])
        __obj.updateDynamic("video format")((`video format`).asInstanceOf[js.Any])
        __obj.updateDynamic("volume name")((`volume name`).asInstanceOf[js.Any])
        __obj.asInstanceOf[SlotInfo]
      }
      
      extension [Self <: SlotInfo](x: Self) {
        
        inline def `setRecording time`(value: String): Self = StObject.set(x, "recording time", value.asInstanceOf[js.Any])
        
        inline def `setSlot id`(value: String): Self = StObject.set(x, "slot id", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: empty | mounting | mounted | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def `setVideo format`(value: VideoFormat): Self = StObject.set(x, "video format", value.asInstanceOf[js.Any])
        
        inline def `setVolume name`(value: String): Self = StObject.set(x, "volume name", value.asInstanceOf[js.Any])
      }
    }
    
    /** Format is `hours:minutes:seconds:frames` */
    type Timecode = /* template literal string: ${number}:${number}:${number}:${number} */ String
    
    trait TransportInfo extends StObject {
      
      /** could be "none" */
      var `clip id`: String
      
      var `display timecode`: Timecode
      
      var loop: `true` | `false`
      
      /** could be "none" */
      var `slot id`: String
      
      var speed: String
      
      var status: preview | stopped | play | forward | rewind | jog | shuttle | record
      
      var timecode: Timecode
      
      var `video format`: VideoFormat
    }
    object TransportInfo {
      
      inline def apply(
        `clip id`: String,
        `display timecode`: Timecode,
        loop: `true` | `false`,
        `slot id`: String,
        speed: String,
        status: preview | stopped | play | forward | rewind | jog | shuttle | record,
        timecode: Timecode,
        `video format`: VideoFormat
      ): TransportInfo = {
        val __obj = js.Dynamic.literal(loop = loop.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timecode = timecode.asInstanceOf[js.Any])
        __obj.updateDynamic("clip id")((`clip id`).asInstanceOf[js.Any])
        __obj.updateDynamic("display timecode")((`display timecode`).asInstanceOf[js.Any])
        __obj.updateDynamic("slot id")((`slot id`).asInstanceOf[js.Any])
        __obj.updateDynamic("video format")((`video format`).asInstanceOf[js.Any])
        __obj.asInstanceOf[TransportInfo]
      }
      
      extension [Self <: TransportInfo](x: Self) {
        
        inline def `setClip id`(value: String): Self = StObject.set(x, "clip id", value.asInstanceOf[js.Any])
        
        inline def `setDisplay timecode`(value: Timecode): Self = StObject.set(x, "display timecode", value.asInstanceOf[js.Any])
        
        inline def setLoop(value: `true` | `false`): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
        
        inline def `setSlot id`(value: String): Self = StObject.set(x, "slot id", value.asInstanceOf[js.Any])
        
        inline def setSpeed(value: String): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: preview | stopped | play | forward | rewind | jog | shuttle | record): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setTimecode(value: Timecode): Self = StObject.set(x, "timecode", value.asInstanceOf[js.Any])
        
        inline def `setVideo format`(value: VideoFormat): Self = StObject.set(x, "video format", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.NTSC
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.PAL
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.NTSCp
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.PALp
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`720p50`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`720p5994`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`720p60`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p23976`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p24`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p25`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p2997`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p30`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i50`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i5994`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i60`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp23976`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp24`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp25`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp2997`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp30`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp50`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp5994`
      - typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp60`
    */
    trait VideoFormat extends StObject
    object VideoFormat {
      
      inline def `1080i50`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i50` = "1080i50".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i50`]
      
      inline def `1080i5994`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i5994` = "1080i5994".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i5994`]
      
      inline def `1080i60`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i60` = "1080i60".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080i60`]
      
      inline def `1080p23976`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p23976` = "1080p23976".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p23976`]
      
      inline def `1080p24`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p24` = "1080p24".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p24`]
      
      inline def `1080p25`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p25` = "1080p25".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p25`]
      
      inline def `1080p2997`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p2997` = "1080p2997".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p2997`]
      
      inline def `1080p30`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p30` = "1080p30".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`1080p30`]
      
      inline def `4Kp23976`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp23976` = "4Kp23976".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp23976`]
      
      inline def `4Kp24`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp24` = "4Kp24".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp24`]
      
      inline def `4Kp25`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp25` = "4Kp25".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp25`]
      
      inline def `4Kp2997`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp2997` = "4Kp2997".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp2997`]
      
      inline def `4Kp30`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp30` = "4Kp30".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp30`]
      
      inline def `4Kp50`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp50` = "4Kp50".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp50`]
      
      inline def `4Kp5994`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp5994` = "4Kp5994".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp5994`]
      
      inline def `4Kp60`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp60` = "4Kp60".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`4Kp60`]
      
      inline def `720p50`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`720p50` = "720p50".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`720p50`]
      
      inline def `720p5994`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`720p5994` = "720p5994".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`720p5994`]
      
      inline def `720p60`: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`720p60` = "720p60".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.`720p60`]
      
      inline def NTSC: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.NTSC = "NTSC".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.NTSC]
      
      inline def NTSCp: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.NTSCp = "NTSCp".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.NTSCp]
      
      inline def PAL: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.PAL = "PAL".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.PAL]
      
      inline def PALp: typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.PALp = "PALp".asInstanceOf[typingsJapgolly.hyperdeckJsLib.hyperdeckJsLibStrings.PALp]
    }
  }
  
  @JSImport("hyperdeck-js-lib", "HyperdeckCore")
  @js.native
  open class HyperdeckCore () extends StObject {
    
    /**
      * Destroy the hyperdeck instance, and disconnect if connected.
      */
    def destroy(): Unit = js.native
    
    /**
      * Get the notifier.
      * Events with id 'asynchronousEvent' will be emitted from this for asynchronous events
      * from the hyperdeck.
      * 'connectionLost' is emitted if the hyperdeck connection is lost (or fails to connect)
      */
    def getNotifier(): Notifier = js.native
    
    /**
      * Determine if currently connected to the hyperdeck.
      * @return boolean true if connected, false otherwise.
      */
    def isConnected(): Boolean = js.native
    
    /**
      * Make a request to the hyperdeck.
      * - If the hyperdeck returns a success response the promise will be resolved
      *   with the payload.
      * - If the hyperdeck returns a failure response the promise will be rejected
      *   with the payload.
      * - If the hyperdeck looses connection or is not connected the promise will be
      *   rejected and the payload will be `null`.
      * @return The promise which will resolve/reject when a response has been received
      *         (or connection lost).
      */
    // tslint:disable-next-line:no-unnecessary-generics
    def makeRequest[T](command: String): js.Promise[Response[T]] = js.native
    
    /**
      * Returns a promise that resolves when they hyperdeck is connected,
      * or rejected if the connection fails.
      */
    def onConnected(): js.Promise[Unit] = js.native
  }
  
  @JSImport("hyperdeck-js-lib", "Logger")
  @js.native
  val Logger: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalLogger */ Any = js.native
}
