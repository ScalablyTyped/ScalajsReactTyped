package typingsJapgolly.av

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.Blob
import org.scalajs.dom.File
import typingsJapgolly.av.AV.BufferFormats
import typingsJapgolly.av.AV.DemuxerConstructor
import typingsJapgolly.av.AV.Device
import typingsJapgolly.av.AV.DeviceConstructor
import typingsJapgolly.av.AV.HttpSourceOpts
import typingsJapgolly.av.AV.Source
import typingsJapgolly.av.AV.TypedArray
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AV {
    
    @JSGlobal("AV.Asset")
    @js.native
    open class Asset protected ()
      extends StObject
         with typingsJapgolly.av.AV.Asset {
      def this(source: Source) = this()
    }
    object Asset {
      
      @JSGlobal("AV.Asset")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromBuffer(buffer: BufferFormats): typingsJapgolly.av.AV.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.av.AV.Asset]
      
      /* static member */
      inline def fromFile(file: File): typingsJapgolly.av.AV.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(file.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.av.AV.Asset]
      
      /* static member */
      inline def fromURL(url: String): typingsJapgolly.av.AV.Asset = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.av.AV.Asset]
      inline def fromURL(url: String, opts: HttpSourceOpts): typingsJapgolly.av.AV.Asset = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.av.AV.Asset]
    }
    
    @JSGlobal("AV.AudioDevice")
    @js.native
    open class AudioDevice protected ()
      extends StObject
         with typingsJapgolly.av.AV.AudioDevice {
      def this(sampleRate: Double, channels: Double) = this()
    }
    object AudioDevice {
      
      @JSGlobal("AV.AudioDevice")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def create(sampleRate: Double, channels: Double): Device | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(sampleRate.asInstanceOf[js.Any], channels.asInstanceOf[js.Any])).asInstanceOf[Device | Null]
      
      /* static member */
      inline def register(device: DeviceConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(device.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("AV.BalanceFilter")
    @js.native
    open class BalanceFilter ()
      extends StObject
         with typingsJapgolly.av.AV.Filter {
      
      /* CompleteClass */
      override def process(buffer: TypedArray): Unit = js.native
    }
    
    @JSGlobal("AV.Bitstream")
    @js.native
    open class Bitstream protected ()
      extends StObject
         with typingsJapgolly.av.AV.Bitstream {
      def this(stream: typingsJapgolly.av.AV.Stream) = this()
    }
    
    @JSGlobal("AV.Buffer")
    @js.native
    open class Buffer protected ()
      extends StObject
         with typingsJapgolly.av.AV.Buffer {
      def this(data: TypedArray) = this()
      
      /* CompleteClass */
      override def copy(): typingsJapgolly.av.AV.Buffer = js.native
      
      /* CompleteClass */
      var length: Double = js.native
      
      /* CompleteClass */
      override def slice(offset: Double, length: Double): typingsJapgolly.av.AV.Buffer = js.native
      
      /* CompleteClass */
      override def toBlob(): Blob = js.native
      
      /* CompleteClass */
      override def toBlobURL(): String = js.native
    }
    object Buffer {
      
      @JSGlobal("AV.Buffer")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def allocate(size: Double): typingsJapgolly.av.AV.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("allocate")(size.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.av.AV.Buffer]
    }
    
    @JSGlobal("AV.BufferList")
    @js.native
    open class BufferList ()
      extends StObject
         with typingsJapgolly.av.AV.BufferList {
      
      /* CompleteClass */
      override def advance(): Boolean = js.native
      
      /* CompleteClass */
      override def append(buffer: typingsJapgolly.av.AV.Buffer): Unit = js.native
      
      /* CompleteClass */
      var availableBuffers: Double = js.native
      
      /* CompleteClass */
      var availableBytes: Double = js.native
      
      /* CompleteClass */
      override def copy(): typingsJapgolly.av.AV.BufferList = js.native
      
      /* CompleteClass */
      var first: typingsJapgolly.av.AV.Buffer | Null = js.native
      
      /* CompleteClass */
      var last: typingsJapgolly.av.AV.Buffer | Null = js.native
      
      /* CompleteClass */
      var numBuffers: Double = js.native
      
      /* CompleteClass */
      override def reset(): Unit = js.native
      
      /* CompleteClass */
      override def rewind(): Boolean = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("AV.BufferSource")
    @js.native
    open class BufferSource protected ()
      extends StObject
         with Source {
      def this(input: BufferFormats) = this()
    }
    
    /* note: abstract class */ @JSGlobal("AV.Decoder")
    @js.native
    open class Decoder ()
      extends StObject
         with typingsJapgolly.av.AV.Decoder
    object Decoder {
      
      @JSGlobal("AV.Decoder")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def find(id: String): typingsJapgolly.av.AV.Decoder | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(id.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.av.AV.Decoder | Null]
      
      /* static member */
      inline def register(id: String, decoder: Instantiable0[typingsJapgolly.av.AV.Decoder]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(id.asInstanceOf[js.Any], decoder.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /* note: abstract class */ @JSGlobal("AV.Demuxer")
    @js.native
    open class Demuxer ()
      extends StObject
         with typingsJapgolly.av.AV.Demuxer
    object Demuxer {
      
      @JSGlobal("AV.Demuxer")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def find(buffer: typingsJapgolly.av.AV.Buffer): typingsJapgolly.av.AV.Demuxer | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.av.AV.Demuxer | Null]
      
      /* static member */
      inline def register(demuxer: DemuxerConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(demuxer.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("AV.EventEmitter")
    @js.native
    open class EventEmitter ()
      extends StObject
         with typingsJapgolly.av.AV.EventEmitter {
      
      /* CompleteClass */
      override def emit(event: String, args: Any*): Unit = js.native
      
      /* CompleteClass */
      override def off(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
      
      /* CompleteClass */
      override def on(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
      
      /* CompleteClass */
      override def once(event: String, fn: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("AV.FileSource")
    @js.native
    open class FileSource protected ()
      extends StObject
         with Source {
      def this(file: File) = this()
    }
    
    @JSGlobal("AV.Filter")
    @js.native
    open class Filter ()
      extends StObject
         with typingsJapgolly.av.AV.Filter {
      def this(context: js.Object, key: String) = this()
      
      /* CompleteClass */
      override def process(buffer: TypedArray): Unit = js.native
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("AV.HTTPSource")
    @js.native
    open class HTTPSource protected ()
      extends StObject
         with Source {
      def this(url: String) = this()
      def this(url: String, opts: HttpSourceOpts) = this()
    }
    
    @JSGlobal("AV.Player")
    @js.native
    open class Player protected ()
      extends StObject
         with typingsJapgolly.av.AV.Player {
      def this(asset: typingsJapgolly.av.AV.Asset) = this()
    }
    object Player {
      
      @JSGlobal("AV.Player")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromBuffer(buffer: BufferFormats): typingsJapgolly.av.AV.Player = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.av.AV.Player]
      
      /* static member */
      inline def fromFile(file: File): typingsJapgolly.av.AV.Player = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(file.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.av.AV.Player]
      
      /* static member */
      inline def fromURL(url: String): typingsJapgolly.av.AV.Player = ^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.av.AV.Player]
      inline def fromURL(url: String, opts: HttpSourceOpts): typingsJapgolly.av.AV.Player = (^.asInstanceOf[js.Dynamic].applyDynamic("fromURL")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.av.AV.Player]
    }
    
    @JSGlobal("AV.Stream")
    @js.native
    open class Stream protected ()
      extends StObject
         with typingsJapgolly.av.AV.Stream {
      def this(list: typingsJapgolly.av.AV.BufferList) = this()
    }
    object Stream {
      
      @JSGlobal("AV.Stream")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromBuffer(buffer: typingsJapgolly.av.AV.Buffer): typingsJapgolly.av.AV.Stream = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.av.AV.Stream]
    }
    
    @JSGlobal("AV.UnderflowError")
    @js.native
    open class UnderflowError ()
      extends StObject
         with Error {
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
    }
    
    @JSGlobal("AV.VolumeFilter")
    @js.native
    open class VolumeFilter ()
      extends StObject
         with typingsJapgolly.av.AV.Filter {
      
      /* CompleteClass */
      override def process(buffer: TypedArray): Unit = js.native
    }
  }
}
