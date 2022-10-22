package typingsJapgolly.winrt.global.Windows.Media

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingQuality
import typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality
import typingsJapgolly.winrt.Windows.Storage.IStorageFile
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaProperties {
  
  @JSGlobal("Windows.Media.MediaProperties.AudioEncodingProperties")
  @js.native
  open class AudioEncodingProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingProperties {
    
    /* CompleteClass */
    var bitrate: Double = js.native
    
    /* CompleteClass */
    var bitsPerSample: Double = js.native
    
    /* CompleteClass */
    var channelCount: Double = js.native
    
    /* CompleteClass */
    var properties: typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /* CompleteClass */
    var sampleRate: Double = js.native
    
    /* CompleteClass */
    var subtype: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
  @js.native
  object AudioEncodingQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingQuality & Double
      ] = js.native
    
    /* 0 */ val auto: typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.auto & Double = js.native
    
    /* 1 */ val high: typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.high & Double = js.native
    
    /* 3 */ val low: typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.low & Double = js.native
    
    /* 2 */ val medium: typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingQuality.medium & Double = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.ContainerEncodingProperties")
  @js.native
  open class ContainerEncodingProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.MediaProperties.ContainerEncodingProperties {
    
    /* CompleteClass */
    var properties: typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /* CompleteClass */
    var subtype: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
  @js.native
  open class ImageEncodingProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.MediaProperties.ImageEncodingProperties {
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var properties: typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /* CompleteClass */
    var subtype: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  /* static members */
  object ImageEncodingProperties {
    
    @JSGlobal("Windows.Media.MediaProperties.ImageEncodingProperties")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createJpeg(): typingsJapgolly.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createJpeg")().asInstanceOf[typingsJapgolly.winrt.Windows.Media.MediaProperties.ImageEncodingProperties]
    
    inline def createJpegXR(): typingsJapgolly.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createJpegXR")().asInstanceOf[typingsJapgolly.winrt.Windows.Media.MediaProperties.ImageEncodingProperties]
    
    inline def createPng(): typingsJapgolly.winrt.Windows.Media.MediaProperties.ImageEncodingProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("createPng")().asInstanceOf[typingsJapgolly.winrt.Windows.Media.MediaProperties.ImageEncodingProperties]
  }
  
  @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
  @js.native
  open class MediaEncodingProfile ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile {
    
    /* CompleteClass */
    var audio: typingsJapgolly.winrt.Windows.Media.MediaProperties.AudioEncodingProperties = js.native
    
    /* CompleteClass */
    var container: typingsJapgolly.winrt.Windows.Media.MediaProperties.ContainerEncodingProperties = js.native
    
    /* CompleteClass */
    var video: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingProperties = js.native
  }
  /* static members */
  object MediaEncodingProfile {
    
    @JSGlobal("Windows.Media.MediaProperties.MediaEncodingProfile")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromFileAsync(file: IStorageFile): IAsyncOperation[typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromFileAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]]
    
    inline def createFromStreamAsync(stream: IRandomAccessStream): IAsyncOperation[typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile] = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromStreamAsync")(stream.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]]
    
    inline def createM4a(quality: AudioEncodingQuality): typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createM4a")(quality.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    inline def createMp3(quality: AudioEncodingQuality): typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createMp3")(quality.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    inline def createMp4(quality: VideoEncodingQuality): typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createMp4")(quality.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    inline def createWma(quality: AudioEncodingQuality): typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createWma")(quality.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]
    
    inline def createWmv(quality: VideoEncodingQuality): typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile = ^.asInstanceOf[js.Dynamic].applyDynamic("createWmv")(quality.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaEncodingProfile]
  }
  
  @JSGlobal("Windows.Media.MediaProperties.MediaPropertySet")
  @js.native
  open class MediaPropertySet ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaPropertySet {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def first(): IIterator[IKeyValuePair[String, Any]] = js.native
    
    /* CompleteClass */
    override def getView(): IMapView[String, Any] = js.native
    
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def insert(key: String, value: Any): Boolean = js.native
    
    /* CompleteClass */
    override def lookup(key: String): Any = js.native
    
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.MediaRatio")
  @js.native
  open class MediaRatio ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaRatio {
    
    /* CompleteClass */
    var denominator: Double = js.native
    
    /* CompleteClass */
    var numerator: Double = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
  @js.native
  open class VideoEncodingProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingProperties {
    
    /* CompleteClass */
    var bitrate: Double = js.native
    
    /* CompleteClass */
    var frameRate: typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaRatio = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var pixelAspectRatio: typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaRatio = js.native
    
    /* CompleteClass */
    var properties: typingsJapgolly.winrt.Windows.Media.MediaProperties.MediaPropertySet = js.native
    
    /* CompleteClass */
    var subtype: String = js.native
    
    /* CompleteClass */
    var `type`: String = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  
  @JSGlobal("Windows.Media.MediaProperties.VideoEncodingQuality")
  @js.native
  object VideoEncodingQuality extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality & Double
      ] = js.native
    
    /* 0 */ val auto: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.auto & Double = js.native
    
    /* 1 */ val hD1080p: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD1080p & Double = js.native
    
    /* 2 */ val hD720p: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.hD720p & Double = js.native
    
    /* 4 */ val ntsc: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.ntsc & Double = js.native
    
    /* 5 */ val pal: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.pal & Double = js.native
    
    /* 7 */ val qvga: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.qvga & Double = js.native
    
    /* 6 */ val vga: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.vga & Double = js.native
    
    /* 3 */ val wvga: typingsJapgolly.winrt.Windows.Media.MediaProperties.VideoEncodingQuality.wvga & Double = js.native
  }
}
