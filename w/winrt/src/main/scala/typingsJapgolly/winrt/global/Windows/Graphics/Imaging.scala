package typingsJapgolly.winrt.global.Windows.Graphics

import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrt.Windows.Foundation.Collections.IIterator
import typingsJapgolly.winrt.Windows.Foundation.Collections.IKeyValuePair
import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.IAsyncAction
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperation
import typingsJapgolly.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typingsJapgolly.winrt.Windows.Foundation.PropertyType
import typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapBounds
import typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapFlip
import typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode
import typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapRotation
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import typingsJapgolly.winrt.Windows.Storage.Streams.IInputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IOutputStream
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Imaging {
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
  @js.native
  object BitmapAlphaMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapAlphaMode & Double] = js.native
    
    /* 2 */ val ignore: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.ignore & Double = js.native
    
    /* 0 */ val premultiplied: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.premultiplied & Double = js.native
    
    /* 1 */ val straight: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapAlphaMode.straight & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapCodecInformation")
  @js.native
  open class BitmapCodecInformation ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapCodecInformation {
    
    /* CompleteClass */
    var codecId: String = js.native
    
    /* CompleteClass */
    var fileExtensions: IVectorView[String] = js.native
    
    /* CompleteClass */
    var friendlyName: String = js.native
    
    /* CompleteClass */
    var mimeTypes: IVectorView[String] = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
  @js.native
  open class BitmapDecoder ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapDecoder {
    
    /* CompleteClass */
    var bitmapContainerProperties: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapPropertiesView = js.native
    
    /* CompleteClass */
    var decoderInformation: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapCodecInformation = js.native
    
    /* CompleteClass */
    var frameCount: Double = js.native
    
    /* CompleteClass */
    override def getFrameAsync(frameIndex: Double): IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapFrame] = js.native
    
    /* CompleteClass */
    override def getPreviewAsync(): IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.ImageStream] = js.native
  }
  /* static members */
  object BitmapDecoder {
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.bmpDecoderId")
    @js.native
    def bmpDecoderId: String = js.native
    inline def bmpDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpDecoderId")(x.asInstanceOf[js.Any])
    
    inline def createAsync(decoderId: String, stream: IRandomAccessStream): IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapDecoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(decoderId.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapDecoder]]
    inline def createAsync(stream: IRandomAccessStream): IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapDecoder] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(stream.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapDecoder]]
    
    inline def getDecoderInformationEnumerator(): IVectorView[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecoderInformationEnumerator")().asInstanceOf[IVectorView[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapCodecInformation]]
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.gifDecoderId")
    @js.native
    def gifDecoderId: String = js.native
    inline def gifDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gifDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.icoDecoderId")
    @js.native
    def icoDecoderId: String = js.native
    inline def icoDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icoDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.jpegDecoderId")
    @js.native
    def jpegDecoderId: String = js.native
    inline def jpegDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.jpegXRDecoderId")
    @js.native
    def jpegXRDecoderId: String = js.native
    inline def jpegXRDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXRDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.pngDecoderId")
    @js.native
    def pngDecoderId: String = js.native
    inline def pngDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pngDecoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapDecoder.tiffDecoderId")
    @js.native
    def tiffDecoderId: String = js.native
    inline def tiffDecoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiffDecoderId")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
  @js.native
  open class BitmapEncoder ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapEncoder
  /* static members */
  object BitmapEncoder {
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.bmpEncoderId")
    @js.native
    def bmpEncoderId: String = js.native
    inline def bmpEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bmpEncoderId")(x.asInstanceOf[js.Any])
    
    inline def createAsync(encoderId: String, stream: IRandomAccessStream): IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapEncoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(encoderId.asInstanceOf[js.Any], stream.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapEncoder]]
    inline def createAsync(
      encoderId: String,
      stream: IRandomAccessStream,
      encodingOptions: IIterable[
          IKeyValuePair[String, typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapTypedValue]
        ]
    ): IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapEncoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")(encoderId.asInstanceOf[js.Any], stream.asInstanceOf[js.Any], encodingOptions.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapEncoder]]
    
    inline def createForInPlacePropertyEncodingAsync(bitmapDecoder: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapDecoder): IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapEncoder] = ^.asInstanceOf[js.Dynamic].applyDynamic("createForInPlacePropertyEncodingAsync")(bitmapDecoder.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapEncoder]]
    
    inline def createForTranscodingAsync(
      stream: IRandomAccessStream,
      bitmapDecoder: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapDecoder
    ): IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapEncoder] = (^.asInstanceOf[js.Dynamic].applyDynamic("createForTranscodingAsync")(stream.asInstanceOf[js.Any], bitmapDecoder.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapEncoder]]
    
    inline def getEncoderInformationEnumerator(): IVectorView[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapCodecInformation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getEncoderInformationEnumerator")().asInstanceOf[IVectorView[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapCodecInformation]]
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.gifEncoderId")
    @js.native
    def gifEncoderId: String = js.native
    inline def gifEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gifEncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.jpegEncoderId")
    @js.native
    def jpegEncoderId: String = js.native
    inline def jpegEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegEncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.jpegXREncoderId")
    @js.native
    def jpegXREncoderId: String = js.native
    inline def jpegXREncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jpegXREncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.pngEncoderId")
    @js.native
    def pngEncoderId: String = js.native
    inline def pngEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pngEncoderId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.Graphics.Imaging.BitmapEncoder.tiffEncoderId")
    @js.native
    def tiffEncoderId: String = js.native
    inline def tiffEncoderId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tiffEncoderId")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapFlip")
  @js.native
  object BitmapFlip extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapFlip & Double] = js.native
    
    /* 1 */ val horizontal: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapFlip.horizontal & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapFlip.none & Double = js.native
    
    /* 2 */ val vertical: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapFlip.vertical & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapFrame")
  @js.native
  open class BitmapFrame ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapFrame
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
  @js.native
  object BitmapInterpolationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode & Double] = js.native
    
    /* 2 */ val cubic: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.cubic & Double = js.native
    
    /* 3 */ val fant: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.fant & Double = js.native
    
    /* 1 */ val linear: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.linear & Double = js.native
    
    /* 0 */ val nearestNeighbor: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapInterpolationMode.nearestNeighbor & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
  @js.native
  object BitmapPixelFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapPixelFormat & Double] = js.native
    
    /* 3 */ val bgra8: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.bgra8 & Double = js.native
    
    /* 1 */ val rgba16: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.rgba16 & Double = js.native
    
    /* 2 */ val rgba8: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.rgba8 & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapPixelFormat.unknown & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapProperties")
  @js.native
  open class BitmapProperties ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapProperties {
    
    /* CompleteClass */
    override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapPropertySet] = js.native
    
    /* CompleteClass */
    override def setPropertiesAsync(
      propertiesToSet: IIterable[
          IKeyValuePair[String, typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapTypedValue]
        ]
    ): IAsyncAction = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapPropertiesView")
  @js.native
  open class BitmapPropertiesView ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapPropertiesView {
    
    /* CompleteClass */
    override def getPropertiesAsync(propertiesToRetrieve: IIterable[String]): IAsyncOperation[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapPropertySet] = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapPropertySet")
  @js.native
  open class BitmapPropertySet ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapPropertySet {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def first(): IIterator[
        IKeyValuePair[String, typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapTypedValue]
      ] = js.native
    
    /* CompleteClass */
    override def getView(): IMapView[String, typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapTypedValue] = js.native
    
    /* CompleteClass */
    override def hasKey(key: String): Boolean = js.native
    
    /* CompleteClass */
    override def insert(key: String, value: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapTypedValue): Boolean = js.native
    
    /* CompleteClass */
    override def lookup(key: String): typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapTypedValue = js.native
    
    /* CompleteClass */
    override def remove(key: String): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
  @js.native
  object BitmapRotation extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapRotation & Double] = js.native
    
    /* 2 */ val clockwise180Degrees: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise180Degrees & Double = js.native
    
    /* 3 */ val clockwise270Degrees: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise270Degrees & Double = js.native
    
    /* 1 */ val clockwise90Degrees: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapRotation.clockwise90Degrees & Double = js.native
    
    /* 0 */ val none: typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapRotation.none & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapTransform")
  @js.native
  open class BitmapTransform ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapTransform {
    
    /* CompleteClass */
    var bounds: BitmapBounds = js.native
    
    /* CompleteClass */
    var flip: BitmapFlip = js.native
    
    /* CompleteClass */
    var interpolationMode: BitmapInterpolationMode = js.native
    
    /* CompleteClass */
    var rotation: BitmapRotation = js.native
    
    /* CompleteClass */
    var scaledHeight: Double = js.native
    
    /* CompleteClass */
    var scaledWidth: Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.BitmapTypedValue")
  @js.native
  open class BitmapTypedValue protected ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.BitmapTypedValue {
    def this(value: Any, `type`: PropertyType) = this()
    
    /* CompleteClass */
    var `type`: PropertyType = js.native
    
    /* CompleteClass */
    var value: Any = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.ColorManagementMode")
  @js.native
  object ColorManagementMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Imaging.ColorManagementMode & Double] = js.native
    
    /* 1 */ val colorManageToSRgb: typingsJapgolly.winrt.Windows.Graphics.Imaging.ColorManagementMode.colorManageToSRgb & Double = js.native
    
    /* 0 */ val doNotColorManage: typingsJapgolly.winrt.Windows.Graphics.Imaging.ColorManagementMode.doNotColorManage & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.ExifOrientationMode")
  @js.native
  object ExifOrientationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Imaging.ExifOrientationMode & Double] = js.native
    
    /* 0 */ val ignoreExifOrientation: typingsJapgolly.winrt.Windows.Graphics.Imaging.ExifOrientationMode.ignoreExifOrientation & Double = js.native
    
    /* 1 */ val respectExifOrientation: typingsJapgolly.winrt.Windows.Graphics.Imaging.ExifOrientationMode.respectExifOrientation & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.ImageStream")
  @js.native
  open class ImageStream ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.ImageStream {
    
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var contentType: String = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /* CompleteClass */
    var position: Double = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.JpegSubsamplingMode")
  @js.native
  object JpegSubsamplingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode & Double] = js.native
    
    /* 0 */ val default: typingsJapgolly.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.default & Double = js.native
    
    /* 1 */ val y4Cb2Cr0: typingsJapgolly.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr0 & Double = js.native
    
    /* 2 */ val y4Cb2Cr2: typingsJapgolly.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb2Cr2 & Double = js.native
    
    /* 3 */ val y4Cb4Cr4: typingsJapgolly.winrt.Windows.Graphics.Imaging.JpegSubsamplingMode.y4Cb4Cr4 & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.PixelDataProvider")
  @js.native
  open class PixelDataProvider ()
    extends StObject
       with typingsJapgolly.winrt.Windows.Graphics.Imaging.PixelDataProvider {
    
    /* CompleteClass */
    override def detachPixelData(): js.typedarray.Uint8Array = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
  @js.native
  object PngFilterMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Imaging.PngFilterMode & Double] = js.native
    
    /* 6 */ val adaptive: typingsJapgolly.winrt.Windows.Graphics.Imaging.PngFilterMode.adaptive & Double = js.native
    
    /* 0 */ val automatic: typingsJapgolly.winrt.Windows.Graphics.Imaging.PngFilterMode.automatic & Double = js.native
    
    /* 4 */ val average: typingsJapgolly.winrt.Windows.Graphics.Imaging.PngFilterMode.average & Double = js.native
    
    /* 1 */ val none: typingsJapgolly.winrt.Windows.Graphics.Imaging.PngFilterMode.none & Double = js.native
    
    /* 5 */ val paeth: typingsJapgolly.winrt.Windows.Graphics.Imaging.PngFilterMode.paeth & Double = js.native
    
    /* 2 */ val sub: typingsJapgolly.winrt.Windows.Graphics.Imaging.PngFilterMode.sub & Double = js.native
    
    /* 3 */ val up: typingsJapgolly.winrt.Windows.Graphics.Imaging.PngFilterMode.up & Double = js.native
  }
  
  @JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
  @js.native
  object TiffCompressionMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.winrt.Windows.Graphics.Imaging.TiffCompressionMode & Double] = js.native
    
    /* 0 */ val automatic: typingsJapgolly.winrt.Windows.Graphics.Imaging.TiffCompressionMode.automatic & Double = js.native
    
    /* 2 */ val ccitt3: typingsJapgolly.winrt.Windows.Graphics.Imaging.TiffCompressionMode.ccitt3 & Double = js.native
    
    /* 3 */ val ccitt4: typingsJapgolly.winrt.Windows.Graphics.Imaging.TiffCompressionMode.ccitt4 & Double = js.native
    
    /* 4 */ val lzw: typingsJapgolly.winrt.Windows.Graphics.Imaging.TiffCompressionMode.lzw & Double = js.native
    
    /* 7 */ val lzwhDifferencing: typingsJapgolly.winrt.Windows.Graphics.Imaging.TiffCompressionMode.lzwhDifferencing & Double = js.native
    
    /* 1 */ val none: typingsJapgolly.winrt.Windows.Graphics.Imaging.TiffCompressionMode.none & Double = js.native
    
    /* 5 */ val rle: typingsJapgolly.winrt.Windows.Graphics.Imaging.TiffCompressionMode.rle & Double = js.native
    
    /* 6 */ val zip: typingsJapgolly.winrt.Windows.Graphics.Imaging.TiffCompressionMode.zip & Double = js.native
  }
}
