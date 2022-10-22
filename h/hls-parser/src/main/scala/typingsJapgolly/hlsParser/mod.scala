package typingsJapgolly.hlsParser

import typingsJapgolly.hlsParser.anon.AssocLanguage
import typingsJapgolly.hlsParser.anon.Attributes
import typingsJapgolly.hlsParser.anon.Audio
import typingsJapgolly.hlsParser.anon.AverageBandwidth
import typingsJapgolly.hlsParser.anon.BasePlaylistConstructorPr
import typingsJapgolly.hlsParser.anon.BasePlaylistConstructorPrCurrentVariant
import typingsJapgolly.hlsParser.anon.BasePlaylistConstructorPrDiscontinuitySequenceBase
import typingsJapgolly.hlsParser.anon.Discontinuity
import typingsJapgolly.hlsParser.anon.Duration
import typingsJapgolly.hlsParser.anon.Format
import typingsJapgolly.hlsParser.anon.Height
import typingsJapgolly.hlsParser.anon.Id
import typingsJapgolly.hlsParser.anon.LastMSN
import typingsJapgolly.hlsParser.anon.Offset
import typingsJapgolly.hlsParser.anon.PartialOptions
import typingsJapgolly.hlsParser.anon.Uri
import typingsJapgolly.hlsParser.hlsParserBooleans.`false`
import typingsJapgolly.hlsParser.hlsParserBooleans.`true`
import typingsJapgolly.hlsParser.hlsParserStrings.AUDIO
import typingsJapgolly.hlsParser.hlsParserStrings.EVENT
import typingsJapgolly.hlsParser.hlsParserStrings.SUBTITLES
import typingsJapgolly.hlsParser.hlsParserStrings.VIDEO
import typingsJapgolly.hlsParser.hlsParserStrings.VOD
import typingsJapgolly.hlsParser.hlsParserStrings.`CLOSED-CAPTIONS`
import typingsJapgolly.hlsParser.hlsParserStrings.playlist
import typingsJapgolly.hlsParser.hlsParserStrings.segment
import typingsJapgolly.hlsParser.mod.types.MasterPlaylist
import typingsJapgolly.hlsParser.mod.types.MediaPlaylist
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hls-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hls-parser", "Data")
  @js.native
  open class Data () extends StObject {
    
    var `type`: playlist | segment = js.native
  }
  
  inline def getOptions(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[Options]
  
  inline def parse(manifest: String): MasterPlaylist | MediaPlaylist = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(manifest.asInstanceOf[js.Any]).asInstanceOf[MasterPlaylist | MediaPlaylist]
  
  inline def setOptions(overrides: PartialOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptions")(overrides.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stringify(playlist: MasterPlaylist): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(playlist.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(playlist: MediaPlaylist): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(playlist.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object types {
    
    @JSImport("hls-parser", "types.DateRange")
    @js.native
    open class DateRange protected () extends StObject {
      def this(properties: Attributes) = this()
      
      var attributes: js.UndefOr[js.Object] = js.native
      
      var classId: js.UndefOr[String] = js.native
      
      var duration: js.UndefOr[Double] = js.native
      
      var end: js.UndefOr[js.Date] = js.native
      
      var endOnNext: js.UndefOr[Boolean] = js.native
      
      var id: String = js.native
      
      var plannedDuration: js.UndefOr[Double] = js.native
      
      var start: js.Date = js.native
    }
    
    @JSImport("hls-parser", "types.Key")
    @js.native
    open class Key protected () extends StObject {
      def this(properties: Format) = this()
      
      var format: js.UndefOr[String] = js.native
      
      var formatVersion: js.UndefOr[String] = js.native
      
      var iv: js.UndefOr[Buffer] = js.native
      
      var method: String = js.native
      
      var uri: js.UndefOr[String] = js.native
    }
    
    @JSImport("hls-parser", "types.MasterPlaylist")
    @js.native
    open class MasterPlaylist protected () extends Playlist {
      def this(properties: BasePlaylistConstructorPrCurrentVariant) = this()
      
      var currentVariant: js.UndefOr[Double] = js.native
      
      @JSName("isMasterPlaylist")
      var isMasterPlaylist_MasterPlaylist: `true` = js.native
      
      var sessionDataList: js.Array[SessionData] = js.native
      
      var sessionKeyList: js.Array[Key] = js.native
      
      var variants: js.Array[Variant] = js.native
    }
    
    @JSImport("hls-parser", "types.MediaInitializationSection")
    @js.native
    open class MediaInitializationSection protected () extends StObject {
      def this(properties: Uri) = this()
      
      var byterange: js.UndefOr[Byterange] = js.native
      
      var uri: String = js.native
    }
    
    @JSImport("hls-parser", "types.MediaPlaylist")
    @js.native
    open class MediaPlaylist protected () extends Playlist {
      def this(properties: BasePlaylistConstructorPrDiscontinuitySequenceBase) = this()
      
      var discontinuitySequenceBase: js.UndefOr[Double] = js.native
      
      var endlist: Boolean = js.native
      
      var isIFrame: Boolean = js.native
      
      @JSName("isMasterPlaylist")
      var isMasterPlaylist_MediaPlaylist: `false` = js.native
      
      var lowLatencyCompatibility: js.UndefOr[LowLatencyCompatibility] = js.native
      
      var mediaSequenceBase: js.UndefOr[Double] = js.native
      
      var partTargetDuration: js.UndefOr[Double] = js.native
      
      var playlistType: js.UndefOr[EVENT | VOD] = js.native
      
      var prefetchSegments: js.Array[PrefetchSegment] = js.native
      
      var renditionReports: js.UndefOr[js.Array[RenditionReport]] = js.native
      
      var segments: js.Array[Segment] = js.native
      
      var skip: js.UndefOr[Double] = js.native
      
      var targetDuration: Double = js.native
    }
    
    @JSImport("hls-parser", "types.PartialSegment")
    @js.native
    open class PartialSegment protected () extends StObject {
      def this(properties: Duration) = this()
      
      var byterange: js.UndefOr[ByteRange] = js.native
      
      var duration: js.UndefOr[Double] = js.native
      
      var gap: js.UndefOr[Boolean] = js.native
      
      var hint: js.UndefOr[Boolean] = js.native
      
      var independent: js.UndefOr[Boolean] = js.native
      
      var uri: String = js.native
    }
    
    @JSImport("hls-parser", "types.Playlist")
    @js.native
    open class Playlist protected () extends Data {
      def this(properties: BasePlaylistConstructorPr) = this()
      
      var independentSegments: Boolean = js.native
      
      var isMasterPlaylist: Boolean = js.native
      
      var source: js.UndefOr[String] = js.native
      
      var start: js.UndefOr[Offset] = js.native
      
      var uri: js.UndefOr[String] = js.native
      
      var version: js.UndefOr[Double] = js.native
    }
    
    @JSImport("hls-parser", "types.PrefetchSegment")
    @js.native
    open class PrefetchSegment protected () extends Data {
      def this(properties: Discontinuity) = this()
      
      var discontinuity: js.UndefOr[Boolean] = js.native
      
      var discontinuitySequence: Double = js.native
      
      var key: js.UndefOr[Key] = js.native
      
      var mediaSequenceNumber: Double = js.native
      
      var uri: String = js.native
    }
    
    @JSImport("hls-parser", "types.Rendition")
    @js.native
    open class Rendition[T] protected () extends StObject {
      def this(properties: AssocLanguage[T]) = this()
      
      var assocLanguage: js.UndefOr[String] = js.native
      
      var autoselect: Boolean = js.native
      
      var channels: js.UndefOr[String] = js.native
      
      var characteristics: js.UndefOr[String] = js.native
      
      var forced: Boolean = js.native
      
      var groupId: String = js.native
      
      var instreamId: js.UndefOr[String] = js.native
      
      var isDefault: Boolean = js.native
      
      var language: js.UndefOr[String] = js.native
      
      var name: String = js.native
      
      var `type`: T = js.native
      
      var uri: js.UndefOr[String] = js.native
    }
    
    @JSImport("hls-parser", "types.RenditionReport")
    @js.native
    open class RenditionReport protected () extends StObject {
      def this(properties: LastMSN) = this()
      
      var lastMSN: js.UndefOr[Double] = js.native
      
      var lastPart: js.UndefOr[Double] = js.native
      
      var uri: String = js.native
    }
    
    @JSImport("hls-parser", "types.Segment")
    @js.native
    open class Segment protected () extends Data {
      def this(properties: typingsJapgolly.hlsParser.anon.Byterange) = this()
      
      var byterange: js.UndefOr[Byterange] = js.native
      
      var dateRange: DateRange = js.native
      
      var discontinuity: js.UndefOr[Boolean] = js.native
      
      var discontinuitySequence: Double = js.native
      
      var duration: Double = js.native
      
      var key: js.UndefOr[Key] = js.native
      
      var map: js.UndefOr[MediaInitializationSection] = js.native
      
      var mediaSequenceNumber: Double = js.native
      
      var parts: js.UndefOr[js.Array[PartialSegment]] = js.native
      
      var programDateTime: js.UndefOr[js.Date] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var uri: String = js.native
    }
    
    @JSImport("hls-parser", "types.SessionData")
    @js.native
    open class SessionData protected () extends StObject {
      def this(properties: Id) = this()
      
      var id: String = js.native
      
      var language: js.UndefOr[String] = js.native
      
      var uri: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    
    @JSImport("hls-parser", "types.Variant")
    @js.native
    open class Variant protected () extends StObject {
      def this(properties: AverageBandwidth) = this()
      
      var audio: js.Array[Rendition[AUDIO]] = js.native
      
      var averageBandwidth: js.UndefOr[Double] = js.native
      
      var bandwidth: Double = js.native
      
      var closedCaptions: js.Array[Rendition[`CLOSED-CAPTIONS`]] = js.native
      
      var codecs: js.UndefOr[String] = js.native
      
      var currentRenditions: Audio = js.native
      
      var frameRate: js.UndefOr[Double] = js.native
      
      var hdcpLevel: js.UndefOr[String] = js.native
      
      var isIFrameOnly: js.UndefOr[Boolean] = js.native
      
      var resolution: js.UndefOr[Height] = js.native
      
      var subtitles: js.Array[Rendition[SUBTITLES]] = js.native
      
      var uri: String = js.native
      
      var video: js.Array[Rendition[VIDEO]] = js.native
    }
    
    trait BasePlaylistConstructorProperties extends StObject {
      
      var independentSegments: js.UndefOr[Boolean] = js.undefined
      
      var source: js.UndefOr[String] = js.undefined
      
      var start: js.UndefOr[Offset] = js.undefined
      
      var uri: js.UndefOr[String] = js.undefined
      
      var version: js.UndefOr[Double] = js.undefined
    }
    object BasePlaylistConstructorProperties {
      
      inline def apply(): BasePlaylistConstructorProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BasePlaylistConstructorProperties]
      }
      
      extension [Self <: BasePlaylistConstructorProperties](x: Self) {
        
        inline def setIndependentSegments(value: Boolean): Self = StObject.set(x, "independentSegments", value.asInstanceOf[js.Any])
        
        inline def setIndependentSegmentsUndefined: Self = StObject.set(x, "independentSegments", js.undefined)
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        inline def setStart(value: Offset): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
        
        inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
        
        inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    trait ByteRange extends StObject {
      
      var length: Double
      
      var offset: Double
    }
    object ByteRange {
      
      inline def apply(length: Double, offset: Double): ByteRange = {
        val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[ByteRange]
      }
      
      extension [Self <: ByteRange](x: Self) {
        
        inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      }
    }
    
    trait LowLatencyCompatibility extends StObject {
      
      var canBlockReload: js.UndefOr[Boolean] = js.undefined
      
      var canSkipUntil: js.UndefOr[Boolean] = js.undefined
      
      var holdBack: js.UndefOr[Double] = js.undefined
      
      var partHoldBack: js.UndefOr[Double] = js.undefined
    }
    object LowLatencyCompatibility {
      
      inline def apply(): LowLatencyCompatibility = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LowLatencyCompatibility]
      }
      
      extension [Self <: LowLatencyCompatibility](x: Self) {
        
        inline def setCanBlockReload(value: Boolean): Self = StObject.set(x, "canBlockReload", value.asInstanceOf[js.Any])
        
        inline def setCanBlockReloadUndefined: Self = StObject.set(x, "canBlockReload", js.undefined)
        
        inline def setCanSkipUntil(value: Boolean): Self = StObject.set(x, "canSkipUntil", value.asInstanceOf[js.Any])
        
        inline def setCanSkipUntilUndefined: Self = StObject.set(x, "canSkipUntil", js.undefined)
        
        inline def setHoldBack(value: Double): Self = StObject.set(x, "holdBack", value.asInstanceOf[js.Any])
        
        inline def setHoldBackUndefined: Self = StObject.set(x, "holdBack", js.undefined)
        
        inline def setPartHoldBack(value: Double): Self = StObject.set(x, "partHoldBack", value.asInstanceOf[js.Any])
        
        inline def setPartHoldBackUndefined: Self = StObject.set(x, "partHoldBack", js.undefined)
      }
    }
  }
  
  trait Byterange extends StObject {
    
    var length: Double
    
    var offset: Double
  }
  object Byterange {
    
    inline def apply(length: Double, offset: Double): Byterange = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Byterange]
    }
    
    extension [Self <: Byterange](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var strictMode: Boolean
  }
  object Options {
    
    inline def apply(strictMode: Boolean): Options = {
      val __obj = js.Dynamic.literal(strictMode = strictMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setStrictMode(value: Boolean): Self = StObject.set(x, "strictMode", value.asInstanceOf[js.Any])
    }
  }
}
